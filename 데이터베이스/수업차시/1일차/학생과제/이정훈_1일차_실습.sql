--����1
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
select * from member_tbl_11;
--2. ��� ���� �̸��� ���� ���� ��ȸ�Ͻÿ�
select m_name,M_BIRTHDAY from member_tbl_11;
--3. �̸��� ���ؼ��� �����̵�, ����, ����Ʈ ���� ��ȸ�Ͻÿ�
select M_name,M_ID,M_BIRTHDAY,M_POINT from member_tbl_11 where M_NAME = '���ؼ�';

--4. ����Ʈ�� 2000�� �̻��� ���̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_NAME,M_TEL from member_tbl_11 where M_POINT >=2000;
--5. ����Ʈ�� 2000������ 3000�� ������ ���̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select m_name,m_tel from member_tbl_11 where m_point BETWEEN 2000 and 3000;
--6. ������� ��01���� ���̸�, ��ȭ��ȣ , ����Ʈ ���� ��ȸ�Ͻÿ�
select m_name,m_tel,m_point from MEMBER_TBL_11 where M_GRADE = '01';
--7. ������ 2004-06-01 ������ ���̸� ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select m_name,m_tel from member_tbl_11 where m_birthday = '2004-06-01';
--8. ������ 2004-05-01������ �¾ ���� ���̸� , ���� ���� ��ȸ�Ͻÿ�
select m_name,M_BIRTHDAY from member_tbl_11 where m_birthday < '2004-05-01';
--9. ������� ��01���� �ƴ� ���� ���̸�, ��ȭ��ȣ, ����� ���� ��ȸ�Ͻÿ�
select m_name,m_tel,M_GRADE from MEMBER_TBL_11 where M_GRADE != '01';
--10. �� ����� ��02�� �� ���� �����̵�, �̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select m_id,m_name,m_tel from MEMBER_TBL_11 where M_GRADE = '02';
--11. ����Ʈ�� 1500�� �̸��� ���� ���̸�, ��ȭ��ȣ ��ȸ�Ͻÿ�
select m_name,m_tel from MEMBER_TBL_11 where m_point < 1500;
--12. ����Ʈ�� �������� ���� ������ ��ȸ�Ͻÿ�
--( ����Ʈ�� NULL�� �� ��ȸ: ����Ʈ�� �Էµ��� ���� ���� ���� ) 
select * from MEMBER_TBL_11 where m_point is null;
--13. ����Ʈ�� �ο��� (����Ʈ �ݾ��� ������ �ִ�) ������ ��ȸ�Ͻÿ�( ����Ʈ�� NULL�� �ƴ� �� ��ȸ�ϸ� ��)
select * from MEMBER_TBL_11 where m_point is not null;
--14. ������� �ߺ����� �ʵ��� ������� ��ȸ�ϴ� ������ �ۼ��Ͻ�
select distinct m_grade from MEMBER_TBL_11 ;

--���� 2

--1. ������� ��01���̰� ����Ʈ�� 2000�̻��� ���� ���̵�, �̸� ������ ��ȸ�Ͻÿ�
select m_id, m_name from MEMBER_TBL_11 where m_grade = '01' and m_point > 2000;
--2. ������� ��01�� �̰ų� ����Ʈ�� 2000�̻��� ���� ���̵�, �̸� ������ ��ȸ�Ͻÿ�
select m_id, m_name from MEMBER_TBL_11 where m_grade = '01' or m_point > 2000;
--3. �达���� ���� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ�
--( ��) ��浿, ��ȫ�� , ������... ������ ���۵Ǵ� �̸�)
select m_id,m_name,m_grade from MEMBER_TBL_11 where m_name like '��%';
--4. �̸��� ���� ������ ���� ���̵�, �̸� , ��� ������ ��ȸ�Ͻÿ�
select m_id,m_name,m_grade from MEMBER_TBL_11 where m_name like '%��';
--5. ������� ��01��, ��03�� �� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ�
--( IN ������ ����� �ּ���) 
select m_id,m_name,m_grade from MEMBER_TBL_11 where m_grade in ('01','03');
--6. ������� ��01��, ��02�� �� �ƴ� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ�
--( NOT IN ������ ��� �� �ּ���)
select m_id,m_name,m_grade from MEMBER_TBL_11 where m_grade not in ('01','02');
--7. ������� ��02�� �̰ų� �̸��� �̾����� ���� ���� ������ ���̵�� �̸� , ��� ������ ��ȸ �Ͻÿ�
select m_id,m_name,m_grade from MEMBER_TBL_11 where m_grade = '02' or m_name like '��%';
--8. ������ 2004-05-01������ �¾�ų� ������� ��03���� ���� ���̵�, �̸�, ���� ������ ��ȸ�Ͻ�
select m_id,m_name,m_birthday from MEMBER_TBL_11 where m_birthday < '2004-05-01' or m_grade = '03';
































