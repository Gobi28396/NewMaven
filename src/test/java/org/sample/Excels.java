package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excels {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\ELCOT\\Desktop\\Excel.xlsx");
	FileInputStream s=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(s);
	Sheet sh=w.getSheet("Sheet1");
	/*Row row = sh.getRow(0);
	Cell cel = row.getCell(2);
System.out.println(cel);*/
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row row = sh.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
