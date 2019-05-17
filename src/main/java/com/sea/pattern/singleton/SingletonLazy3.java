package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * 单例模式的懒汉实现3--线程安全
 * 通过设置同步代码块，效率也太低，整个代码块被加锁
 */
public class SingletonLazy3 {
    private static SingletonLazy3 singletonLazy;

    private SingletonLazy3() {

    }

    public static SingletonLazy3 getInstance() {
        try {
            synchronized (SingletonLazy3.class) {
                if (null == singletonLazy) {
                    // 模拟在创建对象之前做一些准备工作
                    Thread.sleep(1000);
                    singletonLazy = new SingletonLazy3();
                }
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        return singletonLazy;
    }
}
