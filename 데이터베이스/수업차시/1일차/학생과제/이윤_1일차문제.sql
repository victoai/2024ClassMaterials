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
select * from acorntbl where name like '��%';

--sql : DBMS ( �����ͺ��̽������ý��� ����Ʈ���� + �����ͺ��̽� ) ����Ŭ11g
--sql : DBMS�� �����ϴ� ��� ( ������ �ִ� )

--DML (insert -> creat, select-read, update, delete) CRUD
--DDL
--DCL

--��ȸ�ϱ�
--select �÷���, �÷��� .. from ���̺��;
--* (����÷�)
--���̺�Ű��, ���̺��� Ȯ�θ�ɾ� desc ���̺��
desc emp;
--��� �÷� ��ȸ�ϱ�
select * from emp;

--���ϴ� �÷��� ��ȸ�ϱ�
select empno, ename, job 
from emp;

--�÷���Ī ����Ͽ�����ϱ�
--�÷��� �ڿ� as (��������) " ��Ī�� "  (���鵵 �� �� ����)
 select profno "Pro's No", name as "Pro's Name", pay
 from professor;

--distinct �ߺ��� ���� �����ϰ� ����ϱ�
select deptno from emp;
select distinct deptno from emp;

--���� ������ || �÷��� �����ؼ� ��ȸ�ϰ� ���� �� ���
select ename || '��' as ename, job from emp;
select ename || ' ' || job from emp;

--���ϴ� ���Ǹ� ��󳻱� -where�� ���

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
select * from acorntbl where name like '��%';

select * from emp;
--where �������� ������ = ����
select * from emp where job = 'CLERK' ;

-- !-, <> ���� �ʴ�
select * from emp where job != 'CLERK';

-- > ũ��, �ʰ�
select * from emp where sal > 1200;

--�÷��̳� ���̺�� ��ҹ��� �������
--����Ÿ�� ��ҹ��ڸ� �����ؾ� �մϴ�.

-- >= �̻�
select * from emp where sal >=800;

-- < �̸�
select * from emp where comm < 300;

-- <= ����
select * from emp where comm <=300;

-- between a and b a��b ���̿� �ִ� ������ �� ��ȸ (�տ��� ������ �ڿ� ū��)
select * from emp where sal between 1200 and 2000;

-- and (������ ������ ���� �� ��� �����ϴ� ����)
select * from emp where job='CLERK' and sal=1300;
select * from emp where sal >= 1200 and sal <= 2000; 

-- or (���� �߿��� �ϳ��� �����ϴ� ����) 
select * from emp where job='SALESMAN' or sal > 1200;

-- in ������
select * from emp where deptno in (10,20);
select * from emp where deptno = 10 or deptno = 20;
 
-- like �����ڷ� ����� �͵� ��� ã�� %(0�̻�), _(�� �ڸ�), __(�� �ڸ�)
select * from emp where job like 'S%';  --  ������ s�̰� �ڿ��� �������
select * from emp where job like '%N';  --  ���� N���� ������ ��� �� ã�ڴ�
select * from emp where job like '%N%';  --  job �÷��� N���ڰ� ���Ե� ���� ��� ã�ڴ�

select * from emp where sal like '1%';
select * from emp where ename like 'W___';

--����, ��¥ǥ���� '' ǥ���ؾ� ��
select * from emp where hiredate >= '80/12/17';

-- null ��   is null is not null
-- null ���� Ȯ���� ���� is null, is not null
select * from emp;
--�����ͺ��̽����� �÷��� ���� null�� ���� ���� �������� ���� ���� �ǹ��Ѵ�. ���ǻ��� !! => 0�� �ǹ� �ƴϴ�.
--���� null�� ���� ��ȸ�� ���� = ���ٶ�� ������ ��� ���� => is null ����ؾ� ��

select * from emp where comm is null;
select * from emp where comm is not null;

-- null���� �ٷ� �� ���� ����
-- ����) comm �÷��� ���� +100������ ������ ��ȸ�� �Ѵٸ� �����?

-- null+100 => null
--null�� �������� ���� ���� �ǹ��ϹǷ� ���⿡ � ������ �����ص� �������� ���� ������ �ν���
select ename, sal, comm+100 from emp; 

--select ename, sal, nvl(comm, 0) from emp;

--56page �����ϱ� order by
select * from emp;
-- sal ���� ������ ���� 
-- order by�� ��� �÷��� ���, ��ȸ�ϴ� �÷��� ����
select * from emp order by sal desc;

select job, sal from emp order by sal desc;
select job, sal from emp order by 2 desc;

select * 
from emp
order by deptno , sal desc;

-- ���տ����� (union ����ġ��)
-- union, union all, intersect, minus
-- ȸ�����̺�(��� ȸ�������� �ִ� ���̺�)
-- ����ȸ�����̺�, ��⵵ȸ�����̺�, �λ�ȸ�����̺�
-- ��üȸ���� ��ȸ�� �� union ����� (�ߺ�����, ��������)

--���ǻ��� : �÷���, �÷�Ÿ���� ���ƾ���

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


