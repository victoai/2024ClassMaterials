

--select * from ���̺��
--selet * from  ���̺�� where ���� 

select * from acorntbl;
select * from acorntbl where name like '��_';
select * from acorntbl where name like '��%';


-- �������Լ� (����, ���� , ��¥, ��ȯ�Լ�, �Ϲ��Լ� )
 
select  ename, initcap(ename) from emp;  -- ù���ڸ��빮�ڷ� ��ȯ����
select  ename, lower(ename) from emp;  -- �ҹ��ڷ� ��ȯ����
select  ename, upper(ename) from emp;  -- �빮�ڷ� ��ȯ����
select  ename, length(ename) from emp;  --���ڿ��� ����



select * from ACORNTBL;
select length(name), lengthb(name) from ACORNTBL;  --  lengthb()����Ʈ���� ������

select *  from emp; 
select   ename || job    from emp;
select   ename || job  as   "ename job"   from emp;

select  concat( ename, job) from emp;

--substr()   ���ڿ��� �Ϻθ� ������ �� 
-- ( ���ڿ�, ������ġ, ������ ����)
select substr(ename, 2, 3)  from emp;

select 'abcde' from dual;   -- dual  �������̺� 
select  substr('abcde', 2,1) from dual;

select  substr('hi hello', 4,5) from dual;
select  substr(name,2,2)  from acorntbl;

--������ġ�� -�̸� �����ʱ������� ������ġ�� ������
select  substr(name,-1,2)  from acorntbl;

-- instr() : ���ڿ����� Ư�� ������ ��ġ�� ��ȯ�� 

select  instr('A-B-C-D', '-' )from dual;
select  instr('A-B-C-D', '-' , 1,3 )from dual;

select  instr('032)851-1234',')') from dual;

select * from student;
select name, tel from student;
-- ��ȭ��ȣ���� ) ���� ��ġ ã��
select name, instr(tel, ')') from student;

-- ��ȭ��ȣ���� ) ���� ��ġ -1 (������ ���� ���ϱ�)
select name, substr(tel, 1 ,  instr(tel, ')')-1) , instr(tel, ')')-1  from student;

-- lpad() �Լ� 
select * from student;
select id from student;
--   lpad(���ڿ�, ��ü�ڸ���, ä�﹮��)
select lpad(id , 10 , '*') from student;
select rpad(id , 10 , '-') from student;

--trim() :�������� (���� ��������)
--ltrim() :���ʰ�������  
--rtrim() :�����ʰ�������  

select  '  abc  '|| 'b'  from dual;
select trim('  abc  ') || 'b'  from dual;
select ltrim('  abc  ') || 'b'  from dual;
select rtrim('  abc  ') || 'b'  from dual;

--replace 
select * from emp;
select ename , replace( ename,  'M',  '*') from emp;
select  ename,  replace( ename,   'SM' , '**')  from emp;  -- SM �̶�� ���ڸ�  **�� �ٲ��. !!!
select  substr( ename, 1,2) from emp;   -- �̸����� ���� �α��� ��������
select  ename,  replace( ename,  substr(ename, 1,2)    , '**')  from emp; -- �̸����� ���� �α��ڸ�  **�� �ٲٱ�

select * from  student;
select name, jumin , replace( jumin, substr( jumin, 7,7) ,'-/-/-/-' ) from student;
-- 84,85
select ename, replace(ename, substr(ename,2,2),'--') as REPLACE from emp;
select name, jumin, replace(jumin,substr(jumin,7),'-/-/-/-') as REPLACE from student;
select name, tel, replace(tel,substr(tel,5,3),'***') as REPLACE from student where deptno1='102';
select name, tel, replace(tel,substr(tel,9),'****') as REPLACE from student where deptno1='101';

--79
select name, tel, substr(tel, 1,instr(tel,')')-1)  as "AREA CODE" from student where deptno1='201';
--�����Լ�
-- round( ����, �ڸ���) �ݿø� 
-- �ڸ�����-�̸� �Ҽ��� ���� ����
select  round( 987.655, 2) from dual;
select  trunc( 987.655, 2 ) from dual;
select  trunc( 987.655, -1 ) from dual;  --������ ���� 
select  trunc( 987.655, -2 ) from dual;  --�ʴ��� ���� 

