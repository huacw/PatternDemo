package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * ����ģʽ������ʵ��5--�̰߳�ȫ
 * ͨ������ͬ������飬ʹ��DCL˫���������
 * ʹ��˫��������Ƴɹ��Ľ���˵���ģʽ������ʵ�ֵ��̲߳���ȫ�����Ч������
 * DCL Ҳ�Ǵ�������߳̽�ϵ���ģʽʹ�õĽ������
 *
 */
public class SingletonLazy5 {
    private static SingletonLazy5 singletonLazy;

    private SingletonLazy5() {
    }

    public static SingletonLazy5 getInstance() {
        try {
            if (null == singletonLazy) {
                // ģ���ڴ�������֮ǰ��һЩ׼������
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