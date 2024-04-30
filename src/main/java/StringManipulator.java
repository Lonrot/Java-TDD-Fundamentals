import org.apache.commons.lang3.StringUtils;

public class StringManipulator {


    public String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string

        return StringUtils.reverse(input);
    }

    public boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)
        for (int i = 0; i<input.length()/2;i++){
            if(input.charAt(i) != input.charAt(input.length()-i-1)){
                return false;
            }

        }
        return true;
    }
}