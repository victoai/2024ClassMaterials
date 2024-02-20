-- select * from 테이블명
-- select * from 테이블명 where 조건


select * from acorntbl;
select * from acorntbl where name like '이_';
select * from acorntbl where name like '이%';


-- 단일행 함수 (문자, 숫자, 날짜, 변환함수, 일반함수)


select ename, initcap(ename) from emp;  --첫글자만 대문자로 변환
select ename, lower(ename) from emp;  -- 소문자로 변환
select ename, upper(ename) from emp;  -- 대문자로 변환
select ename, length(ename) from emp;  -- 문자열의 길이


select * from acorntbl;
select length(name), length(name) from acorntbl;    -- lengthb() 바이트수를 구해줌


select * from emp;
select ename || job from emp;
select ename || job as "ename job" from emp;


-- 붙여 쓰기
select concat(ename, job) from emp;


-- substr() 문자열의 일부를 추출할 때
-- ( 문자열, 시작위치, 가져올 개수)
select substr(ename, 2, 3) from emp;


select 'abcde' from dual;   -- dual 가상테이블, 함수연습
select substr('abcde', 2, 1) from dual;   -- oracle에서 dual이라는 가상 테이블 제공


select substr('hi hello', 4, 5) from dual;
select name from acorntbl;

select substr(name, 2, 2) from acorntbl;  -- 두번째 행부터 이름이어서 이름 두 글자 출력


-- 시작위치가 -이면 오른쪽 기준으로 시작 위치가 정해짐
select name, substr(name, -2, 2) from acorntbl;

select substr(name, -1, 2) from acorntbl; -- -는 오른쪽 기준으로 출력, 기준에서 두 개 출력


-- instr (): 문자열에서 특정 문자의 위치를 반환함


select instr('A-B-C-D', '-') from dual;
select instr('A-B-C-D', '-', 1, 3) from dual;   -- - 찾음, 1부터 시작, 세 번째 하이픈 위치 출력

select instr('032)851-1234',')') from dual;   -- ) 찾을 때


select * from student;
select name, tel from student;
select name, instr(tel, ')') from student;    -- 전화번호에서 ) 문자 위치 찾기

-- 전화번호에서 ) 문자 위치 -1 (가져올 개수 구하기)
select name, substr( tel, 1, instr(tel, ')')-1), instr(tel, ')')-1 from student;


-- lpad() 함수
select * from student;
select id from student;

-- lpad(문자열, 전체자리수, 채울 문자)
select lpad(id, 10, '*') from student;
select rpad(id, 10, '*') from student;


-- trim(): 공백제거 (양쪽 공백제거)
-- ltrim(): 공백제거 (양쪽 공백제거)
-- rtrim(): 오른쪽공백제거


select '  abc  ' || 'b' from  dual;
select trim('  abc  ') || 'b' from dual; -- 공백 제거 후 붙음
select lrim('  abc  ') || 'b' from dual;
select rtrim('  abc  ') || 'b' from dual;


-- replace
select * from emp;
select ename, replace( ename, 'M', '*' ) from emp;    -- M 문자를 *로 바꿔서 출력


select ename, replace( ename, 'SM', '**') from emp;   -- SMITH만 바뀜
select substr(ename, 1, 2) from emp;
select ename, replace( ename, substr(ename, 1, 2),  '**') from emp;

select * from emp;
select ename, replace( ename, substr(ename, 2, 2), '--') from emp;

select * from student;
select jumin from student;
select NAME , JUMIN, replace (jumin, substr(jumin, 7, 7), '-/-/-/-/-') from student; 
select deptno1, NAME , JUMIN, replace (jumin, substr(jumin, 7, 7), '-/-/-/-/-') from student where deptno1 =101;

select name, tel, replace(tel, substr(tel, 5, 3), '***') from student;


select name, tel, replace(tel, substr(tel, 9), '****') from student where deptno1 = 101;


-- 숫자 함수
-- round( 숫자, 자리수) 반올림
-- 자리수가 -이면 소수점 기준 왼쪽

select round(987.655, 2) from dual;   -- 반올림
select trunc(987.655, 2) from dual;   -- 반올림하지 않고 버림
select trunc(987.655, -1) from dual;    -- 원단위 절사
select trunc(987.655 - 2) from dual;  -- 십단위 절사


select ceil(12.3456) from dual;   -- 정수 올림
select floor(12.3456) from dual; -- 정수 내림

-- 나머지구하기 mod (피제수, 제수)
select mod(10, 2) from dual;

