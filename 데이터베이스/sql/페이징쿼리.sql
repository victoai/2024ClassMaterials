-- pageSize:4일때  ( 한 페이지에 4개의 글을 보겠다)
-- 1 page -> 1~ 4
-- 2 page -> 5~ 8
-- 3 page -> 9~ 12
--총레코드수 :11개
--총페이지수 : 11/ 4  =>3페이지 ( 2 +1)
select * from member_tbl_11;  

--rownum 이용해서 범위의 목록 가져오기
--rownum 사용시 주의사항 !
select * from member_tbl_11
where rownum   between 1  and 4 ;
--
select * from member_tbl_11
where rownum   between 5  and 8 ;
 
 select *
 from(select rownum num , m_id, m_pw, m_name  from member_tbl_11 )
 where num between 1 and  4 ;
 --
 select *
 from(select rownum num , m_id, m_pw, m_name  from member_tbl_11 )
 where num between 9 and  12 ;
 
 
