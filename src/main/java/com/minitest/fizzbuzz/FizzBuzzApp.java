package com.minitest.fizzbuzz;


import com.minitest.fizzbuzz.node.CircularLinkedList;
import com.minitest.fizzbuzz.service.OutputNumberService;
import com.minitest.fizzbuzz.service.impl.OutputServiceImpl;

/**
	* @Title: FizzBuzzApp 
	* @Description: main application   
	* @author ZhouXiaowei
	* @date 2019.6.19
	* @version V1.0   
*/
public class FizzBuzzApp 
{
	 
    public static void main(String[] args )
    {
    	//init a circularLinkedList
    	CircularLinkedList  clList=new CircularLinkedList();
    	//put 100 numbers into clList
    	clList.initList(100);
    	OutputNumberService outputNumberService=new OutputServiceImpl();
    	int i=1;
    	 
    	while(i<=100) {
    		Integer element=clList.getElement(i);
    		System.out.println(outputNumberService.output(element));
    		i++;
        }
    	 
    }
}
