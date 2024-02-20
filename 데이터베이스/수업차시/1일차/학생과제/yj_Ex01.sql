select * from emp;


create table  acorntbl (
    id  varchar2(10) primary key,
    pw  varchar2(10) ,
    name varchar2(10)
);


select *  from  acorntbl ;
insert into acorntbl values('dy', '4482', '곽단야');
insert into acorntbl values('mg','1234', '김민규');
insert into acorntbl  values('mj' ,'0000' , '김민지');
insert into acorntbl  values('bj','6666','김병진');
insert into acorntbl values('jy', '1127', '김재열');
insert into acorntbl values('hs', '0317', '김현수');
insert into acorntbl values('nj','9876','문나정');
insert into acorntbl values('jw', '1111', '박지원'); 
insert into acorntbl values('tm', '4482', '박태민');
insert into acorntbl values('yj','0117','서예진'); 
insert into acorntbl values('y','1126','이윤');
insert into acorntbl values('yj2','0625','이윤정');
insert into acorntbl values('jh','6789','이정훈');
insert into acorntbl  values('ek', '1234', '조은경');
insert into acorntbl values('jt','1234','표준태');
insert into acorntbl values('jh1', '7777', '허재혁');
insert into acorntbl values('jh2', '9999', '허재화');
commit;

select * from acorntbl;

-- 김씨 조회
select * from acorntbl where name like '김%';

select * from acorntbl where name like '이%';

-- sql  :  DBMS (데이터베이스관리시스템 sw + 소프트웨어 + 데이터베이스 ) 오라클 11
-- sql : DBMS에 질의하는 언어 (문법이 있다)

--DML  (insert -> create, select-read , update , delete) CRUD
--DDL  
--DCL


--조회하기
-- select 컬럼명 , 컬럼명 .. from 테이블명 ;
-- * (모든컬럼)
-- 테이블 스키마, 테이블 구조 확인 명령어 desc 테이블명
desc emp;
-- 모든 컬럼 조회하기
SELECT * FROM emp;



-- 원하는 컬럼만 조회하기
select empno, ename, job
from emp;



 create table professor
(profno number(4) primary key,
 name  varchar2(20) not null, 
 id  varchar2(15) not null,
 position varchar2 (30) not null,
 pay number (3) not null,
 hiredate  date not null,
 bonus number(4) ,
 deptno  number(3),
 email  varchar2(50),
 hpage  varchar2(50));
 
 
 insert into professor
values(1001,'Audie Murphy','Murphy','a full professor',550,to_date('1980-06-23','YYYY-MM-DD'),100,101,'captain@abc.net','http://www.abc.net');

insert into professor
values(1002,'Angela Bassett','Bassett','assistant professor',380,to_date('1987-01-30','YYYY-MM-DD'),60,101,'sweety@abc.net','http://www.abc.net');

insert into professor
values (1003,'Jessica Lange','Lange','instructor',270,to_date('1998-03-22','YYYY-MM-DD'),null,101,'pman@power.com','http://www.power.com');

insert into professor
values (2001,'Winona Ryder','Ryder','instructor',250,to_date('2001-09-01','YYYY-MM-DD'),null,102,'lamb1@hamail.net',null);

insert into professor
values (2002,'Michelle Pfeiffer','Pfeiffer','assistant professor',350,to_date('1985-11-30','YYYY-MM-DD'),80,102,'number1@naver.com','http://num1.naver.com');

insert into professor
values (2003,'Whoopi Goldberg','Goldberg','a full professor',490,to_date('1982-04-29','YYYY-MM-DD'),90,102,'bdragon@naver.com',null);

insert into professor
values (3001,'Emma Thompson','Thompson','a full professor',530,to_date('1981-10-23','YYYY-MM-DD'),110,103,'angel1004@hanmir.com',null);

insert into professor
values (3002,'Julia Roberts','Roberts','assistant professor',330,to_date('1997-07-01','YYYY-MM-DD'),50,103,'naone10@empal.com',null);

insert into professor
values (3003,'Sharon Stone','Stone','instructor',290,to_date('2002-02-24','YYYY-MM-DD'),null,103,'only_u@abc.com',null);

insert into professor
values (4001,'Meryl Streep','Streep','a full professor',570,to_date('1981-10-23','YYYY-MM-DD'),130,201,'chebin@daum.net',null);

insert into professor
values (4002,'Susan Sarandon','Sarandon','assistant professor',330,to_date('2009-08-30','YYYY-MM-DD'),null,201,'gogogo@def.com',null);

insert into professor
values (4003,'Nicole Kidman','Kidman','assistant professor',310,to_date('1999-12-01','YYYY-MM-DD'),50,202,'mypride@hanmail.net',null);

insert into professor
values (4004,'Holly Hunter','Hunter','instructor',260,to_date('2009-01-28','YYYY-MM-DD'),null,202,'ironman@naver.com',null);

insert into professor
values (4005,'Meg Ryan','Ryan','a full professor',500,to_date('1985-09-18','YYYY-MM-DD'),80,203,'standkang@naver.com',null);

