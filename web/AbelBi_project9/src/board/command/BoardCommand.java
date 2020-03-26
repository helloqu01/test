package board.command;

/**
 * 사용자로부터 순수 입력받는 값 처리해주는 Class
 * WriteActionController 와 UpdateActionController 에서 사용
 */
public class BoardCommand {
private String productName, summary, top, bottom, dress, productImage, productContent;
private int productPrice, countProduct, sumOfProduct, delivery;

public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
public String getTop() {
	return top;
}
public void setTop(String top) {
	this.top = top;
}
public String getBottom() {
	return bottom;
}
public void setBottom(String bottom) {
	this.bottom = bottom;
}
public String getDress() {
	return dress;
}
public void setDress(String dress) {
	this.dress = dress;
}
public String getProductImage() {
	return productImage;
}
public void setProductImage(String productImage) {
	this.productImage = productImage;
}
public String getProductContent() {
	return productContent;
}
public void setProductContent(String productContent) {
	this.productContent = productContent;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public int getCountProduct() {
	return countProduct;
}
public void setCountProduct(int countProduct) {
	this.countProduct = countProduct;
}
public int getSumOfProduct() {
	return sumOfProduct;
}
public void setSumOfProduct(int sumOfProduct) {
	this.sumOfProduct = sumOfProduct;
}
public int getDelivery() {
	return delivery;
}
public void setDelivery(int delivery) {
	this.delivery = delivery;
}


}
