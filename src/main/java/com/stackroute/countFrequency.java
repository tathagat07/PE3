package com.stackroute;

import java.util.*;
public class countFrequency {

    public static Set<String> countFreq (String list)
    {

        Set<String> st = new HashSet<String>(Collections.singleton(list));
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(Collections.singleton(list), s));
       return st;
    }

}
