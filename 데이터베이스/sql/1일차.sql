select * from emp;


create table  acorntbl (
    id  varchar2(10) primary key,
    pw  varchar2(10) ,
    name varchar2(10)
);

insert into acorntbl values('dy', '4482', '���ܾ�');
insert into acorntbl values('mg','1234', '��α�');
insert into acorntbl  values('mj' ,'0000' , '�����');
insert into acorntbl  values('bj','6666','�躴��');
insert into acorntbl values('jy', '1127', '���翭');
insert into acorntbl values('hs', '0317', '������');
insert into acorntbl values('nj','9876','������');
insert into acorntbl values('jw', '1111', '������'); 
insert into acorntbl values('tm', '4482', '���¹�');
insert into acorntbl values('yj','0117','������'); 
insert into acorntbl values('y','1126','����');
insert into acorntbl values('yj2','0625','������');
insert into acorntbl values('jh','6789','������');
insert into acorntbl  values('ek', '1234', '������');
insert into acorntbl values('jt','1234','ǥ����');
insert into acorntbl values('jh1', '7777', '������');
insert into acorntbl values('jh2', '9999', '����ȭ');
commit;

select * from acorntbl;

--�达��ȸ
select * from acorntbl where name  like '��%';


--sql  :  DBMS (�����ͺ��̽������ý���  ����Ʈ���� + �����ͺ��̽� ) ����Ŭ11g
--sql : DBMS�� �����ϴ� ��� ( ������ �ִ�)

--DML  (insert ->creat , select-read  , update , delete) CRUD
--DDL
--DCL 

--��ȸ�ϱ�
--select �÷��� , �÷��� .. from  ���̺��;
-- * (����÷�)
-- ���̺�Ű��, ���̺��� Ȯ�θ�ɾ�  desc ���̺��;
desc emp;
-- ����÷���ȸ�ϱ�
select * from emp;

--���ϴ� �÷��� ��ȸ�ϱ�
select empno, ename, job 
from emp;   

select * from professor;

--select ��ɿ� ǥ����(���ͷ�)����Ͽ� ����ϱ�
select  name   ,  'good ''morging!!!!'  "test"
from professor;


--�÷���Ī ����Ͽ� ����ϱ�
-- �÷��� �ڿ� as (��������)  " ��Ī��  "   (���鵵 �� �� ����)
select profno as "Pro's No  ",  name  as  "Pro's Name", pay 
from professor;

-- distinct �ߺ��� ���� �����ϰ� ����ϱ�
select deptno from emp;
select distinct  deptno from emp;

--���� ������ ||   �÷��� �����ؼ� ��ȸ�ϰ� ���� �� ���
select ename || '��' as ename , job from emp;
select ename ||' ' || job  from emp;


-- ���ϴ� ���Ǹ� ��󳻱� -where�� ���


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
select * from acorntbl where name  like '��%';

select * from emp;
--where �������� ������  =����
select * from emp where  job ='CLERK' ;

-- !-, <> �����ʴ�
select * from emp where job != 'CLERK';

-- > ũ��, �ʰ�
select * from emp  where sal  > 1200;

--�÷��̳� ���̺�� ��ҹ��� ������� 
--����Ÿ�� ��ҹ��ڸ� �����ؾ� �մϴ�.

-- >= �̻�
select * from emp where sal >=800;

-- <  �̸�
select  * from emp where comm < 300;

-- <= ����
select * from emp where comm <=300;


-- between a  and b   a��b ���̿� �ִ� ������ �� ��ȸ  ( �տ��� ������ �ڿ� ū��)
select * from emp  where sal between 1200 and 2000 ;


-- and   (������ ������ ������  ��� �����ϴ� ����)
select * from emp where job='CLERK' and  sal=1300;
select * from  emp where sal  >= 1200 and  sal <=2000;


-- or  (���� �߿��� �ϳ��� �����ϴ� ����)
select * from emp where job='SALESMAN' or  sal > 1200;

 
 -- in ������
 select * from emp where deptno  in (10,20);
 select * from emp  where  deptno = 10  or  deptno =20;
  
--  like �����ڷ� ����� �͵� ��� ã��  %(0�̻�), _(�� �ڸ�) __ (  �� �ڸ�) 
select * from  emp where  job like 'S%';   --  ������S�̰� �ڿ��� �������
select * from  emp where  job like '%N';   --  ���� S�� ������ ���� ã�ڴ�
select * from  emp where  job like '%N%';   --   job �÷��� N���ڰ� ���ԵȰ��� ��� ã�ڴ�

select * from emp where  sal like '1%'; 
select * from emp where ename like 'W___';

--����, ��¥ǥ����  '' ǥ���ؾ� ��
select * from emp where hiredate >= '80/12/17';

-- null ��    is null  is not null
-- null ���� Ȯ���� ���� is null, is not null
select * from emp;
--�����ͺ��̽����� �÷��� ���� null�� ���� ���� �������� �������� �ǹ��Ѵ�. ���ǻ��� !! =>0�� �ǹ� �ƴϴ�. 
--���� null�� ���� ��ȸ�� ����  = ���ٶ�� ������ ��� ����  =>  is null ����ؾ� ��

select * from emp where comm is null;
select * from emp where comm is not null;

-- null���� �ٷ� �� ���� ���� 
--����)  comm �÷��� ���� +100������ ������ ��ȸ�� �Ѵٸ� �����? 

-- null+100  =>    �������� ���ƿ� !
-- null+100  =>    null
-- null�� �������� ���� ���� �ǹ��ϹǷ� ���⿡ � ������ �����ص� �������� ���� ������ �ν��� 
select ename, sal, comm+100   from  emp ;

--select ename, sal, nvl(comm, 0) from emp; 

--56page  �����ϱ�  order by 
select * from emp;
-- sal ���� ������ ����  
-- order by �� ���  �÷��� ���,  ��ȸ�ϴ� �÷��� ����
select * from emp  order by sal desc  ;

select job, sal from emp order by sal desc;
select job, sal from emp order by 2 desc;

select  * 
from emp
order by  deptno  , sal desc;

--���տ����� ( union  ����ġ��)
-- union , union all , intersect, minus 
-- ȸ�����̺�(��� ȸ�������� �ִ� ���̺�)
-- ����ȸ��ȸ�����̺�, ��⵵ȸ�����̺� , �λ�ȸ�����̺� 
-- ��üȸ���� ��ȸ�� ��   union ����� (�ߺ�����, ��������)

--���ǻ���: �÷��� , �÷�Ÿ���� ���ƾ���  

select STUDNO , name, DEPTNO1 from student;
select profno , name, deptno from professor;
-- union 

select STUDNO , name, DEPTNO1 from student
minus
select profno , name, deptno from professor;








 













