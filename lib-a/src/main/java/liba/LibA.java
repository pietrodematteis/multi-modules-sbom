package liba;

import org.apache.commons.lang3.StringUtils;

public class LibA {
    public static void print() {
        System.out.println("LibA using StringUtils: " + StringUtils.capitalize("hello from liba"));
    }
}