-- select rpad(id, 10, '*') from student;

select lpad(jumin, 13, '-/') from student;

-- sysdate 현재날짜 구하기
select sysdate from dual;

-- moths_between (큰 날짜, 작은 날짜) : 두 날짜 사이의 개월 수 구하기
select months_between( '20230901', '20230801') from dual;
select months_between( '23/09/01', '23/08/01') from dual;


-- next_day() 기준일 다음에 오는 요일에 해당하는 날짜 구하기
select next_day('2023-08-18', '월') from dual;


-- 현재 날짜 기준 3일 뒤 구하기
select sysdate+5 from dual;


-- to_date 형 변환, 특정 날짜를 기준으로 3일 뒤 구하기
select to_date('2023/08/18') +3 from dual;


-- 형변환 함수
-- 숫자, 날짜로 => 문자로 변환 (원하는 형식으로 포맷해서 조회하기)

select 123456 from dual;
select to_char(123456, '999,999') as amt from dual;
select to_char(123456, 'L999,999.99') from dual;
select to_char(123456, '$999,999') from dual;
-- 주의사항: 표현을 숫자의 자리수보다 9의 개수가 적으면 ##### 표현됨 )
select to_char(123456, '9,999') from dual;
-- 자릿수가 많으면 앞을 0으로 채움
select to_char(123456, '09999,999') from dual;


select * from emp;
select empno, ename, sal, comm from emp;
select empno, ename, (sal*12), comm from emp;
select empno, ename, to_char((sal*12)+comm, '999,999') "연봉" from emp;



-- 날짜를 => 문자로 변환
select sysdate from dual;
select to_char(sysdate, 'yyyy-mm-dd day') from dual;
select to_char(sysdate, 'yyyy-mm-dd dy') from dual;

select to_char(sysdate, 'yyyy/mm/dd') from dual;
select to_char(sysdate , 'yyyy"년"mm"월"dd"일"') from dual;


desc professor;   -- 테이블의 구조를 볼 수 있음
select * from professor;
select name, pay, bonus from professor;
select name, to_char((pay+10)+ bonus, '999,999') from professor;



-- to_number() 함수


select '5' + 3 from dual;     -- 자동형변환(묵시적형변환)
select to_number('5') + 3 from dual;    -- 명시적형변환   숫자 형태로 된 문자를 실제 숫자로 변환하는 함수


-- to_date() 함수 : 문자 형태로 된 날짜 데이터를 실제 날짜 데이터로 변환하는 함수
select to_date('2023/08/18') + 3 from dual;


-- 일반함수  nvl(), nvl2()
-- null인 경우 다른값으로 치환해주는 함수


select * from professor;
select name, bonus from professor;
select name, nvl( bonus, 0) from professor;



select name, nvl((pay*12) + bonus, 0) as "연봉" from professor;
-- null인 경우

-- 연봉 금액에 천단위 표시 형식
select name, nvl((pay*12) + bonus, 0) as "연봉" from professor;


select bonus from professor;
select bonus, nvl2(bonus, bonus*2, 100) from professor;
-- nvl2(컬럼, null 아닌 경우, null 경우)
select nvl2(bonus, bonus*2, 100) from professor;




-- decode() 함수
select * from member_tbl_11;

-- decode는 바꾼다는 의미
select decode(m_grade, '01', 'VIP', '02', '우수', '03', '브론즈') from member_tbl_11;


select * from student;
select name, jumin, substr(jumin, 7, 1) from student;

select name, jumin,  decode( substr(jumin, 7, 1), 1 ,'MAN', 2,'WOMAN') as "Gender" from student;
 
 select name, tel, (substr(tel, 1, 3)) from student;
 select instr(tel, ')') from student;
 
 select name, tel, decode(substr(tel, 1, 3), '02)', 'SEOUL', '031', 'GYEONGGI', '051', 'BUSAN', '052', 'ULSAN', '053', 'DAEGU', '055', 'GYEONGNAM') from student;
 
 
 
 --- case when
 --- SELECT 열이름, case when [조건] then [결과값]
 --- when [조건] then [결과값]
 --  else [결과값]
 --- end as 새로운 칼럼명
 --- from 테이블명 ; 
 
 
 select * from member_tbl_11;
 
 
 select m_point, case 
 when m_point >= 2000 then '상' end as "결과" 
 from member_tbl_11;
 
 
 select m_point, case
          when m_point >= 2000 then '상'
          when m_point >= 1500 then '중'
          else '하'
          end as "결과" from member_tbl_11;
          
          
