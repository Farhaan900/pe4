package com.stackroute.pe4;

public class NoOfChar {
    public int countChar (char c_in, String S_in){

        //substract the length of the new string without the characters from the original string
        return S_in.length()-(S_in.toLowerCase().replaceAll(Character.toString(Character.toLowerCase(c_in)),"")).length();
    }

}
