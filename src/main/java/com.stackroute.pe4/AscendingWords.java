package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AscendingWords {

    public List<String> sorter (String S_in){


        //split the string into words
        List<String> S_list = Arrays.asList(S_in.split(" +"));

        //sort the words
        Collections.sort(S_list);

        return S_list;
    }

}
