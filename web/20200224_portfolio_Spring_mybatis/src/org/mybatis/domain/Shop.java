package org.mybatis.domain;

import java.io.Serializable;
//마이바티스에서 자동주입(DTO((Data Transfer Object))(VO)(Value Object) 역할 담당)
//일반적인 DTO는 로직을 갖고 있지 않는 순수한 데이터 객체이며 속성과 그 속성에 접근하기 위한 getter, setter 메소드만 가진 클래스를 말합니다
//DAO(Data Access Object)는 DB를 사용해 데이터를 조화하거나 조작하는 기능을 전담하도록 만든 오브젝트를 말한다.
public class Shop implements Serializable {
	
	private int shopNo;
	private String shopName;
	private String shopLocation;
	private String shopStatus;
	
	/**기본생성자*/
	public Shop(){
		
	}
	/**생성자*/
	public Shop(int shopNo, String shopName,String shopLocation,String shopStatus) {
		this.shopNo = shopNo;
		this.shopName=shopName;
		this.shopLocation=shopLocation;
		this.shopStatus=shopStatus;		
	}
	/**shift+alt+s+r 겟터셋터 만들기 단축키*/
	/**setter 메소드*/
	public int getShopNo() {
		return shopNo;
	}
	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopLocation() {
		return shopLocation;
	}
	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

}
