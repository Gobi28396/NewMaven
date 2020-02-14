package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwri {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ELCOT\\Desktop\\Elx.xlsx");
		
	/*	Workbook w=new XSSFWorkbook();
		Sheet sh=w.createSheet("new");
		Row r = sh.createRow(1);
		Cell c = r.createCell(1);
		c.setCellValue("hiiii");
		
		
		FileOutputStream g=new FileOutputStream(f);
		w.write(g);
		System.out.println("done");*/
		
		
		Workbook w=new XSSFWorkbook();
		FileOutputStream g=new FileOutputStream(f);
		Sheet sh=w.getSheet("new");
		Row r = sh.getRow(1);
		Cell c = r.getCell(1);
		String k = c.getStringCellValue();
		System.out.println(k);
		if (k=="hiiii") {
			c.setCellValue("lmjhkjjh");	
		}
		
		
		
		w.write(g);
		System.out.println("done");
		
		
		
		
		
		
		
		
		
	
}
}