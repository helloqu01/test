package com.ohj.extend;
import com.ohj.phone.SamsungClass;
public class SKTClass extends SamsungClass{

public int t_member=0;

public String phonrNumber="";

public SKTClass() {

}

public SKTClass(String string) {

this.phonrNumber=string;

}

public void tworld(String n){//자기 번호를 전달 받아야하기 때문에

if(this.phonrNumber.equals(n)){

System.out.println("로그인 되었습니다.");
}else{

System.out.println("멤버가 아닙니다.");

}

}
public String getPhoneNumber(){ //getter 매소드
return this.phonrNumber;
}
}
