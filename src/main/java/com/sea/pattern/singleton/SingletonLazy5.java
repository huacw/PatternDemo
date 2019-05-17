package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * 单例模式的懒汉实现5--线程安全
 * 通过设置同步代码块，使用DCL双检查锁机制
 * 使用双检查锁机制成功的解决了单例模式的懒汉实现的线程不安全问题和效率问题
 * DCL 也是大多数多线程结合单例模式使用的解决方案
 *
 */
public class SingletonLazy5 {
    private static SingletonLazy5 singletonLazy;

    private SingletonLazy5() {
    }

    public static SingletonLazy5 getInstance() {
        try {
            if (null == singletonLazy) {
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
                synchronized (SingletonLazy5.class) {
                    if (null == singletonLazy) {
                        singletonLazy = new SingletonLazy5();
                    }
                }
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        return singletonLazy;
    }
}