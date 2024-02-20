create table tbl_course_300 (
        s_id varchar2(5) not null primary key,
        s_name varchar2(20)  ,
        s_grade number(6),
        teacher_id varchar2(10) ,
        weekday char(2) ,
        start_h number(4),
        end_h  number(4)
);

insert into tbl_course_300 values('1001',  '한식만들기' , 2, 1, 'M' , 0900, 1100 );
insert into tbl_course_300 values('1002',  '양식만들기' , 2, 2, 'TU' , 0900, 1200 );
insert into tbl_course_300 values('1003',  '제과제빵' , 3, 4, 'W' , 0900, 1200 );
insert into tbl_course_300 values('1004',  '중식만들기' , 3, 4, 'TH' , 0900, 1200 );
insert into tbl_course_300 values('1005',  '음료만들기' , 2, 5, 'M' , 1300, 1600 );
insert into tbl_course_300 values('1006',  '분식만들기' , 3, 5, 'TH' , 1500, 1800 );
insert into tbl_course_300 values('1007',  '전통주만들기' , 3, 5, 'W' , 1330, 1630 );
insert into tbl_course_300 values('1008',  '반찬만들기' , 2, 3, 'TH' , 1330, 1530 );
insert into tbl_course_300 values('1009',  '김치만들기' , 3, 3, 'F' , 0900, 1200 );
insert into tbl_course_300 values('1010',  '떡만들기' , 3, 2, 'F' , 1300, 1600 );
commit;


create table tbl_lecturer_300(
    t_id number(6) not null primary key,
    t_name varchar2(20)  ,
    major varchar2(20),
    field varchar2(20)
);

 

insert into tbl_lecturer_300 values( 1, '정국교수','한식,중식' ,'중식');
insert into tbl_lecturer_300 values( 2, '뷔교수','한식,중식' ,'중식');
insert into tbl_lecturer_300 values( 3, '지민교수','한식,양식' ,'양식');
insert into tbl_lecturer_300 values( 4, '제이홉교수','한식,양식' ,'한식');
insert into tbl_lecturer_300 values( 5, '슈가교수','제과제빵' ,'제과');
insert into tbl_lecturer_300 values( 6, '진교수','분식및음료' ,'분식');
insert into tbl_lecturer_300 values( 7, 'RM교수','분식및음료' ,'분식');
commit;

---------------------------------------------------------------------
select * from tbl_course_300;
select * from tbl_lecturer_300;

select * 
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

select c.S_ID "과목코드", c.S_NAME "과목명", c.S_GRADE "학점", l.T_NAME "담당강사",
       c.WEEKDAY "요일", c.START_H "시작시간", c.END_H "종료시간"
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

select 
  Lpad(substr(c.START_H,1,length(c.START_H)-2)||':'||substr(c.START_H,length(c.START_H)-1,2),5,'0') "시작시간", 
  Lpad(substr(c.END_H,1,length(c.END_H)-2)||':'||substr(c.END_H,length(c.END_H)-1,2),5,'0') "종료시간"
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

-- select to_char(  to_date( '900', 'HH24MI' ) , 'HH24:MI' )  from dual;  --오류 
-- lpad이용해서 시 분 형식 맞춘다
-- select to_char(  to_date( lpad('900',4,0), 'HH24MI' ) , 'HH24:MI' )  from dual;--시분 표시형식
--susbtr이용해도 된다
--select   substr(lpad('900',4,0) ,1,2 ) || ':' ||  substr(lpad('900',4,0) ,3,2 )   from dual;

select c.S_ID "과목코드", c.S_NAME "과목명", c.S_GRADE "학점", l.T_NAME "담당강사",
       c.WEEKDAY "요일", 
       Lpad(substr(c.START_H,1,length(c.START_H)-2)||':'||substr(c.START_H,length(c.START_H)-1,2),5,'0') "시작시간", 
       Lpad(substr(c.END_H,1,length(c.END_H)-2)||':'||substr(c.END_H,length(c.END_H)-1,2),5,'0') "종료시간"
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

select decode(c.WEEKDAY, 'M ', '월', 'TU', '화', 'W ', '수', 'TH', '목', 'F ', '금')
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

select c.S_ID "과목코드", c.S_NAME "과목명", c.S_GRADE "학점", l.T_NAME "담당강사",
       decode(c.WEEKDAY, 'M ', '월', 'TU', '화', 'W ', '수', 'TH', '목', 'F ', '금') "요일", 
       Lpad(substr(c.START_H,1,length(c.START_H)-2)||':'||substr(c.START_H,length(c.START_H)-1,2),5,'0') "시작시간", 
       Lpad(substr(c.END_H,1,length(c.END_H)-2)||':'||substr(c.END_H,length(c.END_H)-1,2),5,'0') "종료시간",
       '수정/삭제' "관리"
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;





