package com.minitest.fizzbuzz;

import com.minitest.fizzbuzz.node.CircularLinkedList;
import com.minitest.fizzbuzz.service.FizzBuzzService;
import com.minitest.fizzbuzz.service.OutputNumberService;
import com.minitest.fizzbuzz.service.impl.FizzBuzzServiceImpl;
import com.minitest.fizzbuzz.service.impl.OutputServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class OutputServiceImplTest {
    @Test
    public void testOutputAllNumber() {

        OutputNumberService outputNumberService=new OutputServiceImpl();
        CircularLinkedList clList=new CircularLinkedList();
        //put 100 numbers into clList
        clList.initList(100);
        int i=1;
        while(i<=100) {
            Integer element=clList.getElement(i);
            String result =outputNumberService.output(element);
            System.out.println(result);
            i++;
        }
    }
    @Test
    public void testOutputFizzBuzzNumber() {
        int a=15;
        OutputNumberService outputNumberService=new OutputServiceImpl();
        String result =outputNumberService.output(a);
        assertEquals("FizzBuzz", result);
    }

}
