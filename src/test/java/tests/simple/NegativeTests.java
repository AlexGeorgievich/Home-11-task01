package tests.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NegativeTests {
    @Test
    void test00() {
        assertTrue(false);
    }

    @Test
    void test01() {
        assertEquals(true, false);
    }

    @Test
    void test02() {
        assertTrue(false);
    }

    @Test
    void test03() {
        assertTrue(false);
    }

}