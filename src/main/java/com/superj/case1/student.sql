


CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `reg_no` int NOT NULL COMMENT '学号',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `sex` varchar(20) NOT NULL COMMENT '性别',
  `age` int NOT NULL COMMENT '年龄',
  `grade` varchar(20) NOT NULL COMMENT '年级',
  `major` varchar(50) NOT NULL COMMENT '专业',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8


INSERT INTO student (reg_no,name,sex,age,grade,major) VALUES
(20171201,'梅长苏','男',31,'2008','哲学系')
,(20171202,'萧景琰','男',30,'2008','政治系')
,(20171203,'飞流','男',18,'2016','人体学')
,(20171204,'萧景恒','男',35,'2006','政治系')
,(20171205,'宫羽','女',25,'2013','声乐系')
,(20171206,'霓凰','女',31,'2008','国际关系专业')
,(20171207,'秦般弱','女',30,'2009','通信专业')
;
