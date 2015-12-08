package com.anshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class drwaingapp implements Cloneable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	//	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Triangle1 tri=(Triangle1) context.getBean("riangle");
		tri.draw();
		// TODO Auto-generated method stub

	}

}
