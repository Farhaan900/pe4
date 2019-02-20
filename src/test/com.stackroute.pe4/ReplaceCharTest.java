package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {

    ReplaceChar rcms;
    @Before
    public void setUp() throws Exception {
        rcms = new ReplaceChar();
    }

    @After
    public void tearDown() throws Exception {
        rcms = null;
    }

    @Test
    public void replacer() {
        assertEquals("faity fry", rcms.replacer("daily dry"));
        assertEquals("faity fryaa", rcms.replacer("daily dryaa"));
        assertEquals("faity fry xxtt", rcms.replacer("daily dry xxll"));
        assertEquals("faity fry t t", rcms.replacer("daily dry l l"));
        assertEquals("faity fry tft", rcms.replacer("daily dry tdt"));
        assertEquals("faity fry xx", rcms.replacer("daily dry xx"));
        assertEquals("xxxxxx", rcms.replacer("xxxxxx"));
        assertEquals("f", rcms.replacer("d"));
        assertEquals("t", rcms.replacer("l"));
        assertEquals(" ", rcms.replacer(" "));
        assertEquals("", rcms.replacer(""));

    }
}