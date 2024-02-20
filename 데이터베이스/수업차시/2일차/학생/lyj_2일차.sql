-- select * from ���̺��
-- select * from ���̺�� where ����


select * from acorntbl;
select * from acorntbl where name like '��_';
select * from acorntbl where name like '��%';


-- ������ �Լ� (����, ����, ��¥, ��ȯ�Լ�, �Ϲ��Լ�)


select ename, initcap(ename) from emp;  --ù���ڸ� �빮�ڷ� ��ȯ
select ename, lower(ename) from emp;  -- �ҹ��ڷ� ��ȯ
select ename, upper(ename) from emp;  -- �빮�ڷ� ��ȯ
select ename, length(ename) from emp;  -- ���ڿ��� ����


select * from acorntbl;
select length(name), length(name) from acorntbl;    -- lengthb() ����Ʈ���� ������


select * from emp;
select ename || job from emp;
select ename || job as "ename job" from emp;


-- �ٿ� ����
select concat(ename, job) from emp;


-- substr() ���ڿ��� �Ϻθ� ������ ��
-- ( ���ڿ�, ������ġ, ������ ����)
select substr(ename, 2, 3) from emp;


select 'abcde' from dual;   -- dual �������̺�, �Լ�����
select substr('abcde', 2, 1) from dual;   -- oracle���� dual�̶�� ���� ���̺� ����


select substr('hi hello', 4, 5) from dual;
select name from acorntbl;

select substr(name, 2, 2) from acorntbl;  -- �ι�° ����� �̸��̾ �̸� �� ���� ���


-- ������ġ�� -�̸� ������ �������� ���� ��ġ�� ������
select name, substr(name, -2, 2) from acorntbl;

select substr(name, -1, 2) from acorntbl; -- -�� ������ �������� ���, ���ؿ��� �� �� ���


-- instr (): ���ڿ����� Ư�� ������ ��ġ�� ��ȯ��


select instr('A-B-C-D', '-') from dual;
select instr('A-B-C-D', '-', 1, 3) from dual;   -- - ã��, 1���� ����, �� ��° ������ ��ġ ���

select instr('032)851-1234',')') from dual;   -- ) ã�� ��


select * from student;
select name, tel from student;
select name, instr(tel, ')') from student;    -- ��ȭ��ȣ���� ) ���� ��ġ ã��

-- ��ȭ��ȣ���� ) ���� ��ġ -1 (������ ���� ���ϱ�)
select name, substr( tel, 1, instr(tel, ')')-1), instr(tel, ')')-1 from student;


-- lpad() �Լ�
select * from student;
select id from student;

-- lpad(���ڿ�, ��ü�ڸ���, ä�� ����)
select lpad(id, 10, '*') from student;
select rpad(id, 10, '*') from student;


-- trim(): �������� (���� ��������)
-- ltrim(): �������� (���� ��������)
-- rtrim(): �����ʰ�������


select '  abc  ' || 'b' from  dual;
select trim('  abc  ') || 'b' from dual; -- ���� ���� �� ����
select lrim('  abc  ') || 'b' from dual;
select rtrim('  abc  ') || 'b' from dual;


-- replace
select * from emp;
select ename, replace( ename, 'M', '*' ) from emp;    -- M ���ڸ� *�� �ٲ㼭 ���


select ename, replace( ename, 'SM', '**') from emp;   -- SMITH�� �ٲ�
select substr(ename, 1, 2) from emp;
select ename, replace( ename, substr(ename, 1, 2),  '**') from emp;

select * from emp;
select ename, replace( ename, substr(ename, 2, 2), '--') from emp;

select * from student;
select jumin from student;
select NAME , JUMIN, replace (jumin, substr(jumin, 7, 7), '-/-/-/-/-') from student; 
select deptno1, NAME , JUMIN, replace (jumin, substr(jumin, 7, 7), '-/-/-/-/-') from student where deptno1 =101;

