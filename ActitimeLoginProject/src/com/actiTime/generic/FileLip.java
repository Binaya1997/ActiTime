package com.actiTime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLip {
	



	public String getPrFileData(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/common.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;			
	}

	
	
	public String getExFileData(String sheet,int i,int j)throws EncryptedDocumentException, IOException   {
		FileInputStream fis=new FileInputStream("./data/cmdta.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String dt = wb.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
		return dt; 
	}
	}
	

