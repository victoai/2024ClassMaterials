create table tbl_join_200(
  join_id varchar2(4)  not null primary key ,
  join_nm varchar2(20)  ,
  birth  char(8),
  gender char(1),
  specialty varchar2(1),
  charm varchar2(30)
);
commit;

insert into tbl_join_200 values( 'A001' , '������',  '20050102' , 'M', 'D', '�����');
insert into tbl_join_200 values( 'A002' , '��Ű',  '20090102' , 'M', 'D', '��������');
insert into tbl_join_200 values( 'A003' , '������',  '20070102' , 'M', 'D', 'â�۴�');
insert into tbl_join_200 values( 'A004' , '������',  '20030103' , 'M', 'R', '����');
insert into tbl_join_200 values( 'A005' , '����',  '20020205' , 'M', 'V', '���۰�');
commit;

create table tbl_mentor_200(
    mentor_id varchar2(4) not null primary key ,
    mentor_nm varchar2(20)
);
commit;

insert into tbl_mentor_200 values( 'J001', '������');
insert into tbl_mentor_200 values( 'J002', '�����');
insert into tbl_mentor_200 values( 'J003', '����');
commit;

create table tbl_score_200(
  score_no  number(6) not null ,
  artistid varchar2(4) not null,
  mentorid varchar2(4) not null,
  score number(3),
  primary key( score_no, artistid, mentorid)
);
commit;

insert into tbl_score_200 values( 110001, 'A001', 'J001' , 80);
insert into tbl_score_200 values( 110002, 'A001', 'J002' , 90);
insert into tbl_score_200 values( 110003, 'A001', 'J003' , 70);
insert into tbl_score_200 values( 110004, 'A002', 'J001' , 60);
insert into tbl_score_200 values( 110005, 'A002', 'J002' , 50);
insert into tbl_score_200 values( 110006, 'A002', 'J003' , 70);
insert into tbl_score_200 values( 110007, 'A003', 'J001' , 80);
insert into tbl_score_200 values( 110008, 'A003', 'J002' , 60);
insert into tbl_score_200 values( 110009, 'A003', 'J003' , 70);
insert into tbl_score_200 values( 110010, 'A004', 'J001' , 80);
insert into tbl_score_200 values( 110011, 'A004', 'J002' , 78);
insert into tbl_score_200 values( 110012, 'A004', 'J003' , 89);
insert into tbl_score_200 values( 110013, 'A005', 'J001' , 62);
insert into tbl_score_200 values( 110014, 'A005', 'J002' , 91);
insert into tbl_score_200 values( 110015, 'A005', 'J003' , 67);
commit;

-- ������ ��ȸ
select join_id ������ID, join_nm �������̸�, 
        substr(birth,1,4)||'��'||substr(birth,5,6)||'��'||substr(birth,7,8)||'��' �������, 
        decode(gender,'M','����','����') ����, 
        decode(specialty,'D','��','R','��','V','����') �Ƿ¹���, 
        charm �ŷ¹���
from tbl_join_200;

-- ������ ������ȸ
select s.score_no ���¹�ȣ, j.join_id ������ID,j.join_nm �������̸�, 
        substr(j.birth,1,4)||'��'||substr(j.birth,5,6)||'��'||substr(j.birth,7,8)||'��' �������, 
        s.score ����,
        case 
            when s.score>=90 then 'A'
            when s.score>=80 then 'B'
            when s.score>=70 then 'C'
            else 'D'
            end as ���,
        m.mentor_nm �����̸�
from tbl_join_200 j
join tbl_score_200 s
on j.JOIN_ID=s.ARTISTID
join tbl_mentor_200 m
on s.mentorid=m.mentor_id
order by s.score_no;

-- ������ ��� ��ȸ
select j.join_id ������ID, j.join_nm �������̸�, sum(s.score)��������, 
      round(avg(s.score),2)�������, rank() over(order by sum(s.score) desc)����
from tbl_join_200 j
join tbl_score_200 s
on j.JOIN_ID=s.ARTISTID
group by j.join_id, j.join_nm;



