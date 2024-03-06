<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function  gugudan(){
 	           let dan = document.getElementById("dan").value;
               alert( dan );
               let  wrap  = document.getElementById("wrap");

               for( let i=1; i<=9 ; i++)
               {
                  wrap.innerHTML +=  dan * i  + "<br>";
               }              
       
  }
</script>
</head>  
  
<body>

       <input type="text" id="dan">
       <button onclick="gugudan()"> 구구단출력  </button>
      
       <div id="wrap">  
       </div>


     


   </body>
</html>