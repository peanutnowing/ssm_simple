package com.ssm.simple.demo.file;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 * 从txt文本中解析json格式数据
 *
 * @Author peanutnowing
 * @Date 2019/11/21
 */
public class ParseJsonDemo {
    public static void main(String[] args) {
        String path = ParseJsonDemo.class.getClassLoader().getResource("city_json.txt").getPath();
        String txt = readTxtFile(path);
        String result = parseJson(txt);
        System.out.println(result);
    }

    /**
     * 解析txt文件
     * @param filePath
     * @return
     */
    public static String readTxtFile(String filePath){
        StringBuilder sb = new StringBuilder();
        try {
            String encoding="UTF-8";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    sb.append(lineTxt);
                }
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * 把JSON文件转换为一行一行的数据
     * @param txt
     * @return
     */
    private static String parseJson(String txt){
        //获取jsonObject对象
        JSONArray jsonArray = JSONObject.parseArray(txt);
        StringBuilder sb = new StringBuilder();
        for (Iterator iterator = jsonArray.iterator(); iterator.hasNext(); ) {
            JSONObject jsonObject = (JSONObject) iterator.next();
            String cityName = String.valueOf(jsonObject.get("city_name"));
            String cityId = String.valueOf(jsonObject.get("city_id"));
            sb.append(cityId).append("=").append(cityName).append("\n");
        }
        return sb.toString();
    }
}
