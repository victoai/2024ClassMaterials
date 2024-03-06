<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
 
 function check(){
	 
	 let frm  = document.frm;
	 let  likes  = frm.like;
	 
	 
	 for( let i=0; i< likes.length ; i++){
		 if( likes[i].checked ){
			  alert( likes[i].value);
		 }
	 }
 }
</script>

</head>
<body>


<form name="frm"  onsubmit="return check();">
<input type="radio" name="like"  value="아아">아아
<input type="radio" name="like"  value="라떼">라떼
<button>등록</button>
</form>



</body>
</html>