insert into professor 
values (4006,'Andie Macdowell','Macdowell','instructor',220,to_date('2010-06-28','YYYY-MM-DD'),null,301,'napeople@jass.com',null);

insert into professor
values (4007,'Jodie Foster','Foster','assistant professor',290,to_date('2001-05-23','YYYY-MM-DD'),30,301,'silver-her@daum.net',null);

commit;

 
create table department
( deptno number(3) primary key ,
  dname varchar2(50) not null,
  part number(3),
  build  varchar2(30)) ;
 

insert into department 
values (101,'Computer Engineering',100,'Information Bldg');

insert into department
values (102,'Multimedia Engineering',100,'Multimedia Bldg');

insert into department
values (103,'Software Engineering',100,'Software Bldg');

insert into department
values (201,'Electronic Engineering',200,'Electronic Control Bldg');

insert into department
values (202,'Mechanical Engineering',200,'Machining Experiment Bldg');

insert into department
values (203,'Chemical Engineering',200,'Chemical Experiment Bldg');

insert into department
values (301,'Library and Information science',300,'College of Liberal Arts');

insert into department
values (100,'Department of Computer Information',10,null);

insert into department
values (200,'Department of Mechatronics',10,null);

insert into department
values (300,'Department of Humanities and Society',20,null);

insert into department
values (10,'College of Engineering',null,null);

insert into department
values (20,'College of Liberal Arts',null,null);

commit;
 
 
create table student
( studno number(4) primary key,
  name   varchar2(30) not null,
  id varchar2(20) not null unique,
  grade number check(grade between 1 and 6),
  jumin char(13) not null,
  birthday  date,
  tel varchar2(15),
  height  number(4),
  weight  number(3),
  deptno1 number(3),
  deptno2 number(3),
  profno  number(4));
 

insert into student values (
9411,'James Seo','75true',4,'7510231901813',to_date('1975-10-23','YYYY-MM-DD'),'055)381-2158',180,72,101,201,1001);

insert into student values (
9412,'Rene Russo','Russo',4,'7502241128467',to_date('1975-02-24','YYYY-MM-DD'),'051)426-1700',172,64,102,null,2001);

insert into student values (
9413,'Sandra Bullock','Bullock',4,'7506152123648',to_date('1975-06-15','YYYY-MM-DD'),'053)266-8947',168,52,103,203,3002);

insert into student values (
9414,'Demi Moore','Moore',4,'7512251063421',to_date('1975-12-25','YYYY-MM-DD'),'02)6255-9875',177,83,201,null,4001);

insert into student values (
9415,'Danny Glover','Glover',4,'7503031639826',to_date('1975-03-03','YYYY-MM-DD'),'031)740-6388',182,70,202,null,4003);

insert into student values (
9511,'Billy Crystal','Crystal',3,'7601232186327',to_date('1976-01-23','YYYY-MM-DD'),'055)333-6328',164,48,101,null,1002);

insert into student values (
9512,'Nicholas Cage','Cage',3,'7604122298371',to_date('1976-04-12','YYYY-MM-DD'),'051)418-9627',161,42,102,201,2002);

insert into student values (
9513,'Micheal Keaton','Keaton',3,'7609112118379',to_date('1976-09-11','YYYY-MM-DD'),'051)724-9618',177,55,202,null,4003);

insert into student values (
9514,'Bill Murray','Murray',3,'7601202378641',to_date('1976-01-20','YYYY-MM-DD'),'055)296-3784',160,58,301,101,4007);

insert into student values (
9515,'Macaulay Culkin','Culkin',3,'7610122196482',to_date('1976-10-12','YYYY-MM-DD'),'02)312-9838',171,54,201,null,4001);

insert into student values (
9611,'Richard Dreyfus','Dreyfus',2,'7711291186223',to_date('1977-11-29','YYYY-MM-DD'),'02)6788-4861',182,72,101,null,1002);

insert into student values (
9612,'Tim Robbins','Robbins',2,'7704021358674',to_date('1977-04-02','YYYY-MM-DD'),'055)488-2998',171,70,102,null,2001);

insert into student values (
9613,'Wesley Snipes','Snipes',2,'7709131276431',to_date('1977-09-13','YYYY-MM-DD'),'053)736-4981',175,82,201,null,4002);

insert into student values (
9614,'Steve Martin','Martin',2,'7702261196365',to_date('1977-02-26','YYYY-MM-DD'),'02)6175-3945',166,51,201,null,4003);

insert into student values (
9615,'Daniel Day-Lewis','Day-Lewis',2,'7712141254963',to_date('1977-12-14','YYYY-MM-DD'),'051)785-6984',184,62,301,null,4007);

insert into student values (
9711,'Danny Devito','Devito',1,'7808192157498',to_date('1978-08-19','YYYY-MM-DD'),'055)278-3649',162,48,101,null,null);

insert into student values (
9712,'Sean Connery','Connery',1,'7801051776346',to_date('1978-01-05','YYYY-MM-DD'),'02)381-5440',175,63,201,null,null);

