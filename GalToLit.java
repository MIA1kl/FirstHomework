package com.company;
//import java.util.Scanner;

public class GalToLit {

    public static void main(String[] args) {
//        Scanner GalLit =  new Scanner(System.in);
        double q, a;
//        q = GalLit.nextDouble();
        for (q=1;q<=100;q++) {
            a = q * 3.7854;
            System.out.println(q+" result is: " + a);
            if (q%10==0) {
                System.out.println(" ");
            }

        }
    }
}
