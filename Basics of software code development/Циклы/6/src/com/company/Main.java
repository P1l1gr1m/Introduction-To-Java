package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	char s = 0;
    for (int i = 0; i < Character.MAX_VALUE; ++i, ++s){
        System.out.println(s + " - "+ " " + (int)s);
    }
    }
}
