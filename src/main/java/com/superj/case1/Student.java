package com.superj.case1;

/**
 * 标题: 案例一 - 学生类
 *
 * @Author: Jiang
 * @Date: 2021/1/21 14:15
 */
public class Student {
    /**学生id*/
    private int id;
    /**学号*/
    private int reg_no;
    /**姓名*/
    private String name;
    /**性别*/
    private String sex;
    /**年龄*/
    private int age;
    /**年级*/
    private String grade;
    /**专业*/
    private String major;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReg_no() {
        return reg_no;
    }

    public void setReg_no(int reg_no) {
        this.reg_no = reg_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", reg_no=" + reg_no +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
