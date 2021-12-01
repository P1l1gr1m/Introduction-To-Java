package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int x;
        double f = 0;
        Scanner in = new Scanner(System.in);
    x = in.nextInt();
    if (x <= 3) {
        System.out.println(f = (int) Math.pow(x,2) - 3 * x +9);
    }
    else if (x > 3) {
        System.out.println((float)(f = 1 / ( (int)Math.pow(x,3) + 6.0)));
    }
    }
}
