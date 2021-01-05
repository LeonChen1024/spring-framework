package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * @author LeonChen
 * @since 5/14/20
 */
@Controller
@ComponentScan
public class Demo {
	public static void main(String[] args) {
		BeanFactory

		ApplicationContext


		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(Dao.class);
		ac.refresh();
		Dao dao = ac.getBean(Dao.class);
		dao.hello();


	}

}
