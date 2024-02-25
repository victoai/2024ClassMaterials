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

insert into tbl_test_customer values( 'H001' ,'������', '�󽺺�����', '010-1111-2222');
insert into tbl_test_customer values( 'H002' ,'��⿱', 'L.A', '010-1111-2222');
insert into tbl_test_customer values( 'H003' ,'�����', '������D.C', '010-1111-2222');
insert into tbl_test_customer values( 'H004' ,'�迬��', '����', '010-1111-2222');
insert into tbl_test_customer values( 'H005' ,'�迹��', '�ػ罺', '010-1111-2222');
insert into tbl_test_customer values( 'H006' ,'������', '����', '010-1111-2222');


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


//����Ŭ ����

SELECT   name, address, tel, odate, pname, sale_cnt ,price ,sale_cnt* price
FROM     tbl_test_customer  c , tbl_test_goods g , tbl_test_order o
WHERE    o.id = c.id  and o.pcode = g.pcode ;

// sql  ���� ǥ�� 

SELECT  name, address, tel, odate, pname, sale_cnt, price, sale_cnt * price
FROM   tbl_test_order o
JOIN     tbl_test_customer c
ON       o.id = c.id
JOIN     tbl_test_goods g
ON       o.pcode = g.pcode ;

--����Ŭ ����

select * 
from 
tbl_test_order  o,
tbl_test_customer c
where  o.id = c.id;


--join �� �������� ���°��
--cardition �� 

select * 
from 
tbl_test_order  o,
tbl_test_customer c
;

--Non Equijoin (�� ����)
--���� ������ �������� �ƴ϶� ������ ���ϴ� ���� ���Ѵ�.

create table table3(  column1 number(2));
create table table4(  column2 number(2));


insert into table3 values(10);
insert into table3 values(15);
insert into table3 values(18);


insert into table4 values(12);
insert into table4 values(18);
insert into table4 values(25);

commit;

SELECT *
FROM table3
JOIN   table4
ON     table3.column1 < table4.column2;


--p. 239
select * from score;
select * from hakjum;

select * 
from score s
join hakjum  h
on s.total >= h.min_point and  s.total <= h.max_point;

--
select * from customer;
select * from gift;

select *
from customer  c
join gift g
on c.point  between g.g_start  and g.g_end;

--
select *
from customer  c
join gift g
on c.point  between g.g_start  and g.g_end;

--outer ����
select * from student;
select * from professor;


--���������� ���� �л��� ��ȸ���� ����
-- 
select * 
from student  s
join professor p
on s.profno  =  p.profno;


select s.name, p.name 
from student  s
join professor p
on s.profno  =  p.profno;

 
--
-- ���̺��� pk Ȯ���ϱ�
-- fk �ܷ�Ű ( �ٸ� ���̺���� ���� ���� �÷�)
-- 20�� ��ȸ��
select * 
from student  s
left outer join professor p
on s.profno  =  p.profno;


--ǥ�� �ƿ��� ����
select s.name, p.name 
from student  s
left outer    join professor p
on s.profno  =  p.profno;
 

--����Ŭ �ƿ��� ���� ǥ��
select s.name, p.name 
from student  s, professor p
where s.profno  =  p.profno(+);


--����Ǯ��
--p.254  1 

select * from student;  --�л����̺�
select * from department;  --�а����̺�

--�л��̸�, �а��ڵ�,  �а��̸�
select *
from student s
join department d
on s.deptno1  = d.deptno;


select s.name, s.deptno1 , d.dname
from student s
join department d
on s.deptno1  = d.deptno;

--2�� ����
select * from emp2;
select * from p_grade;

-- �̸�, ����, ����,  ����, ���� 

select * 
from emp2 e
join p_grade p
on e.position =  p.position;


select e.name , e.position , e.pay,  p.s_pay, p.e_pay 
from emp2 e
join p_grade p
on e.position =  p.position;


--õ���� ���б�ȣ
select e.name , e.position , to_char( e.pay ,'999,999,999'),  p.s_pay, p.e_pay 
from emp2 e
join p_grade p
on e.position =  p.position;


--p.254  3
--���� ���ϱ�
select  trunc( (sysdate- birthday) /365 ,0) 
from emp2;

select  trunc(   months_between( sysdate , birthday) /12 ,0) 
from emp2;




select *
from emp2  e
join p_grade g
on  trunc (  ( sysdate-e.birthday) /365 , 0)  between g.s_age and g.e_age;



select e.name,  trunc( ( sysdate - e.birthday) /365 ,0 ) "age"  , e.position, g.position , g.s_age, g.e_age
from emp2  e
join p_grade g
on  trunc (  ( sysdate-e.birthday) /365 , 0)  between g.s_age and g.e_age;



 