insert into member_tbl_11 values ('m100' , '1234' , '������', '010-1111-2222' , '2004-01-01' , 100, '01');
insert into member_tbl_11 values ('m101' , '4444' , '����', '010-2222-3333' , '2004-01-01' , 1500, '01');
insert into member_tbl_11 values ('m102' , '5555' , '���ϳ�', '010-3333-4444' , '2004-12-10' , 2000, '02');
insert into member_tbl_11 values ('m103' , '6666' , '����ȣ', '010-4444-5555' , '2004-04-10' , 1900, '02');
insert into member_tbl_11 values ('m104' , '7777' , '�����', '010-5555-6666' , '2004-09-12' , 3000, '03');
insert into member_tbl_11 values ('m105' , '8888' , '�ִ���', '010-6666-7777' , '2004-08-10' , 4800, '03');
insert into member_tbl_11 values ('m106' , '9999' , '�̾˸�', '010-7777-8888' , '2004-07-10' , 2900, '01');
insert into member_tbl_11 values ('m107' , '0101' , '��̳�', '010-8888-9999' , '2004-06-09' , 1200, '01');
insert into member_tbl_11 values ('m108' , '0404' , '������', '010-9999-8888' , '2004-05-19' , 3000, '03');
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday) 
values ('m109' , '0448' , '���ؼ�', '010-7878-1111' , '2004-11-27' );
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday) 
values ('m110' , '4848' , '������', '010-8888-9090' , '2004-11-09');
commit;

--1. ��� ������ȸ (* : ����÷�)
select * from member_tbl_11 ;

--2. ��� ���� �̸��� ���� ���� ��ȸ�Ͻÿ�
select M_NAME, M_BIRTHDAY 
from member_tbl_11;

--3. �̸��� ���ؼ��� �����̵�, ����, ����Ʈ ���� ��ȸ�Ͻÿ�
select M_ID, M_BIRTHDAY, M_POINT from member_tbl_11 where M_NAME = '���ؼ�';

--4. ����Ʈ�� 2000�� �̻��� ���̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_NAME, M_TEL from member_tbl_11 where M_POINT  >=2000;
 
--5. ����Ʈ�� 2000������ 3000�� ������ ���̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_NAME, M_TEL from member_tbl_11 where M_POINT >= 2000 and M_POINT <= 3000;

--6. ������� ��01���� ���̸�, ��ȭ��ȣ , ����Ʈ ���� ��ȸ�Ͻÿ�
select M_NAME, M_TEL, M_POINT from member_tbl_11 where M_GRADE='01';

--7. ������ 2004-06-01 ������ ���̸� ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_NAME, M_TEL from member_tbl_11 where M_BIRTHDAY>='2004-06-01';

--8. 2004-05-01������ �¾ ���� ���̸� , ���� ���� ��ȸ�Ͻÿ�
select M_NAME, M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY < '2004-05-01';

--9. ������� ��01���� �ƴ� ���� ���̸�, ��ȭ��ȣ, ����� ���� ��ȸ�Ͻÿ�
select M_NAME, M_TEL, M_GRADE from member_tbl_11 where M_GRADE != '01';

--10. �� ����� ��02�� �� ���� �����̵�, �̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_ID, M_NAME, M_TEL from member_tbl_11 where M_GRADE='02';

--11. ����Ʈ�� 1500�� �̸��� ���� ���̸�, ��ȭ��ȣ ��ȸ�Ͻÿ�
select M_NAME, M_TEL from member_tbl_11 where M_POINT < 1500;

--12. ����Ʈ�� �������� ���� ������ ��ȸ�Ͻÿ�
select * from member_tbl_11 where M_POINT is null;

--13. ����Ʈ�� �ο��� (����Ʈ �ݾ��� ������ �ִ�) ������ ��ȸ�Ͻÿ�( ����Ʈ�� NULL�� �ƴ� �� ��ȸ�ϸ� ��)
select * from member_tbl_11 where M_POINT is not null;

--14. ������� �ߺ����� �ʵ��� ������� ��ȸ�ϴ� ������ �ۼ��Ͻÿ�
select DISTINCT M_GRADE from member_tbl_11;

--1. ������� ��01���̰� ����Ʈ�� 2000�̻��� ���� ���̵�, �̸� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME from member_tbl_11 where M_GRADE='01' and M_POINT >= 2000;

--2. ������� ��01�� �̰ų� ����Ʈ�� 2000�̻��� ���� ���̵�, �̸� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME from member_tbl_11 where M_GRADE='01' or M_POINT >= 2000;

--3. �达���� ���� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_NAME like '��%';

--4. �̸��� ���� ������ ���� ���̵�, �̸� , ��� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_NAME like '%��';

--5. ������� ��01��, ��03�� �� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ� (IN ������ ����� �ּ���)
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_GRADE in('01','03');

--6. ������� ��01��, ��02�� �� �ƴ� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ� ( NOT IN ������ ��� �� �ּ���)
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_GRADE NOT IN('01','02');

--7. ������� ��02�� �̰ų� �̸��� �̾����� ���� ���� ������ ���̵�� �̸� , ��� ������ ��ȸ �Ͻÿ�
select M_ID, M_NAME, M_GRADE from member_tbl_11 where M_GRADE='02' or M_NAME='��%';

--8. ������ 2004-05-01������ �¾�ų� ������� ��03���� ���� ���̵�, �̸�, ���� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME, M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY < '2004-05-01' or M_GRADE='03';




























