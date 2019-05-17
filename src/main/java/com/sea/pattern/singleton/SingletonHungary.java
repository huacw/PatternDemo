package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * 恶汉模式的单例,通过静态变量实现单例，主要利用JVM的类加载机制实现
 * 缺点：占用资源
 * 适用于占用资源少，在初始化的时候就会被用到的类
 */
public class SingletonHungary {
    private static SingletonHungary instance = new SingletonHungary();

    //将构造器设置为private禁止通过new进行实例化
    private SingletonHungary(){
    }

    public static SingletonHungary newInstance(){
        return instance;
    }
}