select name, tel, replace(tel, substr(tel, 5, 3), '***') from student;


select name, tel, replace(tel, substr(tel, 9), '****') from student where deptno1 = 101;


-- ���� �Լ�
-- round( ����, �ڸ���) �ݿø�
-- �ڸ����� -�̸� �Ҽ��� ���� ����

select round(987.655, 2) from dual;   -- �ݿø�
select trunc(987.655, 2) from dual;   -- �ݿø����� �ʰ� ����
select trunc(987.655, -1) from dual;    -- ������ ����
select trunc(987.655 - 2) from dual;  -- �ʴ��� ����


select ceil(12.3456) from dual;   -- ���� �ø�
select floor(12.3456) from dual; -- ���� ����

-- ���������ϱ� mod (������, ����)
select mod(10, 2) from dual;

-- select rpad(id, 10, '*') from student;

select lpad(jumin, 13, '-/') from student;

-- sysdate ���糯¥ ���ϱ�
select sysdate from dual;

-- moths_between (ū ��¥, ���� ��¥) : �� ��¥ ������ ���� �� ���ϱ�
select months_between( '20230901', '20230801') from dual;
select months_between( '23/09/01', '23/08/01') from dual;


-- next_day() ������ ������ ���� ���Ͽ� �ش��ϴ� ��¥ ���ϱ�
select next_day('2023-08-18', '��') from dual;


-- ���� ��¥ ���� 3�� �� ���ϱ�
select sysdate+5 from dual;


-- to_date �� ��ȯ, Ư�� ��¥�� �������� 3�� �� ���ϱ�
select to_date('2023/08/18') +3 from dual;


-- ����ȯ �Լ�
-- ����, ��¥�� => ���ڷ� ��ȯ (���ϴ� �������� �����ؼ� ��ȸ�ϱ�)

select 123456 from dual;
select to_char(123456, '999,999') as amt from dual;
select to_char(123456, 'L999,999.99') from dual;
select to_char(123456, '$999,999') from dual;
-- ���ǻ���: ǥ���� ������ �ڸ������� 9�� ������ ������ ##### ǥ���� )
select to_char(123456, '9,999') from dual;
-- �ڸ����� ������ ���� 0���� ä��
select to_char(123456, '09999,999') from dual;


select * from emp;
select empno, ename, sal, comm from emp;
select empno, ename, (sal*12), comm from emp;
select empno, ename, to_char((sal*12)+comm, '999,999') "����" from emp;



-- ��¥�� => ���ڷ� ��ȯ
select sysdate from dual;
select to_char(sysdate, 'yyyy-mm-dd day') from dual;
select to_char(sysdate, 'yyyy-mm-dd dy') from dual;

select to_char(sysdate, 'yyyy/mm/dd') from dual;
select to_char(sysdate , 'yyyy"��"mm"��"dd"��"') from dual;


desc professor;   -- ���̺��� ������ �� �� ����
select * from professor;
select name, pay, bonus from professor;
select name, to_char((pay+10)+ bonus, '999,999') from professor;



-- to_number() �Լ�


select '5' + 3 from dual;     -- �ڵ�����ȯ(����������ȯ)
select to_number('5') + 3 from dual;    -- ���������ȯ   ���� ���·� �� ���ڸ� ���� ���ڷ� ��ȯ�ϴ� �Լ�


-- to_date() �Լ� : ���� ���·� �� ��¥ �����͸� ���� ��¥ �����ͷ� ��ȯ�ϴ� �Լ�
select to_date('2023/08/18') + 3 from dual;


-- �Ϲ��Լ�  nvl(), nvl2()
-- null�� ��� �ٸ������� ġȯ���ִ� �Լ�


select * from professor;
select name, bonus from professor;
select name, nvl( bonus, 0) from professor;



select name, nvl((pay*12) + bonus, 0) as "����" from professor;
-- null�� ���

-- ���� �ݾ׿� õ���� ǥ�� ����
select name, nvl((pay*12) + bonus, 0) as "����" from professor;


