<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
 table{
    border:1px solid black;
    width:400px;
    margin:0 auto;
 }
 td{
 	border:1px solid black;
 }
 
 td:nth-child(1){
 text-align: center;
 }
</style>

<script>
 function  check(){
	 alert("유효성검사");
	 document.frm.submit();
 }

</script>
</head>
<body>

<form name="frm"  action="reg_action.jsp"   method="post"  >

 <table>
 <caption>고객등록</caption>
 <tr>
 <td>아이디</td>
 <td><input type="text"  name="id"></td>
 </tr>
 
 <tr>
 <td>이름</td>
 <td><input type="text"  name="name"></td>
 </tr> 
 <tr>
 <td>주소</td>
 <td><input type="text"  name="address"></td>
 </tr>
 
 
 <tr>
 <td>전화번호</td>
 <td><input type="text"  name="tel"></td>
 </tr>
 
 <tr>
 <td colspan="2">
 <input type="button" value="등록"   onclick="check()">
 <input type="reset" value="취소">
 </td> 
 </tr>
 
 </table>
 
 </form>
</body>
</html>