package examples;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class runner {

    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { Annotations.class,AnnotationsTwo.class });

        testng.addListener(tla);
        testng.run();
    }
}
