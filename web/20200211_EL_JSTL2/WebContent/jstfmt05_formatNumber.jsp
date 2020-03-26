<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<pre>
	ko_KR/en_US/en_GB
	<fmt:setLocale value="ko_kr"/>
	number:<fmt:formatNumber value="9876543.61" type="number"/>
	currency:<fmt:formatNumber value="9876543.61" type="currency"/>
	percent:<fmt:formatNumber type="percent">9876543.61</fmt:formatNumber>
	
	pattern=".000"  :<fmt:formatNumber value="9876543.61" pattern=".000"/>
	pattern="#,#00.0#":<fmt:formatNumber value="9876543.612345" pattern="#,#00.0#"/>
	</pre>
</body>
</html>