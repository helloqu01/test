
	CREATE TABLE board( /*�Խ��� ���̺� �⺻����*/
	idx int(11) NOT NULL auto_increment,/*�� ��ȣ(�ڵ�����)*/
	/*PW int(50) NOT NULL,*/
	name varchar(10) NOT NULL,/*�۾���*/
	title varchar(50) NOT NULL,/*������*/
	contents text NOT NULL,/*�۳���*/
	email varchar(20) NOT NULL,/*�۾��� ����*/
	/*mkate datetime NOT NULL,/*ó�� ���� ��¥���Խ�*/*/
	/*modate datetime NOT NULL,/*������ ���� ��¥���Խ�*/*/
	hit int(10) not null default 0, /*��ȸ��*/
	depth int(11) NOT NULL default 0,/*��ۿ���*/
	uid int(11) NOT NULL,/*�������*/
	PRIMARY KEY(idx) /*�ߺ� �� ������� ����*/
	);
	
	/*mysql�Լ�
	 * count() ���� ���ϴ� ��
	 * now()�ð� ���ϴ� ��
	 * sum() �ձ��ϴ� ��
	 * avg() �� ���ϴ� ��
	 * max() �ִ밪 ���ϴ°�
	 * min() �ּҰ� ���ϴ� ��
	 * MAX(uid)+1 uid�� �ִ밪�� 1�� ���ϴ� ��
	 * insert into board (name,title) values(?,?) values=> ���� ���� ��
	 * �ڹٿ��� ResultSet�� select ���� �޴´� �׷��� rs.next()�� ���ش�.
	 * �ű⼭ ��������  00= rs.getInt() �� ����*/
	
	/*����
	 * 1. select
	 * 2.insert
	 *  	��� insect ���� uid 
	 * 		1. update
	 * 		depth ������ 0 ����� 1*/
	���ο� �۾��� query
	SELECT MAX(uid)+1 FROM board;
	insert into board (name,title,message,email,check,hit,pass,depth,uid)
				values('name','title','message','email','now()',hit,'pass',depth,uid);
	
	�ۼ��� query
	select pass from board where idx = 'no';
	update board set name = 'name',title ='title',message='message',email='email' mkdata = 'mkdata' where no='no';
	
	�ۻ��� query
	select pass from board where idx ='no';
	delete from board where idx ='no';
	
	��۾��� query
	depth=depth+1; /*�� ���� depth�� ���� ����*/
	update board set uit+1 where uid >=$uid;
	insert into board (name,title,message,email,check,hit,pass,depth,uid)
				values('name','title','message','email','now()',hit,'pass',depth,uid);
	
	