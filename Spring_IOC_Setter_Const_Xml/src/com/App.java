package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spec.Department;
import com.spec.Employee;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee empBean = ctxt.getBean("emp", Employee.class);
		
		System.out.println(empBean.getEmpId());
		System.out.println(empBean.getEmpName());
		
		Department depart = empBean.getDepartment();
		System.out.println(depart.getDepartmentCode());
		System.out.println(depart.getDepartmentName());
		
//		System.out.println(empBean.getDepartment().getDepartmentCode());
//		System.out.println(empBean.getDepartment().getDepartmentName());
		
		
	}

	private static void mannualWayOfSettingDependency() {
		Employee emp = new Employee();
		emp.setEmpId(45);
		emp.setEmpName("sekhar");
		Department dep = new Department();
		dep.setDepartmentCode("HR");
		dep.setDepartmentName("Human Resource");
		emp.setDepartment(dep);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getDepartment().getDepartmentCode());
		System.out.println(emp.getDepartment().getDepartmentName());
	}
}
