package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGradeA() {
        assertEquals("A", App.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", App.calculateGrade(80));
    }

    @Test
    public void testFail() {
        assertEquals("Fail", App.calculateGrade(40));
    }
}
