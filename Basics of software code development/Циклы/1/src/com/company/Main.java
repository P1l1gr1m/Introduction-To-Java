package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int N;
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
        int sum = 0;
    for (int i = 1; i <= N; ++i) {
        sum += i;
    }
    System.out.println(sum);
    }
}
