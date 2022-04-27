<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보 변경폼</h1>
<form action="membermybatisinsert" method="post" >
	아이디<input type=text name="id" value=${param.id } readonly="readonly"><br>
	이름<input type=text name="name" ><br>
	주소<input type=text name="address" ><br>	
	<input type=submit value="회원정보수정">
</form>
</body>
</html>