select bonus from professor;
select bonus, nvl2(bonus, bonus*2, 100) from professor;
-- nvl2(�÷�, null �ƴ� ���, null ���)
select nvl2(bonus, bonus*2, 100) from professor;




-- decode() �Լ�
select * from member_tbl_11;

-- decode�� �ٲ۴ٴ� �ǹ�
select decode(m_grade, '01', 'VIP', '02', '���', '03', '�����') from member_tbl_11;


select * from student;
select name, jumin, substr(jumin, 7, 1) from student;

select name, jumin,  decode( substr(jumin, 7, 1), 1 ,'MAN', 2,'WOMAN') as "Gender" from student;
 
 select name, tel, (substr(tel, 1, 3)) from student;
 select instr(tel, ')') from student;
 
 select name, tel, decode(substr(tel, 1, 3), '02)', 'SEOUL', '031', 'GYEONGGI', '051', 'BUSAN', '052', 'ULSAN', '053', 'DAEGU', '055', 'GYEONGNAM') from student;
 
 
 
 --- case when
 --- SELECT ���̸�, case when [����] then [�����]
 --- when [����] then [�����]
 --  else [�����]
 --- end as ���ο� Į����
 --- from ���̺�� ; 
 
 
 select * from member_tbl_11;
 
 
 select m_point, case 
 when m_point >= 2000 then '��' end as "���" 
 from member_tbl_11;
 
 
 select m_point, case
          when m_point >= 2000 then '��'
          when m_point >= 1500 then '��'
          else '��'
          end as "���" from member_tbl_11;
          
          
-- ������ �Լ�   �����Լ�, sum(), avg(), max(), min()
-- count(*), count(�÷���)
select * from member_tbl_11;

select sum(m_point) from member_tbl_11;
select avg(m_point) from member_tbl_11;
select max(m_point) from member_tbl_11;
select min(m_point) from member_tbl_11;


-- group by, ���� �Լ��� �Բ� ����Ѵ�
select count(*) from member_tbl_11;   --- member_tbl_ll ���̺��� ���� ������ ���Ѵ�
select count(m_point) from member_tbl_11;   -- member_tbl_11 ���̺��� ���� ������ ���Ѵ�


select m_grade, sum(m_point)
from member_tbl_11
group by m_grade;


-- having �� ����ϱ� (����), group by ��� ������ ���ǿ� �´� �͸� ������ �� ����


select m_grade, m_point
from member_tbl_11;


select m_grade, sum(m_point) as total -- 4��   as�� �̸��� ����
from member_tbl_11    -- 1��
group by m_grade    -- 2��
--  having total >= 5000 select �ִ� ��Ī�� ����� �� ����. ������ ������ �ִ�. !!!!
having sum(m_point) >= 5000;  -- 3��



select m_grade, sum(m_point) as "total"
from member_tbl_11
group by m_grade
having sum(m_point) >= 5000
order by 2 desc ;


-- count(), count(*)   count(�÷���)


select * from emp;
select count(*) from emp;
select count(ename) from emp;
select count(comm) from emp;    -- �ش��ϴ� �÷��� ���� null�� �����ϰ� ī��Ʈ��


select sum(comm) from emp;    -- null�� ���ܵǰ� �հ谡 ��������.


select avg(comm) from emp;
select max(comm) from emp;
select min(comm) from emp;


-- group by

select * from emp;
-- group by ������ ��ȸ�� Ȯ���ϱ�
select deptno, sal from emp;

-- �μ��� sal�� ����� ���Ѵ�
select deptno, sum(sal) from emp
group by deptno;


-- having�� ������ group by�� �� ��Ȳ���� ���ȴ�
-- group by�� ���µ� having�� ����.
-- group�� ��� ������ ������ ����� ���� having�� �;� ��. !!!!


select deptno, sum(sal)
from emp
group by deptno
having sum(sal) >= 7000;



