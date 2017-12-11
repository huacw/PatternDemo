package com.sea.pattern.factory.abstractfactory;

/**
 * 
 * 人种工厂
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface HumanFactory {
	//制造一个黄色人种 
	public Human createYellowHuman();  
	  
	//制造一个白色人种 
	public Human createWhiteHuman(); 
	  
	//制造一个黑色人种 
	public Human createBlackHuman();
}
