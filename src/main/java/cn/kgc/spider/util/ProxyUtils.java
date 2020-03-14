package cn.kgc.spider.util;

import cn.kgc.spider.model.ProxyIpEntity;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by zezhong.shang on 17-9-19.
 */
public class ProxyUtils {

    static Logger logger= LoggerFactory.getLogger(ProxyUtils.class);

    public static ProxyIpEntity getProxyIp() {
//        String ipUrl = "http://dynamic.goubanjia.com/dynamic/get/32ea0e44b1497118f5fda8b5e5e22748.html";
        String ipUrl = "http://dynamic.goubanjia.com/dynamic/get/914871a5da008ec1fbc4b76e111efc6f.html?sep=3";
        ProxyIpEntity proxyIp = new ProxyIpEntity();
        try {
            String ipstr = Jsoup.connect(ipUrl).get().text();
            proxyIp.setIp(ipstr.split(":")[0]);
            proxyIp.setPort(ipstr.split(":")[1]);
        } catch (IOException e) {
            logger.info(e.getCause()+"：获取动态IP异常,暂休2秒");
            try {
                Thread.sleep(2000);
                return getProxyIp();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        return  proxyIp;
    }

    public static void main(String[] args) {

    }
}
