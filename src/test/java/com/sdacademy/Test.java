package com.sdacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class Test {


    @org.junit.jupiter.api.DisplayName("should add 2 numbers")
    @org.junit.jupiter.api.Test
    void test() throws Exception {
        // given
        int a = 5;
        int b = 7;
        // when
        int c = App.addInt(a, b);
        // then

        Assertions.assertEquals(12, c);
    }

    @DisplayName("should substruct first number from second")
    @org.junit.jupiter.api.Test
    void test1() throws Exception {
        // given
        int a = 10;
        int b = 4;
        // when
        int c = App.subInt(a, b);
        // then
        Assertions.assertEquals(6, c);
    }

    @DisplayName("should multiply two numbers")
    @org.junit.jupiter.api.Test
    void test2() throws Exception {
    	// given
    int a = 10;
    int b = 5;
    	// when
        int c = App.multInt(a, b);
        // then
        Assertions.assertEquals(50,c);
    }

    @DisplayName("should divise second number by first")
    @org.junit.jupiter.api.Test
    void test3() throws Exception {
    	// given

    	// when

    	// then
    	Assertions.fail("Write your test");
    }
}
