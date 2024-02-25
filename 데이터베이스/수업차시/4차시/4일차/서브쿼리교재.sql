-- emp테이블에서 WARD보다 COMM 을 적게 받는 사람의 이름과 comm
select  ename, comm
from emp
where comm <  ( select comm from emp where ename = 'WARD' )


--
select  * 
from  student;

--

select * from dept
where exists( select deptno  from dept  where  deptno  =  &dno);

select * from dept
where deptno in ( select deptno  from dept  where  deptno  =  &dno);