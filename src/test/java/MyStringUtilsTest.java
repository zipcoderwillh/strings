import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by willhorton on 2/19/16.
 */
public class MyStringUtilsTest {

    @Test
    public void testCombineArrays() throws Exception {
        assertEquals("test", MyStringUtils.combineArrays(new char[] {'t', 'e', 's', 't'}));
    }

    @Test
    public void testCombineArrays1() throws Exception {
        assertEquals("test", MyStringUtils.combineArrays(new String[] {"t", "e", "s", "t"}));
    }

    @Test
    public void testSplitString() throws Exception {
        assertArrayEquals(new String[] {"test", "one", "two"}, MyStringUtils.splitString("test\none\ntwo"));
    }

    @Test
    public void testReverseCapitalize() throws Exception {
        assertEquals("tHIS iS a tEST", MyStringUtils.reverseCapitalize("This is a test"));
    }

    @Test
    public void testReverseWords() throws Exception {
        assertEquals("siht si a tset", MyStringUtils.reverseWords("this is a test"));
    }

    @Test
    public void testRemoveWhiteSpace() throws Exception {
        assertEquals("this\nis\na\ntest", MyStringUtils.removeWhiteSpace("this is a test"));
    }

    @Test
    public void testSubStrings() throws Exception {
        assertArrayEquals(new String[] {"te", "tes", "test", "es", "est", "st"}, MyStringUtils.subStrings("test"));
    }

    /*
    @Test
    public void testFormatStrings() throws Exception {

    }
    */

}