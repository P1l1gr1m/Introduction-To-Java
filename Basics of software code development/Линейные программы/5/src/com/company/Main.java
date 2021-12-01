package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int time;
        Scanner in = new Scanner(System.in);
        time = in.nextInt();
        int hours = time / 60 / 60;
        int minutes = (time - (hours * 60 * 60)) / 60;
        int seconds = time - (hours * 60 * 60) - (minutes * 60);
        System.out.printf("%dh %dmin %dsec", hours, minutes, seconds);
    }
}
