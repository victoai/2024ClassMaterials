 insert into tbl_test_customer values( 'H006' ,'������', '����', '010-1111-2222');
 commit;
 --�ֹ����̺� ���� ��ȸ�ϱ�  , �ֹ����̺�, �����̺� ���輺�� ����  ( �ֹ����̺� �����̺��� id�� ������ ����, �ܷ�Ű��� ��)
 select * from  tbl_test_order; 
 select  * from tbl_test_customer;
 
 select *
 from tbl_test_order   o
 join tbl_test_customer c
 on o.id = c.id;
 
 -- ����, �Ǹż���
 
 select  c.name  name ,  o.sale_cnt   "sale  cnt "
 from tbl_test_order   o
 join tbl_test_customer c
 on o.id = c.id;
 
 -- ���� �Ǹż���
 select  c.name    ,  sum( o.sale_cnt   ) || '��'  ����
 from tbl_test_order   o
 join tbl_test_customer c
 on o.id = c.id
 group by  c.name   ;
 -- �������� , ����� equi���� , inner����  ( ��ġ�ϴ°͸� ���εȴ�.)
 select *
 from tbl_test_order o
 inner join tbl_test_customer c    --  inner �������� (��ġ���� �ʴ°��� ��ȸ���� �ʴ´�.)
 on  o.id = c.id;
 
 
 select c.name  ,  o.sale_cnt 
 from tbl_test_order o
 inner join tbl_test_customer c    --  inner �������� (��ġ���� �ʴ°��� ��ȸ���� �ʴ´�.)
 on  o.id = c.id; 
 -- �� �ֹ����� ��ȸ ! ( �ֹ����� �ʴ� ���� �Բ� ��ȸ�� �� �ֵ��� )
 
 select c.name, o.sale_cnt
 from tbl_test_order  o
 join tbl_test_customer c
 on  o.id  = c.id ;
 
 
 --select * from tbl_test_customer;
 
 
  -- 
 select c.name, o.sale_cnt
 from tbl_test_order  o
 right outer join tbl_test_customer c
 on  o.id  = c.id ;
 
 
 -- 
 select c.name, nvl( o.sale_cnt , 0)|| '��'
 from tbl_test_order  o
 right outer join tbl_test_customer c
 on  o.id  = c.id ;
 
 
 --���� �Ǹż���
 select c.name,   nvl( sum(o.sale_cnt   ) ,0)  qty
 from tbl_test_order  o
 right outer join tbl_test_customer c
 on  o.id  = c.id 
 group by  c.name
 order by 2 desc;
   
 -- �ֹ������� ��ȸ�ϱ� 
 -- ���� ���̺��� ���� �� �� 
 -- �� ���߿��� �߽����̺� ���� ǥ���� 
 select * from tbl_test_order;  
 select * from tbl_test_customer;
 
 select *
 from tbl_test_order o
 join tbl_test_customer c
 on o.id =c.id;

 
 
 select  c.name, o.sale_cnt
 from tbl_test_order o
 join tbl_test_customer c
 on o.id =c.id;
 --�ֹ��������� ���� �Բ� ��ȸ�ϱ�  ( outer  ���� , left, right, full)
 select  c.name, o.sale_cnt
 from tbl_test_order o
 right outer join tbl_test_customer c
 on o.id =c.id;
 -- null �� ó��
 select  c.name,  nvl(o.sale_cnt,0)
 from tbl_test_order o
 right outer join tbl_test_customer c
 on o.id =c.id;
 
 --���� ���� ( group by)
 select  c.name,  sum( nvl(o.sale_cnt,0))
 from tbl_test_order o
 right outer join tbl_test_customer c
 on o.id =c.id
 group by c.name ;
 
 
 -- rollup() : �� ���غ� �Ұ踦 ����ؼ� �����ִ� �Լ� 
 -- group by�� ����Ǿ�� �Ѵ�.
 
 select * from emp;
 select deptno , job, sal from emp;
 --�μ��� �޿��հ�
