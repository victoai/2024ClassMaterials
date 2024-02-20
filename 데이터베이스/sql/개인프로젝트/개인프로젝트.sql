CREATE TABLE webtoon_comic
(
num varchar2(30) not null primary key,
title VARCHAR2(30) NOT NULL ,
episode VARCHAR2(30) not null, 
name varchar2(30) not null,
web_date varchar2(10)not null,
cookie NUMBER(5),
hits number(5)
);

create table webtoon_customer
(
cus_id varchar2(30) not null primary key,
num varchar2(30),
mycookie number(5)  CHECK(mycookie >=0)
);
COMMIT;

select * from webtoon_comic;
select * from webtoon_customer;

-- ���� ������ 
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('A101','�� ���� ��','1ȭ','�̴�','��',0);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('A102','�� ���� ��','2ȭ','�̴�','��',0);
insert into webtoon_comic(num,title, episode, name, web_date, cookie) 
values ('A103','�� ���� ��','3ȭ','�̴�','��',0);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('A104','�� ���� ��','4ȭ','�̴�','��',2);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('A105','�� ���� ��','5ȭ','�̴�','��',2);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('B111','���൵��','���ѷα�','���','��',0);
insert into webtoon_comic(num,title, episode, name, web_date, cookie) 
values ('B112','���൵��','1��(1)_�̺�','���','��',0);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('C211','ȭ���ȯ','1ȭ','LICO, ��','��',0);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('C212','ȭ���ȯ','2ȭ','LICO, ��','��',0);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('C213','ȭ���ȯ','3ȭ','LICO, ��','��',2);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('D101','���� �ٲ���','[����2]������ 1','����ȣ, ȣ��','��',0);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('D102','���� �ٲ���','[����2]������ 2','����ȣ, ȣ��','��',2);
insert into webtoon_comic (num,title, episode, name, web_date, cookie) 
values ('D103','���� �ٲ���','[����2]������ 3','����ȣ, ȣ��','��',2);

-- ��������
insert into webtoon_customer (cus_id,mycookie) 
values ('A001', 43);
insert into webtoon_customer (cus_id,mycookie) 
values ('B001', 0);
insert into webtoon_customer (cus_id,mycookie) 
values ('C001', 3);
insert into webtoon_customer (cus_id,mycookie) 
values ('D001', 9);
insert into webtoon_customer (cus_id,mycookie) 
values ('E001', 16);

commit;

drop table webtoon_customer;
-- ���� ����Ʈ
select * from WEBTOON_COMIC;
-- �Ͽ��� ���� ����Ʈ
select * from WEBTOON_COMIC where WEB_DATE like '%��%';
-- ���� ������ ��
select * from WEBTOON_CUSTOMER;


update webtoon_customer 
set    num = (select num from webtoon_comic where title ='�� ���� ��' and episode = '4ȭ'),
      mycookie = mycookie -  
                (select cookie from webtoon_comic where title ='�� ���� ��' and episode = '4ȭ')
where cus_id = 'E001';



--
update webtoon_customer 
set    num =  'A103',
      mycookie =  20
where cus_id = 'A001';





select * from WEBTOON_CUSTOMER;