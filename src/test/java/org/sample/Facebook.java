package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Facebook {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ELCOT\\Desktop\\Fb.xlsx");
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(s);
		Sheet sh=w.getSheet("Sheet1");
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c= r.getCell(j);
		int ct = c.getCellType();
		//System.out.println(ct);
		if (ct==1) {
			String s1 = c.getStringCellValue();System.out.println(s1);
		} else {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dt = c.getDateCellValue();
				SimpleDateFormat g=new SimpleDateFormat("dd-MMM-yyyy");
				String format = g.format(dt);
				System.out.println(format);
			} else {
				double nc = c.getNumericCellValue();
				Long l=(long)nc;
				String v = String.valueOf(l);
System.out.println(v);
			}

		}

}
}}
}
