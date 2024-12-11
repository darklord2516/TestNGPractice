package Tests;

import org.testng.annotations.Test;

public class day1 {

    @Test (groups={"Smoke"}, dependsOnMethods = "secondTest")
    public void firstTest () {
        System.out.println("Hi");
    }

    @Test
    public void secondTest() {
        System.out.println("Bye");
    }
}
