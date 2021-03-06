/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertEquals("I", classUnderTest.RomanNumerals(1));
        assertEquals("XVIII", classUnderTest.RomanNumerals(18));
        assertEquals("CIV", classUnderTest.RomanNumerals(104));
        assertEquals("CCL", classUnderTest.RomanNumerals(250));
    }
}
