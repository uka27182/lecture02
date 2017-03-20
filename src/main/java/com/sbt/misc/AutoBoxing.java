package com.sbt.misc;

public class AutoBoxing {
    public static void main(String[] args) {
        long sum = 0L;
        long start = System.nanoTime();
        for (int i = 1; i < Integer.MAX_VALUE ; i++) {
            sum = sum + 1;
        }
        long end = System.nanoTime();
        System.out.println(sum);
        System.out.println("It takes " + (end - start)/1000000);
    }
}
