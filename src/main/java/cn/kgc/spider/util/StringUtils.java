package cn.kgc.spider.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zezhong.shang on 17-6-2.
 */
public class StringUtils {
    /**
     * ĳλ����ĸ��д
     *
     * @param name
     * @param indx
     * @return
     */
    public static String captureName(String name, int indx) {
        name = name.substring(0, indx) + name.substring(indx, indx + 1).toUpperCase() + name.substring(indx + 1);
        return name;
    }

    /**
     * ����ĸ��д
     *
     * @param name
     * @return
     */
    public static String captureName(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }

    /***
     * ����ĸСд
     *
     * @param name
     * @return
     */
    public static String lowerName(String name) {
        name = name.substring(0, 1).toLowerCase() + name.substring(1);
        return name;
    }

    /***
     * ȥ���»��� �����շ�ԭ�����ת��
     *
     * @return
     */
    public static String putOffUnderline(String columnName) {
        StringBuffer fieldNameBuffer = null;
        String tempNameArray[] = columnName.split("_");
        for (int i = 0; i < tempNameArray.length; i++) {
            if (i == 0) {
                fieldNameBuffer = new StringBuffer(tempNameArray[i]);
            } else {
                fieldNameBuffer.append(captureName(tempNameArray[i]));
            }
        }
        return fieldNameBuffer.toString();
    }


    public static String delHTMLTag(String htmlStr){
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式

        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE);
        Matcher m_script=p_script.matcher(htmlStr);
        htmlStr=m_script.replaceAll(""); //过滤script标签

        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE);
        Matcher m_style=p_style.matcher(htmlStr);
        htmlStr=m_style.replaceAll(""); //过滤style标签

        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE);
        Matcher m_html=p_html.matcher(htmlStr);
        htmlStr=m_html.replaceAll(""); //过滤html标签

        return htmlStr.trim(); //返回文本字符串
    }

    public static void main(String[] args) {
        String content="岗位职责： 1、负责基于手机浏览器的界面设计、开发； 2、负责微信公众平台、支付宝生活号、APP框架设计与开发； 3、参与客户、公司平台的技术架构和概要设计； 4、参与核心模块编码及系统重构； 6、参与制定开发规范，并带领研发团队； 7、新技术研究与引入。 岗位要求： 1、计算机，数学等相关专业专业知识和技能； 2、一年以上软件开发设计经验，有Java开发、微信公众平台、支付宝服务窗开发经验、熟悉微信公共平台SDK(提供作品演示可以加分)； 3、熟悉前端开发框架，熟悉Json和xml数据交换格式，熟悉jQuery、HTML5、CSS、Ajax、Json、freemark等技术，有处理浏览器兼容性问题的经验； 4、能独立进行开发，熟练使用jfinal,spring,mybatis等框架； 5、熟练掌握MySQL、SqlServer等常用数据库、相关技术及工具； 6、熟悉微信公共平台接口和微信开放平台API，有微信公共平台实际开发案例； 7、有APP开发经验的加分； 8、对业务有很强的领悟能力，能快速准确的将业务需求转化为业务架构，具备创新精神； 9、对移动互联网有比较深刻的理解、对互联网新技术有比较执着的热情、思路清晰。 ";
        content=delHTMLTag(content);
        System.out.println(content);
    }
}
