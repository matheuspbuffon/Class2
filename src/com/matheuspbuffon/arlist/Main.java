package com.matheuspbuffon.arlist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(35);
        integerList.add(75);
        integerList.add(105);

        System.out.println(integerList);
        //System.out.println(integerList.get(0));

        for (int currentInt:integerList) {
            System.out.println(currentInt);
        }
    }
}
