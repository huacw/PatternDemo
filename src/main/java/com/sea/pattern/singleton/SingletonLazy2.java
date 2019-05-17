package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * ����ģʽ������ʵ��2--�̰߳�ȫ
 * ͨ������ͬ��������Ч��̫�ͣ���������������
 */
public class SingletonLazy2 {
    private static SingletonLazy2 singletonLazy;

    private SingletonLazy2() {
    }

    public static synchronized SingletonLazy2 getInstance() {
        try {
            if (null == singletonLazy) {
                // ģ���ڴ�������֮ǰ��һЩ׼������
                Thread.sleep(1000);
                singletonLazy = new SingletonLazy2();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singletonLazy;
    }
}