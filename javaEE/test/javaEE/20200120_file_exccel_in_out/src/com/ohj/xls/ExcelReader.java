package com.ohj.xls;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReader {
	
	public ExcelReader()throws Exception{//throws Exception ����ó��//3��
		
		Workbook wb = Workbook.getWorkbook(new File("c:/filetest/data.xls"));
		Sheet s = wb.getSheet(0);
		
		int i=0;
		while(true){
			try{
			Cell c = s.getCell(0,i);
			Cell c1 = s.getCell(1,i);
			System.out.println(c.getContents()+"\t"+c1.getContents());//getContents : ���� ������ �ִ� ���ڿ��� �д� �޼ҵ�
			i++;
			}catch(Exception e){
				break;
			}
		}
	}

}
