package com.acme.proj;

import static com.acme.liba.LibraryA.STATIC_STRING_LIB_A;
import static com.acme.libb.LibraryB.STATIC_STRING_LIB_B;

public class Project {
    public static void main(String[] args) {
        System.out.println("This string is from liba: " + STATIC_STRING_LIB_A);
        System.out.println("This string is from libb: " + STATIC_STRING_LIB_B);
    }
}
