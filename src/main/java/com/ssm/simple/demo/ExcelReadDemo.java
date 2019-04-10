package com.ssm.simple.demo;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * POI读取Excel
 * @Author peanutnowing
 * @Date 2019/4/10
 */
public class ExcelReadDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("city.xlsx");
        Workbook workbook = getWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");//获取工作表

        int allRow = sheet.getLastRowNum();//获取行数
        for(int i=0;i<=allRow;i++){
            Row row = sheet.getRow(i);
            //获取列数
            short lastCellNum = row.getLastCellNum();
            for (int j=0;j<lastCellNum;j++){
                String cellValue = row.getCell(j).getStringCellValue();
                System.out.println(cellValue+"\t");
            }
        }
        //释放资源
        workbook.close();
    }


    /**
     * 根据文件名称获取操作工作簿
     * @param file
     * @return
     * @throws IOException
     */
    public static Workbook getWorkbook(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        //2003版本
        if(file.getName().endsWith("xls")){
            workbook = new HSSFWorkbook(inputStream);
            // 2007及以上版本
        }else if(file.getName().endsWith("xlsx")){
            workbook = new XSSFWorkbook(inputStream);
        }
        inputStream.close();
        return workbook;
    }
}
