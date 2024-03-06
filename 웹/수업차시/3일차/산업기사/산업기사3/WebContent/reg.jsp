<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="index.css"  rel="stylesheet">
<link href="reg.css"  rel="stylesheet">
<script src="reg.js" ></script>
 
</head>
<body>

<header>
 <h2> HY라우드 오디션  ver 1.0</h2> 
</header>
<nav>
<a href="reg.jsp">참가자등록</a>
<a href="search1.jsp">참가자목록조회</a>
<a href="search2.jsp">참가자점수조회</a>
<a href="search2.jsp">참가자등수조회</a>
<a href="index.jsp">홈으로</a>
</nav>
<section>
 <form name="frm"  action="reg_action.jsp" method="post" >
 <table>
 <caption>참가자 등록</caption>
 
 <tr>
 <td>참가자ID</td>
 <td><input type="text" name="join_id"></td>
 </tr>
 
 <tr>
 <td>참가자이름</td>
 <td><input type="text" name="join_nm"></td>
 </tr>
 
  <tr>
 <td>생년월일</td>
 <td><input type="text" class="birth" name="year">년
     <input type="text" class="birth" name="month">월
     <input type="text" class="birth" name="day">일
 </td>
 </tr>
 
   <tr>
 <td>성별</td>
 <td><input type="radio" name="gender"  value="M">남 
     <input type="radio" name="gender"  value="F">여
 </td>
 </tr>
 
 <tr>
 <td>실력무대</td>
 <td>
 <select name="specialty">
 <option value="">선택하시오</option>
 <option value="V">보컬</option>
 <option value="D">댄스</option>
 <option value="R">랩</option>   
 </select>
 </td>
 </tr>
 
 
 <tr>
 <td>매력무대</td>
 <td>
  	<input type="text" name="charm">
 </td>
 </tr>
 
  <tr> 
 <td colspan="2">
  	<input type="button" value="저장"  onclick="check()">
  	<input type="reset" value="취소">
 </td>
 </tr>
 
 </table>
 
 </form>
 
</section>
<footer>
  <h3>HRD KOREA </h3> 
</footer>


</body>
</html>