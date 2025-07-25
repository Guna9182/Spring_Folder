package com.spec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com")
//@PropertySource(value = "classpath:app.properties")
public class MyConfig {

	@Bean("employee")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEmpId(543);
		emp.setEmpName("Sekhar");
		emp.setDepartment(getDepartment());
		return emp;
	}
	
	@Bean("department")
//	@Scope("prototype")
	public Department getDepartment() {
		Department depart = new Department();
		depart.setDepartmentCode("HR");
		return depart;
	}
	
	
	// constructor way injecting
//	@Bean("employee")
//	public Employee getEmployee(Department department) {
//		Employee emp = new Employee(1,"gfd", department);
//		emp.setDepartment(department);
//		return emp;
//	}
//	
//	@Bean("department")
//	public Department getDepartment() {
//		return new Department("Admin", "admin");
//	}
}
