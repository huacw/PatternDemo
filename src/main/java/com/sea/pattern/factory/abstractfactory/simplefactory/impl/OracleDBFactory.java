package com.sea.pattern.factory.abstractfactory.simplefactory.impl;

import com.sea.pattern.factory.abstractfactory.simplefactory.IDBFactory;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IDepartmentDao;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IUserDao;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.impl.OracleDepartmnetDaoImpl;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.impl.OracleUserDaoImpl;

/**
 * 
 * oracle数据库工厂
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class OracleDBFactory implements IDBFactory {

	@Override
	public IDepartmentDao createDepartmentDao() {
		return new OracleDepartmnetDaoImpl();
	}

	@Override
	public IUserDao createUserDao() {
		return new OracleUserDaoImpl();
	}

}
