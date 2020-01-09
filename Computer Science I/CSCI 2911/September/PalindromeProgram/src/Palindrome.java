
public class Palindrome {

    String sentence;

    public Palindrome(String s) {
        sentence = s;
    }

    public boolean isPalindrome() {
        boolean is_palindrome = true;

        for (int i = 0; i < sentence.length() && is_palindrome; ++i) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - i - 1)) {
                is_palindrome = false;
            }
        }
            return is_palindrome;
        
    }
}

