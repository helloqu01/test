package thread_ex;
public class ThreadClass extends Thread {//컨트롤 키 + Thread 클릭하면 Thread.class가 나온다.
String name= null;
public ThreadClass () {// 기본생성자

}
public ThreadClass (String n) {// 외부값을 전달 받는 생성자(ThreadClass t1= new ThreadClass("t1");)

this.name=n;

}

// 반드시 run()가 필요

public void run(){// 실제 스레드 (Thread로부터 상속 받은 매소드)

for(int i=0;i<50;i++){ //내부 실행 내용 재정의

System.out.println(name+":"+i);//0~49까지 출력

}

}

/* // 아래 생성자들은 Overloading된 생성자들

​

public ThreadClass(Runnable target) {

super(target);

// Runnable 인터페이스를 구현받은 객체를 전달 받는 생성자

}

​

public ThreadClass(String name) {

super(name);

// 스레드 이름을 전달 받는 생성자

}

​

public ThreadClass(ThreadGroup group, Runnable target) {

super(group, target);

// 스레드 그룹과 Runnable 인터페이스를 구현받는 객체를 전달받는 생성자

}

​

public ThreadClass(ThreadGroup group, String name) {

super(group, name);

// 스레드 그룹과 스레드 이름을 전달 받는 생성자

}

​

public ThreadClass(Runnable target, String name) {

super(target, name);

// Runnable 인터페이스를 구현받는 객체와 스레드 이름을 전달받는 생성자

}

​

public ThreadClass(ThreadGroup group, Runnable target, String name) {

super(group, target, name);

// 스레드 그룹과 Runnable 인터페이스를 구현받는 객체, 스레드 이름을 전달받는 생성자

}

​

public ThreadClass(ThreadGroup group, Runnable target, String name, long stackSize) {

super(group, target, name, stackSize);

// 스레드 그룹과 Runnable 인터페이스를 구현받는 객체, 스레드 이름

// 작업시 필요한 메모리 (스택) 크기를 전달받는 생성자

}*/

}