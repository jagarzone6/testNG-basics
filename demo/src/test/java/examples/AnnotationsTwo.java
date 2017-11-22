package examples;

import org.testng.annotations.*;

public class AnnotationsTwo {

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("After Suite");
    }

}