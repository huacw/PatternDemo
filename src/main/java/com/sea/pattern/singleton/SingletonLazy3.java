package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * ����ģʽ������ʵ��3--�̰߳�ȫ
 * ͨ������ͬ������飬Ч��Ҳ̫�ͣ���������鱻����
 */
public class SingletonLazy3 {
    private static SingletonLazy3 singletonLazy;

    private SingletonLazy3() {

    }

    public static SingletonLazy3 getInstance() {
        try {
            synchronized (SingletonLazy3.class) {
                if (null == singletonLazy) {
                    // ģ���ڴ�������֮ǰ��һЩ׼������
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
