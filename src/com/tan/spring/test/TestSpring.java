package com.tan.spring.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	@Test
	public void testConnect() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");

		System.out.println(dataSource.getConnection());
	}
	
	@Test
	public void testAnnotation(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = ac.getBean("user");
		System.out.println(bean);
		
	}
}
