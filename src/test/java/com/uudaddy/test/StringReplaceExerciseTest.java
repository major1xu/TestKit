package com.uudaddy.test;

import org.junit.Test;

import java.io.IOException;

public class StringReplaceExerciseTest {
    private StringReplaceExercise underTest = new StringReplaceExercise();

    @Test
    public void testHelloWorldTask() throws IOException {
        underTest.replaceStrManually("miffle", 'f', 'd');
    }
}
