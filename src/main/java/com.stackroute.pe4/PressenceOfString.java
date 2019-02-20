package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PressenceOfString {

    public boolean finder(String S_in,String S_find){

        // return true if the pattern is found
        return Pattern.compile(S_find).matcher(S_in).find();

    }

}