select * from emp;





select deptno, job, sum(sal)
from emp
group by deptno, job
order by 1, 3 desc;


select * from member_tbl_11;


-- ����) MEMBER_TBL_11 ���̺�κ��� ����� ��ȸ�ϱ�, �ߺ��� �� �����ϰ� ��ȸ�ϱ�
select distinct m_grade from member_tbl_11;


-- ����) �����̺�κ��� ���̵� USERID��� �̸����� ��ȸ�ϱ� (AS �� ����������)
select m_id as "userid" from member_tbl_11;

-- ���� ������ ||  �÷��� �����ؼ� ��ȸ�ϰ� ���� �� ���
select m_name || '��' as m_name from member_tbl_11;





CREATE TABLE CUST_INFO(
 ID VARCHAR2(13) NOT NULL PRIMARY KEY , FIRST_NM VARCHAR2(10) , LAST_NM VARCHAR2(10) , ANNL_PERF NUMBER(10,2) 
);
COMMIT;


INSERT INTO CUST_INFO VALUES ('8301111567897' , 'JHUN' , 'KIM', 330.08);
INSERT INTO CUST_INFO VALUES ('9302112567897' , 'JINYOUNG' , 'LEE', 857.61);
INSERT INTO CUST_INFO VALUES ('8801111567897' , 'MIJA' , 'HAN', -76.77);
INSERT INTO CUST_INFO VALUES ('9901111567897' , 'YOUNGJUN' , 'HA', 468.54);
INSERT INTO CUST_INFO VALUES ('9801112567897' , 'DAYOUNG' , 'SUNG', -890);
INSERT INTO CUST_INFO VALUES ('9701111567897' , 'HYEJIN' , 'SEO', 47.44);
COMMIT;



-- ����) ������ ���̺�κ��� �ֹι�ȣ 7��° ���� (������ ��Ÿ����)�� �����Ͽ� GENDER ��� �̸����� �ֹι�ȣ�� �Բ� ��ȸ�Ͻÿ�

select * from CUST_INFO;
select id, decode(substr(id, 7,1), 1, '����', 2, '����') as gender from CUST_INFO;


-- select ename, lower(ename) from emp;  -- �ҹ��ڷ� ��ȯ

select id, last_nm, lower(last_nm) from CUST_INFO;


-- ���� ������
-- select concat(ename, job) from emp;
select * from CUST_INFO;
select id, last_nm || ', ' || first_nm as name from CUST_INFO;

-- select round(987.655, 2) from dual;   -- �ݿø�
-- ����) ������ ���̺�κ��� �� �ֹι�ȣ, ������ �Ҽ� ��°���� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ǥ�õ� �� �ֵ��� ��ȸ �Ͻÿ�
select id, annl_perf, round(annl_perf, 1) from CUST_INFO;


-- select trunc(987.655, 2) from dual;   -- �ݿø����� �ʰ� ����
select id, annl_perf, trunc(annl_perf, 0) from CUST_INFO;


select sysdate from dual;
select 2+3 from dual;


-- ����) �����̺�κ��� �ֹι�ȣ , ������ 300�̻��̸� ����� 100�̻��� �Ϲݼ��� 0�����̸� ���� , �������� �������� ������ RESULT�÷������� ��ȸ�� �� �ֵ��� �Ͻÿ�
--select deptno, sum(sal)
-- from emp
-- group by deptno
-- having sum(sal) >= 7000;


select * from cust_info;


-- ����) �����̺�κ��� �ֹι�ȣ , ������ 300�̻��̸� ����� 100�̻��� �Ϲݼ��� 0�����̸� ���� , �������� �������� ������ RESULT�÷������� ��ȸ�� �� �ֵ��� �Ͻÿ�
select id, annl_perf, case
when annl_perf >= 300 then '�����'
when annl_perf >= 100 then '�Ϲݼ���'
when annl_perf <= 0 then '����'
else '��������'
end as "result" from cust_info;


