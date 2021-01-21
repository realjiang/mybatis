package com.superj.case2;

import com.superj.case1.Student;
import com.superj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

//JUNIT单元测试类
public class MyBatisTestor {

    /**
     * 动态sql 案例
     * @throws Exception
     */
    @Test
    public void selectOneToMany() throws Exception {
        SqlSession session = null;
        try{
            session = MyBatisUtils.openSession();
            String classname = "一班";
            List<Classes> list = session.selectList("classes.selectOneToMany",classname);
//            List<Classes> list = session.selectList("classes.selectOneToMany",null);
            for(Classes c : list){
                System.out.println(c.getName()+":"+c.getStudents().size());
            }
        } catch (Exception e){
            throw e;
        } finally {
            MyBatisUtils.closeSession(session);
        }
    }


}
