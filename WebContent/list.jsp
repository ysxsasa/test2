<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>头像</td>
		<Td>用户ID</Td>
		<Td>上传人</Td>
		<Td>原始文件名</Td>
		<Td>文件存储路径</Td>
		<Td>新文件名</Td>
	</tr>
	<c:forEach items="${list }" var="ew">
	<tr>
		<td><img src="${ew.impath }" style="width:100px;height:100px"></td>
		<Td>${ew.usid }</Td>
		<Td>${ew.uname }</Td>
		<Td>${ew.imname }</Td>
		<Td>${ew.impath }</Td>
		<Td>${ew.imbm }</Td>
	</tr>
	
	</c:forEach>
	</table>

</body>
</html>