<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employeeList</title>
</head>
<body>
	직원리스트 <br />
	<a href="employeeWrite.emp">직원등록</a> <br />
	직원수 : ${list.size() } <br />
	<table border="1" width="600">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>아이디</td>
			<td>고용일</td>
		</tr>
		<c:forEach items="${list }" var="dto">
			<tr>
				<td><a href="employeeDetail.emp?empNum=${dto.empNum }">${dto.empNum }</a></td>
				<td><a href="employeeDetail.emp?empNum=${dto.empNum }">${dto.empName }</a></td>
				<td>${dto.empId }</td>
				<td>${dto.empHireDate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>