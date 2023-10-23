package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Student st=   ac.getBean("s",Student.class);
		System.out.println(st.getId());
		System.out.println(st.getName());
		
		
	}
}
