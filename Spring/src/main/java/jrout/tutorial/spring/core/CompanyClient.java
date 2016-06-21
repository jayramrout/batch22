package jrout.tutorial.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CompanyClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.cfg.xml");
		ICompany company = (ICompany)ctx.getBean("company");
		System.out.println(company.totalEmployees());
		System.out.println(company.getManufacture());
		System.out.println(company);
	}
}