-- emp���̺��� WARD���� COMM �� ���� �޴� ����� �̸��� comm
select  ename, comm
from emp
where comm <  ( select comm from emp where ename = 'WARD' );


--������ sub query  ��������3
-- 
select name, weight 
from  student
where  weight >  (  select avg(weight) from student  where deptno1= 201 );

--

select  * 
from  student;

--��������
-- p.432

select * from emp2;
select * from dept2;

select empno, name, deptno
from emp2
where deptno in ( select dcode from dept2  where area='Pohang Main Office');

--�μ���ȣ�� 20�� �����ϸ� main ������ �����
select * from dept
where exists( select deptno  from dept  where  deptno  =  &dno);


select * from dept
where deptno  in ( select deptno  from dept  where  deptno  =  &dno);



--��Į�� ��������

