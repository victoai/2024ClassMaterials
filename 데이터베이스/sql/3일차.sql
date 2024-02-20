 insert into tbl_test_customer values( 'H006' ,'이윤정', '서울', '010-1111-2222');
 commit;
 --주문테이블 정보 조회하기  , 주문테이블, 고객테이블 관계성이 있음  ( 주문테이블에 고객테이블의 id를 가지고 있음, 외래키라고 함)
 select * from  tbl_test_order; 
 select  * from tbl_test_customer;
 
 select *
 from tbl_test_order   o
 join tbl_test_customer c
 on o.id = c.id;
 
 -- 고객명, 판매수량
 
 select  c.name  name ,  o.sale_cnt   "sale  cnt "
 from tbl_test_order   o
 join tbl_test_customer c
 on o.id = c.id;
 
 -- 고객별 판매수량
 select  c.name    ,  sum( o.sale_cnt   ) || '개'  수량
 from tbl_test_order   o
 join tbl_test_customer c
 on o.id = c.id
 group by  c.name   ;
 -- 동등조인 , 등가조인 equi조인 , inner조인  ( 일치하는것만 조인된다.)
 select *
 from tbl_test_order o
 inner join tbl_test_customer c    --  inner 생략가능 (일치하지 않는것은 조회되지 않는다.)
 on  o.id = c.id;
 
 
 select c.name  ,  o.sale_cnt 
 from tbl_test_order o
 inner join tbl_test_customer c    --  inner 생략가능 (일치하지 않는것은 조회되지 않는다.)
 on  o.id = c.id; 
 -- 고객 주문수량 조회 ! ( 주문하지 않는 고객도 함께 조회될 수 있도록 )
 
 select c.name, o.sale_cnt
 from tbl_test_order  o
 join tbl_test_customer c
 on  o.id  = c.id ;
 
 
 --select * from tbl_test_customer;
 
 
  -- 
 select c.name, o.sale_cnt
 from tbl_test_order  o
 right outer join tbl_test_customer c
 on  o.id  = c.id ;
 
 
 -- 
 select c.name, nvl( o.sale_cnt , 0)|| '개'
 from tbl_test_order  o
 right outer join tbl_test_customer c
 on  o.id  = c.id ;
 
 
 --고객별 판매수량
 select c.name,   nvl( sum(o.sale_cnt   ) ,0)  qty
 from tbl_test_order  o
 right outer join tbl_test_customer c
 on  o.id  = c.id 
 group by  c.name
 order by 2 desc;
   
 -- 주문정보를 조회하기 
 -- 여러 테이블을 조인 할 때 
 -- 두 개중에서 중심테이블 먼저 표시함 
 select * from tbl_test_order;  
 select * from tbl_test_customer;
 
 select *
 from tbl_test_order o
 join tbl_test_customer c
 on o.id =c.id;

 
 
 select  c.name, o.sale_cnt
 from tbl_test_order o
 join tbl_test_customer c
 on o.id =c.id;
 --주문하지않은 고객도 함께 조회하기  ( outer  조인 , left, right, full)
 select  c.name, o.sale_cnt
 from tbl_test_order o
 right outer join tbl_test_customer c
 on o.id =c.id;
 -- null 값 처리
 select  c.name,  nvl(o.sale_cnt,0)
 from tbl_test_order o
 right outer join tbl_test_customer c
 on o.id =c.id;
 
 --고객별 집계 ( group by)
 select  c.name,  sum( nvl(o.sale_cnt,0))
 from tbl_test_order o
 right outer join tbl_test_customer c
 on o.id =c.id
 group by c.name ;
 
 
 -- rollup() : 각 기준별 소계를 요약해서 보여주는 함수 
 -- group by가 선행되어야 한다.
 
 select * from emp;
 select deptno , job, sal from emp;
 --부서별 급여합계
select deptno , sum( sal )
from emp
group by  deptno;
--
select deptno , sum( sal )
from emp
group by  rollup(deptno);
 
select decode(deptno, null,'합계',deptno) deptno , sum( sal )
from emp
group by  rollup(deptno); 
 --to_char(  금액,  '999,999' )
 select decode(deptno, null,'합계',deptno) deptno , to_char( sum( sal ) , '999,999'  ) sal_total
from emp
group by  rollup(deptno);


select  deptno, job, sal
from emp;
-- group by 
select  deptno, job, sum( sal)
from emp
group by  deptno, job
order by deptno , job;

-- rollup() 소계 , 전체합계
select  deptno, job, sum( sal)
from emp
group by   rollup(deptno, job)
order by deptno , job;
--
select  deptno, decode(job, null,'소계', job), sum( sal)
from emp
group by   rollup(deptno, job)
order by deptno , job; 

--rollup()에서 
select  decode(deptno, null,'전체합계',deptno) deptno, decode(job, null,'소계', job)  job, sum( sal)
from emp
group by   rollup(deptno, job)
order by deptno , job;

--pivot() 함수

select * from emp;

select  deptno , empno,  job
from emp;

--
select deptno,
    decode(job, 'CLERK' , empno) clerk,
    decode(job, 'MANAGER' , empno) manager,
    decode(job, 'PRESIDENT' , empno) PRESIDENT,
    decode(job, 'ANALYST' , empno) ANALYST,
    decode(job, 'SALESMAN' , empno) SALESMAN
from emp;

select * from emp;

select deptno,
    count(decode(job, 'CLERK' , empno)) clerk,
    count(decode(job, 'MANAGER' , empno)) manager,
    count(decode(job, 'PRESIDENT' , empno))  PRESIDENT,
    count( decode(job, 'ANALYST' , empno)) ANALYST,
    count( decode(job, 'SALESMAN' , empno)) SALESMAN
from emp
group by deptno;

