package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        if ((x <= 4 && x >= -4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
