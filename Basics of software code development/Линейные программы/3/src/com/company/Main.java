package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double z = 0;
    int x, y;
    Scanner in = new Scanner(System.in);
    x = in.nextInt();
    y = in.nextInt();
    z = (double) ( (double)(Math.sin(x) + Math.cos(y)) / (double) (Math.cos(x) - Math.sin(y))) * (double) (Math.tan(x*y));
    System.out.println("z = " + z);
    }
}
