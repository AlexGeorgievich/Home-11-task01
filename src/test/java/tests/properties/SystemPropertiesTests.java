package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

@Tag(value = "properties")
public class SystemPropertiesTests {

    @Test
    void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }
    @Test
    void someTest2() {
        System.setProperty("some_browser","safari");
        String browser = System.getProperty("some_browser");
        System.out.println(browser);
    }
        @Test
    void someTest3() {
//        String browser1 = System.getProperty("browser");
//        System.out.println(browser1);
        String browser = System.getProperty("browser","opera");
        System.out.println(browser);
        // gradle clean test                        -> opera
        // gradle clean test -Dbrowser=mozilla      -> mozilla
    }
    @Test
    void someTest5() {
        String browser = System.getProperty("browser","chrome");
        String browserVersion = System.getProperty("version", "92");
        String browserSize = System.getProperty("browserSize","1920x1080");

        System.out.println(browser);
        System.out.println(browserVersion);
        System.out.println(browserSize);
    }

    @Test
    @Tag("smoke")
    void someTest7(){
        System.out.println("You can say - " + System.getProperty("some_text"," === HELLO +++"));
    }
}
