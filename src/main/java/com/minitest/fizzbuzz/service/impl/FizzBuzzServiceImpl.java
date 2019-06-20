package com.minitest.fizzbuzz.service.impl;

import com.minitest.fizzbuzz.service.FizzBuzzService;

public class FizzBuzzServiceImpl implements FizzBuzzService {
 
	@Override
	public Boolean transfer_fizz(int i) {
		if(i%3==0) {
			return true;
		} 
		return false;
		 
	}
	@Override
	public Boolean transfer_buzz(int i) {
		if(i%5==0) {
			return true;
		} 
		return false;
	}
	
}
