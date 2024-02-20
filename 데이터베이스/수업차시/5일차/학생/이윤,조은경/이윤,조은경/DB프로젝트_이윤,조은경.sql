-- ��� �����̼� ��Ű��
create table member_list(
    mb_id  VARCHAR2(4) not null primary key,
    mb_Name  VARCHAR2(10) not null,
    mb_birth date not null,
    mb_Nickname VARCHAR2(20) not null
);

insert into member_list values('mb01', '������', '1990-04-08', '����'); 
insert into member_list values('mb02', '����', '1991-09-23', '���ɿ���'); 
insert into member_list values('mb03', '�ֹ�ȣ', '1991-12-09', '�Ҳ�ī������');
insert into member_list values('mb04', '���¹�', '1993-07-18', '�ڷ���');
insert into member_list values('mb05', '���̴�', '2008-05-25', 'SHINee');


-- ������ �����̼� ��Ű��
create table position_list(
    pt_id VARCHAR2(4) not null primary key, 
    pt_name VARCHAR2(20) not null
);

insert into position_list values('pt01', '����'); 
insert into position_list values('pt02', '���κ���'); 
insert into position_list values('pt03', '���庸��'); 
insert into position_list values('pt04', '���η���'); 
insert into position_list values('pt05', '���巡��'); 
insert into position_list values('pt06', '���δ�'); 
insert into position_list values('pt07', '�����'); 

-- ������ ���� �����̼� ��Ű��
create table position_setting(
    mb_id VARCHAR2(20) references member_list(mb_id),
    pt_id VARCHAR2(4) references position_list(pt_id),
    primary key(pt_id, mb_id)
);

insert into position_setting values('mb01', 'pt02'); 
insert into position_setting values('mb02', 'pt01'); 
insert into position_setting values('mb02', 'pt05'); 
insert into position_setting values('mb02', 'pt07'); 
insert into position_setting values('mb03', 'pt01'); 
insert into position_setting values('mb03', 'pt04'); 
insert into position_setting values('mb04', 'pt06'); 
insert into position_setting values('mb04', 'pt03'); 

-- �ٹ� �����̼� ��Ű��
create table album_list(
  al_id varchar2(7) not null primary key,
  al_name varchar2(100) not null,
  al_date date not null
);

