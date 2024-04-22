package com.acorn.junit2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test2.xml"  } )
public class CalculatorTest {

	@Autowired
	Calculator calculator;
	
	@Test
	public void test() {
		 int result = calculator.add(4, 5);
		 assertEquals(9, result);
	}

}
