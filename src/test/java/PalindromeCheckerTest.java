import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker;

    @Before
    public void beforeEachTest() throws Exception {
        palindromeChecker = new PalindromeChecker();
    }

    @Test
    public void givenEmptyString_ThenTrueIsReturned(){
        boolean result = palindromeChecker.palindromeTest("");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void givenStringOfSpaces_ThenTrueIsReturned(){
        boolean result = palindromeChecker.palindromeTest("     ");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void givenA_ThenTrueIsReturned(){
        boolean result = palindromeChecker.palindromeTest("A");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void givenAbcdefg_ThenFalseIsReturned(){
        boolean result = palindromeChecker.palindromeTest("abcdefg");
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void givenAa_ThenTrueIsReturned(){
        boolean result = palindromeChecker.palindromeTest("aa");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void givenAaa_ThenTrueIsReturned(){
        boolean result = palindromeChecker.palindromeTest("aaa");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void givenAbba_ThenTrueIsReturned(){
        boolean result = palindromeChecker.palindromeTest("abba");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void givenRepaper_ThenTrueIsReturned(){
        boolean result = palindromeChecker.palindromeTest("Repaper");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void givenAStringWIthSpaces_ThenWillReturnCorrectResult(){
        boolean result = palindromeChecker.palindromeTest("Race car");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void givenAPhrase_ThenWillReturnCorrectResult(){
        boolean result = palindromeChecker
                .palindromeTest("Are we not drawn onward, " +
                        "we few, drawn onward to new era?");
        assertThat(result).isEqualTo(true);
    }
}
