<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.*"%>
       <%
    	String ok = request.getParameter("OK");
    	String result = null;
    	if(ok.equals("OK")){
    		String id = (String)session.getAttribute("ID");
    		PrintWriter writer = null;
    		try{
    			String filePath = application.getRealPath("/WEB-INF/"+id+".txt");
    			writer = new PrintWriter(filePath);
    			writer.println("아이디:"+id);
    			result = "SUCCESS";
    		}
    		catch(IOException ioe){
    			result = "FAIL";
    		}finally{
    			try{
    				writer.close();
    			}
    			catch(Exception e){
    				
    			}
    		}
    	}
    	else{
    		result = "FAIL";
    	}
    	session.invalidate();
    	
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>중복 확인 결과</h3>
	<% 
		if(result.equals("SUCCESS"))
			out.println("사용 가능한 아이디 입니다.");
		else
			out.println("중복 아이디입니다.");
	
	%>
	<input>

</body>
</html>