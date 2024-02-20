
create table tblcall_list (
 regno number(3) not null primary key,
 regtime number(10) ,
 regdate date,
 cusno varchar2(10),
 startpoint varchar2(20),
 destination varchar2(20),
 taxino varchar2(10),
 state varchar2(1)
);

insert into tblcall_list values( 1,0830,'20210101','P001','���', '����' , 'T001', 'P' );
insert into tblcall_list values( 2,1210,'20210102','P002','����', '������' , 'T002', 'R' );
insert into tblcall_list values( 3,1120,'20210510','P003','����', '�λ�' , 'T003', 'P' );
insert into tblcall_list values( 4,1510,'20210520','P003','����', '����' , 'T001', 'P' );
insert into tblcall_list values( 5,1610,'20210530','P001','������', '����' , '����', 'R' );

commit;

create table tblcust(
   id varchar2(10) not null primary key,
   name varchar2(20),
   tel varchar2(20)
);

insert into tblcust values('P001','���',  '01011112222');
insert into tblcust values('P002','�̰�',  '01022223333');
insert into tblcust values('P003','�ڰ�',  '01033334444');

commit;

create table tbl_taxi(
   id varchar2(10) not null primary key,
   name varchar2(20) ,
   kind varchar2(20)
);

insert into tbl_taxi values('T001' , '���ý�' ,  '����');
insert into tbl_taxi values('T002' , '���ý�' ,  '����');
insert into tbl_taxi values('T003' , '���ý�' ,  '����');

commit;

select  * from tbl_taxi;
select  * from tblcust;
select * from tblcall_list;



 

--��ȸ���� �ۼ�

select * from tblcall_list;

select *
from tblcall_list  call
join tblcust  cust
on  call.CUSNO  = cust.id;
--

select  cust.tel,  call.regno ,
        call.regtime, call.regdate , 
        cust.name,  call.startpoint,
        call.DESTINATION  ,  call.taxino,
        call.state
from tblcall_list  call
join tblcust  cust
on  call.CUSNO  = cust.id;
--
select   substr(cust.tel, 1, 3) || '-' || substr(cust.tel, 4, 4)  || '-' || substr(cust.tel, 8, 4)  tel, 
        call.regno ,substr( lpad( regtime, 4, '0') , 1 ,2 )  || ':' || substr( lpad( regtime, 4, '0') , 3 ,2 )  regtime
        , to_char( call.regdate ,'yyyy-mm-dd' ) , 
        cust.name,  call.startpoint,
        call.DESTINATION  ,  call.taxino,
        decode(call.state ,'P', '�����Ϸ�', 'R', '�����غ�' , 'X', '��������')
from tblcall_list  call
join tblcust  cust
on  call.CUSNO  = cust.id;


select  substr( lpad( regtime, 4, '0') , 1 ,2 )  || ':' || substr( lpad( regtime, 4, '0') , 3 ,2 )
from tblcall_list;




create table tbl_join_200(
  join_id varchar2(4)  not null primary key ,
  join_nm varchar2(20)  ,
  birth  char(8),
  gender char(1),
  specialty varchar2(1),
  charm varchar2(30)
);

insert into tbl_join_200 values( 'A001' , '������',  '20050102' , 'M', 'D', '�����');
insert into tbl_join_200 values( 'A002' , '��Ű',  '20090102' , 'M', 'D', '��������');
insert into tbl_join_200 values( 'A003' , '������',  '20070102' , 'M', 'D', 'â�۴�');
insert into tbl_join_200 values( 'A004' , '������',  '20030103' , 'M', 'R', '����');
insert into tbl_join_200 values( 'A005' , '����',  '20020205' , 'M', 'V', '���۰�');

commit;