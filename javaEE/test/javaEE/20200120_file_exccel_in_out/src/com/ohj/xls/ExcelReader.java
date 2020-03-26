package com.ohj.xls;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReader {
	
	public ExcelReader()throws Exception{//throws Exception 예외처리//3번
		
		Workbook wb = Workbook.getWorkbook(new File("c:/filetest/data.xls"));
		Sheet s = wb.getSheet(0);
		
		int i=0;
		while(true){
			try{
			Cell c = s.getCell(0,i);
			Cell c1 = s.getCell(1,i);
			System.out.println(c.getContents()+"\t"+c1.getContents());//getContents : 셀이 가지고 있는 문자열을 읽는 메소드
			i++;
			}catch(Exception e){
				break;
			}
		}
	}

}
