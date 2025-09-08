package simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


@Tag("simple")
public class NegativeTest {

    @Test
    @Tag("simple")
    void test1() {
        assertTrue(false);
    }

    @Test
    @Tag("simple")
    void test2() {
        assertTrue(false);
    }

    @Test
    @Tag("simple")
    void test3() {
        assertTrue(false);
    }
}
