package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        int c = 180 - a - b;
        if (c <= 0) {
            System.out.println("Triangle doesnt exist");
            return;
        }
        if ((a + b + c) == 180) {
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Triangle exist and it is rectangular");
            }
            else {
                System.out.println("Triangle exist and it is not rectangular");
            }
        }

    }
}
