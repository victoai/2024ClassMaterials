-- �츮�� ���̺� �����ϱ�
create table  acorntbl (
    id  varchar2(10) primary key,
    pw  varchar2(10) ,
    name varchar2(10)
);

--crud   => create(insert ) , read( select ), u(update) , d(delete) 
select *  from  acorntbl ;
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
 
 
 
 --26page 
select * from emp;
--29
--���̺� ���� ��ȸ
 select * from tab;

--���ϴ� �÷��� ��ȸ
select  empno, ename from emp;

--���̺� ��Ű��, ���̺� ���� 
desc emp;

-- select ��ɿ� ǥ������ ����Ͽ� ����ϱ�  "alias  ��� �ִ� ��Ī�� �� �ֵ���ǥ "
select name, 'good morning '' !!! '  "good moring"  from professor ;
 
 
 -- �÷� ��Ī ����Ͽ� ����ϱ�
 
 -- distinct : �ߺ��� ���� �����ϰ� ����ϱ�
 
 -- ���Ῥ���ڷ� �÷��� �ٿ��� ����ϱ�  || 
 
 -- ���ϴ� ���Ǹ� ��󳻱� - Where�� ����ϱ�
 -- �����Ͽ� ����ϱ�  order by �� ����ϱ�
 -- ���տ�����  union, union all, intersect , minus
 
 
 
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
 
 --�Ի���  hiredate
 select ename, hiredate from emp where hiredate >= '80/12/01';
 select ename, hiredate from emp where hiredate >= '1980-12-01';
 
 
 select * from student;
 select tel from student;
 
  --  1(��)234567
  select sysdate , next_day(sysdate, '��') from dual ;
  select sysdate , next_day(sysdate,  2) from dual ;
  select sysdate , last_day(sysdate) from dual ;
 
 
 --85 page  ���� 4
  select    tel ,  replace( tel,  substr( tel,  instr(tel, '-')+1  ,4)   ,'****') from student;
   
  
  -- �����ڰ� �� �ִ� �ุ ���
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
 