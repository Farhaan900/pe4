package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PressenceOfStringTest {

    PressenceOfString posms;

    @Before
    public void setUp() throws Exception {
        posms = new PressenceOfString();
    }

    @After
    public void tearDown() throws Exception {
        posms = null;
    }

    @Test
    public void finder() {
        assertEquals(true, posms.finder("apple banana", "apple"));
        assertEquals(false, posms.finder("apple banana", "cat"));
    }
}