<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>idCheck</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var userId = $('#userId').val();
			$(opener.document).find("#userId").val(userId);
			window.self.close();
		});
	});
</script>
<body>
	<form action="idCheck.nhn" method="post">
		<table border="1">
			<tr>
				<td>검색 : <input type="search" name="userId" id="userId" value="${userId }">
				<input type="submit" value="아이디검색">
				<c:if test= "${empty auth && !empty userId }" >
					<div>사용 가능 아이디입니다
					<button type="button" id="btn">아이디 사용</button></div>
				</c:if>
				<c:if test= "${!empty auth }" >
					<div>사용중인 아이디입니다</div>
				</c:if>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>