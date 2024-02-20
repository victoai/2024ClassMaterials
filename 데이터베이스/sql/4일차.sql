create table goods_tbl_500(
goods_cd varchar2(6) not null primary key, 
goods_nm varchar2(30), 
goods_price number(8), 
cost number(8), in_date date
); 


insert into goods_tbl_500 values('110001','육계장사발면',1050,750,'20190302');
insert into goods_tbl_500 values('110002','단팥빵',1300,800,'20190302'); 
insert into goods_tbl_500 values('110003','사브로',2000,1700,'20190302');
insert into goods_tbl_500 values('110004','칠성사이다',900,750,'20190302'); 
insert into goods_tbl_500 values('110005','콜라',750,300,'20190302'); 
insert into goods_tbl_500 values('110006','아몬드초콜릿',1500,1300,'20190302'); 
insert into goods_tbl_500 values('110007','초코몽',850,600,'20190302');


 create table store_tbl_500(
 store_cd varchar2(5) not null primary key,
 store_nm varchar2(20), 
 store_fg varchar2(1)
);

 insert into store_tbl_500 values('A001','노원점','0');
 insert into store_tbl_500 values('A002','마포점','0'); 
insert into store_tbl_500 values('A003','석계점','0'); 
insert into store_tbl_500 values('B001','하계점','1');
 insert into store_tbl_500 values('C001','상계점','1'); 
insert into store_tbl_500 values('D001','중계점','0');
 insert into store_tbl_500 values('D002','태릉입구점','1'); 
insert into store_tbl_500 values('E001','화랑대점','0');


 create table sale_tbl_500(
 sale_no varchar2(4) not null primary key, 
 sale_ymd date not null,
 sale_fg varchar2(1) not null, 
 store_cd varchar2(5)  ,         
 goods_cd varchar2(6) ,
 sale_cnt number(3),
 pay_type varchar2(2),
 constraint  fk1 foreign key (store_cd)  references store_tbl_500(store_cd),
 constraint  fk2  foreign key (goods_cd) references goods_tbl_500(goods_cd)
); 

insert into sale_tbl_500 values('0001','20190325','1','A001','110001',2,'02'); 
insert into sale_tbl_500 values('0002','20190325','1','B001','110003',2,'02');
 insert into sale_tbl_500 values('0003','20190325','1','D001','110003',1,'01'); 
