package com.lovo.s1;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MyRequest {
      private GreetingService gs;

	public void sendyHiRiquest(){
		gs.sayHi();
	}
	

	public GreetingService getGs() {
		return gs;
	}

	public void setGs(GreetingService gs) {
		this.gs = gs;
	}
	public static void main(String[] args) {
		
		BeanFactory bf = 
	    		new XmlBeanFactory(new FileSystemResource(new File("hello.xml")));
		MyRequest mr=
				(MyRequest)bf.getBean("mr");
		mr.sendyHiRiquest();
	}
      
}
