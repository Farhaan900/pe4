package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TransposeString {

    public String transposer(String S_in){

        String S_out = "";

        //split the string into words
        for(String ss: S_in.split(" +")){

            //divide each word into single characters
            List<String> S_list =  Arrays.asList(ss.split(""));
            //reverses the word
            Collections.reverse(S_list);
            //joins the reversed words
            S_out += String.join("",S_list) + " ";

        }
        return S_out.trim();
    }
}
