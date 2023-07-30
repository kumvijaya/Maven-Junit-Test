package com.mycompany.app;	

import static org.junit.Assert.assertEquals;				

import org.junit.Test;		

public class Test1 {						

    @Test				
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