package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurancesOfString {

    public String occFinder (String S_in, String S_find){

        String S_out = "";
        Pattern pattern = Pattern.compile(S_find);
        Matcher matcher = pattern.matcher(S_in);

        while (matcher.find()) {
            S_out += matcher.start() + "-" + matcher.end() + " ";
        }

        return S_out.trim();
    }

}
