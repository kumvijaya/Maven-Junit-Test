package com.mycompany.app;	

import static org.junit.Assert.assertEquals;				

import org.junit.Test;		

public class SuiteTest1 {						

    @Test(expected = ArithmeticException.class)					
    public void testJUnitMessage() {				
        String expected = "Y";					
        String actual = "Y";					
        assertEquals(expected, actual);		
    }		

    @Test		
    public void testJUnitHiMessage() {					
        String expected = "Y";					
        String actual = "Y";					
        assertEquals(expected, actual);												
    }		
}