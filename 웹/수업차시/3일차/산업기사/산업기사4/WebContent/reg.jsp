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
    margin:0 auto;
    border-collapse: collapse;
}

td{
	border:1px solid black;
}


td:nth-child(1){
text-align: center;
}
</style>


<script>
// 유효성
function check(){
	alert("dkfkfkfk");
	//유효성  , 라디오 => 입력메시지 	
    let frm = document.frm ;
	
	
    let  v_jumin  = frm.v_jumin;
    let  v_name = frm.v_name;
    let  n_no = frm.n_no;
    let  v_area  =frm.v_area;
    let  v_time  = frm.v_time;
    let v_confirm = frm.v_confirm;
    
        
    
    if( v_jumin.value  =="" ) {
        alert("주민번호 입력하세요");
        v_jumin.focus();
    }else if( v_name.value ==""  ){
    	alert("이름을 입력하세요");
    	v_name.focus();
    }else if( n_no.value=="" ){
    	alert("후보자이름 선택하세요");   	
    }else if(v_area.value=="" ){
    	alert("선택하세요");
    	v_area.focus();
    }else if( v_time.value==""){
    	alert("입력하세요");
    	v_time.focus();
    }else if( v_confirm.value =="" ){
    	alert("선택하세요");
    }else{
    	 frm.submit();
    }    
     //frm.submit();
     
}
</script>
</head>
<body>

<form name="frm"  action="reg_action.jsp"  method="post">
<table>
<tr>
<td> 투표자주민번호</td>
<td> <input type="text"  name="v_jumin"></td>
</tr>
<tr>
<td> 투표자이름</td>
<td> <input type="text"  name="v_name"></td>
</tr>
<tr>
<td> 후보자이름 </td>
<td>
   <select name="n_no">
   	<option>선택하세요</option>
   	<option value="1001">김후보</option>
   	<option value="1002">이후보</option>
   	<option value="1003">최후보</option>
   	<option value="1004">박후보</option>
   	<option value="1005">우후보</option>
   	<option value="1006">정후보</option>
   </select> 
</td>
</tr>
<tr>
<td> 투표장</td>
<td> <input type="text"  name="v_area"></td>
</tr>
<tr>
<td> 투표시간</td>
<td> <input type="text" name="v_time"></td>
</tr>
<tr>
<td> 유권자확인 </td>
<td> 
   <input type="radio" value="y"  name="v_confirm"> 확인
   <input type="radio" value="n" name="v_confirm"> 미확인
</td>
</tr>
<tr> 
<td colspan="2"> 
 <input type="button"  value="저장"  onclick="check()">
 <input type="reset"  value="취소">
</td>
</tr>
</table>
</form>

</body>
</html>