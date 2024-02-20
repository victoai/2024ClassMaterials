--1.��� ���� ����
select *from member_tbl_11;

--2.��� ���� �̸��� ���� ���� ��ȸ�Ͻÿ�
select M_NAME, M_BIRTHDAY from member_tbl_11;

--3.�̸��� ���ؼ��� �����̵�, ����, ����Ʈ ���� ��ȸ�Ͻÿ�
select M_ID, M_BIRTHDAY, M_POINT from member_tbl_11 where M_NAME = '���ؼ�';

--4.����Ʈ�� 2000�� �̻��� ���̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_NAME, M_TEL from member_tbl_11 where M_POINT>=2000;

--5.����Ʈ�� 2000������ 3000�� ������ ���̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_NAME, M_TEL from member_tbl_11 where M_POINT>=2000 and M_POINT<=3000;
select M_NAME, M_TEL from member_tbl_11 where M_POINT between 2000 and 3000;

--6.������� ��01���� ���̸�, ��ȭ��ȣ , ����Ʈ ���� ��ȸ�Ͻÿ�
select M_NAME,M_TEL,M_POINT from member_tbl_11 where M_GRADE = '01';

--7. ������ 2004-06-01 ������ ���̸� ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_NAME,M_TEL from member_tbl_11 where M_BIRTHDAY>='04/06/01';

--8. ������ 2004-05-01 ������ �¾ ���� ���̸� , ���� ���� ��ȸ�Ͻÿ�
select M_NAME,M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY<='04/05/01';

--9. ������� ��01���� �ƴ� ���� ���̸�, ��ȭ��ȣ, ����� ���� ��ȸ�Ͻÿ�
select M_NAME,M_TEL,M_GRADE from member_tbl_11 where M_GRADE!='01';

--10. �� ����� ��02�� �� ���� �����̵�, �̸�, ��ȭ��ȣ ���� ��ȸ�Ͻÿ�
select M_ID,M_NAME,M_TEL from member_tbl_11 where M_GRADE='02';

--11. ����Ʈ�� 1500�� �̸��� ���� ���̸�, ��ȭ��ȣ ��ȸ�Ͻÿ�
select M_NAME,M_TEL from member_tbl_11 where M_POINT<1500;

--12. ����Ʈ�� �������� ���� ������ ��ȸ�Ͻÿ�
select * from member_tbl_11 where M_POINT is null;

--13. ����Ʈ�� �ο��� (����Ʈ �ݾ��� ������ �ִ�) ������ ��ȸ�Ͻÿ�( ����Ʈ�� NULL�� �ƴ� �� ��ȸ�ϸ� ��)
select * from member_tbl_11 where M_POINT is not null;

--14. ������� �ߺ����� �ʵ��� ������� ��ȸ�ϴ� ������ �ۼ��Ͻÿ�
select distinct M_Grade from member_tbl_11;

-- �ѤѤѤѤѤѤѤѤѤ� �ι�° �ѤѤѤѤѤѤѤѤѤѤѤѤ�
--1. ������� ��01���̰� ����Ʈ�� 2000�̻��� ���� ���̵�, �̸� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME from member_tbl_11 where M_GRADE ='01' and M_POINT>=2000;

--2. ������� ��01�� �̰ų� ����Ʈ�� 2000�̻��� ���� ���̵�, �̸� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME from member_tbl_11 where M_GRADE ='01' or M_POINT>=2000;

--3. �达���� ���� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_NAME like '��%';

--4. �̸��� ���� ������ ���� ���̵�, �̸� , ��� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_NAME like '%��';

--5. ������� ��01��, ��03�� �� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ�(IN ������ ����� �ּ���) 
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_GRADE IN (01,03);

--6. ������� ��01��, ��02�� �� �ƴ� ���� ���̵�, �̸�, ��� ������ ��ȸ�Ͻÿ�(NOT IN ������ ��� �� �ּ���)
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_GRADE NOT IN (01,02);

--7. ������� ��02�� �̰ų� �̸��� �̾����� ���� ���� ������ ���̵�� �̸� , ��� ������ ��ȸ �Ͻÿ�
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_GRADE = 02 or M_NAME like '��%';

--8. ������ 2004-05-01������ �¾�ų� ������� ��03���� ���� ���̵�, �̸�, ���� ������ ��ȸ�Ͻÿ�
select M_ID, M_NAME,M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY <= '04/05/01' or M_GRADE = 03;
