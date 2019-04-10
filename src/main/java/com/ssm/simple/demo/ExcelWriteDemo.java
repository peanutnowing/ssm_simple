package com.ssm.simple.demo;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * POI操作Excel
 *
 * @Author peanutnowing
 * @Date 2019/4/9
 */
public class ExcelWriteDemo {
    public static void main(String[] args) throws IOException {
        //map集合存储城市ID和城市名称
        Map<String,String> map = new HashMap<>();
        map.put("1","北京");
        map.put("2","上海");
        map.put("3","广州");
        map.put("4","深圳");
        map.put("5","杭州");

        //1.创建文件
        File file = new File("city.xlsx");
        OutputStream outputStream = new FileOutputStream(file);
        //2.创建工作簿及工作表
        XSSFWorkbook  workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        //3.添加表头
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("城市ID");
        row.createCell(1).setCellValue("城市名称");
        //4.添加内容——集合数据写入excel中
        for(Map.Entry<String,String> entry: map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            XSSFRow xssFRow = sheet.createRow(Integer.valueOf(key));
            xssFRow.createCell(0).setCellValue(key);
            xssFRow.createCell(1).setCellValue(value);
        }
        //5.数据写入excel，释放资源
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }
}
