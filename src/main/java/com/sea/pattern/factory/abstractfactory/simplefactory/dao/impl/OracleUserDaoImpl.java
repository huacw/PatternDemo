package com.sea.pattern.factory.abstractfactory.simplefactory.dao.impl;

import com.sea.pattern.factory.abstractfactory.simplefactory.bean.User;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IUserDao;

/**
 * 
 * oracle���ݿ���û�Dao����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class OracleUserDaoImpl implements IUserDao {

	@Override
	public void insert(User user) {
		System.out.println("oracle���ݿ�����û���Ϣ");
	}

	@Override
	public void update(User user) {
		System.out.println("oracle���ݿ�����û���Ϣ");
	}

}
