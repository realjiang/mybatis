
CREATE TABLE `classes` (
  `classid` int NOT NULL AUTO_INCREMENT COMMENT '班级id',
  `classno` varchar(20) NOT NULL COMMENT '班级编号',
  `name` varchar(20) DEFAULT NULL COMMENT '班级名称',
  `major` varchar(20) NOT NULL COMMENT '专业',
  PRIMARY KEY (`classid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

INSERT INTO test.classes (classno,name,major) VALUES 
('Class001','一班','计算机')
,('Class002','二班','计算机')
,('Class003','三班','会计')
,('Class004','四班','会计')
;

CREATE TABLE `students` (
  `stuid` int NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `stuno` varchar(100) NOT NULL COMMENT '学号',
  `stuname` varchar(100) NOT NULL COMMENT '姓名',
  `sex` varchar(100) NOT NULL COMMENT '性别',
  `classno` varchar(100) NOT NULL COMMENT '班级编号',
  PRIMARY KEY (`stuid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

INSERT INTO test.students (stuno,stuname,sex,classno) VALUES 
('20181101','梅长苏','男','Class001')
,('20181102','萧景琰','男','Class001')
,('20181103','宫羽','女','Class001')
,('20181104','霓凰','女','Class003')
;