insert into sale_tbl_500 values('0004','20190325','1','A001','110006',5,'02'); 
insert into sale_tbl_500 values('0005','20190325','1','C001','110003',2,'02'); 
insert into sale_tbl_500 values('0006','20190325','2','C001','110003',2,'02');
 insert into sale_tbl_500 values('0007','20190325','1','A002','110005',4,'02');
 insert into sale_tbl_500 values('0008','20190325','1','A003','110004',4,'02');
 insert into sale_tbl_500 values('0009','20190325','1','B001','110001',2,'01');
 insert into sale_tbl_500 values('0010','20190325','1','A002','110006',1,'02');
 
 commit;
 
 --한양CU쿼리
 select * from goods_tbl_500;
 select * from store_tbl_500;
 select * from sale_tbl_500;
 
 
  select * from goods_tbl_500;
  
  select  goods_cd, goods_nm, to_char(goods_price,'999,999') ||'원', 
          to_char( cost ,'999,999'),  to_char(in_date , 'yyyy"년" mm"월 "dd"일"') 
  from goods_tbl_500;
  --
  desc goods_tbl_500;  
  --금액 천단위 표시
  select to_char(goods_price ,'999,999')
  from goods_tbl_500;
  
  --날짜변환
  --sql 문자, 날짜  ' '
  -- 컬럼의 별칭을 줄 때   "" 쌍따옴표  
  -- select a  as  "a 별칭"  from tbla;
  select  to_char(in_date , 'yyyy"년" mm"월 "dd"일"')
  from goods_tbl_500;
  
 
 
 --한양 3
 select sale_fg,sale_no, sale_ymd, sale_cnt, pay_type
 from sale_tbl_500;
 --
 select * from   sale_tbl_500;
 -- 두 개의 테이블 조인
 select *
 from sale_tbl_500  s
 join goods_tbl_500  g
 on s.GOODS_CD = g.GOODS_CD;
 --
 select s.sale_fg, s.sale_no, s.sale_ymd,  g.GOODS_NM ,s.sale_cnt, s.pay_type  
 from sale_tbl_500  s
 join goods_tbl_500  g
 on s.GOODS_CD = g.GOODS_CD;
 
 ---
  select s.STORE_CD , s.sale_fg, s.sale_no, s.sale_ymd,  g.GOODS_NM ,s.sale_cnt, s.pay_type  
 from sale_tbl_500  s
 join goods_tbl_500  g
 on s.GOODS_CD = g.GOODS_CD;
 
 
 --
 select s.STORE_CD , s.sale_fg, s.sale_no, s.sale_ymd,  g.GOODS_NM ,s.sale_cnt, s.pay_type  
 from sale_tbl_500  s
 join goods_tbl_500  g
 on s.GOODS_CD = g.GOODS_CD
 where s.STORE_CD='A001';
 
  --
 select  decode(s.sale_fg, 1,'판매',2,'취소'),
         s.sale_no  , 
         to_char(s.sale_ymd , 'yyyy-mm-dd'),  g.GOODS_NM ,s.sale_cnt
         , decode(s.pay_type , '01' ,'현금', '02','카드')  
 from sale_tbl_500  s
 join goods_tbl_500  g
 on s.GOODS_CD = g.GOODS_CD
 where s.STORE_CD='A001';
 
 --점포별 매출현황 --
 select   * from  sale_tbl_500;
 select   * from  store_tbl_500;
 select   * from  goods_tbl_500;
 
 --
 select s.STORE_CD  ,  s.sale_cnt * g.goods_price
 from sale_tbl_500  s
 join goods_tbl_500 g
 on s.GOODS_CD = g.GOODS_CD ;
 
 
 select  s.STORE_CD  ,  ss.STORE_NM  ,  s.sale_cnt * g.goods_price
 from sale_tbl_500  s
 join goods_tbl_500 g
 on s.GOODS_CD = g.GOODS_CD 
 join store_tbl_500 ss
 on  s.STORE_CD  =ss.STORE_CD ;
 
 ---
 select  ss.STORE_NM  ,  s.sale_cnt * g.goods_price
 from sale_tbl_500  s
 join goods_tbl_500 g
 on s.GOODS_CD = g.GOODS_CD 
 join store_tbl_500 ss
 on  s.STORE_CD  =ss.STORE_CD ;
 
 -- 점별 집계 
 select  ss.STORE_NM  ,  sum( s.sale_cnt * g.goods_price)
 from sale_tbl_500  s
 join goods_tbl_500 g
 on s.GOODS_CD = g.GOODS_CD 
 join store_tbl_500 ss
 on  s.STORE_CD  =ss.STORE_CD 
 group by ss.STORE_NM ;
 
 -- 현금, 카드 , 총매출
 select  ss.STORE_NM  , 
 sum(decode( s.pay_type,'01',  s.sale_cnt * g.goods_price))   cash,
 sum(decode( s.pay_type,'02',  s.sale_cnt * g.goods_price))   card ,
 sum( s.sale_cnt * g.goods_price)  총매출
 from sale_tbl_500  s
 join goods_tbl_500 g
 on s.GOODS_CD = g.GOODS_CD 
 join store_tbl_500 ss
 on  s.STORE_CD  =ss.STORE_CD 
 group by ss.STORE_NM ;
 
 
 select  ss.STORE_NM  , 
 to_char(nvl(sum(decode( s.pay_type,'01',  s.sale_cnt * g.goods_price)) ,0) ,'999,999')   cash,
 nvl(sum(decode( s.pay_type,'02',  s.sale_cnt * g.goods_price)) ,0)   card ,
 sum( s.sale_cnt * g.goods_price)  총매출
 from sale_tbl_500  s
 join goods_tbl_500 g
 on s.GOODS_CD = g.GOODS_CD 
 join store_tbl_500 ss
 on  s.STORE_CD  =ss.STORE_CD 
 group by ss.STORE_NM 
 order by 4 desc;
 
  
 
 -- view 만들기
 CREATE TABLE t_emp
