//alert("test");

function check(){	
	
	alert("유효성");	
	
	let frm  = document.frm;		
	let join_id = frm.join_id;
	let join_nm = frm.join_nm ;	
	let year  = frm.year;
	let month = frm.month;
	let day = frm.day;
	
	let gender = frm.gender;
	let specialty  = frm.specialty;
	let charm = frm.charm;
	
 		
	if( join_id.value == "" ){
		alert(" 아이디를 입력하세요 ");
		join_id.focus();		 
	}else if( join_nm.value =="" ){
		alert("이름을 입력하세요");
		join_nm.focus();
	}else if(  year.value =="" || month.value =="" || day.value =="" ){
		alert("생일을 입력하세요");
		year.focus();
	}else if(  gender.value ==""){
		alert("성별을 선택하세요");
		gender[0].focus();
	}else if(specialty.value =="" ){
		alert("스페셜무대 선택하시오");
		specialty.focus();
	}else if( charm.value ==""){
		alert("매력무대를 입력하세요");
		charm.focus();
	}	
	else{  // 위의 모든 사항이 아닌경우 정상적으로  submit 수행
	//유효성 	
		frm.submit();
	}
	
}