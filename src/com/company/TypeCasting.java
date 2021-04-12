package com.company;

public class TypeCasting {

    public static void implicitTypeCasting() {
        byte a = 110;
        short b = 30000;
        char c = 'S';
        int d = 35000;
        long e = 40000l;
        float f = 3.222222f;
        double g = 5.1234567890;

        System.out.println("Implicit casting,Works just fine:" + (b = a));
        System.out.println("Implicit casting,Works just fine:" + (d = a));
        System.out.println("Implicit casting,Works just fine:" + (e = a));
        System.out.println("Implicit casting,Works just fine:" + (f = a));
        System.out.println("Implicit casting,Works just fine:" + (g = a));
        System.out.println("Implicit casting,Works just fine:" + (g = d));
    }

    public static void explicitTypeCasting() {

        int i = 234;
        byte j = (byte) i;
        System.out.println("Explicit casting: " + j);

        double d = 2.5555555;
        int e = (int) d;
        System.out.println("Explicit casting: " + e);

        int r = 120;
        char c = (char) r;
        System.out.println("Explicit casting: " + c);

    }

}
