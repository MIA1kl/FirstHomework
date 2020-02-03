package com.company;

public class Main {

    public static void main(String[] args) {

	for ( int i=1; i<=100; i++){
	    System.out.print("Divisors of number " +i+ " is: ");
	    for (int j=1;j<=i;j++)
	        if (i%j==0) System.out.print(j+", ");
	            System.out.println();

        }
    }
}
