package com;

public class classone {
    public static void main(String[] args) {
        System.out.println("hello word!");
        System.out.println("ce");
        System.out.println("测试git提交");
        System.out.println("测试git提交2");
        methodOne();
        methodTwo();
        String s = methodTwo();
        System.out.println(s);
    }
    public static  void methodOne(){
        System.out.println("没有返回值，不传参的方法");
    }
    public static String methodTwo(){
        System.out.println("有返回值的方法，不传参");
        return "methodTwo的返回值";
    }
}

