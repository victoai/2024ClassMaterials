
select  �μ���ȣ, �����μ���ȣ , �μ��̸�,  level,  lpad( '  ' ,  5 *( level -1) )  ||  �μ��̸�  
from depttmp
start with   �����μ���ȣ is null
connect by prior �μ���ȣ =  �����μ���ȣ 
order by level;



create table depttmp(
  �μ���ȣ varchar2 (10) , 
  �μ��̸� varchar2 (20) ,
  �����μ���ȣ  varchar2(10)  
)

select * from depttmp;

insert into depttmp  values(  'A001' , 'ȸ��' , null);
insert into depttmp  values(  'A002', '���ߺ�' ,'A001');
insert into depttmp  values( 'A003' , '�濵������' , 'A001');
insert into depttmp  values( 'A004' , '������' , 'A001');
insert into depttmp  values( 'A005' , '�¶��ΰ��ߺ�' , 'A002');
insert into depttmp  values( 'A006' , '�繫����' , 'A003');
insert into depttmp  values( 'A007' , '��������' , 'A003');
insert into depttmp  values( 'A008' , '��������' , 'A004');

commit;


 
 
 SELECT 
    �μ���ȣ, 
    �����μ���ȣ, 
    �μ��̸�, 
    LEVEL,
    LPAD(' ', 3 * (LEVEL - 1)) || �μ��̸� AS hierarchy_name
FROM 
    depttmp
START WITH 
    �����μ���ȣ IS NULL
CONNECT BY 
    PRIOR �μ���ȣ = �����μ���ȣ
ORDER SIBLINGS BY
    CASE 
        WHEN �����μ���ȣ IS NULL THEN �μ��̸�
        ELSE �����μ���ȣ
    END,
    �μ��̸�;

 

 