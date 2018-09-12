package com.dyadic.helloapp;

import static javax.xml.XMLConstants.XML_NS_PREFIX;
import com.dyadic.hiapp.HiModules;

public class HelloModules {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX);
        System.out.println(new HiModules().getHi());
    }
}
