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
select * from acorntbl where name like '김%';

--sql : DBMS ( 데이터베이스관리시스템 소프트웨어 + 데이터베이스 ) 오라클11g
--sql : DBMS에 질의하는 언어 ( 문법이 있다 )

--DML (insert -> creat, select-read, update, delete) CRUD
--DDL
--DCL

--조회하기
--select 컬럼명, 컬럼명 .. from 테이블명;
--* (모든컬럼)
--테이블스키마, 테이블구조 확인명령어 desc 테이블명
desc emp;
--모든 컬럼 조회하기
select * from emp;

--원하는 컬럼만 조회하기
select empno, ename, job 
from emp;

--컬럼별칭 사용하여출력하기
--컬럼명 뒤에 as (생략가능) " 별칭명 "  (공백도 들어갈 수 있음)
 select profno "Pro's No", name as "Pro's Name", pay
 from professor;

--distinct 중복된 값을 제거하고 출력하기
select deptno from emp;
select distinct deptno from emp;

--연결 연산자 || 컬럼명 연결해서 조회하고 싶을 때 사용
select ename || '님' as ename, job from emp;
select ename || ' ' || job from emp;

--원하는 조건만 골라내기 -where절 사용

select empno, ename 
from emp 
where empno=7900;

select empno, ename, sal
from emp
where sal < 900;

select empno, sal, ename
from emp
where sal>1500;

select * from acorntbl;
select * from acorntbl where name like '이%';

select * from emp;
--where 절에서의 연산자 = 같다
select * from emp where job = 'CLERK' ;

-- !-, <> 같지 않다
select * from emp where job != 'CLERK';

-- > 크다, 초과
select * from emp where sal > 1200;

--컬럼이나 테이블명 대소문자 상관없음
--데이타는 대소문자를 구분해야 합니다.

-- >= 이상
select * from emp where sal >=800;

-- < 미만
select * from emp where comm < 300;

-- <= 이하
select * from emp where comm <=300;

-- between a and b a와b 사이에 있는 범위의 값 조회 (앞에는 작은거 뒤에 큰거)
select * from emp where sal between 1200 and 2000;

-- and (조건이 여러개 있을 때 모두 만족하는 조건)
select * from emp where job='CLERK' and sal=1300;
select * from emp where sal >= 1200 and sal <= 2000; 

-- or (조건 중에서 하나라도 만족하는 조건) 
select * from emp where job='SALESMAN' or sal > 1200;

-- in 연산자
select * from emp where deptno in (10,20);
select * from emp where deptno = 10 or deptno = 20;
 
-- like 연산자로 비슷한 것들 모두 찾기 %(0이상), _(한 자리), __(두 자리)
select * from emp where job like 'S%';  --  시작이 s이고 뒤에는 상관없다
select * from emp where job like '%N';  --  끝이 N으로 끝나는 모든 것 찾겠다
select * from emp where job like '%N%';  --  job 컬럼에 N문자가 포함된 것을 모두 찾겠다

select * from emp where sal like '1%';
select * from emp where ename like 'W___';

--문자, 날짜표현시 '' 표시해야 함
select * from emp where hiredate >= '80/12/17';

-- null 값   is null is not null
-- null 값을 확인할 때는 is null, is not null
select * from emp;
--데이터베이스에서 컬럼의 값이 null인 것은 값이 정해지지 않은 것을 의미한다. 주의사항 !! => 0의 의미 아니다.
--값이 null인 것을 조회할 때는 = 같다라는 조건을 사용 못함 => is null 사용해야 함

select * from emp where comm is null;
select * from emp where comm is not null;

-- null값을 다룰 때 주의 사항
-- 예시) comm 컬럼에 값을 +100증가된 값으로 조회를 한다면 결과는?

-- null+100 => null
--null은 정해지지 않은 값을 의미하므로 여기에 어떤 연산을 수행해도 정해지지 않은 값으로 인식함
select ename, sal, comm+100 from emp; 

--select ename, sal, nvl(comm, 0) from emp;

--56page 정렬하기 order by
select * from emp;
-- sal 높은 순으로 정렬 
-- order by절 사용 컬럼명 명시, 조회하는 컬럼의 순서
select * from emp order by sal desc;

select job, sal from emp order by sal desc;
select job, sal from emp order by 2 desc;

select * 
from emp
order by deptno , sal desc;

-- 집합연산자 (union 행합치기)
-- union, union all, intersect, minus
-- 회원테이블(모든 회원정보가 있는 테이블)
-- 서울회원테이블, 경기도회원테이블, 부산회원테이블
-- 전체회원을 조회할 때 union 사용함 (중복제거, 정렬해줌)

--주의사항 : 컬럼수, 컬럼타입이 같아야함

select STUDNO, name, DEPTNO1 from student;
select profno, name, deptno from professor;
-- union

select STUDNO, name, DEPTNO1 from student
minus
select profno, name, deptno from professor;


create table member_tbl_11(
m_id varchar2(5) not null primary key , m_pw varchar2(5) , m_name varchar2(10) , m_tel varchar2(13) , m_birthday date , m_point number(6) , m_grade varchar2(2) 
);
commit;


