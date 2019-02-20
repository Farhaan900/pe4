package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurancesOfStringTest {

    OccurancesOfString oosms;

    @Before
    public void setUp() throws Exception {
        oosms = new OccurancesOfString();
    }

    @After
    public void tearDown() throws Exception {
        oosms = null;
    }

    @Test
    public void occFinder() {
        assertEquals("0-2",oosms.occFinder("apple","ap"));
        assertEquals("0-2 6-8",oosms.occFinder("apple ap","ap"));
        assertEquals("0-2 7-9",oosms.occFinder("apple  ap","ap"));
        assertEquals("0-4",oosms.occFinder("apple ap","appl"));
    }
}