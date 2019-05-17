package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * 使用静态内部类实现单例模式--线程安全
 * 和饿汉模式一样，是靠JVM保证类的静态成员只能被加载一次的特点，
 * 这样就从JVM层面保证了只会有一个实例对象
 *
 * 这种方式和饿汉模式又有什么区别呢？不也是立即加载么？
 * 实则不然，加载一个类时，其内部类不会同时被加载。一个类被加载，当且仅当其某个静态成员（静态域、构造器、静态方法等）被调用时发生。
 *
 * 这种方式是实现单例模式的最优解
 */
public class SingletonStaticInner {
    private SingletonStaticInner() {
    }

    private static class SingletonInner {
        private static SingletonStaticInner singletonStaticInner = new SingletonStaticInner();
    }

    public static SingletonStaticInner getInstance() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return SingletonInner.singletonStaticInner;
    }
}
