select  to_date('2023-08-10') +3  from dual;

select  to_date('2023-08-15') - to_date('2023-08-10')  from dual;


select  deptno,  avg(sal) 
from emp
group by rollup(  deptno );

select  deptno,  avg(sal) 
from emp
group by   deptno ;
