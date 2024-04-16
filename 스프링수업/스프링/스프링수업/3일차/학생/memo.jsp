<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MEMO</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<style>
	table{
		border-collapse: collapse;
	}
	td{
		border: 1px solid black;
		text-align: center;
	}
</style>

<script>
	
	function search(){
		$.ajax({
	 		type:"GET" ,
	 		url: "/day3/search" ,
	 		success : function( data){
	 			console.log(data);
	 			let result  = toHTML(data);
	 			$("#tableRst").html( result);
	 		},
	 		error: function(){
	 			alert( "error");
	 		}
	 	});	
	
	}

	 function toHTML(d ){
		let str ="<tr>"
				+ "<td>순번</td>"
				+ "<td>코드</td>"
				+ "<td>내용</td>"
				+ "<td>관리</td>"
				+ "</tr>";
	 	for(let i=0; i<d.length; i++){
	 		let item = d[i];
	 		str = "<tr>""
				+ "<td>"+item.num+"</td>"
				+ "<td>"+item.code+"</td>"
				+ "<td>"+item.content+"</td>"
				+ "<td>"+
			<td>${item.code}</td>
			<td>${item.content}</td>
			<td>
				<button onclick="update('${item.code}', '${item.content}')">수정</button>
				<button onclick="deletesend('${item.code}')">삭제</button>
			</td>
		</tr>
	 			
	 			
	 			
	 			<c:forEach var="item" items="${memoList}">
			<tr>
				<td>${item.num}</td>
				<td>${item.code}</td>
				<td>${item.content}</td>
				<td>
					<button onclick="update('${item.code}', '${item.content}')">수정</button>
					<button onclick="deletesend('${item.code}')">삭제</button>
				</td>
			</tr>
		</c:forEach>
	 	}
	 
	 }




	function registersend(){
		let content = document.getElementById("iptReg").value;
		// let content = $(#iptReg).val()
		
		$.ajax({
			type: "post",
			dataType: "text",
			url: "/day3/register",
			data: "content=" + content,
			success: function(data){
				window.location.reload();
			},
			error: function(){
				alert("요청실패");
			}
		});
	}
	
	function update(code, content){
		
		let str = "<input id=\"inputContent\" type=\"text\" value=\""+content+"\">"
				+ "<button onclick=\"updatesend('"+code+"')\">수정</button>";
		$("#result").append(str);
		
	}
	
	function updatesend(code){
		
		let content = document.getElementById("inputContent").value;
		
		let memo = {code: code , content :content};
		let memos  = JSON.stringify( memo);		
		
		$.ajax({
			type: "put",
			data: memos,
			contentType: "application/json",
			url: "/day3/update",
			success: function(data){
				$("#result").empty();
				window.location.reload();
			},
			error:function(){
				alert("요청실패");
			}
		});
	}
	
	function deletesend(code){
		$.ajax({
			type: "delete",
			dataType: "text",
			url: "/day3/delete/"+code,			 
			success: function(data){
				window.location.reload();
			},
			error: function(){
				alert("요청실패");
			}
		});
	}
</script>
</head>
<body>

	<h2> MEMO </h2> 
	
	<input type="text" id="iptReg">
	<button onclick="registersend()">등록</button>
	
	
	<button onclick="search()">등록</button>
	<table id="tableRst">
		
		
	</table>

	<div id="result">
	</div>

</body>
</html>