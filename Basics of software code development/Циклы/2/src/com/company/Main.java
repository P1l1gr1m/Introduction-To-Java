package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int a,b,h,x;
    a = in.nextInt();
    b = in.nextInt();
    h = in.nextInt();
    int y = 0;
    for (int i = a; i <= b; i += h) {
        if (i > 2) {
            y = i;
        }
        else {
            y = (-1) * i;
        }
        System.out.println("When x = " + i + " y = " + y);
    }
    }
}
