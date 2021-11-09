package com.test.juc;

/**
 * @author: mjt
 * time:2021-11-09
 * desription:
 *  同步和非同步方法是否可以同时运行？
 *  答案是可以一起运行的
 */
public class SyncOrAsync {
    public synchronized  void m1(){
        System.out.println(Thread.currentThread().getName() + "m1 开始运行");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m1 运行结合");
    }

    public void m2(){
        System.out.println(Thread.currentThread().getName() + "m2 开始运行");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m2 运行结合");
    }

    public static void main(String[] args) {
        SyncOrAsync sos = new SyncOrAsync();
        new Thread(sos :: m1,"m1").start();
        new Thread(sos :: m2,"m2").start();
    }
}