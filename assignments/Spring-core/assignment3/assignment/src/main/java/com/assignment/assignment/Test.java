package com.assignment.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		BankAccountcontroller accountcontroller = (BankAccountcontroller) context.getBean("bankaccountcontroller");
		System.out.println(accountcontroller.getBalance(11802445));
		System.out.println(accountcontroller.deposit(11802445, 15000));
		System.out.println(accountcontroller.getBalance(11802445));
		

	}

}
