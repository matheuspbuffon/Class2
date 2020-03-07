package com.matheuspbuffon.arlist;

import java.util.Comparator;

public class SortComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return t1.compareTo(s);
    }
}
