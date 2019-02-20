package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoOfCharTest {

    NoOfChar noc;

    @Before
    public void setUp() throws Exception {
        noc = new NoOfChar();
    }

    @After
    public void tearDown() throws Exception {
        noc = null;
    }

    @Test
    public void countChar() {

        assertEquals(1,noc.countChar('a',"apple"));
        assertEquals(2,noc.countChar('p',"apple"));
        assertEquals(0,noc.countChar('x',"apple"));
        assertEquals(1,noc.countChar('e',"apple"));
        assertEquals(2,noc.countChar('n',"banana"));
        assertEquals(0,noc.countChar('1',"apple"));
        assertEquals(5,noc.countChar('l',"applelllaal"));
        assertEquals(1,noc.countChar('c',"caT"));
        assertEquals(1,noc.countChar('A',"apple"));
        assertEquals(1,noc.countChar('a',"Apple"));
        assertEquals(0,noc.countChar('a',""));
        assertEquals(0,noc.countChar(' ',"apple"));
        assertEquals(5,noc.countChar('a',"Apple is apple not banana"));

    }
}