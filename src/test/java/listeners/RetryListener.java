package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class RetryListener implements ISuiteListener {

    @Override
    public void onFinish(ISuite suite) {
        // Create a new suite for failed test cases
        XmlSuite failedSuite = new XmlSuite();
        failedSuite.setName("Retry Suite - " + suite.getName());

        // Add failed tests to the new suite
        suite.getResults().values().forEach(result -> {
            result.getTestContext().getFailedTests().getAllMethods().forEach(failedMethod -> {
                XmlTest failedTest = new XmlTest(failedSuite);

                // Ensure unique test name by appending the class name or other identifier
                failedTest.setName("Retry - " + failedMethod.getTestClass().getName() + "." + failedMethod.getMethodName());

                // Add the class of the failed test
                List<XmlClass> classes = new ArrayList<>();
                classes.add(new XmlClass(failedMethod.getTestClass().getName()));
                failedTest.setXmlClasses(classes);
            });
        });

        // Run the retry suite if there are failed tests
        if (!failedSuite.getTests().isEmpty()) {
            System.out.println("Rerunning failed test cases for suite: " + suite.getName());
            org.testng.TestNG testNG = new org.testng.TestNG();
            List<XmlSuite> suites = new ArrayList<>();
            suites.add(failedSuite);
            testNG.setXmlSuites(suites);
            testNG.run();
        }
    }
}
