package com.example.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class JupiterTest {


    @AfterAll
    public static void CleanUp(){
        System.out.println("\nthis must be shown on the last of all test that executing in the class\n");
    }

    @AfterEach
    void AfEa(){
        System.out.println("*******this methode called after each test**********");
    }

    @ParameterizedTest
    @MethodSource("testData")
   // @Timeout(value = 1, unit = TimeUnit.SECONDS)
    @DisplayName("\n testing the calculator class \n")
    void test(int a , int b , int answer){

        var result = Clculator.add(a ,b );
        Assertions.assertEquals(result, answer);
    }

   static Stream<Arguments> testData(){
        return Stream.of(
          Arguments.arguments(2, 3 ,5),
          Arguments.arguments(2, 2 ,4),
          Arguments.arguments(2, 4 ,6)
        );
    }

    @BeforeEach
    public void before(){
        System.out.println("this called before each test");
    }

    @BeforeAll // even though this test is located in the last of the class,so it runs before all tests
    static void beforeAllTest(){ // the methode must be static otherwise It not gonna work
        System.out.println("\nThis is the test that must be shown before all other tests\n");
    }


    public static double monyAfterX(int years , int startSum , int procentage){
        var kapital = startSum;
        for (int i = 0 ; i< years ; i ++) kapital = kapital*procentage;
        return kapital;
    }


    public String letters(String str){

        String f1 = str.replace("A" , "");

        return f1 ;
    }

}
