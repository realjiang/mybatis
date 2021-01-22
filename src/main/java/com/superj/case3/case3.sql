
CREATE TABLE `t_student` (
  `stuid` int NOT NULL AUTO_INCREMENT COMMENT '学生编号',
  `name` varchar(100) NOT NULL COMMENT '学生姓名',
  `reg_no` varchar(100) NOT NULL COMMENT '学生学号',
  `grade` varchar(100) NOT NULL COMMENT '学生所在年级',
  `card_no` char(18) NOT NULL COMMENT '学生身份证号码',
  `description` varchar(100) NOT NULL COMMENT '备注',
  PRIMARY KEY (`stuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8