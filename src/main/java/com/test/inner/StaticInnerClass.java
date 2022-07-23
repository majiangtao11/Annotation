package com.test.inner;

/**
 * @author: mjt
 * time:2022-06-21
 * desription:静态内部类
 */
public  class StaticInnerClass {

   private String id;

    public void test(){
        System.out.println("test");
    }

    static class InnerClass{

        private String name;

        public void show(){
            System.out.println("show");
        }
    }

    public static void main(String[] args) {
        new StaticInnerClass.InnerClass().show();
    }
}