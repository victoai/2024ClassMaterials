<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>SQL 실행 단계 알아보기</h3>
<ol>
<li>쿼리 문장 분석</li>
<li>컴파일</li>
<li>실행</li>
</ol>


쿼리문을 수행할 때마다 SQL 실행단계 1~3 단계를 거침
SQL 문을 수행하는 과정에서 매번 컴파일을 하기 때문에 성능상 이슈 발생
실행되는 SQL문을 확인 가능


컴파일이 미리 되어있기 때문에 Statement에 비해 좋은 성능
특수문자를 자동으로 파싱해주기 때문에 SQL injection 같은 공격을 막을 수 있음
"?" 부분에만 변화를 주어 쿼리문을 수행하므로 실행되는 SQL문을 파악하기 어려움
 
 
 statement : 매번 쿼리를 수행할 때마다 1~3단계를 거친다.
PreparedStatement : 처음 한 번만 3단계를 거친 후 캐시에 담아 재 사용한다.
<h2>Statement: </h2>

Statement는 SQL 쿼리를 실행하기 위한 인터페이스
간단한 SQL 쿼리를 실행할 때 사용 
쿼리가 실행되기 전에 쿼리 문자열은 데이터베이스 서버로 그대로 전송됨
매번 SQL 쿼리가 실행될 때마다 데이터베이스 서버에서 쿼리 문장을 파싱하고 컴파일해야 하므로, 동일한 쿼리를 여러 번 실행할 때 효율성이 떨어질 수 있음

<h2> PreparedStatement </h2>
PreparedStatement는 미리 컴파일된 SQL 쿼리를 나타내는 인터페이스 
동일한 쿼리를 반복해서 실행해야 할 때 효율적임
쿼리의 미리 컴파일과 파싱은 최초 실행 시에 한 번만 수행되며, 이후에는 매개 변수만 바인딩되어 실행됨
쿼리의 파라미터에 값을 동적으로 바인딩하여 쿼리를 실행할 수 있다. 
SQL 쿼리의 재사용성과 보안성을 높이는 데 도움이 된다
파라미터 값은 자동으로 이스케이프되어 SQL 쿼리 인젝션 공격을 예방하는 데 도움이 됩니다.

<p>
 PreparedStatement는 Statement의 확장된 버전임, 미리 컴파일되고 매개 변수 바인딩을 통해 보다 효율적으로 SQL 쿼리를 실행할 수 있게 해줌
 . SQL 쿼리의 재사용성, 보안성 및 성능 향상을 위해 가능하면 PreparedStatement를 사용하는 것이 좋음.
</p>

</body>
</html>