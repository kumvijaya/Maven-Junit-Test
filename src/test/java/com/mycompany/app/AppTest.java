package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        String message1 = null;
        String message2 =  null;
        try{
            message1 = app1.getMessage();
            message2 = app2.getMessage();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(message1, message2);
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        String message1 = null;
        try{

            message1 = app.getMessage();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        assertEquals("Hello World!", message1);
    }
}
