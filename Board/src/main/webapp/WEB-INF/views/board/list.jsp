<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.tNo}</td>
					<td><a href="/board/view?tNo=${list.tNo}">${list.tTitle}</a></td>
					<td>${list.tWriter}</td>
					<td>${list.tDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a href="/board/write">게시물 작성</a>
	</div>
</body>
</html>