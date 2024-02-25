-- 210p 1.
select * from emp;

select ename, sal, comm
from emp;

select ename, sal, nvl(comm,0)
from emp;

select ename, sal+nvl(comm,0)
from emp;

select ename, sal+nvl(comm,0) pay
from emp;

select max(sal+nvl(comm,0)) max
from emp;

select max(sal+nvl(comm,0)) max,
       min(sal+nvl(comm,0)) min
from emp;

select max(sal+nvl(comm,0)) max,
       min(sal+nvl(comm,0)) min,
       avg(sal+nvl(comm,0)) avg
from emp;

select max(sal+nvl(comm,0)) max,
       min(sal+nvl(comm,0)) min,
       trunc(avg(sal+nvl(comm,0)),1) avg
from emp;

-- max¿Í ÀÌ¸§
select * from emp;

select  ename,  sal+ nvl( comm,0)  
from emp;

select  ename from emp
where   sal+ nvl( comm,0)   = 
( select   max(  sal+ nvl( comm,0))   
from emp  );


select * from (select  ename  ,   sal+ nvl( comm,0)  pay  from emp)
where  pay  = (  
  select   max(  sal+ nvl( comm,0))   
  from emp);

-- 210p 2.
select * from student;

select substr(birthday, 4, 2) from student;

select 
       count(decode(substr(birthday, 4, 2), 01, substr(birthday, 4, 2))) jan, 
       count(decode(substr(birthday, 4, 2), 02, substr(birthday, 4, 2))) feb, 
       count(decode(substr(birthday, 4, 2), 03, substr(birthday, 4, 2))) mar, 
       count(decode(substr(birthday, 4, 2), 04, substr(birthday, 4, 2))) apr, 
       count(decode(substr(birthday, 4, 2), 05, substr(birthday, 4, 2))) may, 
       count(decode(substr(birthday, 4, 2), 06, substr(birthday, 4, 2))) jun, 
       count(decode(substr(birthday, 4, 2), 07, substr(birthday, 4, 2))) jul, 
       count(decode(substr(birthday, 4, 2), 08, substr(birthday, 4, 2))) aug, 
       count(decode(substr(birthday, 4, 2), 09, substr(birthday, 4, 2))) sep, 
       count(decode(substr(birthday, 4, 2), 10, substr(birthday, 4, 2))) oct, 
       count(decode(substr(birthday, 4, 2), 11, substr(birthday, 4, 2))) nov, 
       count(decode(substr(birthday, 4, 2), 12, substr(birthday, 4, 2))) dec 
from student;

select 
       count(substr(birthday, 4, 2)) || 'EA' total ,
       count(decode(substr(birthday, 4, 2), 01, substr(birthday, 4, 2))) || 'EA' jan, 
       count(decode(substr(birthday, 4, 2), 02, substr(birthday, 4, 2))) || 'EA' feb, 
       count(decode(substr(birthday, 4, 2), 03, substr(birthday, 4, 2))) || 'EA' mar, 
       count(decode(substr(birthday, 4, 2), 04, substr(birthday, 4, 2))) || 'EA' apr, 
       count(decode(substr(birthday, 4, 2), 05, substr(birthday, 4, 2))) || 'EA' may, 
       count(decode(substr(birthday, 4, 2), 06, substr(birthday, 4, 2))) || 'EA' jun, 
       count(decode(substr(birthday, 4, 2), 07, substr(birthday, 4, 2))) || 'EA' jul, 
       count(decode(substr(birthday, 4, 2), 08, substr(birthday, 4, 2))) || 'EA' aug, 
       count(decode(substr(birthday, 4, 2), 09, substr(birthday, 4, 2))) || 'EA' sep, 
       count(decode(substr(birthday, 4, 2), 10, substr(birthday, 4, 2))) || 'EA' oct, 
       count(decode(substr(birthday, 4, 2), 11, substr(birthday, 4, 2))) || 'EA' nov, 
       count(decode(substr(birthday, 4, 2), 12, substr(birthday, 4, 2))) || 'EA' dec 
from student;

-- 210p 3.
select * from student;

select tel from student;

select tel, instr(tel,')',1) from student;

select tel, substr(tel, 1, instr(tel,')',1)-1) from student;

select 
       count(substr(tel, 1, instr(tel,')',1)-1)) total,
       count(decode(substr(tel, 1, instr(tel,')',1)-1),'02','seoul')) seoul,
       count(decode(substr(tel, 1, instr(tel,')',1)-1),'031','gyeonggl')) gyeonggl,
       count(decode(substr(tel, 1, instr(tel,')',1)-1),'051','busan')) busan,
       count(decode(substr(tel, 1, instr(tel,')',1)-1),'052','ulsan')) ulsan,
       count(decode(substr(tel, 1, instr(tel,')',1)-1),'053','daegu')) daegu,
       count(decode(substr(tel, 1, instr(tel,')',1)-1),'055','gyeongnam')) gyeongnam
from student;

-- 210p 4.
select * from emp;
insert into emp(empno, deptno, ename, sal) values(1000, 10, 'Tiger', 3600);
insert into emp(empno, deptno, ename, sal) values(2000, 10, 'Cat', 3000);
commit;

select empno, ename, job, sal, deptno from emp;

select deptno, job, sum(sal) 
from emp
group by deptno, job
order by deptno, job;

select  
  decode( job,'CLERK', sal) CLERK,
  decode( job,'MANAGER', sal) MANAGER,
  decode( job,'PRESIDENT', sal) PRESIDENT,
  decode( job,'ANALYST', sal) ANALYST,
  decode( job,'SALESMAN', sal) SALESMAN
from emp;

select  deptno,
  sum(decode( job,'CLERK', sal)) CLERK,
  sum(decode( job,'MANAGER', sal)) MANAGER,
  sum(decode( job,'PRESIDENT', sal)) PRESIDENT,
  sum(decode( job,'ANALYST', sal)) ANALYST,
  sum(decode( job,'SALESMAN', sal)) SALESMAN
from emp
group by deptno;

select  deptno,
  nvl(sum(decode( job,'CLERK', sal)),0) CLERK,
  nvl(sum(decode( job,'MANAGER', sal)),0) MANAGER,
  nvl(sum(decode( job,'PRESIDENT', sal)),0) PRESIDENT,
  nvl(sum(decode( job,'ANALYST', sal)),0) ANALYST,
  nvl(sum(decode( job,'SALESMAN',sal)),0) SALESMAN,
  sum(sal) total
from emp
group by rollup(deptno)
order by deptno;

-- 210p 5.
select * from emp;

select deptno, ename, sal from emp;

select deptno, ename, sal, sum(sal) over(order by sal) total
from emp
order by sal;