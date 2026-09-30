import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class EmployeeIncrementTest {
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;
    @BeforeEach
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }
    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }
    @Test
    @DisplayName("Test 15% increment for monthly salary < Rs. 1 Lakh")
    public void testSalaryLessThanOneLakh() {
        System.setIn(new ByteArrayInputStream("50000\n".getBytes()));
        EmployeeIncrement.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Annual Increment Amount: Rs. 90000.0"));
    }
    @Test
    @DisplayName("Test 10% increment for monthly salary between 1 Lakh and 2 Lakh")
    public void testSalaryBetweenOneAndTwoLakh() {
        System.setIn(new ByteArrayInputStream("150000\n".getBytes()));
        EmployeeIncrement.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Annual Increment Amount: Rs. 180000.0"));
    }
    @Test
    @DisplayName("Test 5% increment for monthly salary > Rs. 2 Lakh")
    public void testSalaryMoreThanTwoLakh() {
        System.setIn(new ByteArrayInputStream("300000\n".getBytes()));
        EmployeeIncrement.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Annual Increment Amount: Rs. 180000.0"));
    }
}