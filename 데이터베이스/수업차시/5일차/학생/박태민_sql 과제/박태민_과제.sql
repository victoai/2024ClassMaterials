-- 1. ����
create table country(
country varchar2(50) not null,
c_summary varchar2(3) not null,
capital varchar2(50),
population number(9) not null,
area number(9) not null
);
--                                ������, �ڵ�, ����, �α���, ����
insert into country values('�״�����', 'NLD', '�Ͻ��׸���', 17606532, 41543);
insert into country values('�߽���', 'MEX', '�߽��ڽ�Ƽ', 128455567, 1962550);
insert into country values('����', 'GBR', '����', 67736802, 243891);
insert into country values('����', 'MCO', '����', 38300, 2.2);
insert into country values('����', 'DEU', '������', 84358845, 357022);
insert into country values('������', 'ESP', '���帮��', 47519628, 505990);
insert into country values('�ɶ���', 'FIN', '���Ű', 5544156, 338145);
insert into country(country, c_summary, population, area) values('������', 'CHE', 8780366, 41285);
insert into country values('��Ż����', 'ITA', '�θ�', 58870762, 301340);
insert into country values('����Ʈ����', 'AUT', '��', 9104722, 83879);
insert into country values('����Ʈ���ϸ���', 'AUS', 'ĵ����', 26439111, 7741220);

select country, c_summary, capital, to_char(population, '999,999,999')||'��' �α���, to_char(area, '999,999,999')||'km^2' ����
from country;

-- 2. ����������
create table engine(
e_nm varchar2(50) not null unique,
manufacturer varchar2(50) not null,
mother_company varchar2(50),
establishment number(4)
);
--                                ������, ������, ����, �����⵵
insert into engine values('F1 M14 E Performance', 'Mercedes AMG High Performance Powertrains', 'Mercedes-Benz AG', 1983);
insert into engine values('RBPT H001', 'Red Bull Powertrains', 'Red Bull Racing', 2021);
insert into engine(e_nm, manufacturer, establishment) values('Ferrari 006/10', 'Scuderia Ferrari', 1929);
insert into engine values('Renault E-Tech RE23', 'Renault Sport and Mecachrome', 'Alpine', 1976);

update engine
set e_nm='RBPTH001'
where mother_company='Red Bull Racing';

update engine
set e_nm='Mercedes-AMG F1 M14 E Performance'
where mother_company='Mercedes-Benz AG';

select e_nm, manufacturer, mother_company ����, establishment||'��' �����⵵ 
from engine;

-- 3. ����Ʈ����(��)
create table constructor(
t_nm varchar2(50) not null unique, 
principal varchar2(50), 
since number(4) not null, 
con_champ number(2),
c_nationality varchar2(3) not null,
engine varchar2(50) not null references engine(e_nm)
);
--                                      ����, ����, â�ܳ⵵, ��è���Ƚ��, ����, ����
insert into constructor values('����� ���̽�', 'ũ����Ƽ�� ȣ��', 2005, 5, 'AUT', 'RBPTH001');
insert into constructor values('�޸������� ����', '���� ����', 2010, 8, 'DEU', 'Mercedes-AMG F1 M14 E Performance');
insert into constructor values('�������� ���', '�������� �ټ���', 1929, 16, 'ITA', 'Ferrari 006/10');
insert into constructor(t_nm, since, c_nationality, engine) values('�ֽ��� ��ƾ', 2021, 'GBR', 'Mercedes-AMG F1 M14 E Performance');
insert into constructor(t_nm, since, c_nationality, engine) values('���� �θ޿�', 2019, 'CHE', 'Ferrari 006/10');
insert into constructor(t_nm, since, c_nationality, engine) values('���� Ÿ�츮', 2020, 'ITA', 'RBPTH001');
insert into constructor values('�ƶ�', '�ȵ巹�� ���ڶ�', 1963, 8, 'GBR', 'Mercedes-AMG F1 M14 E Performance');

select t_nm, principal, since||'��' â��, con_champ||'ȸ' "�� ���", engine 
from constructor;

