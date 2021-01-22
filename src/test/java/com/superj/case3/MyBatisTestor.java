package com.superj.case3;

import com.superj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//JUNIT单元测试类
public class MyBatisTestor {

    /**
     * 批量插入
     * @throws Exception
     */
    @Test
    public void insertBatch() throws Exception {
        SqlSession session = null;
        try{
            session = MyBatisUtils.openSession();
            List list = new ArrayList();
            for (int i = 0; i < 10000; i++) {
                Student student = new Student();
                student.setName("测试学生");
                student.setReg_no("s0001");
                student.setGrade("一年级");
                student.setCard_no("1111111111");
                student.setDescription("备注");
                list.add(student);
            }
            session.insert("tstudent.batchInsert", list);
            session.commit();//提交事务数据
        } catch (Exception e){
            if (session != null) {
                session.rollback();//回滚事务
            }
            throw e;
        } finally {
            MyBatisUtils.closeSession(session);
        }
    }

}
