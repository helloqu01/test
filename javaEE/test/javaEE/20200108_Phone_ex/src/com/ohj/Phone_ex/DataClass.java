package com.ohj.Phone_ex;

import java.util.ArrayList;

public class DataClass {
	ArrayList<InfoClass> Info = new ArrayList<InfoClass>();
	public DataClass() {
		Info.add(new InfoClass ("갤럭시노트8", "이대점", "13EA"));
		Info.add(new InfoClass("갤럭시노트8", "강남점", "30EA"));
		Info.add(new InfoClass("갤럭시노트8", "부산점", "45EA"));
		Info.add(new InfoClass("V30", "이대점", "16EA"));
		Info.add(new InfoClass("V30", "강남점", "32EA"));
		Info.add(new InfoClass("V30", "부산점", "56EA"));
		Info.add(new InfoClass("iPhone8", "이대점", "57EA"));
		Info.add(new InfoClass("iPhone8", "강남점", "24EA"));
		Info.add(new InfoClass("iPhone8", "부산점", "34EA"));

	}
}
