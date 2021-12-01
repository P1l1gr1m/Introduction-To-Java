package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        float z = 0;
        int step2 = 2;
        int step3 = 3;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a != 0) {
            z = ((float) 4 + (float) Math.sqrt(((Math.pow(b, step2)) + (4 * a * c)))) / (2 * a) - (float)Math.pow(a,step3) * c + (float)Math.pow(b,-step2);
            System.out.println("z = " + z);
        }
        else if (a == 0) {
            System.out.println("a argument = 0, cannot be solved");
        }
    }
}

