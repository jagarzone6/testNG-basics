package examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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


    @AfterTest
    public void AfterAll(){
        System.out.println("END");

    }
}