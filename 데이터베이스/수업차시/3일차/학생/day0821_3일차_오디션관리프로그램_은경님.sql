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



create table tbl_mentor_200(
    mentor_id varchar2(4) not null primary key ,
    mentor_nm varchar2(20)
);

insert into tbl_mentor_200 values( 'J001', '박진영');
insert into tbl_mentor_200 values( 'J002', '박재상');
insert into tbl_mentor_200 values( 'J003', '보아');
commit;



create table tbl_score_200(
  score_no  number(6) not null ,
  artistid varchar2(4) not null,
  mentorid varchar2(4) not null,
  score number(3),
  primary key( score_no, artistid, mentorid)
);

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

-----------------------------------------------------------------
-- 1. 참가자 조회
select * from tbl_join_200;

select decode(gender, 'M', '남성') "성별"
from tbl_join_200;

select to_date( birth) from tbl_join_200;

select to_char( to_date( birth) , 'yyyy-mm-dd') 
from tbl_join_200;

select to_char( to_date( birth) , 'yyyy"년"mm"월"dd"일"') 
from tbl_join_200;

select 
       decode(gender, 'M', '남성') "성별",
       decode(specialty, 'V', '보컬' , 'D', '댄스', 'R', '랩') "실력무대"      
from tbl_join_200;

select join_id "참가자ID", join_nm "참가자이름", birth "생년월일",
      decode(gender, 'M', '남성') "성별",
      decode(specialty, 'V', '보컬' , 'D', '댄스', 'R', '랩') "실력무대", charm "매력무대"
from tbl_join_200;

select join_id "참가자ID", join_nm "참가자이름", 
      to_char( to_date( birth) , 'yyyy"년"mm"월"dd"일"') "생년월일",
      decode(gender, 'M', '남성') "성별",
      decode(specialty, 'V', '보컬' , 'D', '댄스', 'R', '랩') "실력무대", charm "매력무대"
from tbl_join_200;

-- 2. 참가자 점수조회
select * from tbl_join_200;
select * from tbl_mentor_200;
select * from tbl_score_200;

select * from tbl_join_200 j
join tbl_score_200 s
on j.join_id = s.artistid;

select * from tbl_join_200 j
join tbl_score_200 s
on j.join_id = s.artistid
join tbl_mentor_200 m
on s.mentorid = m.mentor_id;

select s.SCORE_NO, j.JOIN_ID, j.JOIN_NM, j.BIRTH, 
       s.SCORE, m.MENTOR_NM
from tbl_join_200 j
join tbl_score_200 s
on j.join_id = s.artistid
join tbl_mentor_200 m
on s.mentorid = m.mentor_id;

select s.SCORE_NO "계좌번호", j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름", 
       j.BIRTH "생년월일", 
       s.SCORE "점수", m.MENTOR_NM "멘토이름"
from tbl_join_200 j
join tbl_score_200 s
on j.join_id = s.artistid
join tbl_mentor_200 m
on s.mentorid = m.mentor_id;

select s.SCORE_NO "계좌번호", j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름", 
       to_char(to_date(j.BIRTH), 'yyyy"년"mm"월"dd"일"') "생년월일", 
       s.SCORE "점수", m.MENTOR_NM "멘토이름"
from tbl_join_200 j
join tbl_score_200 s
on j.join_id = s.artistid
join tbl_mentor_200 m
on s.mentorid = m.mentor_id;

select score from tbl_score_200;

select score,
  case when score>=90 then 'A'
       when score>=80 then 'B'
       when score>=70 then 'C'
       else 'D'
  end as "등급"
from tbl_score_200;

select s.SCORE_NO "계좌번호", j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름", 
       to_char(to_date(j.BIRTH), 'yyyy"년"mm"월"dd"일"') "생년월일", s.SCORE "점수",
       case when s.SCORE>=90 then 'A'
            when s.SCORE>=80 then 'B'
            when s.SCORE>=70 then 'C'
            else 'D'
       end as "등급",
       m.MENTOR_NM "멘토이름"
from tbl_join_200 j
join tbl_score_200 s
on j.join_id = s.artistid
join tbl_mentor_200 m
on s.mentorid = m.mentor_id;

select s.SCORE_NO "계좌번호", j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름", 
       to_char(to_date(j.BIRTH), 'yyyy"년"mm"월"dd"일"') "생년월일", s.SCORE "점수",
       case when s.SCORE>=90 then 'A'
            when s.SCORE>=80 then 'B'
            when s.SCORE>=70 then 'C'
            else 'D'
       end as "등급",
       m.MENTOR_NM "멘토이름"
from tbl_join_200 j
join tbl_score_200 s
on j.join_id = s.artistid
join tbl_mentor_200 m
on s.mentorid = m.mentor_id
order by s.SCORE_NO;

-- 3. 참가자 등수 조회
select * from tbl_join_200;
select * from tbl_mentor_200;
select * from tbl_score_200;

select * 
from tbl_join_200 j
join tbl_score_200 s
on j.JOIN_ID = s.ARTISTID;

select j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름",  s.score
from tbl_join_200 j
join tbl_score_200 s
on j.JOIN_ID = s.ARTISTID;

select j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름",  sum(s.score) "종합점수"
from tbl_join_200 j
join tbl_score_200 s
on j.JOIN_ID = s.ARTISTID
group by j.join_id, j.join_nm;

select j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름",  sum(s.score) "종합점수",
       avg(s.score) "평균점수"
from tbl_join_200 j
join tbl_score_200 s
on j.JOIN_ID = s.ARTISTID
group by j.join_id, j.join_nm;

select j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름",  sum(s.score) "종합점수",
       round(avg(s.score),2) "평균점수"
from tbl_join_200 j
join tbl_score_200 s
on j.JOIN_ID = s.ARTISTID
group by j.join_id, j.join_nm;

select j.JOIN_ID "참가자ID", j.JOIN_NM "참가자이름", sum(s.score) "종합점수",
       round(avg(s.score),2) "평균점수", rank() over(order by sum(s.score) desc) "순위"
from tbl_join_200 j
join tbl_score_200 s
on j.JOIN_ID = s.ARTISTID
group by j.join_id, j.join_nm;








