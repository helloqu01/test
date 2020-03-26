package com.ohj;

import com.ohj.xls.ExcelMaker;

public class MainClass {

	public static void main(String[] args) {
		
		try {//2¹ø
			new ExcelMaker();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
