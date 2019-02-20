package com.stackroute.pe4;

public class ReplaceChar {

    public String replacer(String S_in){

        // replace all the occurances of l and d with t and f
        return S_in.replaceAll("l","t").replaceAll("d","f");

    }

}
