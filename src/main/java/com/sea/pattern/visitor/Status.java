package com.sea.pattern.visitor;

import com.sea.pattern.visitor.impl.Man;
import com.sea.pattern.visitor.impl.Woman;

/**
 * 
 * ×´Ì¬£¨visitor£©
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface Status {
	public void getManStatus(Man man);

	public void getWomanStatus(Woman woman);
}
