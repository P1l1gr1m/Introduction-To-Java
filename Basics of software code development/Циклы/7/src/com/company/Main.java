package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int m,n;
    m = in.nextInt();
    n = in.nextInt();
    for (int i = m; i <= n; ++i) {
        int temp = 0;
        for (int j = 2; j < i - 1; ++j) {
            if (i % j == 0) {
                System.out.println(j);
                temp = 1;
            }
        }
    if (temp == 0) {
        System.out.println("No denominators for that number");
    }
    }
    }
}
