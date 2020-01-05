package com.ssm.simple.demo.common;

/**
 * 正则表达式demo
 */
public class RegexDemo {
    /**
     * 去掉字符串中首次遇到的数字以及一些前缀样式
     * @param args
     */
    public static void main(String[] args) {
        String str1="98从理论到现实";
        String str2="98、培训师小白：这是免费课，我不在乎";
        String str3="98-伸手不打笑脸人 得饶人处且饶";
        String str4="87 随心驾车游";
        String str5="87.《人性的弱点全集》第八十七集(大结局)";
        String str6="13：劳动合同法第14条，必须签订无固定期限的情形";
        String str7="【077】资本市场大跌，他们是怎么做的呢？";
        String str8="Vol.95厚黑之术：面子社会";
        System.out.println(updateTitle(str8));
    }
    /**
     * 修改标题
     * @param title
     * @return
     */
    public static String updateTitle(String title){
        String str = null;
        if (title.contains("Vol")){
            str = title.replaceAll("(\\w+.)?\\d+","").trim();
        } else if(title.contains("【")||title.contains("】")){
            str = title.replaceAll("【\\d+】","").trim();
        }else {
            str = title.replaceFirst("(\\w+.)?\\d+(\\pP|\\pS|\\s+)?","").trim();
        }
        return str;
    }

}
