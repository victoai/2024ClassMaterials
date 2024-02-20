--1.모든 정보 보냄
select *from member_tbl_11;

--2.모든 고객의 이름과 생일 정보 조회하시오
select M_NAME, M_BIRTHDAY from member_tbl_11;

--3.이름이 박해수인 고객아이디, 생일, 포인트 정보 조회하시오
select M_ID, M_BIRTHDAY, M_POINT from member_tbl_11 where M_NAME = '박해수';

--4.포인트가 2000점 이상인 고객이름, 전화번호 정보 조회하시오
select M_NAME, M_TEL from member_tbl_11 where M_POINT>=2000;

--5.포인트가 2000점에서 3000점 사이의 고객이름, 전화번호 정보 조회하시오
select M_NAME, M_TEL from member_tbl_11 where M_POINT>=2000 and M_POINT<=3000;
select M_NAME, M_TEL from member_tbl_11 where M_POINT between 2000 and 3000;

--6.고객등급이 ‘01’인 고객이름, 전화번호 , 포인트 정보 조회하시오
select M_NAME,M_TEL,M_POINT from member_tbl_11 where M_GRADE = '01';

--7. 생일이 2004-06-01 이후인 고객이름 전화번호 정보 조회하시오
select M_NAME,M_TEL from member_tbl_11 where M_BIRTHDAY>='04/06/01';

--8. 생일이 2004-05-01 이전에 태어난 고객의 고객이름 , 생일 정보 조회하시오
select M_NAME,M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY<='04/05/01';

--9. 고객등급이 ‘01’이 아닌 고객의 고객이름, 전화번호, 고객등급 정보 조회하시오
select M_NAME,M_TEL,M_GRADE from member_tbl_11 where M_GRADE!='01';

--10. 고객 등급이 ‘02’ 인 고객의 고객아이디, 이름, 전화번호 정보 조회하시오
select M_ID,M_NAME,M_TEL from member_tbl_11 where M_GRADE='02';

--11. 포인트가 1500점 미만인 고객의 고객이름, 전화번호 조회하시오
select M_NAME,M_TEL from member_tbl_11 where M_POINT<1500;

--12. 포인트가 적립되지 않은 고객정보 조회하시오
select * from member_tbl_11 where M_POINT is null;

--13. 포인트가 부여된 (포인트 금액을 가지고 있는) 고객정보 조회하시오( 포인트가 NULL이 아닌 고객 조회하면 됨)
select * from member_tbl_11 where M_POINT is not null;

--14. 고객등급이 중복되지 않도록 고객등급을 조회하는 쿼리를 작성하시오
select distinct M_Grade from member_tbl_11;

-- ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 두번째 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
--1. 고객등급이 ‘01’이고 포인트가 2000이상인 고객의 아이디, 이름 정보를 조회하시오
select M_ID, M_NAME from member_tbl_11 where M_GRADE ='01' and M_POINT>=2000;

--2. 고객등급이 ‘01’ 이거나 포인트가 2000이상인 고객의 아이디, 이름 정보를 조회하시오
select M_ID, M_NAME from member_tbl_11 where M_GRADE ='01' or M_POINT>=2000;

--3. 김씨성을 가진 고객의 아이디, 이름, 등급 정보를 조회하시오
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_NAME like '김%';

--4. 이름이 수로 끝나는 고객의 아이디, 이름 , 등급 정보를 조회하시오
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_NAME like '%수';

--5. 고객등급이 ‘01’, ‘03’ 인 고객의 아이디, 이름, 등급 정보를 조회하시오(IN 연산자 사용해 주세요) 
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_GRADE IN (01,03);

--6. 고객등급이 ‘01’, ‘02’ 이 아닌 고객의 아이디, 이름, 등급 정보를 조회하시오(NOT IN 연산자 사용 해 주세요)
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_GRADE NOT IN (01,02);

--7. 고객등급이 ‘02’ 이거나 이름이 이씨성을 가진 고객의 정보의 아이디와 이름 , 등급 정보를 조회 하시오
select M_ID, M_NAME,M_GRADE from member_tbl_11 where M_GRADE = 02 or M_NAME like '이%';

--8. 생일이 2004-05-01이전에 태어나거나 고객등급이 ‘03’인 고객의 아이디, 이름, 생일 정보를 조회하시오
select M_ID, M_NAME,M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY <= '04/05/01' or M_GRADE = 03;
