create table member_tbl_11(
m_id varchar2(5) not null primary key ,
m_pw varchar2(5) ,
m_name varchar2(10) ,
m_tel varchar2(13) ,
m_birthday date ,
m_point number(6) ,
m_grade varchar2(2)
);
commit;

insert into member_tbl_11 values ('m100' , '1234' , '¼º±âÈÆ', '010-1111-2222' , '2004-01-01' , 100, '01');
insert into member_tbl_11 values ('m101' , '4444' , '±è»ó¿ì', '010-2222-3333' , '2004-01-01' , 1500, '01');
insert into member_tbl_11 values ('m102' , '5555' , '±èÀÏ³²', '010-3333-4444' , '2004-12-10' , 2000, '02');
insert into member_tbl_11 values ('m103' , '6666' , 'ÀÌÁØÈ£', '010-4444-5555' , '2004-04-10' , 1900, '02');
insert into member_tbl_11 values ('m104' , '7777' , '±è»õº®', '010-5555-6666' , '2004-09-12' , 3000, '03');
insert into member_tbl_11 values ('m105' , '8888' , 'ÃÖ´ö¼ö', '010-6666-7777' , '2004-08-10' , 4800, '03');
insert into member_tbl_11 values ('m106' , '9999' , 'ÀÌ¾Ë¸®', '010-7777-8888' , '2004-07-10' , 2900, '01');
insert into member_tbl_11 values ('m107' , '0101' , '±è¹Ì³à', '010-8888-9999' , '2004-06-09' , 1200, '01');
insert into member_tbl_11 values ('m108' , '0404' , 'ÀÌÁ¤Àç', '010-9999-8888' , '2004-05-19' , 3000, '03');
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday)
values ('m109' , '0448' , '¹ÚÇØ¼ö', '010-7878-1111' , '2004-11-27' );
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday)
values ('m110' , '4848' , 'À§ÇÏÁØ', '010-8888-9090' , '2004-11-09');
commit;

select * from member_tbl_11;

select m_name, m_birthday from member_tbl_11;

select m_id, m_birthday, m_point from member_tbl_11 where m_name = '¹ÚÇØ¼ö';

select m_name, m_tel from MEMBER_TBL_11 where M_POINT >= 2000;

select m_name, m_tel from MEMBER_TBL_11 where M_POINT BETWEEN 2000 and 3000;

select m_name, m_tel, m_point from MEMBER_TBL_11 where M_GRADE = '01';

select m_name, m_birthday from MEMBER_TBL_11 where M_BIRTHDAY <= '2004-06-01';

select m_name, m_tel, M_GRADE from MEMBER_TBL_11 where M_GRADE != '01';

select m_name, m_tel from MEMBER_TBL_11 where M_GRADE = '02';

select m_name, m_tel from MEMBER_TBL_11 where M_POINT < 1500;

select m_name, m_tel from MEMBER_TBL_11 where M_POINT is null;

select m_name, m_tel from MEMBER_TBL_11 where M_POINT is not null;

select DISTINCT m_grade from MEMBER_TBL_11;

select m_id, m_name from MEMBER_TBL_11 where m_grade='01' and m_point >=2000;

select m_id, m_name from MEMBER_TBL_11 where m_grade='01' or m_point >= 2000;

select m_id, m_name, m_grade from MEMBER_TBL_11 where m_name like '±è%';

select m_id, m_name, m_grade from MEMBER_TBL_11 where m_name like '%¼ö';

select m_id, m_name, m_grade from MEMBER_TBL_11 where m_grade in ('01','03');

select m_id, m_name, m_grade from MEMBER_TBL_11 where m_grade not in ('01','03');

select m_id, m_name, m_grade from MEMBER_TBL_11 where m_grade='02' or m_name like 'ÀÌ%';

select m_id, m_name, m_grade from MEMBER_TBL_11 where M_BIRTHDAY <= '2004-05-01' or m_grade = '03';






