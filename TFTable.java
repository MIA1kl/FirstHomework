package com.company;

public class TFTable {

    public static void main(String[] args) {
        boolean p, q;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT\t\t&&\t\t||");
        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (!p) + "\t");
        System.out.println((p && q) + "\t" + (p || q));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (!p) + "\t");
        System.out.println((p && q) + "\t" + (p || q));

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (!p) + "\t");
        System.out.println((p && q) + "\t" + (p || q));

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (!p) + "\t");
        System.out.println((p && q) + "\t" + (p || q));
    }
}
