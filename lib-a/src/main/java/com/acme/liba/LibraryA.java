package com.acme.liba;

public class LibraryA {
    private String child = "";
    public String secondChild = "second";

    public LibraryA() {}

    public static String STATIC_STRING_LIB_A = "Static string from lib a";

    public String getter() {
        this.getterWithParams(1, 2, 3);
        return "String from getter";
    }

    public static String staticMethod() {
        return "String from static";
    }

    public int getterWithParams(int x,
                                int y,
                                int z) {

        String bla = this.child;
        bla.codePointAt(2);
        return x + y + z;
    }
}
