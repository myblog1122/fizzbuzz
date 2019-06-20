package com.minitest.fizzbuzz;

import static org.junit.Assert.*;

import com.minitest.fizzbuzz.service.FizzBuzzService;
import com.minitest.fizzbuzz.service.impl.FizzBuzzServiceImpl;
import org.junit.Test;


public class FizzBuzzServiceImplTest {
    @Test
    public void testTransferIsFizz() {
        int a =3;
        FizzBuzzService  fizzBuzzService=new FizzBuzzServiceImpl();
        Boolean result = fizzBuzzService.transfer_fizz(a);
        assertEquals(true, result);
    }
    @Test
    public void testTransferNotFizz() {
        int a =4;
        FizzBuzzService  fizzBuzzService=new FizzBuzzServiceImpl();
        Boolean result = fizzBuzzService.transfer_fizz(a);
        assertEquals(false, result);
    }

    @Test
    public void testTransferIsBuzz() {
        int a =5;
        FizzBuzzService  fizzBuzzService=new FizzBuzzServiceImpl();
        Boolean result = fizzBuzzService.transfer_buzz(a);
        assertEquals(true, result);
    }
    @Test
    public void testTransferNotBuzz() {
        int a =7;
        FizzBuzzService  fizzBuzzService=new FizzBuzzServiceImpl();
        Boolean result = fizzBuzzService.transfer_buzz(a);
        assertEquals(false, result);
    }
}
