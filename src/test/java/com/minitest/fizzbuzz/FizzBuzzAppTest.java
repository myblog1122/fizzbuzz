package com.minitest.fizzbuzz;

 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	FizzBuzzServiceImplTest.class,
	OutputServiceImplTest.class
})
public class FizzBuzzAppTest 
{
	@Test
	public void contextLoads() {
	}
}