select ceil(12.3456) from dual;   --���� �ø�
select floor(12.3456) from dual;   --���� ����
--���������ϱ� mod(������,����) 
select  mod( 10,2) from dual;

--��¥�Լ�
--sysdate  ���糯¥���ϱ�
select sysdate from dual;
-- months_between( ū��¥ , ������¥ )  : �� ��¥ ������ ����  �� ���ϱ�
select months_between( '20230901','20230801') from dual;
select months_between( '23/09/01','23/08/01') from dual;

--next_day() ������ ������ ���� ���Ͽ� �ش��ϴ� ��¥���ϱ�
select  next_day('2023-08-18','��') from dual;

-- ���糯¥���� 3�� �� ���ϱ�
select sysdate +3  from dual ;

-- Ư����¥�� �������� 3�� �� ���ϱ�
select  to_date('2023/08/18') + 3  from dual;


--����ȯ �Լ�    
-- ����, ��¥��  => ���ڷ� ��ȯ  ( ���ϴ� �������� �����ؼ� ��ȸ�ϱ�)
select  123456 from dual;
select  to_char(123456, '999,999')  from dual;
select  to_char(123456, '9999,999.99')  from dual;
select  to_char(123456, 'L999,999')  from dual; --��ȭǥ��
select  to_char(123456, '$999,999')  from dual; --$ǥ��
-- ���ǻ��� ǥ���� ������ �ڸ������� 9�� ������ ������ ##### ǥ���� )
select  to_char(123456, '9999,999')  from dual;
select  to_char(123456, '09999,999')  from dual;

-- ��¥��=> ���ڷ� ��ȯ
select  sysdate from dual;
select  to_char( sysdate, 'yyyy-mm-dd'  ) from dual;
select  to_char( sysdate, 'yyyy-mm-dd day'  ) from dual;
select  to_char( sysdate, 'yyyy-mm-dd dy'  ) from dual;
select  to_char( sysdate, 'yyyy/mm/dd'  ) from dual;
select  to_char( sysdate, 'yy/mm/dd'  ) from dual;
select  to_char(sysdate , 'yyyy"��"mm"��"dd"��"') from dual;


select  *  from emp;
select  empno,  ename, sal, comm  from emp;
select  empno,  ename,  (sal*12)+comm  from emp;
select  empno,  ename,  to_char((sal*12)+comm , '999,999')  "����"  from emp;

desc professor;
select * from professor;
select name, pay, bonus from professor;
select name, (pay*10)+ bonus from professor;
select name, to_char( (pay*10)+ bonus, '999,999') from professor;

--to_number() �Լ�
select '5' +3  from dual;    --�ڵ�����ȯ(����������ȯ)
select to_number('5') + 3 from dual ;   --���������ȯ    �������·ε� ���ڸ� ���� ���ڷ� ��ȯ�ϴ� �Լ� 

--to_date() �Լ� : �������·ε� ��¥�����͸� ���� ��¥�����ͷ� ��ȯ�ϴ� �Լ� 
select to_date('2023/08/18') + 3 from dual;


--�Ϲ��Լ�  nvl(), nvl2()
--null�� ��� �ٸ������� ġȯ���ִ� �Լ�
select  * from professor;
select name, bonus from professor;
select name, nvl( bonus ,0) from professor;

select name, (pay*12)+ bonus  as  "����"  from professor;
--null�ΰ��
select name,  nvl((pay*12)+ bonus,0) as  "����"  from professor;
--�����ݾ׿� õ���� ǥ������
select name,   to_char(nvl((pay*12)+ bonus,0) ,'999,999') as  "����"  from professor;

select bonus from professor;
select bonus,  nvl2( bonus, bonus*2 , 50) from  professor;
  --   nvl2( �÷�, null�ƴѰ��, null���)
select nvl2( bonus, bonus*2 , 100) from  professor;


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

