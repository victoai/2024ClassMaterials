

select * from student;
select * from department;
 
--1
 CREATE OR REPLACE VIEW v_prof_dept
   AS
   SELECT p.profno "교수번호"   , p.name "교수명"   , d.dname "소속학과명"
   FROM professor p 
   join department d
   on p.deptno = d.deptno ;

 
--2

  SELECT d.dname    , s.max_height  , s.max_weight 
  FROM ( 
   SELECT deptno1, MAX(height) max_height, MAX(weight) max_weight
   FROM student
   GROUP BY deptno1
   ) s 
  join  department d
  on s.deptno1 = d.deptno ;



--3 
  
   
SELECT a.deptno1    , d.dname, a.max_height, s.name, s.height
FROM (
    SELECT deptno1, MAX(height) AS max_height
    FROM student group by deptno1       
) a
JOIN student s 
ON a.deptno1 = s.deptno1 AND a.max_height = s.height
JOIN department d 
ON a.deptno1 = d.deptno
order by 1;


--4
 SELECT s.grade , s.name , s.height , a.avg_height
   FROM (
   SELECT grade , AVG(height) avg_height
   FROM student
   GROUP BY grade
   )  a 
   join student s
   on  a.grade = s.grade
   AND s.height > a.avg_height
  ORDER BY 1 ;
   
  
  
---5
SELECT   rnk, name, pay
FROM (
    SELECT ROWNUM   rnk , name, pay
    FROM (
        SELECT name, pay
        FROM professor
        ORDER BY pay DESC
    )      
)
WHERE  rnk  BETWEEN 2 AND 5;

 
