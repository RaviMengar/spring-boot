package com.spring.aop.springaop.dao;
import org.springframework.stereotype.Repository;

@Repository
public class AopDao2 {

	public String retrieveSomething(){
		return "Dao2";
	}

}