-- 복수행 함수   집계함수, sum(), avg(), max(), min()
-- count(*), count(컬럼명)
select * from member_tbl_11;

select sum(m_point) from member_tbl_11;
select avg(m_point) from member_tbl_11;
select max(m_point) from member_tbl_11;
select min(m_point) from member_tbl_11;


-- group by, 집계 함수와 함께 사용한다
select count(*) from member_tbl_11;   --- member_tbl_ll 테이블의 행의 개수를 구한다
select count(m_point) from member_tbl_11;   -- member_tbl_11 테이블의 행의 개수를 구한다


select m_grade, sum(m_point)
from member_tbl_11
group by m_grade;


-- having 절 사용하기 (선택), group by 결과 내에서 조건에 맞는 것만 추출할 때 쓰임


select m_grade, m_point
from member_tbl_11;


select m_grade, sum(m_point) as total -- 4번   as는 이름을 변경
from member_tbl_11    -- 1번
group by m_grade    -- 2번
--  having total >= 5000 select 있는 별칭을 사용할 수 없다. 쿼리의 순서가 있다. !!!!
having sum(m_point) >= 5000;  -- 3번



select m_grade, sum(m_point) as "total"
from member_tbl_11
group by m_grade
having sum(m_point) >= 5000
order by 2 desc ;


-- count(), count(*)   count(컬럼명)


select * from emp;
select count(*) from emp;
select count(ename) from emp;
select count(comm) from emp;    -- 해당하는 컬럼의 값이 null을 제외하고 카운트함


select sum(comm) from emp;    -- null이 제외되고 합계가 구해진다.


select avg(comm) from emp;
select max(comm) from emp;
select min(comm) from emp;


-- group by

select * from emp;
-- group by 이전의 조회를 확인하기
select deptno, sal from emp;

-- 부서별 sal의 평균을 구한다
select deptno, sum(sal) from emp
group by deptno;


-- having은 이전에 group by가 된 상황에서 사용된다
-- group by가 없는데 having이 없다.
-- group된 결과 내에서 조건을 사용할 때는 having이 와야 함. !!!!


select deptno, sum(sal)
from emp
group by deptno
having sum(sal) >= 7000;



select * from emp;





select deptno, job, sum(sal)
from emp
group by deptno, job
order by 1, 3 desc;


select * from member_tbl_11;


-- 문제) MEMBER_TBL_11 테이블로부터 고객등급 조회하기, 중복된 값 제외하고 조회하기
select distinct m_grade from member_tbl_11;


-- 문제) 고객테이블로부터 아이디 USERID라는 이름으로 조회하기 (AS 는 생략가능함)
select m_id as "userid" from member_tbl_11;

-- 연결 연산자 ||  컬럼명 연결해서 조회하고 싶을 때 사용
select m_name || '님' as m_name from member_tbl_11;





CREATE TABLE CUST_INFO(
 ID VARCHAR2(13) NOT NULL PRIMARY KEY , FIRST_NM VARCHAR2(10) , LAST_NM VARCHAR2(10) , ANNL_PERF NUMBER(10,2) 
);
COMMIT;


INSERT INTO CUST_INFO VALUES ('8301111567897' , 'JHUN' , 'KIM', 330.08);
INSERT INTO CUST_INFO VALUES ('9302112567897' , 'JINYOUNG' , 'LEE', 857.61);
INSERT INTO CUST_INFO VALUES ('8801111567897' , 'MIJA' , 'HAN', -76.77);
INSERT INTO CUST_INFO VALUES ('9901111567897' , 'YOUNGJUN' , 'HA', 468.54);
INSERT INTO CUST_INFO VALUES ('9801112567897' , 'DAYOUNG' , 'SUNG', -890);
INSERT INTO CUST_INFO VALUES ('9701111567897' , 'HYEJIN' , 'SEO', 47.44);
COMMIT;



-- 문제) 고객정보 테이블로부터 주민번호 7번째 숫자 (성별을 나타내는)를 추출하여 GENDER 라는 이름으로 주민번호와 함께 조회하시오

select * from CUST_INFO;
select id, decode(substr(id, 7,1), 1, '남자', 2, '여자') as gender from CUST_INFO;


-- select ename, lower(ename) from emp;  -- 소문자로 변환

select id, last_nm, lower(last_nm) from CUST_INFO;


-- 연결 연산자
-- select concat(ename, job) from emp;
select * from CUST_INFO;
select id, last_nm || ', ' || first_nm as name from CUST_INFO;