insert into student values (
9713,'Christian Slater','Slater',1,'7808091786954',to_date('1978-08-09','YYYY-MM-DD'),'031)345-5677',173,69,201,null,null);

insert into student values (
9714,'Charlie Sheen','Sheen',1,'7803241981987',to_date('1978-03-24','YYYY-MM-DD'),'055)423-9870',179,81,102,null,null);

insert into student values (
9715,'Anthony Hopkins','Hopkins',1,'7802232116784',to_date('1978-02-23','YYYY-MM-DD'),'02)6122-2345',163,51,103,null,null);

commit;

 

CREATE TABLE EMP2 (
 EMPNO       NUMBER  PRIMARY KEY,
 NAME        VARCHAR2(30) NOT NULL,
 BIRTHDAY    DATE,
 DEPTNO      VARCHAR2(06) NOT NULL,
 EMP_TYPE    VARCHAR2(30),
 TEL         VARCHAR2(15),
 HOBBY       VARCHAR2(30),
 PAY         NUMBER,
 POSITION    VARCHAR2(30),
 PEMPNO      NUMBER );
 

INSERT INTO EMP2 VALUES (19900101,'Kurt Russell',TO_DATE('19640125','YYYYMMDD'),'0001','Permanent employee','054)223-0001','music',100000000,'Boss',null);
INSERT INTO EMP2 VALUES (19960101,'AL Pacino',TO_DATE('19730322','YYYYMMDD'),'1000','Permanent employee','02)6255-8000','reading',72000000,'Department head',19900101);
INSERT INTO EMP2 VALUES (19970201,'Woody Harrelson',TO_DATE('19750415','YYYYMMDD'),'1000','Permanent employee','02)6255-8005','Fitness',50000000,'Section head',19960101);
INSERT INTO EMP2 VALUES (19930331,'Tommy Lee Jones',TO_DATE('19760525','YYYYMMDD'),'1001','Perment employee','02)6255-8010','bike',60000000,'Deputy department head',19960101);
INSERT INTO EMP2 VALUES (19950303,'Gene Hackman',TO_DATE('19730615','YYYYMMDD'),'1002','Perment employee','02)6255-8020','Marathon',56000000,'Section head',19960101);
INSERT INTO EMP2 VALUES (19966102,'Kevin Bacon',TO_DATE('19720705','YYYYMMDD'),'1003','Perment employee','052)223-4000','Music',75000000,'Department head',19900101);
INSERT INTO EMP2 VALUES (19930402,'Hugh Grant',TO_DATE('19720815','YYYYMMDD'),'1004','Perment employee','042)998-7005','Climb',51000000,'Section head',19966102);
INSERT INTO EMP2 VALUES (19960303,'Keanu Reeves',TO_DATE('19710925','YYYYMMDD'),'1005','Perment employee','031)564-3340','Climb',35000000,'Deputy Section chief',19966102);
INSERT INTO EMP2 VALUES (19970112,'Val Kilmer',TO_DATE('19761105','YYYYMMDD'),'1006','Perment employee','054)223-4500','Swim',68000000,'Department head',19900101);
INSERT INTO EMP2 VALUES (19960212,'Chris O''Donnell',TO_DATE('19721215','YYYYMMDD'),'1007','Perment employee','054)223-4600',null,49000000,'Section head',19970112);
INSERT INTO EMP2 VALUES (20000101,'Jack Nicholson',TO_DATE('19850125','YYYYMMDD'),'1008','Contracted Worker','051)123-4567','Climb', 30000000,'',19960212);
INSERT INTO EMP2 VALUES (20000102,'Denzel Washington',TO_DATE('19830322','YYYYMMDD'),'1009','Contracted Worker','031)234-5678','Fishing', 30000000,'',19960212);
INSERT INTO EMP2 VALUES (20000203,'Richard Gere',TO_DATE('19820415','YYYYMMDD'),'1010','Contracted Worker','02)2345-6789','Baduk', 30000000,'',19960212);
INSERT INTO EMP2 VALUES (20000334,'Kevin Costner',TO_DATE('19810525','YYYYMMDD'),'1011','Contracted Worker','053)456-7890','Singing', 30000000,'',19960212);
INSERT INTO EMP2 VALUES (20000305,'JohnTravolta',TO_DATE('19800615','YYYYMMDD'),'1008','Probation','051)567-8901','Reading book', 22000000,'',19960212);
INSERT INTO EMP2 VALUES (20006106,'Robert De Niro',TO_DATE('19800705','YYYYMMDD'),'1009','Probation','031)678-9012','Driking',   22000000,'',19960212);
INSERT INTO EMP2 VALUES (20000407,'Sly Stallone',TO_DATE('19800815','YYYYMMDD'),'1010','Probation','02)2789-0123','Computer game', 22000000,'',19960212);
INSERT INTO EMP2 VALUES (20000308,'Tom Cruise',TO_DATE('19800925','YYYYMMDD'),'1011','Intern','053)890-1234','Golf', 20000000,'',19960212);
INSERT INTO EMP2 VALUES (20000119,'Harrison Ford',TO_DATE('19801105','YYYYMMDD'),'1004','Intern','042)901-2345','Drinking',   20000000,'',19930402);
INSERT INTO EMP2 VALUES (20000210,'Clint Eastwood',TO_DATE('19801215','YYYYMMDD'),'1005','Intern','031)345-3456','Reading book', 20000000,'',19960303);
COMMIT;

 

