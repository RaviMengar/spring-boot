package com.spring.aop.springaop.dao;
import org.springframework.stereotype.Repository;

@Repository
public class AopDao1 {
	
	public String retrieveSomething(){
		return "Dao1";
	}
}