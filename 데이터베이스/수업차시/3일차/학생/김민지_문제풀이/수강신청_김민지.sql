create table tbl_course_300 (
        s_id varchar2(5) not null primary key,
        s_name varchar2(20)  ,
        s_grade number(6),
        teacher_id varchar2(10) ,
        weekday char(2) ,
        start_h number(4),
        end_h  number(4)
);
commit;

insert into tbl_course_300 values('1001',  '�ѽĸ����' , 2, 1, 'M' , 0900, 1100 );
insert into tbl_course_300 values('1002',  '��ĸ����' , 2, 2, 'TU' , 0900, 1200 );
insert into tbl_course_300 values('1003',  '��������' , 3, 4, 'W' , 0900, 1200 );
insert into tbl_course_300 values('1004',  '�߽ĸ����' , 3, 4, 'TH' , 0900, 1200 );
insert into tbl_course_300 values('1005',  '���Ḹ���' , 2, 5, 'M' , 1300, 1600 );
insert into tbl_course_300 values('1006',  '�нĸ����' , 3, 5, 'TH' , 1500, 1800 );
insert into tbl_course_300 values('1007',  '�����ָ����' , 3, 5, 'W' , 1330, 1630 );
insert into tbl_course_300 values('1008',  '���������' , 2, 3, 'TH' , 1330, 1530 );
insert into tbl_course_300 values('1009',  '��ġ�����' , 3, 3, 'F' , 0900, 1200 );
insert into tbl_course_300 values('1010',  '�������' , 3, 2, 'F' , 1300, 1600 );
commit;


create table tbl_lecturer_300(
    t_id number(6) not null primary key,
    t_name varchar2(20)  ,
    major varchar2(20),
    field varchar2(20)
);
commit;

 

insert into tbl_lecturer_300 values( 1, '��������','�ѽ�,�߽�' ,'�߽�');
insert into tbl_lecturer_300 values( 2, '�߱���','�ѽ�,�߽�' ,'�߽�');
insert into tbl_lecturer_300 values( 3, '���α���','�ѽ�,���' ,'���');
insert into tbl_lecturer_300 values( 4, '����ȩ����','�ѽ�,���' ,'�ѽ�');
insert into tbl_lecturer_300 values( 5, '��������','��������' ,'����');
insert into tbl_lecturer_300 values( 6, '������','�нĹ�����' ,'�н�');
insert into tbl_lecturer_300 values( 7, 'RM����','�нĹ�����' ,'�н�');
commit;
 
-- ������ ��ȸ
select * from tbl_course_300;
select * from tbl_lecturer_300;

select c.s_id �����ڵ�, c.s_name �����, c.s_grade ����, l.t_name ��簭��,
       decode(c.weekday,'M ','��','TU','ȭ','W ','��','TH','��','F ','��')����,
      to_char(to_date(lpad(c.start_h,4,0),'HH24MI'),'HH24:MI') ���۽ð�,
      --substr(lpad(c.start_h,4,0),1,2)||':'||substr(c.start_h,3,2)���۽ð�,
      to_char(to_date(lpad(c.end_h,4,0),'HH24MI'),'HH24:MI') ����ð� 
from tbl_course_300 c
join tbl_lecturer_300 l
on c.teacher_id=t_id;