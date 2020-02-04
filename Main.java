package com.company;

public class Main {

    public static void main(String[] args)
            throws java.io.IOException{
                int i;
                System.out.println("Click S");
                for(i=0; (char)System.in.read()!='s';i++) {
                    System.out.println(i);
        }

    }
}
