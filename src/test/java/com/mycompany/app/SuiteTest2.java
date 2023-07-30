package com.mycompany.app;	

import org.junit.Assert;		
import org.junit.Test;		

public class SuiteTest2 {				
   	

    @Test		
    public void testSetName() {					
        		

        String expected = "Y";					
        String actual = "Y";					

        Assert.assertEquals(expected, actual);					
        System.out.println("Suite Test 2a is successful " + actual);							
    }	

    @Test		
    public void testSetName2() {					
        		

        String expected = "Y";					
        String actual = "Y";					

        Assert.assertEquals(expected, actual);					
        System.out.println("Suite Test 2b is successful " + actual);							
    }		

}		