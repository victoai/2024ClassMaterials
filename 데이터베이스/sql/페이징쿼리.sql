-- pageSize:4�϶�  ( �� �������� 4���� ���� ���ڴ�)
-- 1 page -> 1~ 4
-- 2 page -> 5~ 8
-- 3 page -> 9~ 12
--�ѷ��ڵ�� :11��
--���������� : 11/ 4  =>3������ ( 2 +1)
select * from member_tbl_11;  

--rownum �̿��ؼ� ������ ��� ��������
--rownum ���� ���ǻ��� !
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
 
 
