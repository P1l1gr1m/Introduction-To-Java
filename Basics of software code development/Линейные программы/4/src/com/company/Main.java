package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = (x*1000) % 1000 + (int)x / 1000.0;
        System.out.println("y = " + y);
    }
}
