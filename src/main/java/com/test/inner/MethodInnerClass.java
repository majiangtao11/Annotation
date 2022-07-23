package com.test.inner;


import java.util.PrimitiveIterator;

/**
 * @author: mjt
 * time:2022-06-21
 * desription:方法内部类
 */
public class MethodInnerClass {
    private String id;
    public void test( String a){
        System.out.println("test");
        class InnerClass{
            public void show(){
                System.out.println(a);
                System.out.println("方法内部类");
            }
        }
        new InnerClass().show();
    }

    public static void main(String[] args) {
        new MethodInnerClass().test("a");
    }
}