--decode() �Լ� 
select * from member_tbl_11;
select  m_grade, decode(m_grade ,'01' ,'VIP','02','���','03','�����') from member_tbl_11;

 
--120 ����2
select * from student;
select name, tel from student;
select substr( tel, 1 ,3) from student ;
select instr(tel, ')') from student;
select substr( tel, 1 , instr(tel,')')-1 ) from student ;
select name, tel , decode( substr( tel, 1 , instr(tel,')')-1 )  , '02' , '����' ,'031','���')  from student;
select name, tel , decode( substr( tel, 1 , instr(tel,')')-1 )  , '02' , '����' ,'031','���')  from student;

--case when 
--SELECT ���̸� , CASE WHEN [����] THEN [�����]
--WHEN [����] THEN [�����]
--ELSE [�����]
--END AS ���ο��÷���
--FROM ���̺�� ; 
select * from member_tbl_11;

select m_point from member_tbl_11;
select m_point, case 
                   when m_point >= 2000 then '��'                    
                end as "���"  from member_tbl_11;
 
 
select m_point, case 
                   when m_point >= 2000 then '��'  
                   when m_point >=1500  then '��'
                   else '��'
                end as "���"  from member_tbl_11; 
  
  
  --�������Լ�   �����Լ� , sum(), avg(), max(), min()
  -- count(*) , count(�÷���)
   select * from member_tbl_11;
   select sum(m_point) from member_tbl_11;
   select avg(m_point) from member_tbl_11;
   select max(m_point) from member_tbl_11;
   select min(m_point) from member_tbl_11;
   select count(*) from member_tbl_11;  -- member_tbl_11 ���̺��� ���� ������ ���Ѵ�. ��ü���� ���� ���ϱ�
   select count(m_point) from member_tbl_11;  -- member_tbl_11  �÷������� count�� ����  �ش��÷���  null ���� �����ϰ� count
   
   --group by , �����Լ��� �Բ� ����Ѵ�.
    select * from member_tbl_11; 
    select m_grade , m_point from member_tbl_11; 
    
    select m_grade , sum( m_point)
    from member_tbl_11
    group by m_grade ;
    
    -- having �� ����ϱ� (����),  group by ���������  ���ǿ� �´°͸� ������ �� 
    select m_grade, m_point 
    from member_tbl_11;
    
    select m_grade, sum(m_point ) as total
    from member_tbl_11
    group by m_grade;
    
    
    --select  ���� ������� 
    select m_grade, sum(m_point ) as  "total" --4��
    from member_tbl_11   -- 1��
    group by m_grade     -- 2��
    --having total >=5000  select�� �ִ� ��Ī�� ����� �� ����. ������ ������ �ִ�. !!! ;   --3��
    having sum(m_point)  >=5000 ;    --3�� 
        
    
    select m_grade, sum(m_point ) as  "total" --4��
    from member_tbl_11   -- 1��
    group by m_grade     -- 2��
    --having total >=5000  select�� �ִ� ��Ī�� ����� �� ����. ������ ������ �ִ�. !!! ;   --3��
    having sum(m_point)  >=5000 ;    --3�� 
    
    
    select m_grade, sum(m_point ) as  "total" 
    from member_tbl_11   
    group by m_grade      
    having sum(m_point)  >=5000 
    order by 2 desc ; 
   
   -- count() , count(*)   count(�÷���) 
   
   select * from emp;
   select count(*) from emp;
   select count(ename) from emp;
   select count(comm) from emp; -- �ش��ϴ� �÷��� ���� null�� �����ϰ� ī��Ʈ��
   
   select  sum(comm) from emp;   --  null�� ���ܵǰ� �հ谡 ��������.
   
   select avg(comm) from emp;
   
   select max(comm) from emp;
   select min(comm) from emp;
   
   
   --group by 
   select   * from emp;
   
   -- group by ������ ��ȸ�� Ȯ���ϱ�
   select deptno, sal  from emp ;
   
   --�μ��� sal�� ����� ���ϱ�
  select deptno, sum(sal) 
  from emp 
  group by deptno;
  
  --having�� ������  group by�� �� ��Ȳ���� ���ȴ�.
  --group by ���µ�   having  ����. !!!! 
  --group�� ��������� ������ ����� ����  having�� �;� ��. !!!!!!!
  
  select deptno, sum(sal) 
  from emp 
  group by deptno
  having sum(sal) >=7000 ;
  
  select  * from emp;
  select  deptno , job, sal
  from emp;
  
  
  select  * from emp;
  
  
  select  deptno , job,  sum(sal)
  from emp
  group by  deptno , job
  order by 1, 3 desc ; 
  
  
     
  select  deptno , job,  sum(sal)
  from emp
  group by  rollup( deptno , job);
 
 SELECT 
    CASE WHEN GROUPING(deptno) = 1 THEN '  Total' ELSE TO_CHAR(deptno) END AS deptno,
    CASE WHEN GROUPING(job) = 1    THEN ' sub Total' ELSE job END AS job,
    SUM(sal) AS total_sal