select deptno , sum( sal )
from emp
group by  deptno;
--
select deptno , sum( sal )
from emp
group by  rollup(deptno);
 
select decode(deptno, null,'�հ�',deptno) deptno , sum( sal )
from emp
group by  rollup(deptno); 
 --to_char(  �ݾ�,  '999,999' )
 select decode(deptno, null,'�հ�',deptno) deptno , to_char( sum( sal ) , '999,999'  ) sal_total
from emp
group by  rollup(deptno);


select  deptno, job, sal
from emp;
-- group by 
select  deptno, job, sum( sal)
from emp
group by  deptno, job
order by deptno , job;

-- rollup() �Ұ� , ��ü�հ�
select  deptno, job, sum( sal)
from emp
group by   rollup(deptno, job)
order by deptno , job;
--
select  deptno, decode(job, null,'�Ұ�', job), sum( sal)
from emp
group by   rollup(deptno, job)
order by deptno , job; 

--rollup()���� 
select  decode(deptno, null,'��ü�հ�',deptno) deptno, decode(job, null,'�Ұ�', job)  job, sum( sal)
from emp
group by   rollup(deptno, job)
order by deptno , job;

--pivot() �Լ�

select * from emp;

select  deptno , empno,  job
from emp;

--
select deptno,
    decode(job, 'CLERK' , empno) clerk,
    decode(job, 'MANAGER' , empno) manager,
    decode(job, 'PRESIDENT' , empno) PRESIDENT,
    decode(job, 'ANALYST' , empno) ANALYST,
    decode(job, 'SALESMAN' , empno) SALESMAN
from emp;

select * from emp;

select deptno,
    count(decode(job, 'CLERK' , empno)) clerk,
    count(decode(job, 'MANAGER' , empno)) manager,
    count(decode(job, 'PRESIDENT' , empno))  PRESIDENT,
    count( decode(job, 'ANALYST' , empno)) ANALYST,
    count( decode(job, 'SALESMAN' , empno)) SALESMAN
from emp
group by deptno;

--pivot()
select * from ( select deptno, job, empno from emp)
pivot(
   count(empno) for job in ( 'CLERK' as "CLERK" ,
                             'MANAGER' as "MANAGER",
                             'PRESIDENT' as "PRESIDENT",
                             'ANALYST' as "ANALYST" ,
                             'SALESMAN' as "SALESMAN")                            
);


