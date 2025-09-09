package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void simplePropertiesTest() {
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simpleProperties1Test() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simpleProperties2Test() {
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    void simpleProperties3Test() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("one_property")
    void simpleProperties4Test() {
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("hello_test")
    void simpleProperties5Test() {
        System.out.println("Hello, " + System.getProperty("user_name", "unknow"));
    }
}
