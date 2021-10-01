package za.ac.nwu.ac.logic.flow.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ModuloTest {

    private Modulo mod;

    @Before
    public void setUp() throws Exception {
    mod = new Modulo();
    }

    @Test
    public void testMethod(){
        Integer result = mod.doMod(9, 5);
        assertNotNull("Should not be null", result);
        assertEquals("Should be value 4", 4, result.intValue());
    }


    @Test()
    public void testMethodByo(){
        try{
            mod.doMod(9, 0);
            fail("Should throw exception");
        } catch (Exception e){
            assertTrue("Error Message expected", e.getMessage().equalsIgnoreCase("Some Reason"));
        }

    }
}
