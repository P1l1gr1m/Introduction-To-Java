package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int a, b;
    a = in.nextInt();
    b = in.nextInt();
        char[] charsOfA = String.valueOf(a).toCharArray();
        char[] charsOfB = String.valueOf(b).toCharArray();

        for (int i = 0; i < charsOfA.length - 1; i++) {

            for (int j = 0; j < charsOfB.length - 1; j++) {

                if (charsOfA[i] == charsOfB[j]) {

                    System.out.print(charsOfA[i] + " ");
                }
            }
        }
    }
}
