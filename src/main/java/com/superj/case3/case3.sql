
CREATE TABLE `t_student` (
  `stuid` int NOT NULL AUTO_INCREMENT COMMENT 'ѧ�����',
  `name` varchar(100) NOT NULL COMMENT 'ѧ������',
  `reg_no` varchar(100) NOT NULL COMMENT 'ѧ��ѧ��',
  `grade` varchar(100) NOT NULL COMMENT 'ѧ�������꼶',
  `card_no` char(18) NOT NULL COMMENT 'ѧ�����֤����',
  `description` varchar(100) NOT NULL COMMENT '��ע',
  PRIMARY KEY (`stuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8