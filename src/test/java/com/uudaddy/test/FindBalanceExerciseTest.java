package com.uudaddy.test;

import org.junit.Test;

import java.io.IOException;

public class FindBalanceExerciseTest {
    private FindBalanceExercise underTest = new FindBalanceExercise();

    @Test
    public void testHelloWorldTask() throws IOException {

        int expect_0 = underTest.findBalance("()()");
        System.out.println(expect_0);

            int expect_2 = underTest.findBalance("()))");
            System.out.println(expect_2);
        //assertEquals(expect_2,2);
    }
}
