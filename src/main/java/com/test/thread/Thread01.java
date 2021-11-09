package com.test.thread;


import cn.hutool.core.thread.ThreadUtil;
import lombok.Getter;
import lombok.Setter;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author: mjt
 * time:2021-11-08
 * desription:
 *      工作中是否有这样的场景，多个线程任务，如果所有线程完成到某个阶段，
 *      你希望知道所有线程均完成该阶段。当然你使用线程计数可以实现，只是不够优雅。
 */
public class Thread01 {
    public static final ExecutorService executorService = Executors.newFixedThreadPool(50);

    @Getter
    @Setter
    public static class SegmentedTask {
        private Runnable start;
        private Runnable middle;
        private Runnable end;

        public SegmentedTask(Runnable start, Runnable middle, Runnable end) {
            this.start = start;
            this.middle = middle;
            this.end = end;
        }
    }

    /**
     * 提交任务
     *
     * @param tasks 参数
     */
    public static void submit(List<SegmentedTask> tasks) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(tasks.size() + 1);
        try {
            tasks.forEach(
                    x -> {
                        executorService.submit(
                                () -> {
                                    try {
                                        x.getStart().run();
                                        cyclicBarrier.await();
                                        x.getMiddle().run();
                                        cyclicBarrier.await();
                                        x.getEnd().run();
                                        cyclicBarrier.await();
                                    } catch (InterruptedException | BrokenBarrierException e) {
                                        e.printStackTrace();
                                    }
                                });
                    });
            cyclicBarrier.await();
            System.out.println("初始任务已经全部完成");
            cyclicBarrier.await();
            System.out.println("中间任务已经全部完成");
            cyclicBarrier.await();
            System.out.println("最终任务已经全部完成");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void destroy() {
        System.out.println("摧毁线程池");
        executorService.shutdown();
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<SegmentedTask> tasks = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            int finalI = i;
            tasks.add(
                    new SegmentedTask(
                            () -> {
                                ThreadUtil.sleep(random.nextInt(10), TimeUnit.SECONDS);
                                System.out.println(
                                        Thread.currentThread() + ":" + MessageFormat.format("第{0}军团已经开始推进！", finalI));
                            },
                            () -> {
                                ThreadUtil.sleep(random.nextInt(10), TimeUnit.SECONDS);
                                System.out.println(
                                        Thread.currentThread() + ":" + MessageFormat.format("第{0}军团已经正在进攻！", finalI));
                            },
                            () -> {
                                ThreadUtil.sleep(random.nextInt(10), TimeUnit.SECONDS);
                                System.out.println(
                                        Thread.currentThread() + ":" + MessageFormat.format("第{0}军团已经攻陷阵地！", finalI));
                            }));
        }
        Thread01.submit(tasks);
        ThreadUtil.sleep(35, TimeUnit.SECONDS);
        Thread01.destroy();
    }

}