--ȸ������
create table u_info(
u_id varchar2(15) primary key,
name varchar2(30) not null,
adress varchar2(30) not null,
tel varchar2(15) check(tel like '010-%-%'),
gender varchar2(1) check(gender in('M','F'))
);

insert into u_info values('aaa111', 'ȫ�浿','����� ������', '010-2323-1212','F');
insert into u_info values('bbb222', '��浿','����� ���ʱ�', '010-3434-4545','M');
insert into u_info values('ccc333', '�ѱ浿','����� ���α�', '010-5656-6767','M');
insert into u_info values('ddd444', '�ɱ浿','����� ���α�', '010-7878-8989','F');
insert into u_info values('eee555', '��浿','����� ����', '010-9090-0101','F');

--��ǰ����
create table product_tbl(
	goods_code varchar2(20) primary key,
	brand_name varchar2(100) not null,
	goods_name varchar2(100) not null,
	category varchar2(20) check(category in('����','����','�ƿ���','��ĿƮ')),
	g_size varchar2(5) check(g_size in('S','M','L','XL')),
	price number(38) not null
);
insert into product_tbl values('P001','Mardi Mercredi' , 'SWEATSHIRT FLOWERMARDI_BLACK PINK','����','M',75000);
insert into product_tbl values('P002','BROWNBREATH' ,'TAG KP TEE - BLACK' ,'����' ,'S',36000);
insert into product_tbl values('P003', 'MARITHE', 'W CLASSIC LOGO TEE white','����', 'L', 45000);

insert into product_tbl values('P004', 'WOOALONG', 'Signature relax wide pants - BLACK','����','S',79000);
insert into product_tbl values('P005', 'TRILLION' ,'���̿����� ���� ���� �� ���̵� ���� ���� (SUMMER BLUE)','����','L',54000);
insert into product_tbl values('P006','ILLIGO','��Ʈ�� ī�� ��� ���� ����','����','XL',112000);
insert into product_tbl values('P007', 'ADIDAS','���̾���� Ʈ��ž - ��','�ƿ���','L',99000);

insert into product_tbl values('P008', 'NACHE','SHIRRING LEATHER JACKET (UNISEX / BLACK)','�ƿ���','M',206000);
insert into product_tbl values('P009', 'CPGN STUDIO','ũ��ŷ �ĵ� ����극��Ŀ �׷���','�ƿ���','S',110000);

insert into product_tbl values('P010', 'KOLEAT','���� �� �ٽ��� ī�� ��� �̴Ͻ�ĿƮ' ,'��ĿƮ','S',52000);
insert into product_tbl values('P011', 'MIXXO','�ø��� �̵� ��ĿƮ','��ĿƮ','M',59900);
insert into product_tbl values('P012', 'IST KUNST', '��ũ���� �ΰ� ���� ��ĿƮ_�׷���','��ĿƮ','XL',59000);

--�ֹ�����
create table goods_order(
order_code varchar2(20) primary key,
id varchar2(15) not null
constraint id_fk references u_info(u_id),
goods_code varchar2(4) not null
constraint goods_code_fk references product_tbl(goods_code),
goods_cnt number(2) not null
);

insert into goods_order values('G001', 'aaa111', 'P001', 2);
insert into goods_order values('G002', 'ccc333', 'P003', 3);
insert into goods_order values('G003', 'bbb222', 'P002', 1);
insert into goods_order values('G004', 'eee555', 'P006', 1);
insert into goods_order values('G005', 'ddd444', 'P006', 4);
insert into goods_order values('G006', 'eee555', 'P010', 2);
insert into goods_order values('G007', 'aaa111', 'P002', 3);
insert into goods_order values('G008', 'bbb222', 'P004', 1);
insert into goods_order values('G009', 'ddd444', 'P003', 6);
insert into goods_order values('G010', 'ddd444', 'P009', 5);

select 
          o.order_code �ֹ��ڵ�,
          p.GOODS_CODE ��ǰ�ڵ�,
          u.U_ID ���̵�,
          p.GOODS_NAME ��ǰ��,
          p.CATEGORY ī�װ�,
          p.G_SIZE ������,
          to_char(p.PRICE, '999,999')  ����,
          u.NAME �̸�,
          u.ADRESS �ּ�,
          u.TEL ��ȭ��ȣ,
          o.goods_cnt �ֹ�����
from goods_order o
join product_tbl p
on o.goods_code = p.goods_code
join u_info u
on o.id = u.u_id;

