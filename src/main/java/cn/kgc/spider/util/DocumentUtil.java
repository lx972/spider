package cn.kgc.spider.util;

import cn.kgc.spider.common.Constants;
import cn.kgc.spider.model.ProxyIpEntity;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by zezhong.shang on 17-9-19.
 */
public class DocumentUtil {

    static Logger logger = LoggerFactory.getLogger(DocumentUtil.class);

    /***
     * 获取文档重试N次
     *
     * @param url
     * @param n
     * @return
     */
    public static Document againDocument(String url, int n) {
        Document document = null;
        //获取连接
        Connection connection = Jsoup.connect(url);
        //设置connection参数
        setConnection(connection);
        //获得代理IP
        document = getDocumentByProxy(connection, n, 1);
        try {
            document = connection.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }
    /***
     * 死亡重试
     * @param url
     * @return
     */
    public static Document againDocument(String url) {
        //获取连接
        Connection connection = Jsoup.connect(url);
        //设置connection参数
        setConnection(connection);
        //获得代理IP
        return getDeadDocumentByProxy(connection);
    }
    /***
     * 死亡重试
     * @param url
     * @return
     */
    public static Document againCommonDocument(String url,int count) {
        //获取连接
        Connection connection = Jsoup.connect(url);
        //设置connection参数
        setConnection(connection);
        //获得代理IP
        return getCommonDocument(connection,count);
    }
    /****
     * 请求一次的方法 不做重试
     *
     * @param url
     * @return
     * @throws Exception
     */
    public static Document onceGetDocument(String url) throws Exception {
        //获取连接
        Connection connection = Jsoup.connect(url);
        //设置connection参数
        setConnection(connection);
        return connection.get();
    }

    public static String getUserAgent() {
        return Constants.UserAgent.Chrome;
    }

    public static void setConnection(Connection connection) {
        //设置connection参数
        connection.timeout(2000);
        connection.userAgent(getUserAgent());
    }

    public static void addHeader(Connection connection,String headers) {
        String headerArray[] = headers.split("\n");
        for (String header : headerArray) {
            String key = header.split(":")[0];
            String value = header.split(":")[1];
            logger.info("设置header>>>>"+key+":"+value);
            connection.header(key, value);
        }
    }

    public static void main(String[] args) throws IOException {
       Document document=DocumentUtil.againCommonDocument("http://www.baidu.com",0);
        System.out.println(document.text());
    }

    public static Document getDocumentByProxy(Connection connection, int maxTimes, int times) {
        times++;
        logger.info("第" + times + "次尝试...........");
        ProxyIpEntity ip = ProxyUtils.getProxyIp();
        connection.proxy(ip.getIp(), Integer.parseInt(ip.getPort()));
        try {
            return connection.get();
        } catch (IOException e) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            return getDocumentByProxy(connection, maxTimes, times);
        }
    }

    public static Document getDocumentByWait(Connection connection) {
        Document document = null;
        try {
            document = connection.get();
            if (document.text().contains("验证账户")) {
                logger.info(">>>>>>>>>>>>>>>>>>被禁了>>>>>>>>>等待中>>>>>>>>>");
                return getDocumentByWait(connection);
            } else {
                return document;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(">>>>>>>>>>>>>>>>>>被禁了>>>>>>>>>等待中>>>>>>>>>");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            return getDocumentByWait(connection);
        }
    }


    public static Document getCommonDocument(Connection connection,int count) {
        Document document = null;
        try {
            document = connection.get();
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(">>>>>>>>>>>>>>>>>>被禁了>>>>>>>>>等待中>>>>>>>>>");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            if(count>=20){
                return null;
            }else{
                return getCommonDocument(connection,count+1);
            }
        }
        return document;
    }

    public static Document getDeadDocumentByProxy(Connection connection) {
        logger.info("死亡爬取模式,不爬下来誓不罢休!!!...........");
        Document document = null;
        try {
            ProxyIpEntity ip = ProxyUtils.getProxyIp();
            connection.proxy(ip.getIp(), Integer.parseInt(ip.getPort()));
            document = connection.get();
            logger.info(document.text() + ">>>>>>>>>");
            if (document.text().contains("验证账户")) {
                try {
                    logger.info("被禁了...........稍等一会换个IP继续.........");
                    Thread.sleep(10000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                return getDeadDocumentByProxy(connection);
            } else {
                return document;
            }
        } catch (Exception e) {
            try {
                logger.info(e.getCause()+"：异常了...........稍等一会换个IP继续.........");
                Thread.sleep(10000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            return getDeadDocumentByProxy(connection);
        }
    }
}
