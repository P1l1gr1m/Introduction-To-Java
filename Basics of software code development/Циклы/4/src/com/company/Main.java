package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1);
	for (long i = 2; i <= 200; ++i) {
        sum = sum.multiply(BigInteger.valueOf((long) i * i));
    }
    System.out.println(sum);
    }
}
