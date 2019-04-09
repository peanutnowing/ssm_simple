package com.ssm.simple.utils;

import java.io.*;
import java.util.*;

/**
 * 文件操作工具类
 *
 * @Author peanutnowing
 * @Date 2019/4/9
 */
public class FileUtil {
    /**
     * 读取property配置文件
     * @param fileName property文件名
     * @return map形式的property的集合
     */
    public static Map<String,String> getConfig(String fileName){
        String path =  FileUtil.class.getClassLoader().getResource(fileName).getPath();
        Map<String, String> map = new HashMap<String, String>();
        InputStream inputStream = null;
        try {
            File file = new File(path);
            inputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
            Properties properties = new Properties();
            properties.load(bufferedReader);
            for (Map.Entry<Object,Object> property:properties.entrySet()){
                if (property.getKey().toString().length()>0){
                    map.put(property.getKey().toString(), property.getValue().toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String,String> cityMap = getConfig("city.properties");
        Set entries = cityMap.entrySet();
        if (entries!=null){
            Iterator iterator = entries.iterator();
            while (iterator.hasNext()){
                Map.Entry entry = (Map.Entry) iterator.next();
                String key = (String) entry.getKey();
                String value = (String) entry.getValue();
                System.out.println(key+"-"+value);
            }
        }
    }
}
