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
					<td><fmt:formatNumber type="number" maxFractionDigits="3" value="${list.no}"/></td>
					<td><a href="/board/view?tNo=${list.tNo}">${list.tTitle}</a></td>
					<td>${list.tWriter}</td>
					<td><fmt:formatDate value="${list.tDate}" pattern="yyyy-MM-dd" /></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<ul>
		<c:if test="${Maker.prev }">
		<li>
			<a href='<c:url value="/board/list?page=${Maker.startPage-1 }"/>'>prev</a>
		</li>
		</c:if>
		<c:forEach begin="${Maker.startPage}" end="${Maker.endPage }" var="pageNum">
			<span>
				<a href='<c:url value="/board/list?page=${pageNum }"/>'>${pageNum }</a>
			</span>
		</c:forEach>
		
		<c:if test="${Maker.next && Maker.endPage >0 }">
    		<li>
        		<a href='<c:url value="/board/list?page=${Maker.endPage+1 }"/>'>next</a>
    		</li>
    	</c:if>
	</ul>
	
	
	
	<a href="/board/write">게시물 작성</a>
</body>
</html>