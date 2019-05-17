package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * ��ģʽ�ĵ���,ͨ����̬����ʵ�ֵ�������Ҫ����JVM������ػ���ʵ��
 * ȱ�㣺ռ����Դ
 * ������ռ����Դ�٣��ڳ�ʼ����ʱ��ͻᱻ�õ�����
 */
public class SingletonHungary {
    private static SingletonHungary instance = new SingletonHungary();

    //������������Ϊprivate��ֹͨ��new����ʵ����
    private SingletonHungary(){
    }

    public static SingletonHungary newInstance(){
        return instance;
    }
}
