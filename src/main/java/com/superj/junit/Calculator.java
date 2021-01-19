package com.superj.junit;

/**
 * 计算器类
 */
public class Calculator {
    //加法运算
    public int add(int a , int b){
        return a + b;
    }
    //减法运算
    public int subtract(int a , int b){
        return a - b;
    }
    //乘法运算
    public int multiply(int a , int b){
        return a * b;
    }
    //除法运算
    public float divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("除数不能为0");
        }
        return (a*1f) / b;//如果不*1f 两个整数除法 结果会舍去小数的值
    }

}
