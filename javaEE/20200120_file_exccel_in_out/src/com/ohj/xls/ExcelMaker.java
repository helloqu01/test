package com.ohj.xls;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelMaker {
	
	public ExcelMaker()throws Exception{//1번 
		File f= new File("c:/filetest/data.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		
		WritableSheet s1 = wb.createSheet("첫번째 ",0);//새로운 시트를 만들어 달라 
		WritableSheet s2 = wb.createSheet("sheet 1",1);
		WritableSheet s3 = wb.createSheet("sheet 2",2);
		
		for(int i=0; i<10;i++){
			Label label = new Label(0,i,"데이터 .."+i);//열, 행 씌여질 내용 
			s1.addCell(label);
			Label label1 = new Label(1,i,"데이터 .."+i);
			s1.addCell(label1);
		}
		wb.write();
		wb.close();
	}

}
