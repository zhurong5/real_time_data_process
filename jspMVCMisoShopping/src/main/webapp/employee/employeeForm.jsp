<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="js/daumAddressScript.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="js/checkScript.js"></script>
<title>employeeForm</title>
</head>
<body>
	직원등록페이지입니다
	<form action="employeeRegist.emp" method="post">
	직원번호 : <input type="text" name="empNum" value="${empNum }" readonly="readonly"><br />
	직원아이디 : <input type="text" name="empId" id="userId" readonly="readonly"><br />
	직원비밀번호 : <input type="password" name="empPw"><br />
	직원비밀번호확인 : <input type="password" name="empPwcon"><br />
	직원명 : <input type="text" name="empName"><br />
	직원주소 : <input type="text" name="empAddr" id="sample4_roadAddress" readonly="readonly">
			<button type="button" onclick="execDaumPostcode();">우편번호검색</button><br />
	상세주소 : <input type="text" name="empAddrDetail"><br />
	우편번호 : <input type="text" name="empPost" id="sample4_postcode" readonly="readonly"><br />
	직원연락처 : <input type="tel" name="empPhone"><br />
	직원주민번호 : <input type="tel" name="empJumin"><br />
	회원이메일 : <input type="email" name="empEmail"><br />
	<input type="submit" value="직원등록">
	</form>
</body>
</html>