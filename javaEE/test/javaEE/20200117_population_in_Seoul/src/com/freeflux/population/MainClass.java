package com.freeflux.population;

import java.util.ArrayList;

import com.freeflux.population.db.DBReadWriteClass;
import com.freeflux.population.file.FileReadWriteClass;

public class MainClass {

	public static void main(String[] args) {
	String url_cou = "c:/Filetest/course_data.txt";
		
		ArrayList<String> line= FileReadWriteClass.readFileLines(url_cou);//���� �о������� Ȯ�� ���α�,72654 ,75611 ,77978 ,4064 ,5167 ,2.11,25425 
		DBReadWriteClass dbrw = new DBReadWriteClass();
		dbrw.connectMySQL();//�α���
		dbrw.dataInsert(line);//������ �Է��϶�.
		
		FileReadWriteClass frwc = new FileReadWriteClass();
		frwc.HtmlClass(dbrw.selectData());
		
		
		
	}

}
