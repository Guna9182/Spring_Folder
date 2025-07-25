package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spec.Sim;
import com.spec.impl.Airtel;
import com.spec.impl.Bsnl;
import com.spec.impl.Jio;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		Sim bean = ctxt.getBean("sim", Sim.class);
		
		bean.calling(234);
		bean.callingAndSms(9876, "GOOD");
		bean.netWorkMode("5g");
		
	}
}
