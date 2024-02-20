-- 방법1 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
select c.s_id 과목코드,
c.s_name 과목명,
c.s_grade 학점,
c.teacher_id 담당강사,
c.weekday 요일,
to_char(to_date( lpad(c.start_h,4,0),'HH24MI'),'HH24:MI')시작시간, 
to_char(to_date(c.end_h,'HH24MI'),'HH24:MI') 종료시간,
decode('관리', '관리','수정/삭제') 관리
from tbl_course_300 c
join tbl_lecturer_300 l
on c.teacher_id = l.t_id;
-- 방법2 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
select c.s_id 과목코드,
c.s_name 과목명,
c.s_grade 학점,
c.teacher_id 담당강사,
c.weekday 요일,
 substr( lpad(c.start_h,4,0) ,1,2) ||':' || substr( lpad(c.start_h,4,0) ,3,2)   ,
to_char(to_date(c.end_h,'HH24MI'),'HH24:MI') 종료시간,
decode('관리', '관리','수정/삭제') 관리
from tbl_course_300 c
join tbl_lecturer_300 l
on c.teacher_id = l.t_id;