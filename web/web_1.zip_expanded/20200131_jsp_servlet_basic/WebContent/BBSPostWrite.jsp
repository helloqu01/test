<%@ page import = "java.io.*,java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기 ? 결과 화면</title>
</head>
<body>
	<h2>글쓰기</h2>
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Date date = new Date();
		Long time =  date.getTime();
		String filename =  time+".txt";
		PrintWriter writer = null;
		
		try{
		String filePath = application.getRealPath("/WEB-INF/BBS/"+filename);
		writer=new PrintWriter(filePath);
		writer.printf("제목: %s %n", title);
		writer.printf("글쓴이: %s %n", name);
		writer.println(content);
		out.println("저장되었습니다.");
		}
		catch(IOException ioe){
			out.println("파일에 데이터를 쓸 수 없습니다.");
		}
		finally{
			try{
				writer.close();
			}
			catch(Exception e){
				
			}
		}
				
	%>
</body>
</html>