
public class PalindromeChecker {

    public boolean palindromeTest(String input) {

        String inputForward = input.replaceAll("[\\p{Punct} \\s]", "");

        StringBuilder inputAsStringBuilder = new StringBuilder(inputForward);
        String inputReversed = inputAsStringBuilder.reverse().toString();

        return inputForward.equalsIgnoreCase(inputReversed);
    }
}
