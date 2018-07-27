<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<a href="querysel.sw">回列表</a>
<form action="queryins.sw" method="post" enctype="multipart/form-data" >
上传人：<input type="text" name="uname"><br>
密码：<input type="password" name="pawd"><br>
头像：<input type="file" name="fs"><br>
<input type="submit" value="文件上传">
</form>

</body>
</html>