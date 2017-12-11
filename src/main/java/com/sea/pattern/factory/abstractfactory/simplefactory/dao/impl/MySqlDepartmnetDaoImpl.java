package com.sea.pattern.factory.abstractfactory.simplefactory.dao.impl;

import com.sea.pattern.factory.abstractfactory.simplefactory.bean.Department;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IDepartmentDao;

/**
 * 
 * mysql数据库的部门Dao操作
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class MySqlDepartmnetDaoImpl implements IDepartmentDao {

	@Override
	public void insert(Department department) {
		System.out.println("mysql数据库插入部门信息");
	}

	@Override
	public void update(Department department) {
		System.out.println("mysql数据库更新部门信息");
	}

}
