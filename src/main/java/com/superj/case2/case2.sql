
CREATE TABLE `classes` (
  `classid` int NOT NULL AUTO_INCREMENT COMMENT '�༶id',
  `classno` varchar(20) NOT NULL COMMENT '�༶���',
  `name` varchar(20) DEFAULT NULL COMMENT '�༶����',
  `major` varchar(20) NOT NULL COMMENT 'רҵ',
  PRIMARY KEY (`classid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

INSERT INTO test.classes (classno,name,major) VALUES 
('Class001','һ��','�����')
,('Class002','����','�����')
,('Class003','����','���')
,('Class004','�İ�','���')
;

CREATE TABLE `students` (
  `stuid` int NOT NULL AUTO_INCREMENT COMMENT 'ѧ��id',
  `stuno` varchar(100) NOT NULL COMMENT 'ѧ��',
  `stuname` varchar(100) NOT NULL COMMENT '����',
  `sex` varchar(100) NOT NULL COMMENT '�Ա�',
  `classno` varchar(100) NOT NULL COMMENT '�༶���',
  PRIMARY KEY (`stuid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

INSERT INTO test.students (stuno,stuname,sex,classno) VALUES 
('20181101','÷����','��','Class001')
,('20181102','������','��','Class001')
,('20181103','����','Ů','Class001')
,('20181104','�޻�','Ů','Class003')
;


