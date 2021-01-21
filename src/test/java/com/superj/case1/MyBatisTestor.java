package com.superj.case1;

import com.superj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//JUNIT单元测试类
public class MyBatisTestor {

    /**
     * 动态sql 案例
     * @throws Exception
     */
    @Test
    public void selectStudents() throws Exception {
        SqlSession session = null;
        try{
            session = MyBatisUtils.openSession();
            Map stu = new HashMap();
//            stu.put("age",30);
//            stu.put("sex","男");
            List<Student> list = session.selectList("student.selectStudents",stu);
            for(Student s : list){
                System.out.println(s);
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }


}
