
----�޴�����----

CREATE TABLE mc_menu(

menu_code      VARCHAR2(4) NOT NULL PRIMARY KEY ,
menu_set       VARCHAR2(50) default '�Ǹ�����' UNIQUE ,
menu_price     number(10) check (menu_price > 0)
);

insert into mc_menu values ('A001' , '�Ұ����ż�Ʈ' , '8900' );
insert into mc_menu values ('A002' , '��Ƽ�Ʈ' , '9300' );
insert into mc_menu values ('A003' , 'ġ����ż�Ʈ' , '7000' );
insert into mc_menu values ('A004' , 'â�簥�����ż�Ʈ' , '12000' );
insert into mc_menu values ('A005' , '���������Ŀ����Ʈ' , '12000' );
insert into mc_menu(MENU_CODE, MENU_PRICE) values ('A006','7200' );


----������----

CREATE TABLE MC_customer(

 cust_code varchar(5) not null primary key ,
 cust_name varchar(20) not null ,
 cust_adress varchar (50)
 );
 
 
insert into mc_customer values ('B001' , '��α�' , '������ ���ֺ���' );
insert into mc_customer values ('B002' , '��ο�' , '��õ�� �Ѽ�����Ʈ' );
insert into mc_customer values ('B003' , '��μ�' , '���� �žƺ���' );
insert into mc_customer values ('B004' , '�����' , '������ �žƺ���' );
insert into mc_customer values ('B005' , '�����' , '������ �Ե�ĳ��' );
COMMIT;




----�ֹ� ����----

CREATE TABLE MC_ORDER(

ORDER_CODE VARCHAR2(5) NOT NULL PRIMARY KEY ,
ORDER_M_CODE VARCHAR2(5) NOT NULL ,
ORDER_C_CODE VARCHAR2(5) NOT NULL ,
order_S_CODE varchar2(5) not null,
ORDER_SALE_CNT NUMBER CHECK ( ORDER_SALE_CNT > 0 )



);

insert into MC_ORDER values ('C001' , 'A001' , 'B001','P001' ,5);
insert into MC_ORDER values ('C002' , 'A002' , 'B004','P004' ,1);
insert into MC_ORDER values ('C003' , 'A002' , 'B003','P003' ,1);
insert into MC_ORDER values ('C004' , 'A003' , 'B002','P002' ,2);
insert into MC_ORDER values ('C005' , 'A004' , 'B005','P005' ,1);
insert into MC_ORDER values ('C006' , 'A002' , 'B002','P002' ,2);
insert into MC_ORDER values ('C007' , 'A003' , 'B004','P004' ,3);
insert into MC_ORDER values ('C008' , 'A005' , 'B001','P001' ,1);
insert into MC_ORDER values ('C009' , 'A001' , 'B002','P002' ,1);



----��������----

create table mc_store_loc (
  store_code varchar2(5) not null primary key ,
  store_loc  VARCHAR2(20) not null UNIQUE
);

insert into mc_store_loc values ('P001' , '������');
insert into mc_store_loc values ('P002' , '��õ��');
insert into mc_store_loc values ('P003' , '������');
insert into mc_store_loc values ('P004' , '������');
insert into mc_store_loc values ('P005' , '������');
COMMIT;


---���� ���---
DROP TABLE MC_MENU; 
DROP TABLE MC_CUSTOMER;
DROP TABLE MC_ORDER;
drop table mc_store_loc;
-----------------

SELECT * FROM MC_MENU;
SELECT * FROM MC_CUSTOMER;
SELECT * FROM MC_ORDER;
select * from mc_store_loc;









select 
m.MENU_SET AS �޴��̸�,
TO_CHAR(m.MENU_PRICE, '999,999')||'��' AS �޴�����,

-- ���̸� ��ȣȭ--

SUBSTR(c.CUST_NAME, 1, 1) || '**' as ���̸�,

c.CUST_ADRESS AS ���ּ�,


o.ORDER_SALE_CNT AS �ֹ�����,
o.ORDER_M_CODE AS �޴��ڵ�,
o.ORDER_CODE AS �ֹ��ڵ� ,
o.ORDER_C_CODE AS ���ڵ�,
o.ORDER_S_CODE AS �����ڵ�,



s.STORE_LOC AS �����,
to_char(SUM(m.menu_price * o.ORDER_SALE_CNT), '999,999') || '��' AS �����

from mc_order o
join MC_CUSTOMER c on o.ORDER_C_CODE = c.CUST_CODE
join MC_MENU m on o.ORDER_M_CODE=m.MENU_CODE
JOIN MC_STORE_LOC s on o.ORDER_S_CODE= s.STORE_CODE

group by 
s.STORE_LOC,
m.MENU_SET,
m.MENU_PRICE,
c.CUST_NAME,
c.CUST_ADRESS,
o.ORDER_SALE_CNT,
o.ORDER_M_CODE,
o.ORDER_CODE,
o.ORDER_C_CODE,
o.ORDER_S_CODE;


-- ���庰 ����� --

select 
s.STORE_LOC AS �����,
to_char(SUM(m.menu_price * o.ORDER_SALE_CNT), '999,999') || '��' AS �����

from mc_order o
join MC_MENU m on o.ORDER_M_CODE=m.MENU_CODE
JOIN MC_STORE_LOC s on o.ORDER_S_CODE= s.STORE_CODE

group by s.STORE_LOC;