CREATE TABLE DEPT2 (
 DCODE   VARCHAR2(06)  PRIMARY KEY,
 DNAME   VARCHAR2(30) NOT NULL,
 PDEPT VARCHAR2(06) ,
 AREA        VARCHAR2(30)) ;
 

INSERT INTO DEPT2 VALUES ('0001','President','','Pohang Main Office');
INSERT INTO DEPT2 VALUES ('1000','Management Support Team','0001','Seoul Branch Office');
INSERT INTO DEPT2 VALUES ('1001','Financial Management Team','1000','Seoul Branch Office');
INSERT INTO DEPT2 VALUES ('1002','General affairs','1000','Seoul Branch Office');
INSERT INTO DEPT2 VALUES ('1003','Engineering division','0001','Pohang Main Office');
INSERT INTO DEPT2 VALUES ('1004','H/W Support Team','1003','Daejeon Branch Office');
INSERT INTO DEPT2 VALUES ('1005','S/W Support Team','1003','Kyunggi Branch Office');
INSERT INTO DEPT2 VALUES ('1006','Business Department','0001','Pohang Main Office');
INSERT INTO DEPT2 VALUES ('1007','Business Planning Team','1006','Pohang Main Office');
INSERT INTO DEPT2 VALUES ('1008','Sales1 Team','1007','Busan Branch Office');
INSERT INTO DEPT2 VALUES ('1009','Sales2 Team','1007','Kyunggi Branch Office');
INSERT INTO DEPT2 VALUES ('1010','Sales3 Team','1007','Seoul Branch Office');
INSERT INTO DEPT2 VALUES ('1011','Sales4 Team','1007','Ulsan Branch Office');

commit;

 

CREATE TABLE cal
   (weekno  varchar2(1),
    day   varchar2(5),
    dayno varchar2(2)) ;

insert into cal values ('1','SUN','1');
insert into cal values ('1','MON','2');
insert into cal values ('1','TUE','3');
insert into cal values ('1','WED','4');
insert into cal values ('1','THU','5');
insert into cal values ('1','FRI','6');
insert into cal values ('1','SAT','7');
insert into cal values ('2','SUN','8');
insert into cal values ('2','MON','9');
insert into cal values ('2','TUE','10');
insert into cal values ('2','WED','11');
insert into cal values ('2','THU','12');
insert into cal values ('2','FRI','13');
insert into cal values ('2','SAT','14');
insert into cal values ('3','SUN','15');
insert into cal values ('3','MON','16');
insert into cal values ('3','TUE','17');
insert into cal values ('3','WED','18');
insert into cal values ('3','THU','19');
insert into cal values ('3','FRI','20');
insert into cal values ('3','SAT','21');
insert into cal values ('4','SUN','22');
insert into cal values ('4','MON','23');
insert into cal values ('4','TUE','24');
insert into cal values ('4','WED','25');
insert into cal values ('4','THU','26');
insert into cal values ('4','FRI','27');
insert into cal values ('4','SAT','28');
insert into cal values ('5','SUN','29');
insert into cal values ('5','MON','30');
insert into cal values ('5','TUE','31');
commit ;
 

create table gift
( gno  number ,
  gname varchar2(30) ,
  g_start  number ,
  g_end  number ) ;

insert into gift values(1,'Tuna Set',1,100000);
insert into gift values(2,'Shampoo Set',100001,200000);
insert into gift values(3,'Car wash Set',200001,300000);
insert into gift values(4,'Kitchen Supplies Set',300001,400000);
insert into gift values(5,'Mountain bike',400001,500000);
insert into gift values(6,'LCD Monitor',500001,600000);
insert into gift values(7,'Notebook',600001,700000);
insert into gift values(8,'Wall-Mountable TV',700001,800000);
insert into gift values(9,'Drum Washing Machine',800001,900000);
insert into gift values(10,'Refrigerator',900001,1000000);
commit ;

 
 

create table customer
(gno  number(8) ,
 gname varchar2(30) ,
 jumin char(13) ,
 point number) ;

insert into customer values (20010001,'James Seo','7510231369824',980000);
insert into customer values (20010002,'Mel Gibson','7502241128467',73000);
insert into customer values (20010003,'Bruce Willis','7506152123648',320000);
insert into customer values (20010004,'Bill Pullman','7512251063421',65000);
insert into customer values (20010005,'Liam Neeson','7503031639826',180000);
insert into customer values (20010006,'Samuel Jackson','7601232186327',153000);
insert into customer values (20010007,'Ahnjihye','7604212298371',273000);
insert into customer values (20010008,'Jim Carrey','7609112118379',315000);
insert into customer values (20010009,'Morgan Freeman','7601202378641',542000);
insert into customer values (20010010,'Arnold Scharz','7610122196482',265000);
insert into customer values (20010011,'Brad Pitt','7711291186223',110000);
insert into customer values (20010012,'Michael Douglas','7704021358674',99000);
insert into customer values (20010013,'Robin Williams','7709131276431',470000);
insert into customer values (20010014,'Tom Hanks','7702261196365',298000);
insert into customer values (20010015,'Angela Bassett','7712141254963',420000);
insert into customer values (20010016,'Jessica Lange','7808192157498',598000);
insert into customer values (20010017,'Winona Ryder','7801051776346',625000);
insert into customer values (20010018,'Michelle Pfeiffer','7808091786954',670000);
insert into customer values (20010019,'Whoopi Goldberg','7803242114563',770000);
insert into customer values (20010020,'Emma Thompson','7802232116784',730000);
commit ;

 

