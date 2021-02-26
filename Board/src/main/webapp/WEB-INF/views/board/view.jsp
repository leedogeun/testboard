<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

<title>게시물 내용</title>
</head>
<body>
	<label>제목</label> ${view.tTitle}
	<br />
	<label>작성자</label> ${view.tWriter}
	<br />
	<label>내용</label> ${view.tContents }

	<form role="check" method="POST">
		<label>비밀번호
			<input type="password" id="tPassword" placeholder="비밀번호를 적으세요">
		</label>
		<input id="modify" type="submit" value="수정">
		<input id="delete" type="submit" value="삭제">
		<input id="list" type="submit" value="목록">
	</form>
</body>

<script type="text/javascript">
var form = $("form[role='check']");
	$("#modify")
		.click(	
		/* .mousedown( */
				function() {
					var pw = $("#tPassword").val();
					form.attr("action","/board/modify?tNo="+${view.tNo}+"&tPassword="+pw);
					form.submit();
				});
	$('#delete')
		.click(	
				function() {
					var pw = $("#tPassword").val();
					form.attr("action","/board/delete?tNo="+${view.tNo}+"&tPassword="+pw);
					form.submit();
				});
	$('#list')
		.click(	
			function() {
				form.attr("action","/board/list");
				form.attr("method","GET");
				form.submit();
			});
</script>
</html>