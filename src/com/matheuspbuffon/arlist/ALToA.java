package com.matheuspbuffon.arlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ALToA {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Rakshith");
        stringList.add("Random");
        stringList.add("Text");
        stringList.add("Entry");
        stringList.add("Point");

        System.out.println("Before sort: "+ stringList);

        Collections.sort(stringList, new SortComparator());

        System.out.println("After sort: "+ stringList);
    }
}