create table hakjum
(grade char(3) ,
 min_point  number ,
 max_point  number ) ;

insert into hakjum values ('A+',96,100);
insert into hakjum values ('A0',90,95);
insert into hakjum values ('B+',86,89);
insert into hakjum values ('B0',80,85);
insert into hakjum values ('C+',76,79);
insert into hakjum values ('C0',70,75);
insert into hakjum values ('D',0,69);
commit;
 

create table score
(studno  number ,
 total number) ;

insert into score values (9411,97);
insert into score values (9412,78);
insert into score values (9413,83);
insert into score values (9414,62);
insert into score values (9415,88);
insert into score values (9511,92);
insert into score values (9512,87);
insert into score values (9513,81);
insert into score values (9514,79);
insert into score values (9515,95);
insert into score values (9611,89);
insert into score values (9612,77);
insert into score values (9613,86);
insert into score values (9614,82);
insert into score values (9615,87);
insert into score values (9711,91);
insert into score values (9712,88);
insert into score values (9713,82);
insert into score values (9714,83);
insert into score values (9715,84);

commit ;
 

create table p_grade
( position  varchar2(30) ,
  s_age number ,
  e_age number ,
  s_year number ,
  e_year number ,
  s_pay  number ,
  e_pay  number ) ;

insert into p_grade values ('Manager',0,24,1,2,12000000,29990000);
insert into p_grade values ('Deputy Section chief',25,28,3,5,30000000,45000000);
insert into p_grade values ('Section head',29,32,6,8,45010000,51000000);
insert into p_grade values ('Deputy department head',33,36,9,10,51010000,60000000);
insert into p_grade values ('Department head',37,40,11,13,60010000,75000000);
insert into p_grade values ('Director',41,55,14,99,75010000,100000000);
commit ;
 

CREATE TABLE t_reg
( text varchar2(10))  ;

INSERT ALL
INTO t_reg VALUES('ABC123')
INTO t_reg VALUES('ABC 123')
INTO t_reg VALUES('ABC  123')
INTO t_reg VALUES('abc 123')
INTO t_reg VALUES('abc  123')
INTO t_reg VALUES('a1b2c3')
INTO t_reg VALUES('aabbcc123')
INTO t_reg VALUES('?/!@#$*&')
INTO t_reg VALUES('\~*().,')
INTO t_reg VALUES(123123)
INTO t_reg VALUES('123abc')
INTO t_reg VALUES('abc')
SELECT  *  FROM dual ;

commit;
 
CREATE TABLE p_01
(no  number ,
 name varchar2(15) );

CREATE TABLE p_02
(no number ,
 name varchar2(15) );

 
create table pt_01
(sno varchar2(8) , pno char(4) , qty number , price  number);

create table pt_02
(sno varchar2(8) , pno char(4) , qty number , price number);

create table p_total
(sno  varchar2(8) , pno char(4) , qty number , price number);

INSERT ALL
 INTO pt_01 VALUES ('12010101','1000',1,500)
 INTO pt_01 VALUES ('12010102','1001',1,400)
 INTO pt_01 VALUES ('12010103','1003',1,300)
 INTO pt_02 VALUES ('12010201','1004',1,600)
 INTO pt_02 VALUES ('12010202','1000',1,500)
 INTO pt_02 VALUES ('12010203','1005',1,700)
 SELECT * FROM dual ;

commit;

 

CREATE TABLE dml_err_test
( no number primary key,
  name varchar2(10)) tablespace example;

INSERT ALL
INTO dml_err_test VALUES (1,'AAA')
INTO dml_err_test VALUES (2,'BBB')
SELECT  * FROM dual ;

commit ;
 

CREATE TABLE t_novalidate
( no number primary key ,
  name varchar2(10) not null ) tablespace example;

INSERT INTO t_novalidate VALUES(1,'AAA');
INSERT INTO t_novalidate VALUES(2,'BBB');
INSERT INTO t_novalidate VALUES(3,'CCC');
COMMIt ;
 
 

CREATE TABLE product
( p_code  number(3) primary key,
  p_name varchar2(20) not null ,
  p_price  number);


insert into product values (100,'Shrimp snack',800);
insert into product values (101,'Patato snack',900);
insert into product values (102,'Peanut snack',1000);
insert into product values (103,'Sesame snack',900);
insert into product values (104,'Onion snack',800);
insert into product values (105,'Sweet potato snack',1500);
commit;

 

