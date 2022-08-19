<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

this is two

<c:forEach items="${address}" var="ele">
	<tr>
		<td>${address.add}</td>
	</tr>
</c:forEach>

</body>
</html>