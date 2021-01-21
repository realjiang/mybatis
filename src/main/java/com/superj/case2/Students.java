package com.superj.case2;

/**
 * 标题: 学生类
 *
 * @Author: Jiang
 * @Date: 2021/1/21 15:03
 */
public class Students {
    private int id;
    private String stuno;
    private String stuname;
    private String sex;
    private String classno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", stuno='" + stuno + '\'' +
                ", stuname='" + stuname + '\'' +
                ", sex='" + sex + '\'' +
                ", classno='" + classno +
                '}';
    }
}
