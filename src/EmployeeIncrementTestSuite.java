import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Employee Increment Test Suite")
@SelectClasses({
    EmployeeIncrementTest.class
})
public class EmployeeIncrementTestSuite {
}