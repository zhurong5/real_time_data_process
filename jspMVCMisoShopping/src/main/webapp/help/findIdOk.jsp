<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findIdOk.jsp</title>
</head>
<body>

	<c:if test="${!empty userId }">
		아이디 : ${userId }
	</c:if>
	<c:if test="${empty userId }">
		<script>
			alert("잘못된 아이디");
		</script>
	</c:if>
</body>
</html>
