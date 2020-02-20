package com.uudaddy.test;

import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Test;

import java.io.IOException;

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConditionsExerciseTest {
    private ConditionsExercise underTest = new ConditionsExercise();

    @Test
    public void testHelloWorldTask() throws IOException {
        underTest.output(30);
    }
}