-- rank() �Լ�
select * from emp;
select empno, ename, sal from emp;
select empno, ename, sal , rank() over (order by sal desc) from emp;   -- asc(������ ���� , desc (������ ����)
select empno, ename, sal , dense_rank() over (order by sal desc) from emp;   -- asc(������ ���� , desc (������ ����)

select  empno, ename, sal , rank() over( order by sal desc )
from emp;

select  empno, ename, sal , deptno,  rank() over( order by sal desc )
from emp;

select  empno, ename, sal , deptno,  rank() over( partition by deptno  order by sal desc )
from emp;


--sum() over ���豸�ϱ�
select * from  panmae;

select  p_date , p_total , sum(p_total) over(order by p_total) 
from panmae;

select p_date, p_code, p_total
from panmae;

select p_date, p_code, p_total , sum(p_total) over( partition by p_code  order by p_total)
from panmae
where p_store=1000;



select p_date, p_total, sum(p_total) over(order by p_total) 
from panmae;

select  p_total, sum(p_total) over(partition by p_total order by p_total) 
from panmae
order by p_total;

SELECT p_total, 
       SUM(p_total) OVER(ORDER BY p_total)
FROM panmae
ORDER BY p_total;


SELECT p_total,
       SUM(p_total) OVER(ORDER BY p_total) AS cumulative_sum
FROM panmae
ORDER BY p_total ;


----- �ݾ״��豸�ϱ�
SELECT p_total,  row_number, SUM(p_total) OVER (ORDER BY row_number) AS amt
FROM (
    SELECT p_total,  ROW_NUMBER() OVER (ORDER BY p_total) AS row_number
    FROM panmae
)                                                    
ORDER BY p_total;


SELECT p_total,   SUM(p_total) OVER (ORDER BY p_total) AS amt
FROM    panmae                                               
ORDER BY p_total;

--��������  4��

select * from emp;
select deptno, job, sal from emp;
select deptno, decode( job , 'CLERK', sal)  
from emp;

select   decode( job , 'CLERK', sal) ,
         decode( job , 'MANAGER' ,sal),
         decode( job, 'PRESIDENT', sal)
from emp;
--
select    sum(decode( job , 'CLERK', sal)) CLERK ,
          sum(decode( job , 'MANAGER' ,sal))  MNANAGER,
          sum(decode( job, 'PRESIDENT', sal)) PRESIDENT
from emp;

select  deptno,  sum(decode( job , 'CLERK', sal)) CLERK ,
          sum(decode( job , 'MANAGER' ,sal))  MNANAGER,
          sum(decode( job, 'PRESIDENT', sal)) PRESIDENT
from emp
group by deptno;

--
select  deptno, 
          nvl(sum(decode( job , 'CLERK', sal)),0) CLERK ,
          nvl(sum(decode( job , 'MANAGER' ,sal)) ,0) MNANAGER,
          nvl(sum(decode( job, 'PRESIDENT', sal)) ,0) PRESIDENT
from emp
group by deptno;
-- 3��
select  * from student;
select   tel from student;
select   count(tel) from student;
--tel���� �������� �����ϱ� (�Ϻ������ϱ� substr() )
select   substr( tel, 1, instr(tel,')') -1 ) from student; 
select   count(tel),
         count(decode( substr( tel, 1, instr(tel,')') -1 ) ,'02',1))   ,
         count(decode( substr( tel, 1, instr(tel,')') -1 ) ,'051',1))  
from student;

--2 �������� Ǯ��
select * from student;
select birthday from student;

select   to_char(birthday ,'mm' )from student;
select   substr(birthday,4,2)  from student;
select  birthday, decode(  to_char(birthday ,'mm' ) ,'01',1) JAN
from student;
select  count(birthday),
 count(decode(  to_char(birthday ,'mm' ) ,'01',1))|| 'EA'  JAN
from student;



select * from tbl_test_customer;

select * from member_tbl_11;

select m_name, m_grade,decode(m_grade,'01','VVIP','02','VIP','03','GOLD' ) from member_tbl_11;

desc member_tbl_11;

insert into member_tbl_11( m_id, m_pw, m_name )  values('angel' ,'1234' ,'����');
select * from member_tbl_11;



select * from tbl_test_order;
select * from tbl_test_customer;
select  sale_cnt , id  from tbl_test_order;

-- �� �ֹ���Ȳ
select   * 
from tbl_test_order  o
join tbl_test_customer   c
on o.id  = c.id ;

-- join   ( inner join ) 
select  z.name, o.sale_cnt
from tbl_test_order  o
join tbl_test_customer   z
on o.id  = z.id ;

 
-- right outer join
select  z.name, o.sale_cnt
from tbl_test_order  o
right outer join tbl_test_customer   z
on o.id  = z.id ;

--  null�϶� Ư�������� ǥ�õ� �� �ֵ���
select  z.name, nvl( o.sale_cnt ,0)
from tbl_test_order  o
right outer join tbl_test_customer   z
on o.id  = z.id ;

create table aa  as select * from tbl_test_order;
select * from  dual;


-- �ð� ǥ���ϱ�
select to_char(  to_date( '900', 'HH24MI' ) , 'HH24:MI' )  from dual;  --�ȵ�
select to_char(  to_date( lpad('900',4,0), 'HH24MI' ) , 'HH24:MI' )  from dual;--�ú� ǥ������
select   substr(lpad('900',4,0) ,1,2 ) || ':' ||  substr(lpad('900',4,0) ,3,2 )   from dual; 



