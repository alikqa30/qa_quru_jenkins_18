package simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PositiveTest {

    @Test
    @Tag("simple")
    void test1() {
        assertTrue(true);
    }

    @Test
    @Tag("simple")
    void test2() {
        assertTrue(true);
    }

    @Test
    @Tag("simple")
    void test3() {
        assertTrue(true);
    }

    @Test
    @Tag("simple")
    void test4() {
        assertTrue(true);
    }
}
