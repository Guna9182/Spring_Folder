package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spec.Department;
import com.spec.Employee;
import com.spec.MyConfig;


public class App 
{
    public static void main( String[] args ) {
    	
    	ApplicationContext ctxt = new AnnotationConfigApplicationContext(MyConfig.class);
    	Employee empBean = ctxt.getBean("employee", Employee.class);
    	
    	System.out.println(empBean.getEmpName());
    	System.out.println(empBean.getEmpId());
    	
    	System.out.println(empBean.getDepartment().getDepartmentCode());
    	
    }
    
}
