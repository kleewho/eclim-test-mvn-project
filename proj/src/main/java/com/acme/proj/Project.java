package com.acme.proj;

import static com.acme.liba.LibraryA.STATIC_STRING_LIB_A;
import static com.acme.libb.LibraryB.STATIC_STRING_LIB_B;

import com.acme.liba.LibraryA;
import com.acme.libb.LibraryB;

public class Project {
    public static void main(String[] args) {
        System.out.println("This string is from liba: " + STATIC_STRING_LIB_A);
        System.out.println("This string is from libb: " + STATIC_STRING_LIB_B);
        
        LibraryA liba = new LibraryA();

        liba.getter();

        //issue #178e something like this:.
        liba.getter();

        liba.getter();

        LibraryB libb = new LibraryB();

        libb.getterB();

        libb.getterB();

        liba.getterWithParams(1, 3, 123);

        LibraryA.staticMethod();

    }
}
