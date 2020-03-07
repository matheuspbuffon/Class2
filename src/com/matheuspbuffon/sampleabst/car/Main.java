package com.matheuspbuffon.sampleabst.car;

public class Main {

    public static void main(String[] args) {

        BMW xbmw = new BMW();
        Limo medLimo = new Limo();

        xbmw.setDoors();
        medLimo.setDoors();

        System.out.println(xbmw.doors);
        System.out.println(medLimo.doors);
    }
}
