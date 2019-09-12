package com.spring.aop.springaop.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.springaop.dao.AopDao2;


@Service
public class Business2 {
	
	@Autowired
	private AopDao2 dao2;
	
	public String calculateSomething(){
		//Business Logic
		return dao2.retrieveSomething();
	}
}
