-- ���̰��� ��ǥ��, �����, ǥ����

create table ticket_tbl(
  ticket_id varchar2(20) not null primary key,
  ticket_type varchar2(20) not null,
  ticket_time_type varchar2(20),
  ticket_available_time varchar2(40) check(ticket_available_time like '__:__~__:__') not null,
  ticket_age varchar2(20) not null,
  ticket_price number(20) not null
);
commit;

insert into ticket_tbl values('t001','�����̿��','���ϱ�','09:00~21:00','����',50000);
insert into ticket_tbl values('t002','�����̿��','������','09:00~15:00','����',30000);
insert into ticket_tbl values('t003','�����̿��','���ı�','16:00~21:00','����',30000);

insert into ticket_tbl values('t004','�����̿��','���ϱ�','09:00~21:00','û�ҳ�',40000);
insert into ticket_tbl values('t005','�����̿��','������','09:00~15:00','û�ҳ�',20000);
insert into ticket_tbl values('t006','�����̿��','���ı�','16:00~21:00','û�ҳ�',20000);

insert into ticket_tbl values('t007','�����̿��','���ϱ�','09:00~21:00','���',25000);
insert into ticket_tbl values('t008','�����̿��','������','09:00~15:00','���',15000);
insert into ticket_tbl values('t009','�����̿��','���ı�','16:00~21:00','���',15000);

insert into ticket_tbl values('t010','5ȸ�̿��',null,'09:00~21:00','����',30000);
insert into ticket_tbl values('t011','5ȸ�̿��',null,'09:00~21:00','û�ҳ�',25000);
insert into ticket_tbl values('t012','5ȸ�̿��',null,'09:00~21:00','���',20000);

insert into ticket_tbl values('t013','3ȸ�̿��',null,'09:00~21:00','����',20000);
insert into ticket_tbl values('t014','3ȸ�̿��',null,'09:00~21:00','û�ҳ�',15000);
insert into ticket_tbl values('t015','3ȸ�̿��',null,'09:00~21:00','���',10000);

insert into ticket_tbl values('t016','1ȸ�̿��',null,'09:00~21:00','����',10000);
insert into ticket_tbl values('t017','1ȸ�̿��',null,'09:00~21:00','û�ҳ�',5000);
insert into ticket_tbl values('t018','1ȸ�̿��',null,'09:00~21:00','���',3000);

commit;

select * from ticket_tbl;

-------
create table t_customer(
id  NUMBER(4) primary key,
name  varchar2(10)  not null ,
tel char(13) check (tel like '010-____-____') not null unique,
age varchar2(10) not null
);
commit;

INSERT into t_customer VALUES (0001,'�����','010-1111-2222','û�ҳ�');
INSERT into t_customer VALUES (0002,'ǥ����','010-2222-1111','û�ҳ�');
INSERT into t_customer VALUES (0003,'���ܾ�','010-3333-4444','����');
INSERT into t_customer VALUES (0004,'������','010-4444-3333','����');
INSERT into t_customer VALUES (0005,'������','010-5555-6666','���');
INSERT into t_customer VALUES (0006,'�̹ο�','010-6666-5555','���');
INSERT into t_customer VALUES (0007,'������','010-7777-8888','���');
INSERT into t_customer VALUES (0008,'������','010-8888-7777','����');
INSERT into t_customer VALUES (0009,'������','010-9999-0000','û�ҳ�');
INSERT into t_customer VALUES (0010,'�����','010-0000-9999','����');
commit;

select * from t_customer;

---------------
create table receipt_tbl(
  receipt_id varchar2(20) not null primary key,
  ticket_id  varchar2(20) not null references ticket_tbl(ticket_id),
  cus_id  NUMBER(4) not null references t_customer(id),
  receipt_date date not null,
  receipt_pay varchar2(20) not null,
  receipt_count number(10) not null
);
commit;

insert into receipt_tbl values('r001','t004',0001,'20230729', '����', 2);
insert into receipt_tbl values('r002','t006',0002,'20230822', 'ī��', 1);
insert into receipt_tbl values('r003','t001',0003,'20230603', 'ī��', 4);
insert into receipt_tbl values('r004','t013',0004,'20230410', '���̹�����', 2);
insert into receipt_tbl values('r005','t015',0005,'20230808', '����', 3);
insert into receipt_tbl values('r006','t018',0006,'20230714', '����', 4);
insert into receipt_tbl values('r007','t015',0007,'20230723', '����', 1);
insert into receipt_tbl values('r008','t002',0008,'20230511', 'īī������', 2);
insert into receipt_tbl values('r009','t004',0009,'20230628', 'ī��', 1);
insert into receipt_tbl values('r010','t013',0010,'20230801', 'ī��', 2);

commit;

select * from receipt_tbl;

