import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import java.io.PrintWriter;

public class TestRunner {
    public static void main(String[] args) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
        		.selectors(selectClass(EmployeeIncrementTestSuite.class)).build();
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
        TestExecutionSummary summary = listener.getSummary();
        System.out.println("JUNIT 5 TEST EXECUTION RESULTS ");
        System.out.println("Total Tests Executed:   " + summary.getTestsSucceededCount());
        System.out.println("Total Tests Failed:     " + summary.getTestsFailedCount());
        if (summary.getTestsFailedCount() > 0) {
            summary.printFailuresTo(new PrintWriter(System.out));
        } else {
            System.out.println("All test cases executed successfully!");
        }
    }
}