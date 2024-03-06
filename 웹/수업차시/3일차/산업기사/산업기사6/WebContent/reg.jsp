<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script>
 function check(){
	// alert("dkfkf");
	let frm = document.frm;
	let s_id  = frm.s_id;
	let s_name  = frm.s_name;
	let teacher_id = frm.teacher_id;
	let s_grade = frm.s_grade;
	let weekday = frm.weekday;
	let start_h = frm.start_h;
    let end_h = frm.end_h;
	
	
	if( s_id.value == ""){
	     alert("코드를 입력하세요");
	     s_id.focus();
	}else if( s_name.value  ==""){
		alert("이름을 입력하세요");
		s_name.focus();
	}else if( teacher_id.value ==""){
		alert("담당강사를 선택하세요");
	}else if( s_grade.value ==""){
		alert("학점을 입력하세요");
		s_grade.focus();
	}else if( weekday.value ==""){
		alert("요일을 선택하세요");
	}else if( start_h.value ==""){
		alert("시작시간 입력하세요");
		start_h.focus();
	}else if( end_h.value ==""){
		alert("종료시간 입력하세요");
		end_h.focus();
	}else{
		frm.submit();
	}
	
 }

</script>
</head>
<body>



<form name="frm" action="reg_action.jsp"  method="post">
<table>
<tr>
<td>교과목코드</td>
<td><input type="text"   name="s_id"    ></td>
</tr>

<tr>
<td>교과명</td>
<td><input type="text" name="s_name"></td>
</tr>

<tr>
<td>담당강사</td>
<td>
  <select name="teacher_id">
  	<option value=""> 선택하세요</option>
  	<option value="1">정국교수</option>
  	<option value="2">뷔교수</option>
  	<option value="3">지민교수</option>
  	<option value="4">제이홉교수</option>
  	<option value="5">슈가교수</option>
  	<option value="6">진교수 </option>
  	<option value="7">RM교수 </option>	
  	  	
  	
  </select>
</td>
</tr>

<tr>
<td>학점</td>
<td><input type="text" name="s_grade"></td>
</tr>

<tr>
<td>요일</td>
<td>
 <input type="radio" value="M"  name="weekday"> 월
 <input type="radio" value="TU" name="weekday"> 화 
 <input type="radio" value="W"  name="weekday"> 수
 <input type="radio" value="TH" name="weekday"> 목
 <input type="radio" value="F"  name="weekday"> 금
 <input type="radio" value="S"  name="weekday"> 토
</td>
</tr>


<tr>
<td>수업시작시간</td>
<td><input type="text" name="start_h"></td>
</tr>

<tr>
<td>수업종료시간</td>
<td><input type="text" name="end_h"></td>
</tr>


<tr>
 
<td  colspan="2">
 <input type="button"   onclick="check()"  value="저장"> 
 <input type="reset" value="취소">
 </td>
</tr>

</table>

</form>
</body>
</html>