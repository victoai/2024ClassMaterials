
-- 문제 풀기 --
select * from STUDENT;
select name,tel, substr(tel, 1, instr(tel,')')-1) from STUDENT where DEPTNO1='201';
select * from emp;
select ename, replace(ename, substr(ename, 2,2),'--') from emp where DEPTNO='20';
select name, replace(jumin, substr(jumin,7,7),'-/-/-/-') from STUDENT where DEPTNO1='101';
select name, replace(tel, substr(tel,5,3), '***') from Student where DEPTNO1=102;
select name, replace(tel, substr(tel,instr(tel,'-')+1), '****') from Student where DEPTNO1=101;




