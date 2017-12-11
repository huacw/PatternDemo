package com.sea.pattern.subscribe.delegate.event.impl;

import java.lang.reflect.Method;

import com.sea.pattern.subscribe.delegate.event.IEvent;
import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * �¼���
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Event implements IEvent {
	// Ҫִ�з����Ķ���
	private IListener listener;
	// Ҫִ�еķ�������
	private String methodName;
	// Ҫִ�з����Ĳ���
	private Object[] params;
	// Ҫִ�з����Ĳ�������
	private Class<?>[] paramTypes;

	public Event() {
	}

	public Event(IListener listener, String methodName, Object... args) {
		this.listener = listener;
		this.methodName = methodName;
		this.params = args;
		contractParamTypes(this.params);
	}

	// ���ݲ����������ɲ�����������
	private void contractParamTypes(Object[] params) {
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}

	// ����setter getterʡ��
	public void setParamTypes(Class<?>[] paramTypes) {
		this.paramTypes = paramTypes;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Class<?>[] getParamTypes() {
		return paramTypes;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	// ִ�и� ����ĸ÷���
	public void invoke() throws Exception {
		Method method = listener.getClass().getMethod(this.getMethodName(),
				this.getParamTypes());
		if (null == method) {
			return;
		}
		method.setAccessible(true);//ȡ����ȫ����Ȩ��
		method.invoke(this.listener, params);
	}
}
