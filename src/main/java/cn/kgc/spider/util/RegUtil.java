package cn.kgc.spider.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zezhong.shang on 17-9-12.
 */
public class RegUtil {
    //正则表达式过滤所有html标签
    public static String filterTag(String content) {
        content = content.replaceAll("<.*?>", "");
        return content;
    }

    public static String filterTab(String content){
        content = content.replaceAll("\\s*|\\t|\\r|\\n", "");
        return content;
    }

    public static void main(String[] args) {
        String content = filterTag("<span style=\"background-color: rgb(255, 255, 255);\"> </span>双子公司是一家从事互联网商城平台的运营商，采用全新的电子商务模式来升级、变革现有的实体经济。公司现在属于初创期，招募创业核心团队人员，希望能和我们拥有相同价值观、有梦想的年轻人加入我们。     双子公司作为商城平台运营商，不会设立自营体系、更不会设立自己的物流配送中心。双子公司的双子商城项目为广大企业（农业品牌）搭建了一个公平、公正、公开的良性电商平台，通过进驻企业的良性竞争来让市场自己教育自己的数据型公司。它是一个特许拥有国家颁发营业资质的企业与实体零售商家完全免费进驻的平台，以实现信息、物流、采供、金融等各个环节紧而有序的垂直链接，紧密协同合作，最大化充分发挥各个节点的特长，形成一个利益共同体。相较以往的传统企业分销渠道众多，企业很难掌握供应链各个环节的真实反馈，只能在幕后的尴尬局面。我们励志让企业从幕后走向台前、让企业不在受限于主流电商平台选边站队等等的各种霸王条款，及打破经销商的市场垄断地位。实现从商品源头、物流、消费者反馈等全程可追溯化。通过双子商城项目全新的供应链整合架构，企业实时掌握供应链各个节点之间的真实反馈数据，让企业不再是盲人摸象，而是由自身来掌握命运。双子商城作为一个开放式平台，积极推动企业创新与品牌可持续性发展，为所有参与者创造巨大的商机。   最优秀的商业经济模式，一定诞生在兵荒马乱的时代！每当万物沉寂，必将有强大的新生命在孕育，它可能会引领下一轮万物复苏。职位要求：    精通常见web前端技术栈，如原生JavaScript面向对象开发、Ajax异步编程，CSS3，HTML5，jQuery,React全家桶，vue全家桶等。熟练掌握常见ui框架，如Bootstrap,Prue css等。精通各种主流布局方式，如固定宽度，传统响应式，flex响应式等，熟悉前端自动化构建工具如webpack,gulp，sass等，熟悉node.js，express,npm。有使用MUI或jQuery Mobile开发跨平台App能力。亦熟悉Php与MySQL，熟悉Linux下服务器环境搭建与优化维护，可独立完成全栈开发。工作地址海南省海口市美兰区国兴大道海阔天空·国兴城B区9-2301B<span style=\"background-color: rgb(255, 255, 255);\"></span><span style=\"font-size: 9pt;\"><o:p></o:p></span>");
        System.out.println(content);
        content=filterTab(content);
        System.out.println(content);
    }

    public static String regTest(String content, String reg) {
        String value="";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(reg);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(content);
        while (m.find()) {
            // 处理
            value= m.group();
        }
        return value;
    }
}
