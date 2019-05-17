package com.sea.pattern.singleton;

import java.io.Serializable;

/**
 * Created by sea on 2019/5/17.
 * ʹ�������ڲ���ʵ�ֵ���ģʽ�����������л��ͷ����л��ĳ������õ��Ĳ���ͬһ��ʵ��
 * �����������������л���ʱ��ʹ��readResolve����
 *
 * readResolve()���������Ǻη���ʥ����ʵ��JVM���ڴ��з����л���"��װ"һ���¶���ʱ���ͻ��Զ�������� readResolve��������������ָ���õĶ�����,
 * ��������Ҳ�͵õ��˱�֤��readResolve()�ĳ����������Ա���п���ͨ�������л��õ��Ķ���
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
        System.out.println("������readResolve����");
        return InnerClass.singletonStaticInnerSerialize;
    }
}
