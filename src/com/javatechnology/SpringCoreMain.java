package com.javatechnology;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringCoreMain {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("C:\\Users\\Suresh\\Downloads\\Spring&SpringBoot08\\Spring07\\src\\SpringConfig.xml"));
		//ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Suresh\\Downloads\\Spring&SpringBoot08\\Spring07\\src\\SpringConfig.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		/*GreetingService service=(GreetingService)factory.getBean("greetingService");
		service.sayGreeting();*/
		Performer performer=(Performer)context.getBean("performer");
		performer.perform();
		
		

	}

}

