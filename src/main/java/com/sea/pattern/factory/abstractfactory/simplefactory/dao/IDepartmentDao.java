package com.sea.pattern.factory.abstractfactory.simplefactory.dao;

import com.sea.pattern.factory.abstractfactory.simplefactory.bean.Department;

/**
 * 
 * ²¿ÃÅDao²Ù×÷
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface IDepartmentDao {
	public void insert(Department department);

	public void update(Department department);
}
