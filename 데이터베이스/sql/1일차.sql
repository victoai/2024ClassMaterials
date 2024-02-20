select * from emp;


create table  acorntbl (
    id  varchar2(10) primary key,
    pw  varchar2(10) ,
    name varchar2(10)
);

insert into acorntbl values('dy', '4482', '곽단야');
insert into acorntbl values('mg','1234', '김민규');
insert into acorntbl  values('mj' ,'0000' , '김민지');
insert into acorntbl  values('bj','6666','김병진');
insert into acorntbl values('jy', '1127', '김재열');
insert into acorntbl values('hs', '0317', '김현수');
insert into acorntbl values('nj','9876','문나정');
insert into acorntbl values('jw', '1111', '박지원'); 
insert into acorntbl values('tm', '4482', '박태민');
insert into acorntbl values('yj','0117','서예진'); 
insert into acorntbl values('y','1126','이윤');
insert into acorntbl values('yj2','0625','이윤정');
insert into acorntbl values('jh','6789','이정훈');
insert into acorntbl  values('ek', '1234', '조은경');
insert into acorntbl values('jt','1234','표준태');
insert into acorntbl values('jh1', '7777', '허재혁');
insert into acorntbl values('jh2', '9999', '허재화');
commit;

select * from acorntbl;

--김씨조회
select * from acorntbl where name  like '김%';


--sql  :  DBMS (데이터베이스관리시스템  소프트웨어 + 데이터베이스 ) 오라클11g
--sql : DBMS에 질의하는 언어 ( 문법이 있다)

--DML  (insert ->creat , select-read  , update , delete) CRUD
--DDL
--DCL 

--조회하기
--select 컬럼명 , 컬럼명 .. from  테이블명;
-- * (모든컬럼)
-- 테이블스키마, 테이블구조 확인명령어  desc 테이블명;
desc emp;
-- 모든컬럼조회하기
select * from emp;

--원하는 컬럼만 조회하기
select empno, ename, job 
from emp;   

select * from professor;

--select 명령에 표현식(리터럴)사용하여 출력하기
select  name   ,  'good ''morging!!!!'  "test"
from professor;


--컬럼별칭 사용하여 출력하기
-- 컬럼명 뒤에 as (생략가능)  " 별칭명  "   (공백도 들어갈 수 있음)
select profno as "Pro's No  ",  name  as  "Pro's Name", pay 
from professor;

-- distinct 중복된 값을 제거하고 출력하기
select deptno from emp;
select distinct  deptno from emp;

--연결 연산자 ||   컬럼명 연결해서 조회하고 싶을 때 사용
select ename || '님' as ename , job from emp;
select ename ||' ' || job  from emp;


-- 원하는 조건만 골라내기 -where절 사용


select  empno ,  ename  
from emp
where  empno= 7900 ;

select empno, ename, sal
from emp
where sal < 900;

select  empno, sal, ename
from emp
where sal>1500;

select * from acorntbl;
select * from acorntbl where name  like '김%';

select * from emp;
--where 절에서의 연산자  =같다
select * from emp where  job ='CLERK' ;

-- !-, <> 같지않다
select * from emp where job != 'CLERK';

-- > 크다, 초과
select * from emp  where sal  > 1200;

--컬럼이나 테이블명 대소문자 상관없음 
--데이타는 대소문자를 구분해야 합니다.

-- >= 이상
select * from emp where sal >=800;

-- <  미만
select  * from emp where comm < 300;

-- <= 이하
select * from emp where comm <=300;


-- between a  and b   a와b 사이에 있는 범위의 값 조회  ( 앞에는 작은거 뒤에 큰거)
select * from emp  where sal between 1200 and 2000 ;


-- and   (조건이 여러개 있을때  모두 만족하는 조건)
select * from emp where job='CLERK' and  sal=1300;
select * from  emp where sal  >= 1200 and  sal <=2000;


-- or  (조건 중에서 하나라도 만족하는 조건)
select * from emp where job='SALESMAN' or  sal > 1200;

 
 -- in 연산자
 select * from emp where deptno  in (10,20);
 select * from emp  where  deptno = 10  or  deptno =20;
  
--  like 연산자로 비슷한 것들 모두 찾기  %(0이상), _(한 자리) __ (  두 자리) 
select * from  emp where  job like 'S%';   --  시작이S이고 뒤에는 상관없다
select * from  emp where  job like '%N';   --  끝이 S로 끝나는 모든것 찾겠다
select * from  emp where  job like '%N%';   --   job 컬럼에 N문자가 포함된것을 모두 찾겠다

select * from emp where  sal like '1%'; 
select * from emp where ename like 'W___';

--문자, 날짜표현시  '' 표시해야 함
select * from emp where hiredate >= '80/12/17';

-- null 값    is null  is not null
-- null 값을 확인할 때는 is null, is not null
select * from emp;
--데이터베이스에서 컬럼의 값이 null인 것은 값이 정해지지 않은것을 의미한다. 주의사항 !! =>0의 의미 아니다. 
--값이 null인 것을 조회할 때는  = 같다라는 조건을 사용 못함  =>  is null 사용해야 함

select * from emp where comm is null;
select * from emp where comm is not null;

-- null값을 다룰 때 주의 사항 
--예시)  comm 컬럼에 값을 +100증가된 값으로 조회를 한다면 결과는? 

-- null+100  =>    오류날거 같아요 !
-- null+100  =>    null
-- null은 정해지지 않은 값을 의미하므로 여기에 어떤 연산을 수행해도 정해지지 않은 값으로 인식함 
select ename, sal, comm+100   from  emp ;

--select ename, sal, nvl(comm, 0) from emp; 

--56page  정렬하기  order by 
select * from emp;
-- sal 높은 순으로 정렬  
-- order by 절 사용  컬럼명 명시,  조회하는 컬럼의 순서
select * from emp  order by sal desc  ;

select job, sal from emp order by sal desc;
select job, sal from emp order by 2 desc;

select  * 
from emp
order by  deptno  , sal desc;

--집합연산자 ( union  행합치기)
-- union , union all , intersect, minus 
-- 회원테이블(모든 회원정보가 있는 테이블)
-- 서울회원회원테이블, 경기도회원테이블 , 부산회원테이블 
-- 전체회원을 조회할 때   union 사용함 (중복제거, 정렬해줌)

--주의사항: 컬럼수 , 컬럼타입이 같아야함  

select STUDNO , name, DEPTNO1 from student;
select profno , name, deptno from professor;
-- union 

select STUDNO , name, DEPTNO1 from student
minus
select profno , name, deptno from professor;








 













