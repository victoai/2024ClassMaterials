
select  부서번호, 상위부서번호 , 부서이름,  level,  lpad( '  ' ,  5 *( level -1) )  ||  부서이름  
from depttmp
start with   상위부서번호 is null
connect by prior 부서번호 =  상위부서번호 
order by level;



create table depttmp(
  부서번호 varchar2 (10) , 
  부서이름 varchar2 (20) ,
  상위부서번호  varchar2(10)  
)

select * from depttmp;

insert into depttmp  values(  'A001' , '회사' , null);
insert into depttmp  values(  'A002', '개발부' ,'A001');
insert into depttmp  values( 'A003' , '경영지원부' , 'A001');
insert into depttmp  values( 'A004' , '영업부' , 'A001');
insert into depttmp  values( 'A005' , '온라인개발부' , 'A002');
insert into depttmp  values( 'A006' , '재무관리' , 'A003');
insert into depttmp  values( 'A007' , '영업관리' , 'A003');
insert into depttmp  values( 'A008' , '국내영업' , 'A004');

commit;


 
 
 SELECT 
    부서번호, 
    상위부서번호, 
    부서이름, 
    LEVEL,
    LPAD(' ', 3 * (LEVEL - 1)) || 부서이름 AS hierarchy_name
FROM 
    depttmp
START WITH 
    상위부서번호 IS NULL
CONNECT BY 
    PRIOR 부서번호 = 상위부서번호
ORDER SIBLINGS BY
    CASE 
        WHEN 상위부서번호 IS NULL THEN 부서이름
        ELSE 상위부서번호
    END,
    부서이름;

 

 