create table panmae
( p_date varchar2(8) not null,
  p_code number not null,
  p_qty  number ,
  p_total number ,
  p_store varchar2(5) ) ;


insert into panmae values ('20110101',100,3,2400,'1000');
insert into panmae values ('20110101',101,5,4500,'1001');
insert into panmae values ('20110101',102,2,2000,'1003');
insert into panmae values ('20110101',103,6,5400,'1004');
insert into panmae values ('20110102',102,2,2000,'1000');
insert into panmae values ('20110102',103,5,4500,'1002');
insert into panmae values ('20110102',104,3,2400,'1002');
insert into panmae values ('20110102',105,2,3000,'1000');
insert into panmae values ('20110103',100,10,8000,'1004');
insert into panmae values ('20110103',100,2,1600,'1000');
insert into panmae values ('20110103',100,3,2400,'1001');
insert into panmae values ('20110103',101,4,3600,'1003');
insert into panmae values ('20110104',100,2,1600,'1002');
insert into panmae values ('20110104',100,4,3200,'1003');
insert into panmae values ('20110104',100,5,4000,'1004');
insert into panmae values ('20110104',101,3,2700,'1001');
insert into panmae values ('20110104',101,4,3600,'1002');
insert into panmae values ('20110104',101,3,2700,'1003');
insert into panmae values ('20110104',102,4,4000,'1001');
insert into panmae values ('20110104',102,2,2000,'1002');
insert into panmae values ('20110104',103,2,1800,'1003');


commit;

 
create table member
(no number(4) not null ,
 name varchar2(20) not null ,
 jumin char(13) primary key ,
 passwd varchar2(10) not null ,
 id  varchar2(10) not null unique ,
 an_key varchar2(10) ,
 an_key_dap  varchar2(15) );

insert into member
 values (1001,'Nicholas Cage','7510231234567','a1234','simson','wife?','Jodie Foster') ;

insert into member
 values(1002,'Jodie Foster','7509222345678','b1234','bobby','husband?','Nicholas Cage') ;

insert into member
 values (1003,'Macaulay Culkin','1410234567890','c1234','daddy','father?','Nicholas Cage');

insert into member
 values (1004,'Nicole Kidman','1609223456789','d1234','mommy','Mather?','Jodie Foster') ;



commit;
 
create table t_reg2
(no number , 
 ip varchar2(20));

insert into t_reg2 values (1,'10.10.0.1') ;
insert into t_reg2 values (2,'10.10.10.1') ;
insert into t_reg2 values (3,'172.16.5.100') ;
insert into t_reg2 values (4,'172.61.186.2') ;
insert into t_reg2 values (5,'172.61.168.2') ;
insert into t_reg2 values (6,'255.255.255.0') ;
commit;

 
create table fruit (name varchar2(10) , price number(5)) tablespace example;
insert into fruit values ('apple' , 100) ;
insert into fruit values ('grape' , 200) ;
insert into fruit values ('orange' ,300) ;
commit;

 

create table loan
( l_date varchar2(8) not null,
  l_code number not null,
  l_qty  number ,
  l_total number ,
  l_store varchar2(5) ) ;


insert into loan values ('20110101',100,3,2400,'1000');
insert into loan values ('20110101',101,5,4500,'1001');
insert into loan values ('20110101',102,2,2000,'1003');
insert into loan values ('20110101',103,6,5400,'1004');
insert into loan values ('20110102',102,2,2000,'1000');
insert into loan values ('20110102',103,5,4500,'1002');
insert into loan values ('20110102',104,3,2400,'1002');
insert into loan values ('20110102',105,2,3000,'1000');
insert into loan values ('20110103',100,10,8000,'1004');
insert into loan values ('20110103',100,2,1600,'1000');
insert into loan values ('20110103',100,3,2400,'1001');
insert into loan values ('20110103',101,4,3600,'1003');
insert into loan values ('20110104',100,2,1600,'1002');
insert into loan values ('20110104',100,4,3200,'1003');
insert into loan values ('20110104',100,5,4000,'1004');
insert into loan values ('20110104',101,3,2700,'1001');
insert into loan values ('20110104',101,4,3600,'1002');
insert into loan values ('20110104',101,3,2700,'1003');
insert into loan values ('20110104',102,4,4000,'1001');
insert into loan values ('20110104',102,2,2000,'1002');
insert into loan values ('20110104',103,2,1800,'1003');

 

CREATE TABLE EMP ( 
  EMPNO     NUMBER(4, 0), 
  ENAME     VARCHAR2(10), 
  JOB       VARCHAR2(9), 
  MGR       NUMBER(4, 0), 
  HIREDATE  DATE, 
  SAL       NUMBER(7, 2),
  COMM      NUMBER(7, 2), 
  DEPTNO    NUMBER(2, 0));

