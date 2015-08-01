package com.acme.libb;

import static com.acme.liba.LibraryA.STATIC_STRING_LIB_A;
import com.acme.liba.LibraryA;

public class LibraryB {
    public static String STATIC_STRING_LIB_B = "The same as " + STATIC_STRING_LIB_A + " but from lib b!";
    private LibraryA liba = new LibraryA();

    public String getterB() {
        this.liba.getterWithParams(int x, int y, int z)

        return STATIC_STRING_LIB_B + STATIC_STRING_LIB_A + new LibraryA().getter();
    }
}
