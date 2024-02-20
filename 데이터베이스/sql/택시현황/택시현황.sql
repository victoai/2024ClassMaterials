
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

insert into tblcall_list values( 1,0830,'20210101','P001','노원', '종로' , 'T001', 'P' );
insert into tblcall_list values( 2,1210,'20210102','P002','강남', '을지로' , 'T002', 'R' );
insert into tblcall_list values( 3,1120,'20210510','P003','서울', '부산' , 'T003', 'P' );
insert into tblcall_list values( 4,1510,'20210520','P003','마포', '종로' , 'T001', 'P' );
insert into tblcall_list values( 5,1610,'20210530','P001','무교동', '강남' , '미정', 'R' );

commit;

create table tblcust(
   id varchar2(10) not null primary key,
   name varchar2(20),
   tel varchar2(20)
);

insert into tblcust values('P001','김고객',  '01011112222');
insert into tblcust values('P002','이고객',  '01022223333');
insert into tblcust values('P003','박고객',  '01033334444');

commit;

create table tbl_taxi(
   id varchar2(10) not null primary key,
   name varchar2(20) ,
   kind varchar2(20)
);

insert into tbl_taxi values('T001' , '김택시' ,  '개인');
insert into tbl_taxi values('T002' , '이택시' ,  '개인');
insert into tbl_taxi values('T003' , '박택시' ,  '개인');

commit;

select  * from tbl_taxi;
select  * from tblcust;
select * from tblcall_list;



 

--조회쿼리 작성

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
        decode(call.state ,'P', '배차완료', 'R', '배차준비' , 'X', '배차미정')
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

insert into tbl_join_200 values( 'A001' , '케이쥬',  '20050102' , 'M', 'D', '깜찍댄스');
insert into tbl_join_200 values( 'A002' , '고키',  '20090102' , 'M', 'D', '동전마술');
insert into tbl_join_200 values( 'A003' , '나윤서',  '20070102' , 'M', 'D', '창작댄스');
insert into tbl_join_200 values( 'A004' , '장현수',  '20030103' , 'M', 'R', '보컬');
insert into tbl_join_200 values( 'A005' , '윤민',  '20020205' , 'M', 'V', '자작곡');

commit;