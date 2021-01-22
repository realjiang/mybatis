package com.superj.case3;

/**
 * 标题: 案例一 - 学生类
 *
 * @Author: Jiang
 * @Date: 2021/1/21 14:15
 */
public class Student {
    /**学生id*/
    private int stuid;
    /**姓名*/
    private String name;
    /**学号*/
    private String reg_no;
    /**年级*/
    private String grade;
    /**身份证号*/
    private String card_no;
    /**备注*/
    private String description;

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", name='" + name + '\'' +
                ", reg_no=" + reg_no +
                ", grade='" + grade + '\'' +
                ", card_no='" + card_no + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
