<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.tNo}</td>
					<td><a href="/board/view?tNo=${list.tNo}">${list.tTitle}</a></td>
					<td>${list.tWriter}</td>
					<td><fmt:formatDate value="${list.tDate}" pattern="yyyy-MM-dd" /></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<ul>
		<c:if test="${mk.prev }">
		<li>
			<a href='<c:url value="/board/list?page=${mk.startPage-1 }"/>'></a>
		</li>
		</c:if>
		<c:forEach begin="${mk.startPage}" end="${mk.endPage }" var="pageNum">
			<li>
				<a href='<c:url value="/board/list?page=${pageNum }"/>'>${pageNum }</a>
			</li>
		</c:forEach>
		
		<c:if test="${mk.next && mk.endPage >0 }">
    		<li>
        		<a href='<c:url value="/board/list?page=${mk.endPage+1 }"/>'></a>
    		</li>
    	</c:if>
	</ul>
	
	
	
	<a href="/board/write">게시물 작성</a>
</body>
</html>