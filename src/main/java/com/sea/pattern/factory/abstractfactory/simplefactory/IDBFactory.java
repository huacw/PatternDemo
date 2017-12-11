package com.sea.pattern.factory.abstractfactory.simplefactory;

import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IDepartmentDao;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IUserDao;

/**
 * 
 * 数据库工厂
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface IDBFactory {
	public IDepartmentDao createDepartmentDao();

	public IUserDao createUserDao();
}
