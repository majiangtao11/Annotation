package com.test.juc;

/**
 * @author: mjt
 * time:2021-11-08
 * desription:
 *      synchronize关键字对某个对象加锁
 */
public class T {
    private static int count  = 10;
    private static Object o = new Object();

    public static void m(){
        synchronized (o){//任何线程首先要拿到o的锁才能执行下面代码
            count --;
            System.out.println(Thread.currentThread().getName() + "count = " + count);
        }
    }

    public static void main(String[] args) {
        m();
    }
}