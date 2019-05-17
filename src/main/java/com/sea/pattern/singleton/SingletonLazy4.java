package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * ����ģʽ������ʵ��4--�̲߳���ȫ
 * ͨ������ͬ������飬ֻͬ������ʵ���Ĵ���
 * ���ǻ������̰߳�ȫ����
 */
public class SingletonLazy4 {
    private static SingletonLazy4 singletonLazy;

    private SingletonLazy4() {
    }

    public static SingletonLazy4 getInstance() {
        try {
            if (null == singletonLazy) {//����1
                // ģ���ڴ�������֮ǰ��һЩ׼������
                Thread.sleep(1000);
                synchronized (SingletonLazy4.class) {
                    singletonLazy = new SingletonLazy4();//����2
                }
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        return singletonLazy;
    }
}
