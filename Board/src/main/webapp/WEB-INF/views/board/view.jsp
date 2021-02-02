<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="http://code.jquery.com/jquery-3.5.0.js" ></script>

<script type="text/javascript">



$(document).on(function(){
    $('#modify').click(function(){
    	var pw = $('#tpassword').val();
        alert(pw);
    	$("#check").attr("action", "/board/modify?tNo=${view.tNo}&tPassword=$('#tpassword').val()");
    	$("#check").attr("method", "get");
        alert('modify');
    });
    $('#delete').click(function(){
    	$('#check').action = "/board/delete?tNo=${view.tNo}&tPassword=$('#tpassword').val()";
    	$('#check').method = "post";
        alert('delete')
    });
});

</script>


<title>게시물 내용</title>
</head>
<body>
	<label>제목</label> ${view.tTitle}
	<br />
	<label>작성자</label> ${view.tWriter}
	<br />
	<label>내용</label> ${view.tContents }

	<form id="check">
		<label>비밀번호 
			<input type="password" id="tpassword" placeholder="비밀번호를 적으세요">
		</label>

		<input id="modify" type="button" value="수정" onclick="javascript: form.action=/board/modify?tNo=${view.tNo}&tPassword=$('#tpassword').val()" >
		<input id="delete" type="button" value="삭제" onclick="">
		<!-- 
		 <a href="/board/modify?tNo=${view.tNo}">게시물 수정</a>
		<a href="/board/delete?tNo=${view.tNo}">게시물 삭제</a>
		 -->
	</form>
</body>
</html>