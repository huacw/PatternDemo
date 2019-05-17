package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * ����ģʽ������ʵ��1--�̲߳���ȫ
 */
public class SingletonLazy1 {
    private static SingletonLazy1 singletonLazy;

    private SingletonLazy1() {
    }

    public static SingletonLazy1 getInstance() {
        if (null == singletonLazy) {
            try { // ģ���ڴ�������֮ǰ��һЩ׼������
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singletonLazy = new SingletonLazy1();
        }
        return singletonLazy;
    }
}