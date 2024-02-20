create table goods_tbl_500(
goods_cd varchar2(6) not null primary key, 
goods_nm varchar2(30), 
goods_price number(8), 
cost number(8), in_date date
); 
commit;

insert into goods_tbl_500 values('110001','�������߸�',1050,750,'20190302');
insert into goods_tbl_500 values('110002','���ϻ�',1300,800,'20190302'); 
insert into goods_tbl_500 values('110003','����',2000,1700,'20190302');
insert into goods_tbl_500 values('110004','ĥ�����̴�',900,750,'20190302'); 
insert into goods_tbl_500 values('110005','�ݶ�',750,300,'20190302'); 
insert into goods_tbl_500 values('110006','�Ƹ�����ݸ�',1500,1300,'20190302'); 
insert into goods_tbl_500 values('110007','���ڸ�',850,600,'20190302');
commit;


 create table store_tbl_500(
 store_cd varchar2(5) not null primary key,
 store_nm varchar2(20), 
 store_fg varchar2(1)
);
commit;

 insert into store_tbl_500 values('A001','�����','0');
 insert into store_tbl_500 values('A002','������','0'); 
insert into store_tbl_500 values('A003','������','0'); 
insert into store_tbl_500 values('B001','�ϰ���','1');
 insert into store_tbl_500 values('C001','�����','1'); 
insert into store_tbl_500 values('D001','�߰���','0');
 insert into store_tbl_500 values('D002','�¸��Ա���','1'); 
insert into store_tbl_500 values('E001','ȭ������','0');
commit;

 create table sale_tbl_500(
 sale_no varchar2(4) not null primary key, 
 sale_ymd date not null,
 sale_fg varchar2(1) not null, 
 store_cd varchar2(5)  ,         
 goods_cd varchar2(6) ,
 sale_cnt number(3),
 pay_type varchar2(2),
 constraint  fk1 foreign key (store_cd)  references store_tbl_500(store_cd),
 constraint  fk2  foreign key (goods_cd) references goods_tbl_500(goods_cd)
); 
commit;

insert into sale_tbl_500 values('0001','20190325','1','A001','110001',2,'02'); 
insert into sale_tbl_500 values('0002','20190325','1','B001','110003',2,'02');
 insert into sale_tbl_500 values('0003','20190325','1','D001','110003',1,'01'); 
insert into sale_tbl_500 values('0004','20190325','1','A001','110006',5,'02'); 
insert into sale_tbl_500 values('0005','20190325','1','C001','110003',2,'02'); 
insert into sale_tbl_500 values('0006','20190325','2','C001','110003',2,'02');
 insert into sale_tbl_500 values('0007','20190325','1','A002','110005',4,'02');
 insert into sale_tbl_500 values('0008','20190325','1','A003','110004',4,'02');
 insert into sale_tbl_500 values('0009','20190325','1','B001','110001',2,'01');
 insert into sale_tbl_500 values('0010','20190325','1','A002','110006',1,'02');
commit;
 

select * from goods_tbl_500;
select * from store_tbl_500;
select * from sale_tbl_500;

-- ������ ������Ȳ
select st.store_nm ������ ,
      nvl(sum(decode(sa.pay_type,01,g.goods_price*sa.sale_cnt)),0)���ݸ���,
      nvl(sum(decode(sa.pay_type,02,g.goods_price*sa.sale_cnt)),0)ī�����,
      nvl(sum(g.goods_price*sale_cnt),0)�Ѹ���
from store_tbl_500 st
left outer join sale_tbl_500 sa
on st.store_cd = sa.store_cd
left outer join goods_tbl_500 g
on g.goods_cd=sa.goods_cd
group by st.store_nm;


-- ��������
select decode(sa.sale_fg,1,'�Ǹ�',2,'���')�Ǹű���,
        sa.sale_no �ǸŹ�ȣ, 
        to_char(sa.sale_ymd, 'yyyy-mm-dd')�Ǹ�����,
        g.goods_nm ��ǰ��,
        sa.sale_cnt �Ǹż���,
        sa.sale_cnt*g.goods_price �Ǹűݾ�,
        decode(pay_type,01,'����',02,'ī��')���뱸��
      
from sale_tbl_500 sa
join goods_tbl_500 g
on sa.goods_cd=g.goods_cd;
