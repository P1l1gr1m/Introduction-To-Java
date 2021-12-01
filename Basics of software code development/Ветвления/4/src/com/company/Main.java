package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a, b, x, y, z;
    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
    if (((a*b) >= (x*y)) || ((a*b) >= (x*z)) || ((a*b) >= (z*y))) {
        System.out.println("Yes");
    }
    else {
        System.out.println("No");
    }
    }
}
