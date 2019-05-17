package com.sea.pattern.singleton;

import java.io.Serializable;

/**
 * Created by sea on 2019/5/17.
 * 使用匿名内部类实现单例模式，在遇见序列化和反序列化的场景，得到的不是同一个实例
 * 解决这个问题是在序列化的时候使用readResolve方法
 *
 * readResolve()方法到底是何方神圣，其实当JVM从内存中反序列化地"组装"一个新对象时，就会自动调用这个 readResolve方法来返回我们指定好的对象了,
 * 单例规则也就得到了保证。readResolve()的出现允许程序员自行控制通过反序列化得到的对象。
 */
public class SingletonStaticInnerSerialize implements Serializable {
    private static final long serialVersionUID = 1L;

    private static class InnerClass {
        private static SingletonStaticInnerSerialize singletonStaticInnerSerialize = new SingletonStaticInnerSerialize();
    }

    public static SingletonStaticInnerSerialize getInstance() {
        return InnerClass.singletonStaticInnerSerialize;
    }

    protected Object readResolve() {
        System.out.println("调用了readResolve方法");
        return InnerClass.singletonStaticInnerSerialize;
    }
}
