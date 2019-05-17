package com.sea.pattern.singleton;

/**
 * Created by sea on 2019/5/17.
 * ʹ�þ�̬�ڲ���ʵ�ֵ���ģʽ--�̰߳�ȫ
 * �Ͷ���ģʽһ�����ǿ�JVM��֤��ľ�̬��Աֻ�ܱ�����һ�ε��ص㣬
 * �����ʹ�JVM���汣֤��ֻ����һ��ʵ������
 *
 * ���ַ�ʽ�Ͷ���ģʽ����ʲô�����أ���Ҳ����������ô��
 * ʵ��Ȼ������һ����ʱ�����ڲ��಻��ͬʱ�����ء�һ���౻���أ����ҽ�����ĳ����̬��Ա����̬�򡢹���������̬�����ȣ�������ʱ������
 *
 * ���ַ�ʽ��ʵ�ֵ���ģʽ�����Ž�
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