-- ����) �����̺�κ��� �̸��� ����Ʈ�� ��ȸ�Ͻÿ� (�� ����Ʈ�� �������� ���� ���� 0���� ǥ�õǵ��� �Ͻÿ�) ��Ʈ:NVL �Լ� ���
select * from member_tbl_11;
select m_name, m_point, nvl(m_point, 0) from member_tbl_11;


--select bonus, nvl2(bonus, bonus*2, 100) from professor;
-- nvl2(�÷�, null �ƴ� ���, null ���)
--select nvl2(bonus, bonus*2, 100) from professor;
select m_name, m_point, nvl2(m_point, m_point+100, 100) from member_tbl_11;


CREATE TABLE STUD_SCORE(
  STUDENT_ID        VARCHAR2(13) NOT NULL PRIMARY KEY ,
  MATH_SCORE      NUMBER(5) ,
  ENG_SCORE        NUMBER(5)   ,
  PHIL_SCORE       NUMBER(5)   ,
  MUSIC_SCORE    NUMBER(5) 
);
COMMIT;


INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE,   ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('0123511' , 89,78,78,90);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE,   ENG_SCORE,  MUSIC_SCORE)   VALUES ('0255475' , 88,90,90);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE  , MUSIC_SCORE)   VALUES ('9921100' , 87,98);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('9732453' , 69,98,78,78);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE )   VALUES ('0578981' , 59,90,89);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('0768789' , 94,80,87,99);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('9824579' , 90,90,78,87);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE )   VALUES ('0565789' , 58,64,72);



commit;



CREATE TABLE STAFF_SAL(
  ID         VARCHAR2(13) NOT NULL PRIMARY KEY ,
  JOB       VARCHAR2(13) ,
  CURRENT_SAL      NUMBER(10)   ,
  ENG_SCORE        NUMBER(5)    
);
COMMIT;



INSERT INTO  STAFF_SAL    VALUES ('2148', 'OFFICER' , 40000, 90);
INSERT INTO  STAFF_SAL    VALUES ('5780', 'CLERK' , 32000, 98);
INSERT INTO  STAFF_SAL    VALUES ('6870', 'MANAGER' , 100000, 81);
INSERT INTO  STAFF_SAL    VALUES ('4565', 'CLERK' , 30000, 79);
INSERT INTO  STAFF_SAL    VALUES ('9687', 'CLERK' , 33000, 66);
INSERT INTO  STAFF_SAL    VALUES ('7337', 'MANAGER' , 100000, 95);
INSERT INTO  STAFF_SAL    VALUES ('1321', 'OFFICER' , 43000, 80);
INSERT INTO  STAFF_SAL    VALUES ('9896', 'CLERK' , 30000, 50);
COMMIT;


CREATE TABLE PRC(
CUST_ID      VARCHAR2(13) NOT NULL PRIMARY KEY ,
SET2            VARCHAR2(13) ,
CARD_FLAG     NUMBER(1)   ,
LOAN_FLAG     NUMBER(1)   ,
INSURANCE_FLAG     NUMBER(1)   ,
CTB_FLAG     NUMBER(1)   ,
FUND_FLAG    NUMBER(1)   ,
ANNL_REV   NUMBER(10)      
);
COMMIT;


INSERT INTO  PRC    VALUES ('546515' , 'SILVER' , 1,1,1,1,1,1000);
INSERT INTO  PRC    VALUES ('46780' , 'GOLD' , 0,0,1,1,0,20000);
INSERT INTO  PRC    VALUES ('237848' , 'GOLD' , 1,1,0,1,1,30000);
INSERT INTO  PRC    VALUES ('56432' , 'DIAMOND' , 1,0,1,1,1,10000);
INSERT INTO  PRC    VALUES ('89647' , 'SILVER' , 0,0,1,1,0,3000);
INSERT INTO  PRC    VALUES ('52333' , 'SILVER' , 1,1,0,1,0,2500 );
INSERT INTO  PRC    VALUES ('89669' , 'GOLD' , 1,0,1,1,0,60000);
INSERT INTO  PRC    VALUES ('21004' , 'SILVER' , 0,0,1,1,0,1000);
INSERT INTO  PRC    VALUES ('17890' , 'DIAMOND' , 1,1,0,1,0,300000);



