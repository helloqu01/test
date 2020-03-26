package com.ohj.phone;
public class LgClass extends AndroidClass{
public LgClass(){
}
//////////////////////////////////////////////

public int ram =0;

public LgClass(int r){

this.ram=r;

}

//////////////////////////////////////////////

public void SmartWorld(){

System.out.println("배경화면 변경");

}

//////////////////////////////////////

private String name;

public String getName() {//getter

return name;

}

////////////////////////////////////////////

public void setName(String name) {//setter 외부에서 바꿀 수 있는 메소드

this.name = name;

}

/////////////////////////////////////////

private int a;

private char c;

private boolean b;

public int getA() {

return a;

}

public void setA(int a) {

this.a = a;

}

public char getC() {

return c;

}

public void setC(char c) {

this.c = c;

}

public boolean isB() {

return b;

}

public void setB(boolean b) {

this.b = b;

}

public int getRam() {

return ram;

}

public void setRam(int ram) {

this.ram = ram;
	}
}

​

​