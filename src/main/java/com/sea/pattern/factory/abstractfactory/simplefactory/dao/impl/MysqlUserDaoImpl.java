package com.sea.pattern.factory.abstractfactory.simplefactory.dao.impl;

import com.sea.pattern.factory.abstractfactory.simplefactory.bean.User;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IUserDao;

/**
 * 
 * mysql数据库的用户Dao操作
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class MysqlUserDaoImpl implements IUserDao {

	@Override
	public void insert(User user) {
		System.out.println("mysql数据库插入用户信息");
	}

	@Override
	public void update(User user) {
		System.out.println("mysql数据库更新用户信息");
	}

}