----------------
-- �������ܺ� �ȸ� Ƽ�� ����, �� �ݾ�
select r.receipt_pay ��������, sum(r.receipt_count)||'��' "�ȸ� Ƽ�ϼ�", sum(r.RECEIPT_COUNT*t.ticket_price)||'��' �ѱݾ�
from receipt_tbl r
join ticket_tbl t
on r.TICKET_ID = t.TICKET_ID
group by receipt_pay;

-- ���� �ȸ� Ƽ�� ����, �� �ݾ�
select substr(r.receipt_date,4,2)||'��' ��, sum(r.receipt_count)||'��' "�ȸ� Ƽ�ϼ�", sum(r.RECEIPT_COUNT*t.ticket_price)||'��' �ѱݾ�
from receipt_tbl r
join ticket_tbl t
on r.TICKET_ID = t.TICKET_ID
group by substr(r.receipt_date,4,2)
order by substr(r.receipt_date,4,2);

-- Ƽ�� ������ �ȸ� ����, �� �ݾ� 
select t.ticket_type "Ƽ�� ����", sum(r.receipt_count)||'��' "�ȸ� Ƽ�ϼ�", sum(r.receipt_count*t.ticket_price)||'��' �ѱݾ� 
from ticket_tbl t
join receipt_tbl r
on t.ticket_id = r.ticket_id
group by t.ticket_type
order by t.ticket_type;

-- ���̺� �ȸ� Ƽ�ϼ�, �� �ݾ�
select nvl(c.age,'����') ����, sum(r.receipt_count) "�ȸ� Ƽ�ϼ�", sum(r.RECEIPT_COUNT*t.ticket_price)||'��' �ѱݾ�
from t_customer c
join receipt_tbl r
on r.cus_id = c.id
join ticket_tbl t
on t.TICKET_ID=r.TICKET_ID
group by rollup(c.age);

--�����̿�Ǹ� ����
select 
ticket_id "Ƽ�� ��ȣ",
ticket_type "Ƽ�� ����",
TICKET_TIME_TYPE "�̿�ð� ����",
TICKET_AVAILABLE_TIME "�̿밡�� �ð�",
TICKET_AGE "����",
TICKET_PRICE||'��' "����"
from ticket_tbl 
where ticket_type = '�����̿��';

--���� ��ݸ� ����
select 
ticket_id "Ƽ�� ��ȣ",
ticket_type "Ƽ�� ����",
nvl(TICKET_TIME_TYPE,' ')"�̿�ð� ����",
TICKET_AVAILABLE_TIME "�̿밡�� �ð�",
TICKET_AGE "����",
TICKET_PRICE||'��'  "����"
from ticket_tbl 
where TICKET_AGE = '����';

--���θ� ����
select id "ȸ�� ��ȣ",name "ȸ�� �̸�",tel "ȸ�� ��ȭ��ȣ",age"ȸ�� ����" from t_customer where age = '����';

--���̺� ȸ�� �� ����
select
count (age)||'��' "�� ���Լ�",
COUNT (case when age = '����' then 1 end)||'��' ����,
COUNT (case when age = 'û�ҳ�' then 1 end)||'��' û�ҳ�,
COUNT (case when age = '���' then 1 end)||'��' ���
from t_customer;

--������
select 
r.RECEIPT_ID "������ ��ȣ",
r.RECEIPT_DATE ���ų�¥,
t.TICKET_TYPE �̿������,
nvl(t.TICKET_TIME_TYPE,' ') �̿�ð�����,
t.TICKET_AVAILABLE_TIME �̿�ð�,
c.NAME �̸�,
t.TICKET_AGE ����,
t.TICKET_PRICE �ݾ�,
r.RECEIPT_COUNT||'��' ����,
t.TICKET_PRICE * r.RECEIPT_COUNT||'��' ����
from receipt_tbl r
join t_customer c
on r.CUS_ID = c.ID
join ticket_tbl t
on r.TICKET_ID = t.TICKET_ID 
;

--230801 �湮 ��ã��
select 
r.RECEIPT_ID "������ ��ȣ",
r.RECEIPT_DATE ���ų�¥,
t.TICKET_TYPE �̿������,
nvl(t.TICKET_TIME_TYPE,' ') �̿�ð�����,
t.TICKET_AVAILABLE_TIME �̿�ð�,
c.NAME �̸�,
t.TICKET_AGE ����,
t.TICKET_PRICE||'��' �ݾ�,
r.RECEIPT_COUNT||'��' ����,
t.TICKET_PRICE * r.RECEIPT_COUNT||'��' ����
from receipt_tbl r
join t_customer c
on r.CUS_ID = c.ID
join ticket_tbl t
on r.TICKET_ID = t.TICKET_ID 
where r.RECEIPT_DATE = '20230801';