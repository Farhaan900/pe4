package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class AscendingWordsTest {

    AscendingWords aw;

    @Before
    public void setUp() throws Exception {
        aw = new AscendingWords();
    }

    @After
    public void tearDown() throws Exception {
        aw = null;
    }

    @Test
    public void sorter() {


        assertEquals(Arrays.asList(new String[] {"apple","banana"}),aw.sorter("banana apple"));
        assertEquals(Arrays.asList(new String[]{"apple","banana","cat"}),aw.sorter("banana cat apple "));
        assertNotNull(aw.sorter(""));
        assertEquals(Arrays.asList(new String[]{"apple","banana","cat","dog"}),aw.sorter("banana cat apple dog"));
        assertEquals(Arrays.asList(new String[]{"apple"}),aw.sorter("apple"));
    }
}