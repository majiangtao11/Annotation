package com.test.thread;

import javax.swing.tree.VariableHeightLayoutCache;
import java.util.concurrent.FutureTask;

/**
 * @author: mjt
 * time:2021-10-09
 * desription:
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("继承thread类，重写run()方法");
            }
        };
        thread.start();

//        ###############################################

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("实现runnable接口，重写run() 方法");
            }
        });
        thread1.start();

//        ###############################################

//        new FutureTask<>(n)
    }
}