package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	int a, b, c;
    int z = 0;
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    z = ((a - 3) * b / 2) + c;
    System.out.println("z = " + z);
    }
}