insert into member_tbl_11 values ('m100' , '1234' , '성기훈', '010-1111-2222' , '2004-01-01' , 100, '01');
insert into member_tbl_11 values ('m101' , '4444' , '김상우', '010-2222-3333' , '2004-01-01' , 1500, '01');
insert into member_tbl_11 values ('m102' , '5555' , '김일남', '010-3333-4444' , '2004-12-10' , 2000, '02');
insert into member_tbl_11 values ('m103' , '6666' , '이준호', '010-4444-5555' , '2004-04-10' , 1900, '02');
insert into member_tbl_11 values ('m104' , '7777' , '김새벽', '010-5555-6666' , '2004-09-12' , 3000, '03');
insert into member_tbl_11 values ('m105' , '8888' , '최덕수', '010-6666-7777' , '2004-08-10' , 4800, '03');
insert into member_tbl_11 values ('m106' , '9999' , '이알리', '010-7777-8888' , '2004-07-10' , 2900, '01');
insert into member_tbl_11 values ('m107' , '0101' , '김미녀', '010-8888-9999' , '2004-06-09' , 1200, '01');
insert into member_tbl_11 values ('m108' , '0404' , '이정재', '010-9999-8888' , '2004-05-19' , 3000, '03');
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday) 
values ('m109' , '0448' , '박해수', '010-7878-1111' , '2004-11-27' );
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday) 
values ('m110' , '4848' , '위하준', '010-8888-9090' , '2004-11-09');
commit;

--1. 모든 정보조회 (* : 모든컬럼)
select * from member_tbl_11 ;

--2. 모든 고객의 이름과 생일 정보 조회하시오
select M_NAME, M_BIRTHDAY 
from member_tbl_11;

--3. 이름이 박해수인 고객아이디, 생일, 포인트 정보 조회하시오
select M_ID, M_BIRTHDAY, M_POINT from member_tbl_11 where M_NAME = '박해수';

--4. 포인트가 2000점 이상인 고객이름, 전화번호 정보 조회하시오
select M_NAME, M_TEL from member_tbl_11 where M_POINT  >=2000;
 
--5. 포인트가 2000점에서 3000점 사이의 고객이름, 전화번호 정보 조회하시오
select M_NAME, M_TEL from member_tbl_11 where M_POINT >= 2000 and M_POINT <= 3000;

--6. 고객등급이 ‘01’인 고객이름, 전화번호 , 포인트 정보 조회하시오
select M_NAME, M_TEL, M_POINT from member_tbl_11 where M_GRADE='01';

--7. 생일이 2004-06-01 이후인 고객이름 전화번호 정보 조회하시오
select M_NAME, M_TEL from member_tbl_11 where M_BIRTHDAY>='2004-06-01';

--8. 2004-05-01이전에 태어난 고객의 고객이름 , 생일 정보 조회하시오
select M_NAME, M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY < '2004-05-01';

--9. 고객등급이 ‘01’이 아닌 고객의 고객이름, 전화번호, 고객등급 정보 조회하시오
select M_NAME, M_TEL, M_GRADE from member_tbl_11 where M_GRADE != '01';

--10. 고객 등급이 ‘02’ 인 고객의 고객아이디, 이름, 전화번호 정보 조회하시오
select M_ID, M_NAME, M_TEL from member_tbl_11 where M_GRADE='02';

--11. 포인트가 1500점 미만인 고객의 고객이름, 전화번호 조회하시오
select M_NAME, M_TEL from member_tbl_11 where M_POINT < 1500;

--12. 포인트가 적립되지 않은 고객정보 조회하시오
select * from member_tbl_11 where M_POINT is null;

--13. 포인트가 부여된 (포인트 금액을 가지고 있는) 고객정보 조회하시오( 포인트가 NULL이 아닌 고객 조회하면 됨)
select * from member_tbl_11 where M_POINT is not null;

--14. 고객등급이 중복되지 않도록 고객등급을 조회하는 쿼리를 작성하시오
select DISTINCT M_GRADE from member_tbl_11;

--1. 고객등급이 ‘01’이고 포인트가 2000이상인 고객의 아이디, 이름 정보를 조회하시오
select M_ID, M_NAME from member_tbl_11 where M_GRADE='01' and M_POINT >= 2000;

--2. 고객등급이 ‘01’ 이거나 포인트가 2000이상인 고객의 아이디, 이름 정보를 조회하시오
select M_ID, M_NAME from member_tbl_11 where M_GRADE='01' or M_POINT >= 2000;

--3. 김씨성을 가진 고객의 아이디, 이름, 등급 정보를 조회하시오
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_NAME like '김%';

--4. 이름이 수로 끝나는 고객의 아이디, 이름 , 등급 정보를 조회하시오
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_NAME like '%수';

--5. 고객등급이 ‘01’, ‘03’ 인 고객의 아이디, 이름, 등급 정보를 조회하시오 (IN 연산자 사용해 주세요)
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_GRADE in('01','03');

--6. 고객등급이 ‘01’, ‘02’ 이 아닌 고객의 아이디, 이름, 등급 정보를 조회하시오 ( NOT IN 연산자 사용 해 주세요)
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_GRADE NOT IN('01','02');

--7. 고객등급이 ‘02’ 이거나 이름이 이씨성을 가진 고객의 정보의 아이디와 이름 , 등급 정보를 조회 하시오
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_GRADE='02' or M_NAME='이%';

--8. 생일이 2004-05-01이전에 태어나거나 고객등급이 ‘03’인 고객의 아이디, 이름, 생일 정보를 조회하시오
select M_ID, M_NAME, M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY < '2004-05-01' or M_GRADE='03';




























