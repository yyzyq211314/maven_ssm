<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>帅气多汁你泽哥</title>
<link  rel="stylesheet"  href="<%=request.getContextPath()%>/resources/css/main.css">
</head>
<body>
	<c:forEach items="${branchs }"  var="branch">
		${branch.id } --> ${branch.name }-->${branch.short_name }-->${branch.come_time }<br>
	</c:forEach>
</body>
</html>