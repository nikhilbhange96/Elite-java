package com.mmcoe.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;


public class TestAssertions {

	@Test
    public void testAssert() {

        String s1 = "Hello";
        String s2 = "Hello";

//        assertEquals(s1, s2);
//        assertSame(s1,s2);
          assertNotNull(s1);
//        assertNull(s2);
        
    }
}