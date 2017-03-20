package com.sbt.traps;

public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        byte i = 100;
        byte x = 100;

        //x = x + i;  // Must be LEGAL
        x += i;     // Must be ILLEGAL
    }
}
