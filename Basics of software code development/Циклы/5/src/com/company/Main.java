package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double n;
        double e;
        n = in.nextInt();
        e = in.nextInt();
        for (double i = 1; i <= n; ++i) {
            double a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