-- 4. ��Ŷ
create table circuit(
c_nm varchar2(50) not null,
country varchar2(50) not null,
open number(4) not null
);
--                              ��Ŷ�̸�, ����, ����⵵
insert into circuit values('����Ҹ�', '����Ʈ����', 1969);
insert into circuit values('���� ��Ƽ', '������������', 2016);
insert into circuit values('�밡�θ�', '�밡��', 1986);
insert into circuit values('����-�����ڼ�', '���⿡', 1921);
insert into circuit values('�ٷ��� ���ͳ��ų� ��Ŷ', '�ٷ���', 2004);
insert into circuit values('�� ���ʺ�', 'ĳ����', 1978);

select c_nm, country, open||'��'
from circuit;

-- 5. ����̹�
create table driver(
d_nm varchar2(50) not null primary key,
d_num number(2) not null,
team varchar2(50) not null references constructor(t_nm),
d_nationality varchar2(3) not null, 
GP_wins number(3) default 0,
d_champ number(1) default 0,
most_wins_circuit varchar2(50) default '����'
);
--                              ����̹���, ��ȣ, �Ҽ���, ����, ���, ��è���, ���� ���� ����� ��Ŷ
insert into driver values('�ƽ� ������Ÿ��', 1, '����� ���̽�', 'NLD', 44, 2, '����Ҹ�');
insert into driver(d_nm, d_num, team, d_nationality, GP_wins, most_wins_circuit) values('�������� �䷹��', 11, '����� ���̽�', 'MEX', 6, '���� ��Ƽ');
insert into driver values('���̽� �ع���', 44, '�޸������� ����', 'GBR', 103, 7, '�밡�θ�');
insert into driver(d_nm, d_num, team, d_nationality, GP_wins, most_wins_circuit) values('���� ��Ŭ��', 16, '�������� ���', 'MCO', 5, '����-�����ڼ�');
insert into driver values('�丣���� �˷м�', 14, '�ֽ��� ��ƾ', 'ESP', 32, 2, '�ٷ��� ���ͳ��ų� ��Ŷ');
insert into driver(d_nm, d_num, team, d_nationality, GP_wins, most_wins_circuit) values('���׸� ��Ÿ��', 77, '���� �θ޿�', 'FIN', 10, '����Ҹ�');
insert into driver(d_nm, d_num, team, d_nationality, GP_wins, most_wins_circuit) values('�ٴϿ� ��ī��', 3, '���� Ÿ�츮', 'AUS', 8, '�� ���ʺ�');
insert into driver(d_nm, d_num, team, d_nationality) values('���� �븮��', 4, '�ƶ�', 'GBR');

select d_nm, d_num, team, d_nationality, GP_wins||'ȸ' ���, d_champ||'ȸ' "���� è�Ǿ�", most_wins_circuit 
from driver;

-- ����̹��� �Ҽ���(����Ʈ����)
select d.d_nm, d.d_num, d.d_nationality, d.GP_wins||'ȸ' ���, d.d_champ||'ȸ' "���� è�Ǿ�", d.most_wins_circuit, d.team, ct.principal, ct.since||'��' â��, ct.con_champ||'ȸ' "�� ���", ct.engine, ct.c_nationality 
from driver d
join constructor ct
on d.team = ct.t_nm;

-- ����Ʈ������ �׶����� ��� Ƚ��
select d.team, sum(d.GP_wins)||'ȸ' "�׶����� ���"
from driver d
join constructor ct
on d.team = ct.t_nm
group by d.team;

-- ����̹��� ����
select d.d_nm, d.d_num, d.team, d.GP_wins||'ȸ' ���, d.d_champ||'ȸ' "���� è�Ǿ�", c.country
from driver d
join country c
on d.d_nationality = c.c_summary;

-- ����̹��� ��Ŷ
select d.d_nm, d.d_num, d.team, d.GP_wins||'ȸ' ���, c.c_nm, c.country, c.open 
from driver d
join circuit c
on d.most_wins_circuit = c.c_nm;

-- ����Ʈ���Ϳ� ����
select ct.t_nm, ct.principal, ct.since||'��' â��, e.e_nm, e.manufacturer 
from constructor ct
join engine e
on ct.engine = e.e_nm;

commit;