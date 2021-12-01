package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int x1, y1, x2, y2, x3, y3;
    Scanner in = new Scanner(System.in);
    x1 = in.nextInt();
    y1 = in.nextInt();
    x2 = in.nextInt();
    y2 = in.nextInt();
    x3 = in.nextInt();
    y3 = in.nextInt();
    if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
        System.out.println("Three points lie on one straight line");
    }
    else {
        System.out.println("Three points do not lie on one straight line");
    }
    }
}