(
eid VARCHAR2(13) NOT NULL PRIMARY KEY ,
ename VARCHAR2(20) ,
salary NUMBER(5) ,
deptno NUMBER(5) ,
comm NUMBER(5)
);
COMMIT;
INSERT INTO t_emp VALUES ('e001' , '신동엽' , 280,10,100) ;
INSERT INTO t_emp VALUES ('e002' , '유재석' , 250,20,50) ;
INSERT INTO t_emp VALUES ('e003' , '전현무' , 190,30,0) ;
INSERT INTO t_emp VALUES ('e004' , '양세영' , 300,20,0) ;
INSERT INTO t_emp VALUES ('e005' , '양세찬' , 290,40,100) ;
CREATE TABLE t_dept
(
deptno NUMBER(5) NOT NULL PRIMARY KEY ,
dname VARCHAR2(20)
);
COMMIT;
INSERT INTO t_dept VALUES (10 , '영업팀') ;
INSERT INTO t_dept VALUES (20 , '기획팀') ;
INSERT INTO t_dept VALUES (30 , '관리팀') ;
INSERT INTO t_dept VALUES (40 , '마케팅팀') ;
INSERT INTO t_dept VALUES (50 , '재무팀') ;

commit;

--view 만들기

 create view v_emp3
 as
  select ename, deptno
  from t_emp;  
  
select * from t_emp;
 
 
 
 --복합뷰
 
 create view v_emp223
 as 
 select e.ename, d.dname
 from t_emp e, t_dept d
 where e.deptno  = d.deptno;
 
 
 create view v_emptest
 as 
 select   e.ename, d.dname
 from t_emp e
 join t_dept d
 on e.deptno = d.deptno;
 
 
 --인라인뷰 
 --from 절 뒤에오는 서브쿼리를 인라인뷰라고 한다.
 
 select  *
 from tbl_test_order;
 --인라인뷰 예제
 select  *
 from(
     select  ocode, pcode, sale_cnt 
     from tbl_test_order
 )  o
   join  tbl_test_goods  g
   on o.pcode =g.pcode; 
  
 -- 서브쿼리
 
 select  * from t_emp;
 
 select ename, salary
 from t_emp 
 where salary > 280;
 
 select ename, salary
 from t_emp 
 where salary > ( select salary from t_emp where ename='신동엽');
 
 select  *
 from  t_emp
 where  deptno in(20,40);
 
 select  *
 from  t_emp
 where  deptno in(  select  deptno from t_dept where dname='기획팀' or dname='마케팅팀' ); 
 --평균급여보다 높은 사람 조회하기
 select *
 from t_emp; 
 select ename , salary
 from t_emp
 where salary  >  250;
 
 
 select ename , salary
 from t_emp
 where salary  >  (  select  avg(salary) from t_emp);
  
 -- salary평균구하기
 select  avg(salary) from t_emp;
 
 
 --dml
 --select 조회하기
 --insert , update, delete
 --member_tbl_11
 select * from member_tbl_11;
 desc member_tbl_11;
 
 --데이터 추가하기
 --모든컬럼의 값을 순서대로 입력해야함 
 insert into member_tbl_11 values('test','0000','우주연', '000-111-3333','1975-12-10' , null, null);
 insert into member_tbl_11(m_id, m_pw, m_name) values('test2','1234','홍길동' );
 commit;
 select * from member_tbl_11;
 
 
 
 -- 
 create table professor3
 as
 select * from professor ;
 
 select * from professor3;
 
 create table professor4
 as
 select * from professor
 where 1=2;         --  불일치 조건 만들기
 
 select * from professor4;
 
 insert into professor4
 select * from professor;
 
 --update (데이터 변경하기)
 select  * from member_tbl_11 where m_name = '우주연';
 
 update member_tbl_11
 set  m_tel ='010-222-5555' 
 where m_id='test'; 
 commit;
 
 select * from member_tbl_11; 
 -- 모든고객의 포인트금액을 변경하기
 -- 기존포인트에서 1000증가시키는 , null인 고객은 1000으로  update 구문작성하기
 
 update member_tbl_11
 set m_pw='9999' , m_tel ='010-999-3333'
 where m_id='test';
 commit;
 
 
 delete 
 from member_tbl_11
 where m_id='test';
 commit;
 
 select * from member_tbl_11;
 
 --DDL 
 --테이블 생성하기 , 테이블 컬럼 정보 수정하기 , 테이블 삭제하기
 
 create table member2(
     id varchar2(7), 
     name varchar2(10)
 );
 select * from member2;
 
 --테이블정보 수정하기
 alter table member  modify(  user_id varchar2(5));
 alter table member2  add( addr varchar2(5) ); 
 alter table member2  rename column id to user_id;
 alter table member2 drop column  addr;
 desc member2;
 
 select * from member2;
 
 
 create table  tt02
 (no number(3,1) default 0 ,
  name varchar2(10) default  'no name' ,
  hiredate  date  default  sysdate
  );
 insert into tt02(no) values(1);
 select * from tt02;
 
 --테이블 삭제하기
 drop table tt2;   --테이블자체를 삭제함  (스키마까지 삭제)
 truncate table tt2;   --테이블정보는 남는다. 
 
 
 select * from tbl_test_customer; 
 select * from tbl_test_goods;
 select * from tbl_test_order;
 
 insert into tbl_test_order( ocode, odate, id,pcode, sale_cnt) 
                             values( 'J009' , '2023-08-22', 'H007', 'P001' ,100);                           
                             
 select * from tbl_test_order;                             
