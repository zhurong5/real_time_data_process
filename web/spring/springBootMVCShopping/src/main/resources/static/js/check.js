/**
 * check.js
 */
	$("#userId").on("change keyup", function() {
		$.ajax({
			type : "post",
			url : "/login/userIdCheck",
			data : {"userId": $("#userId").val()},
			dataType : "text",
			success : function(result) {
				if(result == "1"){
					$("#idcheck").text("사용중인 아이디입니다");
					$("#idcheck").css("color","red");
				}else{
					$("#idcheck").text("사용가능한 아이디입니다");
					$("#idcheck").css("color","blue");
				}
			},
			error: function() {
				alert("서버오류");
			}
		});
	});
	$("#userEmail").on("change keyup", function() {
		$.ajax({
			type : "post",
			url : "/login/userEmailCheck",
			data : {"userEmail": $("#userEmail").val()},
			dataType : "text",
			success : function(result) {
				if(result == "1"){
					$("#emailcheck").text("사용중인 이메일입니다");
					$("#emailcheck").css("color","red");
				}else{
					$("#emailcheck").text("사용가능한 이메일입니다");
					$("#emailcheck").css("color","blue");
				}
			},
			error: function() {
				alert("서버오류");
			}
		});
	});