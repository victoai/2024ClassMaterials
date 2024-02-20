-- 우리반 테이블 생성하기
create table  acorntbl (
    id  varchar2(10) primary key,
    pw  varchar2(10) ,
    name varchar2(10)
);

--crud   => create(insert ) , read( select ), u(update) , d(delete) 
select *  from  acorntbl ;
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
 
 
 
 --26page 
select * from emp;
--29
--테이블 정보 조회
 select * from tab;

--원하는 컬럼만 조회
select  empno, ename from emp;

--테이블 스키마, 테이블 구조 
desc emp;

-- select 명령에 표현식을 사용하여 출력하기  "alias  비어 있는 별칭줄 때 쌍따옴표 "
select name, 'good morning '' !!! '  "good moring"  from professor ;
 
 
 -- 컬럼 별칭 사용하여 출력하기
 
 -- distinct : 중복된 값을 제거하고 출력하기
 
 -- 연결연산자로 컬럼을 붙여서 출력하기  || 
 
 -- 원하는 조건만 골라내기 - Where절 사용하기
 -- 정렬하여 출력하기  order by 절 사용하기
 -- 집합연산자  union, union all, intersect , minus
 
 
 
 select studno , name, deptno1, 1 from student ;
 select profno , name , deptno, 2  from professor;
 
 
 select studno , name, deptno1, 1 from student 
 where deptno1  =101
 union  all
 select profno , name , deptno, 2 
 from professor
 where deptno =101;
  
  
  
  --intersect
  
  select studno  , name
  from student 
  where deptno1 =101
  INTERSECT
  select studno, name
  from student
  where deptno2 =201;
 
 --입사일  hiredate
 select ename, hiredate from emp where hiredate >= '80/12/01';
 select ename, hiredate from emp where hiredate >= '1980-12-01';
 
 
 select * from student;
 select tel from student;
 
  --  1(일)234567
  select sysdate , next_day(sysdate, '월') from dual ;
  select sysdate , next_day(sysdate,  2) from dual ;
  select sysdate , last_day(sysdate) from dual ;
 
 
 --85 page  퀴즈 4
  select    tel ,  replace( tel,  substr( tel,  instr(tel, '-')+1  ,4)   ,'****') from student;
   
  
  -- 영문자가 들어가 있는 행만 출력
  select * from t_reg ;
  select * from t_reg  where regexp_like(text, '[a-z]');
  select * from t_reg  where regexp_like(text, '[A-Z]'); 
  
  select * from t_reg22;
 
 
CREATE TABLE t_reg22
( text varchar2(10))  ;

INSERT ALL
INTO t_reg22 VALUES('ABC123')
INTO t_reg22 VALUES('ABC 123')
INTO t_reg22 VALUES('ABC  123')
INTO t_reg22 VALUES('abc 123')
INTO t_reg22 VALUES('abc  123')
INTO t_reg22 VALUES('a1b2c3')
INTO t_reg22 VALUES('aabbcc123')
INTO t_reg22 VALUES('?/!@#$*&')
INTO t_reg22 VALUES('\~*().,')
INTO t_reg22 VALUES('123123')
INTO t_reg22 VALUES('123abc')
INTO t_reg22 VALUES('abc')
SELECT  *  FROM dual ;

select * from t_reg22;
 