<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.tNo}</td>
					<td><a href="/view?tNo=${list.tNo}">${list.tTitle}</a></td>
					<td>${list.tDate}</td>
					<td>${list.tWriter}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>