CREATE TABLE   PROD_SALES(
CUST_NM         VARCHAR2(13)  ,
PRD_ID             VARCHAR2(5) ,
SALES_AMT       NUMBER(10)      
);
COMMIT;


INSERT INTO   PROD_SALES   VALUES ('LEE', 546 , 3000);
INSERT INTO   PROD_SALES   VALUES ('KIM', 326 , 4780);
INSERT INTO   PROD_SALES   VALUES ('KANG', 564 , 87900);
INSERT INTO   PROD_SALES   VALUES ('KWON', 556 , 45478);
INSERT INTO   PROD_SALES   VALUES ('KIM', 254 , 3000);
INSERT INTO   PROD_SALES   VALUES ('YOO', 567 , 78900);
INSERT INTO   PROD_SALES   VALUES ('PARK', 877 , 89787);
INSERT INTO   PROD_SALES   VALUES ('LEE', 890 , 10000);
INSERT INTO   PROD_SALES   VALUES ('KIM', 787 , 2341);
INSERT INTO   PROD_SALES   VALUES ('PARK', 566 , 50000);



select * from stud_score;

-- ����1) STUD_SCORE ���̺��� ����Ͽ� NULL���� ������ ���� ������ ������
select count(*) from stud_score;

-- ����2) STUD_SCORE ���̺��� ����Ͽ� NULL���� ������ ������ ���� ���� �����ڸ� ������
select count(music_score) from stud_score;
-- ����3) STUD_SCORE ���̺��� ����Ͽ� ���� ������ �� �հ踦 ���غ���
select sum(math_score) from stud_score;
-- ����4) STUD_SCORE ���̺�������Ͽ� ���� ������ ����� ���غ���
select avg(music_score) from stud_score;
-- ����5) STUD_SCORE ���̺��� ����Ͽ� �������� �ִ� �� �ּڰ��� ���غ���
select max(math_score), min(math_score) from stud_score;


--���� 6) CLERK�� 7% , OFFICER�� 5% , MANAGER�� 3%�� ������ �λ��ϱ�� �ߴ�. STAFF_SAL���̺��� ����Ͽ� �� ������ �λ� ������ �����غ��� ( CASE WEHN ����غ��� )
--(���翬���� �������� ������ ���󿬺��� ���غ���)

 select  id, current_sal ,  current_sal *1.1
 from staff_sal;
 
 select * from staff_sal;
 
  select job,  id, current_sal ,  case 
                                  when job='CLERK' then  current_sal *1.07
                                  when job='OFFICER' then current_sal * 1.05
                                  when job='MANAGER' then current_sal * 1.03
  end as "���󿬺�"
 from staff_sal;
 
 
 ���� 1) PRC ���̺��� ����Ͽ� ����޺� �δ� ��� �� ������ ����� ����( GROUP BY ���)
 
 select * from prc;
 
select set2, avg(annl_rev)
from prc
group by set2;

--���� 2) PRC ���̺��� ����Ͽ� ����޺� �� ���� Ȯ���غ���
select set2, count(set2)
from prc
group by set2;


-- ���� 3) ����Ƚ���� �� �� �̻��� ������ �������� �Ϸ��� �Ѵ�. ������ ������� ���̸��� ��ȸ�Ͻÿ�
select * from prod_sales;

select cust_nm
from prod_sales;


select cust_nm, count(cust_nm) 
from prod_sales
group by cust_nm;



select cust_nm, count(cust_nm) 
from prod_sales
group by cust_nm
having  count(cust_nm) >= 2;



select sales_amt, sales_amt >= 70000
from prod_sales;