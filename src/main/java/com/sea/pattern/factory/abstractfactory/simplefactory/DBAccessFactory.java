package com.sea.pattern.factory.abstractfactory.simplefactory;

import java.io.IOException;
import java.util.Properties;

import com.sea.pattern.factory.abstractfactory.simplefactory.impl.MySqlDBFactory;
import com.sea.pattern.factory.abstractfactory.simplefactory.impl.OracleDBFactory;

/**
 * 
 * 数据库访问工厂
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class DBAccessFactory {
	private final static String DB_TYPE = "mysql";
	private static boolean isReflect = true;

	public static IDBFactory createDBFactory() {
		if (isReflect) {
			return createDBFactoryWithReflect();
		}
		if ("oracle".equalsIgnoreCase(DB_TYPE)) {
			return new OracleDBFactory();
		} else if ("mysql".equalsIgnoreCase(DB_TYPE)) {
			return new MySqlDBFactory();
		} else {
			return new OracleDBFactory();
		}
	}

	/**
	 * 使用反射实现
	 * 
	 * @return
	 */
	private static IDBFactory createDBFactoryWithReflect() {
		Properties prop = new Properties();
		try {
			prop.load(DBAccessFactory.class
					.getResourceAsStream("conf.properties"));
			return (IDBFactory) Class.forName(prop.getProperty("db_factory"))
					.newInstance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