-- select round(987.655, 2) from dual;   -- 반올림
-- 문제) 고객정보 테이블로부터 고객 주민번호, 수익을 소수 둘째에서 반올림하여 소수 첫째자리까지 표시될 수 있도록 조회 하시오
select id, annl_perf, round(annl_perf, 1) from CUST_INFO;


-- select trunc(987.655, 2) from dual;   -- 반올림하지 않고 버림
select id, annl_perf, trunc(annl_perf, 0) from CUST_INFO;


select sysdate from dual;
select 2+3 from dual;


-- 문제) 고객테이블로부터 주민번호 , 수익이 300이상이면 고수익 100이상은 일반수익 0이하이면 손해 , 나머지는 변동없음 내용이 RESULT컬럼명으로 조회될 수 있도록 하시오
--select deptno, sum(sal)
-- from emp
-- group by deptno
-- having sum(sal) >= 7000;


select * from cust_info;


-- 문제) 고객테이블로부터 주민번호 , 수익이 300이사이면 고수익 100이상은 일반수익 0이하이면 손해 , 나머지는 변동없음 내용이 RESULT컬럼명으로 조회될 수 있도록 하시오
select id, annl_perf, case
when annl_perf >= 300 then '고수익'
when annl_perf >= 100 then '일반수익'
when annl_perf <= 0 then '손해'
else '변동없음'
end as "result" from cust_info;


-- 문제) 고객테이블로부터 이름과 포인트를 조회하시오 (단 포인트가 적립되지 않은 고객은 0으로 표시되도록 하시오) 힌트:NVL 함수 사용
select * from member_tbl_11;
select m_name, m_point, nvl(m_point, 0) from member_tbl_11;


--select bonus, nvl2(bonus, bonus*2, 100) from professor;
-- nvl2(컬럼, null 아닌 경우, null 경우)
--select nvl2(bonus, bonus*2, 100) from professor;
select m_name, m_point, nvl2(m_point, m_point+100, 100) from member_tbl_11;


CREATE TABLE STUD_SCORE(
  STUDENT_ID        VARCHAR2(13) NOT NULL PRIMARY KEY ,
  MATH_SCORE      NUMBER(5) ,
  ENG_SCORE        NUMBER(5)   ,
  PHIL_SCORE       NUMBER(5)   ,
  MUSIC_SCORE    NUMBER(5) 
);
COMMIT;


INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE,   ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('0123511' , 89,78,78,90);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE,   ENG_SCORE,  MUSIC_SCORE)   VALUES ('0255475' , 88,90,90);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE  , MUSIC_SCORE)   VALUES ('9921100' , 87,98);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('9732453' , 69,98,78,78);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE )   VALUES ('0578981' , 59,90,89);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('0768789' , 94,80,87,99);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('9824579' , 90,90,78,87);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE )   VALUES ('0565789' , 58,64,72);



commit;



CREATE TABLE STAFF_SAL(
  ID         VARCHAR2(13) NOT NULL PRIMARY KEY ,
  JOB       VARCHAR2(13) ,
  CURRENT_SAL      NUMBER(10)   ,
  ENG_SCORE        NUMBER(5)    
);
COMMIT;



INSERT INTO  STAFF_SAL    VALUES ('2148', 'OFFICER' , 40000, 90);
INSERT INTO  STAFF_SAL    VALUES ('5780', 'CLERK' , 32000, 98);
INSERT INTO  STAFF_SAL    VALUES ('6870', 'MANAGER' , 100000, 81);
INSERT INTO  STAFF_SAL    VALUES ('4565', 'CLERK' , 30000, 79);
INSERT INTO  STAFF_SAL    VALUES ('9687', 'CLERK' , 33000, 66);
INSERT INTO  STAFF_SAL    VALUES ('7337', 'MANAGER' , 100000, 95);
INSERT INTO  STAFF_SAL    VALUES ('1321', 'OFFICER' , 43000, 80);
INSERT INTO  STAFF_SAL    VALUES ('9896', 'CLERK' , 30000, 50);
COMMIT;


CREATE TABLE PRC(
CUST_ID      VARCHAR2(13) NOT NULL PRIMARY KEY ,
SET2            VARCHAR2(13) ,
CARD_FLAG     NUMBER(1)   ,
LOAN_FLAG     NUMBER(1)   ,
INSURANCE_FLAG     NUMBER(1)   ,
CTB_FLAG     NUMBER(1)   ,
FUND_FLAG    NUMBER(1)   ,
ANNL_REV   NUMBER(10)      
);
COMMIT;


