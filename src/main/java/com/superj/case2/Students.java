package com.superj.case2;

/**
 * 标题: 学生类
 *
 * @Author: Jiang
 * @Date: 2021/1/21 15:03
 */
public class Students {
    private int stuid;
    private String stuno;
    private String stuname;
    private String sex;
    private String classno;
    private Classes classes;

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
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

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + stuid +
                ", stuno='" + stuno + '\'' +
                ", stuname='" + stuname + '\'' +
                ", sex='" + sex + '\'' +
                ", classno='" + classno + '\'' +
                ", classes=" + classes +
                '}';
    }
}
