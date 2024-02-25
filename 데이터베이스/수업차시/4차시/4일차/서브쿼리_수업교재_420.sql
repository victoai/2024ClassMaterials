-- emp테이블에서 WARD보다 COMM 을 적게 받는 사람의 이름과 comm
select  ename, comm
from emp
where comm <  ( select comm from emp where ename = 'WARD' );


--단일행 sub query  연습문제3
-- 
select name, weight 
from  student
where  weight >  (  select avg(weight) from student  where deptno1= 201 );

--

select  * 
from  student;

--다중쿼리
-- p.432

select * from emp2;
select * from dept2;

select empno, name, deptno
from emp2
where deptno in ( select dcode from dept2  where area='Pohang Main Office');

--부서번호가 20이 존재하면 main 쿼리가 실행됨
select * from dept
where exists( select deptno  from dept  where  deptno  =  &dno);


select * from dept
where deptno  in ( select deptno  from dept  where  deptno  =  &dno);



--스칼라 서브쿼리

