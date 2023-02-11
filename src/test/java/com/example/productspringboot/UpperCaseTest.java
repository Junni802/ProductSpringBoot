package com.example.productspringboot;

import org.junit.jupiter.api.Test;
public class UpperCaseTest {

    @Test
    void Test(){
        String a1 = "abcdefg";
        String a3 = "abCdefg";
        String a2 = "abcdeFg";

        System.out.println(a1.toUpperCase());
        System.out.println(a2.toUpperCase());
        System.out.println(a3.toUpperCase());

    }

}
