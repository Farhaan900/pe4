package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString tsms;

    @Before
    public void setUp() throws Exception {
        tsms = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        tsms = null;
    }

    @Test
    public void transposer() {
        assertEquals("elppa",tsms.transposer("apple"));
        assertEquals("elppa ananab",tsms.transposer("apple banana"));
        assertEquals("sihT elppa",tsms.transposer("This apple"));
        assertNotNull(tsms.transposer(""));
    }
}