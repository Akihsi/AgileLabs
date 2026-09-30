import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindMinimumTest {
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
    public void testFindMinWithTenNumbers() {
        // Simulated user inputs (10 numbers separated by spaces/newlines)
        String simulatedInput = "45.0\n12.5\n3.0\n89.1\n-5.2\n100.0\n0.0\n18.4\n7.3\n2.1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        // Run main method without modifying original code
        FindMinimum.main(new String[]{});
        // Verify printed output
        String output = outContent.toString();
        assertTrue(output.contains("The minimum number is: -5.2"), 
            "Output should contain the expected minimum value");
    }
}