create table tbl_course_300 (
        s_id varchar2(5) not null primary key,
        s_name varchar2(20)  ,
        s_grade number(6),
        teacher_id varchar2(10) ,
        weekday char(2) ,
        start_h number(4),
        end_h  number(4)
);

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

 

insert into tbl_lecturer_300 values( 1, '��������','�ѽ�,�߽�' ,'�߽�');
insert into tbl_lecturer_300 values( 2, '�߱���','�ѽ�,�߽�' ,'�߽�');
insert into tbl_lecturer_300 values( 3, '���α���','�ѽ�,���' ,'���');
insert into tbl_lecturer_300 values( 4, '����ȩ����','�ѽ�,���' ,'�ѽ�');
insert into tbl_lecturer_300 values( 5, '��������','��������' ,'����');
insert into tbl_lecturer_300 values( 6, '������','�нĹ�����' ,'�н�');
insert into tbl_lecturer_300 values( 7, 'RM����','�нĹ�����' ,'�н�');
commit;

---------------------------------------------------------------------
select * from tbl_course_300;
select * from tbl_lecturer_300;

select * 
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

select c.S_ID "�����ڵ�", c.S_NAME "�����", c.S_GRADE "����", l.T_NAME "��簭��",
       c.WEEKDAY "����", c.START_H "���۽ð�", c.END_H "����ð�"
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

select 
  Lpad(substr(c.START_H,1,length(c.START_H)-2)||':'||substr(c.START_H,length(c.START_H)-1,2),5,'0') "���۽ð�", 
  Lpad(substr(c.END_H,1,length(c.END_H)-2)||':'||substr(c.END_H,length(c.END_H)-1,2),5,'0') "����ð�"
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

-- select to_char(  to_date( '900', 'HH24MI' ) , 'HH24:MI' )  from dual;  --���� 
-- lpad�̿��ؼ� �� �� ���� �����
-- select to_char(  to_date( lpad('900',4,0), 'HH24MI' ) , 'HH24:MI' )  from dual;--�ú� ǥ������
--susbtr�̿��ص� �ȴ�
--select   substr(lpad('900',4,0) ,1,2 ) || ':' ||  substr(lpad('900',4,0) ,3,2 )   from dual;

select c.S_ID "�����ڵ�", c.S_NAME "�����", c.S_GRADE "����", l.T_NAME "��簭��",
       c.WEEKDAY "����", 
       Lpad(substr(c.START_H,1,length(c.START_H)-2)||':'||substr(c.START_H,length(c.START_H)-1,2),5,'0') "���۽ð�", 
       Lpad(substr(c.END_H,1,length(c.END_H)-2)||':'||substr(c.END_H,length(c.END_H)-1,2),5,'0') "����ð�"
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

select decode(c.WEEKDAY, 'M ', '��', 'TU', 'ȭ', 'W ', '��', 'TH', '��', 'F ', '��')
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;

select c.S_ID "�����ڵ�", c.S_NAME "�����", c.S_GRADE "����", l.T_NAME "��簭��",
       decode(c.WEEKDAY, 'M ', '��', 'TU', 'ȭ', 'W ', '��', 'TH', '��', 'F ', '��') "����", 
       Lpad(substr(c.START_H,1,length(c.START_H)-2)||':'||substr(c.START_H,length(c.START_H)-1,2),5,'0') "���۽ð�", 
       Lpad(substr(c.END_H,1,length(c.END_H)-2)||':'||substr(c.END_H,length(c.END_H)-1,2),5,'0') "����ð�",
       '����/����' "����"
from tbl_lecturer_300 l
join tbl_course_300 c
on l.T_ID = c.TEACHER_ID;





