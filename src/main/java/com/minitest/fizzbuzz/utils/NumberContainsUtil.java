package com.minitest.fizzbuzz.utils;

public final  class NumberContainsUtil {
	
	/**
	 * judge Integer container contain belong 
	 * @param container
	 * @param belong
	 * @return Boolean
	 */
 public static Boolean contains(Integer container,Integer belong) {
	 String strC=container.toString();
	 return strC.contains(String.valueOf(belong)) ? true :false;
 }
  
}
