package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int a, b, c, d;
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    d = in.nextInt();
    System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
