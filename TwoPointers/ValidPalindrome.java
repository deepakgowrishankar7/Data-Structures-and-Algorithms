public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }     
        int left = 0;
        int right = s.length() - 1;       
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";   
        System.out.println("Is \"" + test1 + "\" a palindrome? " + isPalindrome(test1));
        System.out.println("Is \"" + test2 + "\" a palindrome? " + isPalindrome(test2));
        System.out.println("Is \"" + test3 + "\" a palindrome? " + isPalindrome(test3));
    }
}