insert into emp values (7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
insert into emp values (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
insert into emp values (7521,'WARD','SALESMAN',7698,'1982-02-22',1250,500,30);
insert into emp values (7566,'JONES','MANAGER',7839,'1981-04-02',2975,null,20);
insert into emp values (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
insert into emp values (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,null,30);
insert into emp values (7782,'CLARK','MANAGER',7839,'1981-06-09',2450,null,10);
--insert into emp values (7788,'SCOTT','ANALYST',7566,'1987-04-17',3000,null,20);
insert into emp values (7839,'KING','PRESIDENT',null,'1981-11-17',5000,null,10);
insert into emp values (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
--insert into emp values (7876,'ADAMS','CLERK',7788,'1987-05-23',1100,null,20);
insert into emp values (7900,'JAMES','CLERK',7698,'1981-12-03',950,null,30);
insert into emp values (7902,'FORD','ANALYST',7566,'1981-12-03',3000,null,20);
insert into emp values (7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10); 

CREATE TABLE DEPT (
  DEPTNO   NUMBER(2,0), 
  DNAME    VARCHAR2(14), 
  LOC      VARCHAR2(13)) ;

insert into dept values (10,'ACCOUNTING','NEW YORK');
insert into dept values (20,'RESEARCH','DALLAS');
insert into dept values (30,'SALES','CHICAGO');
insert into dept values (40,'OPERATIONS','BOSTON');

 
commit;


select * from professor;

select name n, 'good ''morining!!!'  "test"
from professor;

-- 컬럼별칭 사용하여 출력하기
-- 컬럼명 뒤에 as 생략 가능  " 별칭명  " (공백도 들어갈 수 있음)

select profno  "Pro's No", name  as  "Pro's Name", pay
from professor;


-- distinct 중복된 값을 제거하고 출력하기


select DEPTNO from emp;
select distinct DEPTNO from emp;



-- 연결 연산자 ||  컬럼명 연결해서 조회하고 싶을 때 사용

select ename || '님' as ename, job from emp;

select ename || ' ' || 'job' from emp;


-- 원하는 조건만 골라내기 -where절 사용


select empno, ename
from emp
where empno = 7900;


select empno, ename, sal
from emp
where sal < 900;


select empno, sal, ename
from emp
where sal > 1500;


select * from acorntbl;
select * from acorntbl where name like '김%';

select * from emp;
-- where 절에서의 연산자
select * from emp where job = 'CLERK';

-- !-, <> 같지 않다
select * from emp where job != 'CLERK';


--> 크다, 초과
select * from emp where sal > 1200;


-- 컬럼이나 테이블명 대소문자 상관없음
-- 데이타는 대소문자를 구분해야 합니다.


-- >= 이상
select * from emp where sal >= 950;


-- < 미만
select * from emp where comm < 300;


-- <= 이하
select * from emp where comm <= 300;


-- between a and b a와 b 사이에 있는 범위의 값 조회  ( 앞에는 작은 거, 뒤에는 큰 거)
select * from emp where sal between 1200 and 3000;


-- and  (조건이 여러 개 있을 때 모두 만족하는 조건)
select * from emp where job = 'CLERK' and sal = 1300;
select * from emp where empno = 7934;


-- or (조건 중에서 하나라도 만족하는 조건)
select * from emp where job='SALESMAN' or sal > 1200;

select * from emp where sal >= 1200 or sal <= 2000;


-- in 연산자
select * from emp where deptno in (10,20);
select * from emp where deptno = 10 or deptno = 20;

-- where deptno = 10 or deptno = 20;


-- like 연산자로 비슷한 것들 모두 찾기 %(0이상), _(한 자리) __ (두 자리)
select * from emp where job like 'S%';    -- 시작이 s이고 뒤에는 상관없다
select * from emp where job like '%N'; --끝의 글자가 s인 경우의 모든 것 찾겠다
select * from emp where job like '%N%'; -- job 컬럼에 N 문자가 포함된 것을 모두 찾겠다


select * from emp where sal like '1%';


select * from emp where ename like 'W___';
-- W로 시작하고 자릿수는 세 개가 온다

-- 문자,  날짜 표현시 '' 표시해야 함
select * from emp where hiredate >= '80/12/17';   -- 이 날 이상인 날짜만 출력


-- null 값   is null is not null
-- null 값을 확인할 때는 is null, is not null
select * from emp;
-- 데이터베이스에서 컬럼의 값이 null인 것은 값이 정해지지 않은 것을 의미한다. 주의사항 !! => 0의 의미 아니다.
-- 값이 null인 것을 조회할 때는 = 같다라는 조건을 사용 못함  =  is null 사용해야 함


select * from emp where comm is null;
select * from emp where comm is not null;


-- null값을 다룰 때 주의 사항
-- 예시) comm 컬럼에 값을 +100 증가된 값으로 조회를 한다면 결과는?
-- null+100 =>  오류날 것 같아요
-- null은 정해지지 않은 값을 의미하므로 여기에 어떤 연산을 수행해도 정해지지 않은 값으로 인식함

select ename, sal, comm+100 from emp;

-- select ename, sal, nvl(comm, 0) from emp;
-- order by 절 사용 컬럼명 명시, 컬럼의 순서
select * from emp order by sal desc ; -- 봉급 내림차순

select job, sal from emp order by sal desc;
select job, sal from emp order by 2 desc;


select * from emp
order by deptno , sal desc;


-- 집합연산자 (union 행합치기)
-- union , union all , intersect, minus
-- 회원테이블(모든 회원정보가 있는 테이블)
-- 서울회원 회원테이블, 경기도회원테이블, 부산회원테이블
-- 전체 회원을 조회할 때 union을 사용함 (중복제거, 정렬해줌)

-- 주의사항 : 컬럼수, 컬럼타입이 같아야 함



create table member_tbl_11(
m_id varchar2(5) not null primary key , m_pw varchar2(5) , m_name varchar2(10) , m_tel varchar2(13) , m_birthday date , m_point number(6) , m_grade varchar2(2) 
);
commit;


insert into member_tbl_11 values ('m100' , '1234' , '성기훈', '010-1111-2222' , '2004-01-01' , 100, '01');
insert into member_tbl_11 values ('m101' , '4444' , '김상우', '010-2222-3333' , '2004-01-01' , 1500, '01');
insert into member_tbl_11 values ('m102' , '5555' , '김일남', '010-3333-4444' , '2004-12-10' , 2000, '02');
insert into member_tbl_11 values ('m103' , '6666' , '이준호', '010-4444-5555' , '2004-04-10' , 1900, '02');
insert into member_tbl_11 values ('m104' , '7777' , '김새벽', '010-5555-6666' , '2004-09-12' , 3000, '03');
insert into member_tbl_11 values ('m105' , '8888' , '최덕수', '010-6666-7777' , '2004-08-10' , 4800, '03');
insert into member_tbl_11 values ('m106' , '9999' , '이알리', '010-7777-8888' , '2004-07-10' , 2900, '01');
insert into member_tbl_11 values ('m107' , '0101' , '김미녀', '010-8888-9999' , '2004-06-09' , 1200, '01');
insert into member_tbl_11 values ('m108' , '0404' , '이정재', '010-9999-8888' , '2004-05-19' , 3000, '03');
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday) 
values ('m109' , '0448' , '박해수', '010-7878-1111' , '2004-11-27' );
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday) 
values ('m110' , '4848' , '위하준', '010-8888-9090' , '2004-11-09');
commit;


-- 1. 모든 정보 조회 * 모든 칼럼
select * from member_tbl_11;

-- 2. 모든 고객의 이름과 생일 정보 조회하시오
select M_NAME, M_BIRTHDAY from member_tbl_11;


-- 3. 이름이 박해수인 고객아이디, 생일, 포인트 정보 조회하시오
select M_ID, M_POINT, M_BIRTHDAY from member_tbl_11 where M_NAME like '박해수';


-- 4. 포인트가 2000점 이상인 고객 이름, 전화번호 정보 조회하시오
select M_NAME, M_TEL, M_POINT from member_tbl_11 where M_POINT >= 2000;

-- 5. 포인트가 2000점에서 3000점 사이의 고객이름, 전화번호 정보 조회하시오
select * from member_tbl_11 where M_POINT between 2000 and 3000;

-- 6. 고객등급이 ‘01’인 고객이름, 전화번호 , 포인트 정보 조회하시오
select M_NAME, M_TEL, M_POINT from member_tbl_11 where M_GRADE = 01;

select  * from member_tbl_11;
select  M_NAME, M_TEL, M_BIRTHDAY from member_tbl_11;
-- 7. 생일이 2004-06-01 이후인 고객이름 전화번호 정보 조회하시오
select  M_NAME, M_TEL from member_tbl_11 where M_BIRTHDAY >= '04/06/01';   -- 이 날 이상인 날짜만 출력


-- 8. 생일이 2004-05-01이전에 태어난 고객의 고객이름 , 생일 정보 조회하시오
select  M_NAME, M_BIRTHDAY from member_tbl_11 where M_BIRTHDAY <= '04/05/01';


-- 9. 고객등급이 ‘01’이 아닌 고객의 고객이름, 전화번호, 고객등급 정보 조회하시오
select M_NAME, M_TEL, M_GRADE from member_tbl_11 where NOT M_GRADE  = '01';

-- 10. 고객 등급이 ‘02’ 인 고객의 고객아이디, 이름, 전화번호 정보 조회하시오
select M_NAME, M_TEL, M_GRADE from member_tbl_11 where M_GRADE  = '02';

-- 11. 포인트가 1500점 미만인 고객의 고객이름, 전화번호 조회하시오
select M_NAME, M_TEL from member_tbl_11 where M_POINT < 1500;

-- 12. 포인트가 적립되지 않은 고객정보 조회하시오
select * from member_tbl_11 where M_POINT IS NULL;

-- 13. 포인트가 부여된 (포인트 금액을 가지고 있는) 고객정보 조회하시오( 포인트가 NULL이 아닌 고객 조회하면 됨)
select * from member_tbl_11 where M_POINT IS NOT NULL;

-- 14. 고객등급이 중복되지 않도록 고객등급을 조회하는 쿼리를 작성하시오
select distinct M_GRADE from member_tbl_11;