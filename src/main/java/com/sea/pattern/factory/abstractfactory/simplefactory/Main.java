package com.sea.pattern.factory.abstractfactory.simplefactory;

import com.sea.pattern.factory.abstractfactory.simplefactory.bean.Department;
import com.sea.pattern.factory.abstractfactory.simplefactory.bean.User;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IDepartmentDao;
import com.sea.pattern.factory.abstractfactory.simplefactory.dao.IUserDao;

public class Main {

	public static void main(String[] args) {
		IDBFactory dbFactory = DBAccessFactory.createDBFactory();
		System.out.println("------------------添加用户------------------");
		IUserDao userDao = dbFactory.createUserDao();
		User u = new User();
		userDao.insert(u);
		System.out.println("------------------添加部门------------------");
		IDepartmentDao departmentDao = dbFactory.createDepartmentDao();
		Department department = new Department();
		departmentDao.insert(department);
	}

}