--안들어간다
-- 들어간다.
-- 결론적으로는 이데이터가 정상적으로 들어가는것이 옳은가?
 
 create table  dept2(
              dcode  varchar2(2)
);

create table new_emp1 (
   no number(4) 
   constraint emp1_no_pk primary key,
   name varchar2(20) 
   constraint emp1_name_nn not null,
   jumin varchar2(13)
   constraint emp1_jumin_nn not null 
   constraint emp1_jumin_uk unique,
   loc_code number(1) 
    constraint emp1_area_ck check( loc_code  <5 ) ,
   deptno varchar2(6)
    constraint emp1_deptno_fk references dept2(dcode)
);



create table new_emp2(
    no number(4) primary key,
    name varchar2(20) not null ,
    jumin varchar2(13) not null unique,
    loc_code number(1) check( loc_code <5),
    deptno varchar2(6) references dept2(dcode )
);

create table test_2021
( id varchar2(7) not null , email varchar2(50) null , phone char(13) not null, pwd varchar2(7) default '111'
);

insert into test_2021 (id ,email, phone)
values('test01' , 'aaa@naver.com' ,'010-111-222');
commit;

create table test_2021_2
(
 id varchar2(50) null , phone varchar2(20) check (phone like '010-%-____') not null , email varchar2(50) null
);

insert into test_2021_2(id, phone) values('test01','0110101');

create table test_2021_0
(
 id varchar2(50) not null, email varchar2(200) null , phone char(13) not null,
 pwd varchar2(200) default '111' ,
 grade CHAR(2) CHECK( grade IN ('01', '02', '03'))
);



insert into test_2021_0 ( id, phone, grade)
values ('test01', '010-111-222' ,'01');





create table test_2021_3
(
 id varchar2(7) not null primary key , email varchar2(50) , phone char(13) unique , pwd varchar2(10)
);

insert into test_2021_3 values('a10' , 'aaa@naver.com' ,'010-111-2222' , '111');
insert into test_2021_3 values('b10' , 'bbb@naver.com' ,'010-222-3333' , '222');

select * from test_2021_3;

insert into test_2021_3 values('b10' , 'ccc@naver.com' ,'010-333-4444' , '333');
insert into test_2021_3 values('c10' , 'ddd@naver.com' ,'010-119-2222' , '111');


create table mem_tbl (
id varchar2(5) not null primary key , name varchar2(10) not null , addr varchar2(10)
);
insert into mem_tbl values( 'a1' , '홍길동' , '서울') ;
insert into mem_tbl values( 'a2' , '홍길순', '부산');

commit;


create table ord_tbl (
no varchar2(5) not null primary key , qty number(4) , cus_no varchar2(5)
);


insert into ord_tbl values( 'j01' , 3, 'a1' );
insert into ord_tbl values( 'j02' , 1, 'a1' );
insert into ord_tbl values( 'j03' , 7, 'a2' );
insert into ord_tbl values( 'j04' , 7, 'a3' );

commit;
