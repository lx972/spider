package cn.kgc.spider.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * 常量类 放置一些常量
 */
public class Constants {

    //默认起始页
    public static final Integer DEFAULT_PAGE_NO = 1;
    //默认页大小
    public static final Integer DEFAULT_PAGE_SIZE = 10;
    //无效词过滤
    public static final String InvalidKey = "invalidWord";

    public static final class JobType{
        public static final String QD="qd";
        public static final String Java="java";
        public static final String BigData="bigData";
    }

    public static final class  UserAgent{

        public static final String LB="Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.1 (KHTML, like Gecko) Chrome/21.0.1180.71 Safari/537.1 LBBROWSER";

        public static final String Trident="Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)";

        public static final String IPAD="Mozilla/5.0 (iPad; U; CPU OS 4_2_1 like Mac OS X; zh-cn) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8C148 Safari/6533.18.5";

        public static final String Firefox="Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:2.0b13pre) Gecko/20110307 Firefox/4.0b13pre";

        public static final String Chrome="Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.112 Safari/537.36";
    }

    public static interface Crawler{
        public final String placeholder="temp";
    }

    public static interface  Status{
        public final Integer DELETE=1;
        public final Integer ACTIVE=0;
    }

    //0:待执行,1:正在执行
    public static interface  TaskStatus{
        public final Integer wait=0;
        public final Integer dataRun=1;
        public final Integer keywordRun=2;
    }

    public static List<Map<String, Object>> dataType(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String,Object> map1=new HashMap<String,Object>();
        Map<String,Object> map2=new HashMap<String,Object>();
        Map<String,Object> map3=new HashMap<String,Object>();
        Map<String,Object> map4=new HashMap<String,Object>();
        Map<String,Object> map5=new HashMap<String,Object>();
        Map<String,Object> map6=new HashMap<String,Object>();
        Map<String,Object> map7=new HashMap<String,Object>();
        Map<String,Object> map8=new HashMap<String,Object>();
        Map<String,Object> map9=new HashMap<String,Object>();

        map1.put("name","Java工程师");
        map1.put("value",1);

        map2.put("name","Web前端工程师");
        map2.put("value",2);

        map3.put("name","运维工程师");
        map3.put("value",3);

        map4.put("name",".NET工程师");
        map4.put("value",4);

        map5.put("name","Python工程师");
        map5.put("value",5);

        map6.put("name","PHP工程师");
        map6.put("value",6);

        map7.put("name","UI工程师");
        map7.put("value",7);

        map8.put("name","测试工程师");
        map8.put("value",8);

        map9.put("name","网络营销师");
        map9.put("value",9);

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);

        return list;
    }
    /***
     * 获取保存字段
     * @return
     */
    public static List<Map<String,String>> saveCloums(){
        List<Map<String,String>> list=new ArrayList<Map<String,String>>();
        Map<String,String> map1=new HashMap<String,String>();
        Map<String,String> map3=new HashMap<String,String>();
        Map<String,String> map4=new HashMap<String,String>();
        Map<String,String> map5=new HashMap<String,String>();
        Map<String,String> map6=new HashMap<String,String>();
        Map<String,String> map7=new HashMap<String,String>();
        Map<String,String> map8=new HashMap<String,String>();
        Map<String,String> map9=new HashMap<String,String>();
        Map<String,String> map10=new HashMap<String,String>();
        Map<String,String> map11=new HashMap<String,String>();
        Map<String,String> map12=new HashMap<String,String>();
        Map<String,String> map13=new HashMap<String,String>();
        Map<String,String> map14=new HashMap<String,String>();
        Map<String,String> map15=new HashMap<String,String>();
        Map<String,String> map16=new HashMap<String,String>();

        map1.put("name","招聘标题");
        map1.put("value","title");

        map3.put("name","公司名称");
        map3.put("value","companyName");

        map4.put("name","公司类型");
        map4.put("value","companyType");

        map5.put("name","公司网址");
        map5.put("value","companyUrl");

        map6.put("name","福利");
        map6.put("value","welfare");

        map7.put("name","公司地址");
        map7.put("value","companyAddress");

        map8.put("name","月薪");
        map8.put("value","monthlySalary");

        map9.put("name","发布日期");
        map9.put("value","releaseDate");

        map10.put("name","工作性质");
        map10.put("value","workNature");

        map11.put("name","工作经验");
        map11.put("value","experience");

        map12.put("name","学历要求");
        map12.put("value","eucation");

        map13.put("name","招聘人数");
        map13.put("value","rNum");

        map14.put("name","职位分类");
        map14.put("value","positionCategory");

        map15.put("name","职位描述");
        map15.put("value","jobDescription");

        map16.put("name","公司规模");
        map16.put("value","companySize");

        list.add(map1);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);
        list.add(map10);
        list.add(map11);
        list.add(map12);
        list.add(map13);
        list.add(map14);
        list.add(map15);
        list.add(map16);
        return  list;
    }
}
