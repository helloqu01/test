package Method;
public class MainClass {

public static void main(String[] args) {

	//사본을 보관하는 것을 객체라고 한다.크게 통틀어 변수이다.

	BookClass b1 = new BookClass();//사본

	b1.author = "저자";//내용을 넣어줌
	b1.price = 200;//내용을 넣어줌 원가
	b1.realPrice(120);//할인가를 넣어준 실제판매한가

	System.out.println("저자의 실제 판매가는 :"+ b1.r_price);//실제 판매가를 나타냄

	BookClass b2 = new BookClass();//사본2

	b2.author = "홍길동";
	b2.price = 150;
	b2.realPrice(100);

	System.out.println("홍길동의 실제 판매가는 :"+ b1.r_price);

	BookClass[] books= new BookClass[2]; //배열 안에 2개가 있다.공간을 만들어놓고 배열하는 방식 세 줄을 써야함

	books[0]=b1;
	books[1]=b2;	

	System.out.println(books[0].author);
	System.out.println(books[1].author);

	BookClass[] books2={b1,b2}; //넣음과 동시에 방을 만들어 배열하는 방식 한 줄로 가능해서 경제적임

	System.out.println(books2[0].author);
	System.out.println(books2[1].author);
	System.out.println(books[0].author+"||"+books2[0].author);

	}
}