package com.test.juc;

import java.util.concurrent.TimeUnit;

/**
 * @author: mjt
 * time:2021-11-09
 * desription:
 *  银行业务：产生脏读数据(dirtyRead)
 *      对业务写方法加锁
 *      对业务读方法加锁
 */
public class Account {
    String name;
    Double money;

    public synchronized void set(String name,Double money){
        this.name = name;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.money = money;
    }

    public synchronized Double getMoney(){
        return this.money;
    }

    public static void main(String[] args) {
        Account account = new Account();
        new Thread(() -> account.set("张三",100.0)).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.getMoney());

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account.getMoney());
    }
}