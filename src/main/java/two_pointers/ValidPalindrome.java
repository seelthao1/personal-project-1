package two_pointers;
/**
 * LeetCode Problem: Valid Palindrome
 * Description: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            //Move left right if current character is not a letter or digit
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            //Move right left if current character is not a letter or digit
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            //If opposite characters at left and right are not equal. not a palindrome
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            //Increment Left and Right
            left++;
            right--;
        }
        return true;
    }
}