insert into album_list values('AL00001', 'The SHINee World (SHINee The First Album)', '2008-08-28');
insert into album_list values('AL00002', 'The 2nd Album ''LUCIFER''', '2010-07-19');
insert into album_list values('AL00003', 'SHINee The 3rd Album ''The Misconceptions Of Us''', '2013-08-08');
insert into album_list values('AL00004', 'Odd - The 4th Album', '2015-05-18');
insert into album_list values('AL00005', '1 of 1 - The 5th Album', '2016-10-05');
insert into album_list values('AL00006', '''The Story of Light'' Epilogue - The 6th Album', '2018-09-10');
insert into album_list values('AL00007', 'Don''t Call Me - The 7th Album', '2021-02-22');
insert into album_list values('AL00008', 'HARD - The 8th Album', '2023-06-26');



-- �� �����̼� ��Ű��
create table song_list(
  so_id varchar2(7) not null primary key,
  so_name varchar2(100) not null,
  al_id varchar2(5) references album_list(al_id)
);


insert into song_list values('SL00001', 'The SHINee World', 'AL00001');
insert into song_list values('SL00002', '����� ��', 'AL00001');
insert into song_list values('SL00003', '��Ұ��� ��', 'AL00001');
insert into song_list values('SL00004', '�� �ƴϸ� �ȵǴ� ��', 'AL00001');
insert into song_list values('SL00005', '�׳డ �������', 'AL00001');
insert into song_list values('SL00006', 'ȭ���� �ϰ�', 'AL00001');
insert into song_list values('SL00007', '������ ����', 'AL00001');
insert into song_list values('SL00008', '�� �翡�� �־�', 'AL00001');
insert into song_list values('SL00009', '����', 'AL00001');
insert into song_list values('SL00010', '���� ���ƺ���', 'AL00001');
insert into song_list values('SL00011', 'In My Room', 'AL00001');
insert into song_list values('SL00012', '���� �ʹ� ����', 'AL00001');

insert into song_list values('SL00012', 'Up & Down', 'AL00002');
insert into song_list values('SL00013', 'Lucifer', 'AL00002');
insert into song_list values('SL00014', 'Electric Heart', 'AL00002');
insert into song_list values('SL00015', 'A-Yo', 'AL00002');
insert into song_list values('SL00016', '��', 'AL00002');
insert into song_list values('SL00017', 'ȭ��', 'AL00002');
insert into song_list values('SL00018', '��', 'AL00002');
insert into song_list values('SL00019', 'WOWOWOW', 'AL00002');
insert into song_list values('SL00020', 'Your Name', 'AL00002');
insert into song_list values('SL00021', 'Life', 'AL00002');
insert into song_list values('SL00022', 'Ready Or Not', 'AL00002');
insert into song_list values('SL00023', 'Love Pain', 'AL00002');
insert into song_list values('SL00024', '��.��.��', 'AL00002');


insert into song_list values('SL00025', 'Spoiler', 'AL00003');
insert into song_list values('SL00026', 'Dream Girl', 'AL00003');
insert into song_list values('SL00027', '��ġ����ŷ', 'AL00003');
insert into song_list values('SL00028', 'Punch Drunk Love', 'AL00003');
insert into song_list values('SL00029', 'Girls, Girls, Girls', 'AL00003');
insert into song_list values('SL00030', '���', 'AL00003');
insert into song_list values('SL00031', '�Ƹ��ٿ�', 'AL00003');
insert into song_list values('SL00032', '���̳ʸ���Ʈ', 'AL00003');
insert into song_list values('SL00033', 'Runaway', 'AL00003');
insert into song_list values('SL00034', '�ʿ� ���� �Ÿ�', 'AL00003');
insert into song_list values('SL00035', 'Nigntmare', 'AL00003');
insert into song_list values('SL00036', 'Why So Serious?', 'AL00003');
insert into song_list values('SL00037', 'SHINe', 'AL00003');
insert into song_list values('SL00038', '������', 'AL00003');
insert into song_list values('SL00039', 'Dangerous', 'AL00003');
insert into song_list values('SL00040', 'Like a Fire', 'AL00003');
insert into song_list values('SL00041', 'Excuse Me Miss', 'AL00003');
insert into song_list values('SL00042', 'Evil', 'AL00003');
insert into song_list values('SL00043', '������ ����', 'AL00003');
insert into song_list values('SL00044', '������ ��', 'AL00003');

insert into song_list values('SL00045', 'Odd Eye', 'AL00004');
insert into song_list values('SL00046', 'Love Sick', 'AL00004');
insert into song_list values('SL00047', 'View', 'AL00004');
insert into song_list values('SL00048', 'Romance', 'AL00004');
insert into song_list values('SL00049', 'Trigger', 'AL00004');
insert into song_list values('SL00050', '�̺��� ��', 'AL00004');
insert into song_list values('SL00051', '���� �뷡�� �Ǿ�', 'AL00004');
insert into song_list values('SL00052', 'Alive', 'AL00004');
insert into song_list values('SL00053', 'WoofWoof', 'AL00004');
insert into song_list values('SL00054', 'Black Hole', 'AL00004');
insert into song_list values('SL00055', '�翬', 'AL00004');

insert into song_list values('SL00056', 'Prism', 'AL00005');
insert into song_list values('SL00057', '1 of 1', 'AL00005');
insert into song_list values('SL00058', 'Feel Good', 'AL00005');
insert into song_list values('SL00059', '���� ���', 'AL00005');
insert into song_list values('SL00060', 'Lipstick', 'AL00005');
insert into song_list values('SL00061', 'Don''t stop', 'AL00005');
insert into song_list values('SL00062', 'SHIFT', 'AL00005');
insert into song_list values('SL00063', 'U Need Me', 'AL00005');
insert into song_list values('SL00064', 'So Amazing', 'AL00005');


insert into song_list values('SL00065', 'All Day All Night', 'AL00006');
insert into song_list values('SL00066', '�� �� ����', 'AL00006');
insert into song_list values('SL00067', '������ ��', 'AL00006');
insert into song_list values('SL00068', 'Chemistry', 'AL00006');
insert into song_list values('SL00069', 'Electric', 'AL00006');
insert into song_list values('SL00070', '����', 'AL00006');
insert into song_list values('SL00071', '�װ� ���ܵ� ��', 'AL00006');
insert into song_list values('SL00072', 'I Say', 'AL00006');
insert into song_list values('SL00073', 'Retro', 'AL00006');
insert into song_list values('SL00074', 'Drive', 'AL00006');
insert into song_list values('SL00075', 'I Want You', 'AL00006');
insert into song_list values('SL00076', 'Undercover', 'AL00006');
insert into song_list values('SL00077', 'JUMP', 'AL00006');
insert into song_list values('SL00078', 'Tonight', 'AL00006');
insert into song_list values('SL00079', '�ȳ�', 'AL00006');
insert into song_list values('SL00080', 'Lock You Down', 'AL00006');


insert into song_list values('SL00081', 'Don''t Call Me', 'AL00007');
insert into song_list values('SL00082', 'Heart Attack', 'AL00007');
insert into song_list values('SL00083', 'Marry You', 'AL00007');
insert into song_list values('SL00084', 'C��DE', 'AL00007');
insert into song_list values('SL00085', 'I Really Want You', 'AL00007');
insert into song_list values('SL00086', 'Kiss Kiss', 'AL00007');
insert into song_list values('SL00087', 'Body Rhythm', 'AL00007');
insert into song_list values('SL00088', 'Attention', 'AL00007');
insert into song_list values('SL00089', '��ĭ', 'AL00007');

insert into song_list values('SL00090', 'HARD', 'AL00008');
insert into song_list values('SL00091', 'JUICE', 'AL00008');
insert into song_list values('SL00092', '10X', 'AL00008');
insert into song_list values('SL00093', 'Satellite', 'AL00008');
insert into song_list values('SL00094', 'Identity', 'AL00008');
insert into song_list values('SL00095', 'The Feeling', 'AL00008');
insert into song_list values('SL00096', 'Like It', 'AL00008');
insert into song_list values('SL00097', 'Sweet Misery', 'AL00008');
insert into song_list values('SL00098', '�Ҹ���', 'AL00008');
insert into song_list values('SL00099', 'Gravity', 'AL00008');


-- �۰ �����̼� ��Ű��
create table songwriter_list(
  sw_id varchar2(7) not null primary key,
  sw_name varchar2(100) not null unique
);

-- �ۻ簡 �����̼� ��Ű��
create table lyricist_list(
  ly_id varchar2(7) not null primary key,
  ly_name varchar2(100) not null unique
);