--pivot()
select * from ( select deptno, job, empno from emp)
pivot(
   count(empno) for job in ( 'CLERK' as "CLERK" ,
                             'MANAGER' as "MANAGER",
                             'PRESIDENT' as "PRESIDENT",
                             'ANALYST' as "ANALYST" ,
                             'SALESMAN' as "SALESMAN")                            
);


-- rank() 함수
select * from emp;
select empno, ename, sal from emp;
select empno, ename, sal , rank() over (order by sal desc) from emp;   -- asc(낮은거 부터 , desc (높은거 부터)
select empno, ename, sal , dense_rank() over (order by sal desc) from emp;   -- asc(낮은거 부터 , desc (높은거 부터)

select  empno, ename, sal , rank() over( order by sal desc )
from emp;

select  empno, ename, sal , deptno,  rank() over( order by sal desc )
from emp;

select  empno, ename, sal , deptno,  rank() over( partition by deptno  order by sal desc )
from emp;


--sum() over 누계구하기
select * from  panmae;

select  p_date , p_total , sum(p_total) over(order by p_total) 
from panmae;

select p_date, p_code, p_total
from panmae;

select p_date, p_code, p_total , sum(p_total) over( partition by p_code  order by p_total)
from panmae
where p_store=1000;



select p_date, p_total, sum(p_total) over(order by p_total) 
from panmae;

select  p_total, sum(p_total) over(partition by p_total order by p_total) 
from panmae
order by p_total;

SELECT p_total, 
       SUM(p_total) OVER(ORDER BY p_total)
FROM panmae
ORDER BY p_total;


SELECT p_total,
       SUM(p_total) OVER(ORDER BY p_total) AS cumulative_sum
FROM panmae
ORDER BY p_total ;


----- 금액누계구하기
SELECT p_total,  row_number, SUM(p_total) OVER (ORDER BY row_number) AS amt
FROM (
    SELECT p_total,  ROW_NUMBER() OVER (ORDER BY p_total) AS row_number
    FROM panmae
)                                                    
ORDER BY p_total;


SELECT p_total,   SUM(p_total) OVER (ORDER BY p_total) AS amt
FROM    panmae                                               
ORDER BY p_total;

--연습문제  4번

select * from emp;
select deptno, job, sal from emp;
select deptno, decode( job , 'CLERK', sal)  
from emp;

select   decode( job , 'CLERK', sal) ,
         decode( job , 'MANAGER' ,sal),
         decode( job, 'PRESIDENT', sal)
from emp;
--
select    sum(decode( job , 'CLERK', sal)) CLERK ,
          sum(decode( job , 'MANAGER' ,sal))  MNANAGER,
          sum(decode( job, 'PRESIDENT', sal)) PRESIDENT
from emp;

select  deptno,  sum(decode( job , 'CLERK', sal)) CLERK ,
          sum(decode( job , 'MANAGER' ,sal))  MNANAGER,
          sum(decode( job, 'PRESIDENT', sal)) PRESIDENT
from emp
group by deptno;

--
select  deptno, 
          nvl(sum(decode( job , 'CLERK', sal)),0) CLERK ,
          nvl(sum(decode( job , 'MANAGER' ,sal)) ,0) MNANAGER,
          nvl(sum(decode( job, 'PRESIDENT', sal)) ,0) PRESIDENT
from emp
group by deptno;
-- 3번
select  * from student;
select   tel from student;
select   count(tel) from student;
--tel에서 국번정보 추출하기 (일부추출하기 substr() )
select   substr( tel, 1, instr(tel,')') -1 ) from student; 
select   count(tel),
         count(decode( substr( tel, 1, instr(tel,')') -1 ) ,'02',1))   ,
         count(decode( substr( tel, 1, instr(tel,')') -1 ) ,'051',1))  
from student;

--2 연습문제 풀이
select * from student;
select birthday from student;

select   to_char(birthday ,'mm' )from student;
select   substr(birthday,4,2)  from student;
select  birthday, decode(  to_char(birthday ,'mm' ) ,'01',1) JAN
from student;
select  count(birthday),
 count(decode(  to_char(birthday ,'mm' ) ,'01',1))|| 'EA'  JAN
from student;



select * from tbl_test_customer;

select * from member_tbl_11;

select m_name, m_grade,decode(m_grade,'01','VVIP','02','VIP','03','GOLD' ) from member_tbl_11;

desc member_tbl_11;

insert into member_tbl_11( m_id, m_pw, m_name )  values('angel' ,'1234' ,'이윤');
select * from member_tbl_11;



select * from tbl_test_order;
select * from tbl_test_customer;
select  sale_cnt , id  from tbl_test_order;

-- 고객 주문현황
select   * 
from tbl_test_order  o
join tbl_test_customer   c
on o.id  = c.id ;

-- join   ( inner join ) 
select  z.name, o.sale_cnt
from tbl_test_order  o
join tbl_test_customer   z
on o.id  = z.id ;

 
-- right outer join
select  z.name, o.sale_cnt
from tbl_test_order  o
right outer join tbl_test_customer   z
on o.id  = z.id ;

--  null일때 특정값으로 표시될 수 있도록
select  z.name, nvl( o.sale_cnt ,0)
from tbl_test_order  o
right outer join tbl_test_customer   z
on o.id  = z.id ;

create table aa  as select * from tbl_test_order;
select * from  dual;


-- 시간 표시하기
select to_char(  to_date( '900', 'HH24MI' ) , 'HH24:MI' )  from dual;  --안됨
select to_char(  to_date( lpad('900',4,0), 'HH24MI' ) , 'HH24:MI' )  from dual;--시분 표시형식
select   substr(lpad('900',4,0) ,1,2 ) || ':' ||  substr(lpad('900',4,0) ,3,2 )   from dual; 



