--420 1
 CREATE OR REPLACE VIEW v_prof_dept
     AS
       SELECT p.profno "교수번호"       ,    p.name  "교수명"       ,    d.dname  "소속학과명"
       FROM professor p , department d
       WHERE p.deptno = d.deptno ;

 
 -- 420 2
 SELECT d.dname, s.max_height, s.max_weight
FROM (
    SELECT deptno1, MAX(height) max_height, MAX(weight) max_weight
    FROM student
    GROUP BY deptno1
) s
JOIN department d ON s.deptno1 = d.deptno;


 --2번 다르게 풀이 
   SELECT    dname , MAX(height) max_height, MAX(weight) max_weight
    FROM  student
    join  department 
    on student.deptno1  = department.deptno    
    group by  dname;
    
  
  --3번  
SELECT d.dname, a.max_height, s.name, s.height
FROM (
    SELECT deptno1, MAX(height) max_height
    FROM student
    GROUP BY deptno1
) a
  JOIN student s ON a.deptno1 = s.deptno1 AND a.max_height = s.height
  JOIN department d ON s.deptno1 = d.deptno;

 

--4 
SELECT s.grade, s.name, s.height, a.avg_height
FROM (
    SELECT grade, AVG(height) avg_height
    FROM student
    GROUP BY grade
) a
JOIN student s ON a.grade = s.grade
WHERE s.height > a.avg_height
ORDER BY 1;



--5
 SELECT rownum "Ranking" , name , pay 
     FROM ( SELECT name , pay
            FROM professor
            ORDER BY 2 desc )
   WHERE rownum BETWEEN 1 and 5 ;

