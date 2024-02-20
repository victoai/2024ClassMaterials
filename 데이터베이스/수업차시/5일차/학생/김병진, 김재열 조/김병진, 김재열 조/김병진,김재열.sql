create table mp_server(
sv_code varchar2(10)
                constraint sv_code_pk1 not null primary key,
sv_name varchar2(20)
                constraint sv_name_nn1 not null
);
insert into mp_server values ('UUU', '���Ͽ¼���');
insert into mp_server values ('BBB', '���׼���');
insert into mp_server values ('RRR', '����Ʈ����');
insert into mp_server values ('CCC', 'ũ�ξƼ���');
insert into mp_server values ('PPP', '���׿¼���');

select * from mp_server;
--�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
drop table mp_vip;
create table mp_vip(
grade_code varchar2(10)
constraint mp_gradetbl_pk primary key,
grade_name varchar2(20)
constraint mp_gradetbl_nn not null,
grade_dr number(10)
constraint gradetbl_dr_ck
check (grade_dr>=0)
);
insert into mp_vip values ('V001', '����', 10);
insert into mp_vip values ('V002', '���', 7);
insert into mp_vip values ('V003', '�ǹ�', 4);
insert into mp_vip values ('V004', '�����', 0);
select * from mp_vip;
--�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
drop table item_cubetbl;
CREATE TABLE item_cubetbl (
  item_code varchar2(10)
    constraint item_cubetbl_pk primary key,
  item_name varchar2(20)
    constraint item_cubetbl_nn not null
    constraint item_cubetbl_uk unique,
  up_percent number(10)
    constraint cubetbl_percent_ck check (up_percent>0),
  item_price number(10)
    constraint cubetbl_price_nn not null
);

insert into item_cubetbl values('C001','��ť��',10,2200);
insert into item_cubetbl values('C002','����ť��',3,1200);
insert into item_cubetbl values('C003','����ť��',5,2400);
insert into item_cubetbl values('C004','����ť��',2,800);
select * from item_cubetbl;
--�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
drop table mp_wp;
create table mp_wp(
  wp_code varchar2(20) 
             constraint wp_pk11_  not null primary key,
   wp_cat varchar2(20) 
              constraint wp_cat_ch11__
              check (wp_cat in('�ۼַ���','�����ϸ�','������',null)),
  wp_price number(20) default 0,
              constraint wp_p_ch11__ check(wp_price >= 0)
  );
  insert into mp_wp values ('w001','�ۼַ���', 5000);
  insert into mp_wp values ('w002','�����ϸ�', 2000);
  insert into mp_wp values ('w003','������', 7000);
  insert into mp_wp values ('w004',null,0);
  select * from mp_wp;
--�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
drop table mp_usertbl;
CREATE TABLE mp_usertbl(
user_id varchar2(20)
constraint mp_usertbl_pk primary key,
grade varchar2(10)
constraint mp_usergrade_ref references mp_vip(grade_code),
sv_code varchar2(10)
constraint mp_sv_ref references mp_server(sv_code)
);

insert into mp_usertbl values('�����Ͻ��ڵ�','V001','CCC');
insert into mp_usertbl values('�ϳ���������','V002','UUU');
insert into mp_usertbl values('Ÿ���Ŀ�����','V004','BBB');
select * from mp_usertbl;
--�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
drop table mp_store;
create table mp_store (
order_id varchar2(10)
                constraint order_id_pk11 not null primary key,
user_id varchar2(20)
                constraint user_id_rf11 references mp_usertbl(user_id),
item_code varchar2(10)
                constraint item_code_rf11 references item_cubetbl(item_code),
wp_code varchar2(10)
                constraint wp_code_rf11 references mp_wp(wp_code),
cnt number (10)
                constraint cnt_ck11 check (cnt > 0)
);
insert into mp_store values ('O001','�����Ͻ��ڵ�',null,'w001',8);
insert into mp_store values ('O002','�ϳ���������',null,'w003',9);
insert into mp_store values ('O003','Ÿ���Ŀ�����','C001',null,10);
insert into mp_store values ('O004','�����Ͻ��ڵ�','C003',null,30);
insert into mp_store values ('002','�����Ͻ��ڵ�','C003','w002',30);
select * from mp_store;
--�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�


SELECT s.order_id �ֹ���ȣ, u.user_id �������̵�,v.grade_name ���, 
    MAX(CASE
        WHEN c.item_code IS NOT NULL THEN c.item_name
        WHEN w.wp_code IS NOT NULL THEN w.wp_cat
        ELSE ''
    END) AS ��ǰ��,
    s.cnt �ֹ�����,
    SUM(CASE
        WHEN c.item_code IS NOT NULL THEN c.item_price
        WHEN w.wp_code IS NOT NULL THEN w.wp_price
        ELSE 0
    END) AS ���簡��,
    SUM(CASE
        WHEN c.item_code IS NOT NULL THEN c.item_price * s.cnt
        WHEN w.wp_code IS NOT NULL THEN w.wp_price * s.cnt
        ELSE 0
    END) AS �Ѱ���,
        SUM(CASE
        WHEN c.item_code
             IS NOT NULL THEN c.item_price * s.cnt * (1-v.grade_dr/100)
        WHEN w.wp_code
             IS NOT NULL THEN w.wp_price * s.cnt * (1-v.grade_dr/100)
        ELSE 0
    END) AS ���ΰ�
FROM mp_store s
JOIN mp_usertbl u ON s.user_id = u.user_id
LEFT JOIN item_cubetbl c ON s.item_code = c.item_code
LEFT JOIN mp_wp w ON s.wp_code = w.wp_code
JOIN mp_vip v ON u.grade = v.grade_code
GROUP BY s.order_id, u.user_id, v.grade_name, s.cnt;