INSERT INTO  PRC    VALUES ('546515' , 'SILVER' , 1,1,1,1,1,1000);
INSERT INTO  PRC    VALUES ('46780' , 'GOLD' , 0,0,1,1,0,20000);
INSERT INTO  PRC    VALUES ('237848' , 'GOLD' , 1,1,0,1,1,30000);
INSERT INTO  PRC    VALUES ('56432' , 'DIAMOND' , 1,0,1,1,1,10000);
INSERT INTO  PRC    VALUES ('89647' , 'SILVER' , 0,0,1,1,0,3000);
INSERT INTO  PRC    VALUES ('52333' , 'SILVER' , 1,1,0,1,0,2500 );
INSERT INTO  PRC    VALUES ('89669' , 'GOLD' , 1,0,1,1,0,60000);
INSERT INTO  PRC    VALUES ('21004' , 'SILVER' , 0,0,1,1,0,1000);
INSERT INTO  PRC    VALUES ('17890' , 'DIAMOND' , 1,1,0,1,0,300000);



CREATE TABLE   PROD_SALES(
CUST_NM         VARCHAR2(13)  ,
PRD_ID             VARCHAR2(5) ,
SALES_AMT       NUMBER(10)      
);
COMMIT;


INSERT INTO   PROD_SALES   VALUES ('LEE', 546 , 3000);
INSERT INTO   PROD_SALES   VALUES ('KIM', 326 , 4780);
INSERT INTO   PROD_SALES   VALUES ('KANG', 564 , 87900);
INSERT INTO   PROD_SALES   VALUES ('KWON', 556 , 45478);
INSERT INTO   PROD_SALES   VALUES ('KIM', 254 , 3000);
INSERT INTO   PROD_SALES   VALUES ('YOO', 567 , 78900);
INSERT INTO   PROD_SALES   VALUES ('PARK', 877 , 89787);
INSERT INTO   PROD_SALES   VALUES ('LEE', 890 , 10000);
INSERT INTO   PROD_SALES   VALUES ('KIM', 787 , 2341);
INSERT INTO   PROD_SALES   VALUES ('PARK', 566 , 50000);



select * from stud_score;

-- 문제1) STUD_SCORE 테이블을 사용하여 NULL값을 포함한 행의 개수를 세보자
select count(*) from stud_score;

-- 문제2) STUD_SCORE 테이블을 사용하여 NULL값을 제외한 제외한 음악 점수 보유자를 세보자
select count(music_score) from stud_score;
-- 문제3) STUD_SCORE 테이블을 사용하여 수학 점수의 총 합계를 구해보자
select sum(math_score) from stud_score;
-- 문제4) STUD_SCORE 테이블을사용하여 음악 점수의 평균을 구해보자
select avg(music_score) from stud_score;
-- 문제5) STUD_SCORE 테이블을 사용하여 수학점수 최댓값 및 최솟값을 구해보자
select max(math_score), min(math_score) from stud_score;


--문제 6) CLERK는 7% , OFFICER는 5% , MANAGER는 3%로 연봉을 인상하기로 했다. STAFF_SAL테이블을 사용하여 각 직원별 인상 연봉을 예상해보자 ( CASE WEHN 사용해보기 )
--(현재연봉을 기준으로 직위별 예상연봉을 구해보자)

 select  id, current_sal ,  current_sal *1.1
 from staff_sal;
 
 select * from staff_sal;
 
  select job,  id, current_sal ,  case 
                                  when job='CLERK' then  current_sal *1.07
                                  when job='OFFICER' then current_sal * 1.05
                                  when job='MANAGER' then current_sal * 1.03
  end as "예상연봉"
 from staff_sal;
 
 
 문제 1) PRC 테이블을 사용하여 고객등급별 인당 평균 연 수익을 계산해 보자( GROUP BY 사용)
 
 select * from prc;
 
select set2, avg(annl_rev)
from prc
group by set2;

--문제 2) PRC 테이블을 사용하여 고객등급별 고객 수를 확인해보자
select set2, count(set2)
from prc
group by set2;


-- 문제 3) 구매횟수가 두 번 이상인 고객에게 마케팅을 하려고 한다. 마케팅 대상자의 고객이름을 조회하시오
select * from prod_sales;

select cust_nm
from prod_sales;


select cust_nm, count(cust_nm) 
from prod_sales
group by cust_nm;



select cust_nm, count(cust_nm) 
from prod_sales
group by cust_nm
having  count(cust_nm) >= 2;



select sales_amt, sales_amt >= 70000
from prod_sales;