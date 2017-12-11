package com.sea.pattern.factory.abstractfactory.simplefactory.dao.impl;

import com.sea.pattern.factory.abstractfactory.simplefactory.bean.Department;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IDepartmentDao;

/**
 * 
 * oracle���ݿ�Ĳ���Dao����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class OracleDepartmnetDaoImpl implements IDepartmentDao {

	@Override
	public void insert(Department department) {
		System.out.println("oracle���ݿ���벿����Ϣ");
	}

	@Override
	public void update(Department department) {
		System.out.println("oracle���ݿ���²�����Ϣ");
	}

}
