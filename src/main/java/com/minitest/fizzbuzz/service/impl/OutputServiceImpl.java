package com.minitest.fizzbuzz.service.impl;

import com.minitest.fizzbuzz.service.FizzBuzzService;
import com.minitest.fizzbuzz.service.OutputNumberService;

public class OutputServiceImpl implements OutputNumberService {
 
	
	@Override
	public String output(int i) {
		
		FizzBuzzService fizzBuzzService=new FizzBuzzServiceImpl();
		Boolean fizzFlag=fizzBuzzService.transfer_fizz(i);
		Boolean buzzFlag=fizzBuzzService.transfer_buzz(i);

		String result="";
		if(fizzFlag) {
			result="Fizz";
		}
		if(buzzFlag) {
			result+="Buzz";
		}
		if("".equals(result)) {
			return String.valueOf(i);
		} 
		return result;
	}
  
}
