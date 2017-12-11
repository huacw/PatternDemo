package com.sea.pattern.factory.abstractfactory;

/**
 * 
 * ���ֹ���
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface HumanFactory {
	//����һ����ɫ���� 
	public Human createYellowHuman();  
	  
	//����һ����ɫ���� 
	public Human createWhiteHuman(); 
	  
	//����һ����ɫ���� 
	public Human createBlackHuman();
}
