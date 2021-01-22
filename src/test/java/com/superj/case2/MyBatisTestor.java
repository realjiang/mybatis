package com.superj.case2;

import com.superj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

//JUNIT单元测试类
public class MyBatisTestor {

    /**
     * 关联查询(一对多)
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
    /**
     * 关联查询(多对一)
     * @throws Exception
     */
    @Test
    public void selectManyToOne() throws Exception {
        SqlSession session = null;
        try{
            session = MyBatisUtils.openSession();
            List<Students> list = session.selectList("students.selectManyToOne");
            for(Students s : list){
                System.out.println(s);
            }
        } catch (Exception e){
            throw e;
        } finally {
            MyBatisUtils.closeSession(session);
        }
    }

}
