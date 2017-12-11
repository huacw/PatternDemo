package com.sea.pattern.subscribe.delegate.event.impl;

import java.lang.reflect.Method;

import com.sea.pattern.subscribe.delegate.event.IEvent;
import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * 事件类
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Event implements IEvent {
	// 要执行方法的对象
	private IListener listener;
	// 要执行的方法名称
	private String methodName;
	// 要执行方法的参数
	private Object[] params;
	// 要执行方法的参数类型
	private Class<?>[] paramTypes;

	public Event() {
	}

	public Event(IListener listener, String methodName, Object... args) {
		this.listener = listener;
		this.methodName = methodName;
		this.params = args;
		contractParamTypes(this.params);
	}

	// 根据参数数组生成参数类型数组
	private void contractParamTypes(Object[] params) {
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}

	// 若干setter getter省略
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

	// 执行该 对象的该方法
	public void invoke() throws Exception {
		Method method = listener.getClass().getMethod(this.getMethodName(),
				this.getParamTypes());
		if (null == method) {
			return;
		}
		method.setAccessible(true);//取消安全访问权限
		method.invoke(this.listener, params);
	}
}
