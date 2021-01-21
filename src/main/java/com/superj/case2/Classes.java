package com.superj.case2;

import java.util.List;

/**
 * 标题: 班级类
 *
 * @Author: Jiang
 * @Date: 2021/1/21 14:58
 */
public class Classes {

    private int classid;
    private String classno;
    private String name;
    private String major;
    private List<Students> students;

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classid=" + classid +
                ", classno='" + classno + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", students=" + students +
                '}';
    }
}
