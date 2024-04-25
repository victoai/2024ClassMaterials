<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form  action="/batis2/board"  method="get">
<select name="condition">
<option>검색어 선택</option>
<option value="writer">작성자</option>
<option value="title">제목</option>
<option value="content">내용</option>
</select>

<input type="text" name="keyword">
<button> 검색</button>
</form>


<c:forEach  var="item" items="${list }">
${item.writer }
${item.title }
</c:forEach>
 
</body>
</html>