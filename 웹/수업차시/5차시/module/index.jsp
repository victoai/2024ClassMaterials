<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<!-- header가 들어 갈 자리 -->
<h2>  include  </h2>

<p>
중복되는 코드를 별도의 파일로 두고 포함시킬 수 있다. 
유지보수성이 좋다 
</p>

<h2>각 header, footer는  각 페이지 마다 공통적이다  include사용하여 하나의 파일로 만들 수 있다</h2>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>