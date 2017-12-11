package com.sea.pattern.factory.abstractfactory.simplefactory.dao;

import com.sea.pattern.factory.abstractfactory.simplefactory.bean.User;

/**
 * 
 * ÓÃ»§²Ù×÷Dao
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface IUserDao {
	public void insert(User user);

	public void update(User user);
}
