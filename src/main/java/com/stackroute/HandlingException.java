package com.stackroute;

public class HandlingException {

    public  int myIndexOf(char[] str, int ch, int index){

        if (str == null) {
            throw new NullPointerException();
        }
        // increase efficiency
        if (str.length <= index || index < 0) {
            return -1;
        }
        for (int i = index; i < str.length; i++) {
            if (index == str[i]) {
                return i;
            }
        }
        // if not found
        return -1;
    }
}
