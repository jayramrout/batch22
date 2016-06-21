package jrout.tutorial.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HondaCompany {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.cfg.xml");
		ICompany company = (ICompany)ctx.getBean("company");
		System.out.println(company.totalEmployees());
		System.out.println(company.getManufacture());
	}
}