FROM emp
GROUP BY ROLLUP(deptno, job);






create table tbl_test_customer(
    id varchar2(20) not null primary key ,
    name varchar2(20) ,
    address varchar2(20),
    tel varchar2(20)
);

create table tbl_test_goods(
  pcode varchar2(20) not null primary key,
  pname varchar(20) ,
  price number(4)
);

create table tbl_test_order(
  ocode varchar2(20) not null primary key,
  odate date,
  id varchar2(20),
 pcode varchar2(20),
 sale_cnt number(6)
);



insert into tbl_test_customer values( 'H001' ,'�躴��', '�󽺺�����', '010-1111-2222');
insert into tbl_test_customer values( 'H002' ,'����', 'L.A', '010-1111-2222');
insert into tbl_test_customer values( 'H003' ,'���ܾ�', '������D.C', '010-1111-2222');
insert into tbl_test_customer values( 'H004' ,'������', '����', '010-1111-2222');
insert into tbl_test_customer values( 'H005' ,'������', '�ػ罺', '010-1111-2222');
insert into tbl_test_customer values( 'H005' ,'������', '����', '010-1111-2222');


 


insert into tbl_test_goods values('P001' ,'�˵��', 1000);
insert into tbl_test_goods values('P002' ,'�������', 100);
insert into tbl_test_goods values('P003' ,'������', 200);
insert into tbl_test_goods values('P004' ,'��Ƣ��', 2000);



insert into tbl_test_order values('J001' , '20210110' , 'H001', 'P001', 2);
insert into tbl_test_order values('J002' , '20210110' , 'H002', 'P002', 5);
insert into tbl_test_order values('J003' , '20210110' , 'H003', 'P003', 2);
insert into tbl_test_order values('J004' , '20210110' , 'H004', 'P004', 1);
insert into tbl_test_order values('J005' , '20210110' , 'H005', 'P002', 3);
insert into tbl_test_order values('J006' , '20210110' , 'H001', 'P002', 3);
insert into tbl_test_order values('J007' , '20210110' , 'H002', 'P001', 1);
insert into tbl_test_order values('J008' , '20210110' , 'H001', 'P002', 4);

 





select  * from  tbl_test_customer;
select  * from  tbl_test_goods;
select  *  from  tbl_test_order ;

-- join ����ġ��
select *
from tbl_test_order  o
join tbl_test_customer c
on  o.ID = c.ID;

select *
from tbl_test_order  o
join tbl_test_customer c
on  o.ID = c.ID
join tbl_test_goods g
on o.PCODE =g.PCODE;


select   o.ocode, o.odate, c.name, c.tel,   g.pname , g.price , o.sale_cnt
from tbl_test_order  o
join tbl_test_customer c
on  o.ID = c.ID
join tbl_test_goods g
on o.PCODE =g.PCODE;
 
 
 select   o.ocode, o.odate, c.name, c.tel,   g.pname ,  g.price * o.sale_cnt
from tbl_test_order  o
join tbl_test_customer c
on  o.ID = c.ID
join tbl_test_goods g
on o.PCODE =g.PCODE;




  


