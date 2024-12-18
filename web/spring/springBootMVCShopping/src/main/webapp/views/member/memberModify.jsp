<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberModify.jsp</title>
</head>
<body>
회원수정 페이지입니다.<br />
<form action="memberModify" method="post" th:object="${memberCommand}">
회원번호 : <input typ="text" th:field="*{memberNum}" name="memberNum"> <br />
이름 : <input type="text" name="memberName" th:field="*{memberName}"/><br />
아이디 : <input type="text" name="memberId" th:field="*{memberId}"/><br />
주소 : <input type="text" name="memberAddr" th:field="*{memberAddr}" /><br />
상세주소 : <input type="text" name="memberAddrDetail" th:field="*{memberAddrDetail }"/><br />
우편번호 : <input type="text" name="memberPost" th:field="*{memberPost}"/><br />
연락처1 : <input type="tel" name="memberPhone1" th:field="*{memberPhone1}"/><br />
연락처2 : <input type="tel" name="memberPhone2" th:field="*{memberPhone2}"/><br />
성별 : <input type="radio" name="gender" value="M" 
		<c:if test="${dto.gender == 'M' }">checked</c:if> />남자
	  <input type="radio" name="gender" value="F" 
	  	<c:if test="${dto.gender == 'F' }">checked</c:if>  />여자	<br />
등록일 : <input type="date" name="memberRegist" value="${dto.memberRegist }"/><br />
생년월일 : <input type="date" name="memberBirth" value="${dto.memberBirth }"/><br />
이메일 : <input type="email" name="memberEmail" th:field="*{memberEmail}"/><br />
<input type="submit" value="회원수정 완료" /> 
<input type="button" value="회원목록" onclick="javascript:location.href='memberList.mem'">
</form>

</body>
</html>