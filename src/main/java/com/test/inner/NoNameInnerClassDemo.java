package com.test.inner;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author: mjt
 * time:2022-06-21
 * desription:匿名内部类
 */
public class NoNameInnerClassDemo {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });


    }
    class Runner implements Runnable{

        @Override
        public void run() {

        }
    }
}