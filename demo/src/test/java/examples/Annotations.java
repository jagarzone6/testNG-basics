package examples;

import org.testng.annotations.*;

public class Annotations {

    @BeforeTest
    public void Before() {
        System.out.println("Before all");
    }

    @BeforeMethod
    public void BeforeTest() {
        System.out.println("Before test");
    }

    @Test
    public void Btest() {
        System.out.println("B TESTNG");
    }


    @Test
    public void Atest() {
        System.out.println("A TESTNG");
    }

    @AfterMethod
    public void AfterTest() {
        System.out.println("After test");
    }


    @AfterTest
    public void After(){
        System.out.println("END");

    }
}