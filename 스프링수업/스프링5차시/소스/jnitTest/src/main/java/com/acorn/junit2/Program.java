package com.acorn.junit2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Program {

	
	@Autowired
	Calculator calculator;
	
	
	public int cal() {
		
		return  calculator.add(5, 3);
	}
	
}
