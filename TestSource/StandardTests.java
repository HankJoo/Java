package TestSource;


import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class StandardTests {
    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach");
    }

    @Test
    @DisplayName("test case name is displayed")
    void succeedingTest() {
        assumeTrue("abc".contains("a"));
    }

    @Test
    void failingTest() {
//        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll");
    }
}
