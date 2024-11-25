public class exo9 {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String findPalindrome(String s) {
        s = s.toLowerCase();

        if (s.length() < 3) {
            return "The string is too short";
        }
        
        if (!s.matches("[a-z ]+")) {
            return "Only alphabetical characters are allowed";
        }
        

        String longestPalindrome = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                String substring = s.substring(i, j + 1).replace(" ", "");
                
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }

        if (longestPalindrome.length() >= 3) {
            return longestPalindrome;
        } else {
            return "No palindrome found";
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(findPalindrome("ok")); // The string is too short
        System.out.println(findPalindrome("ok!")); // Only alphabetical characters are allowed
        System.out.println(findPalindrome("coucou")); // No palindrome found
        System.out.println(findPalindrome("good morning Madam")); // madam
        System.out.println(findPalindrome("nurses run")); // nurses run
        System.out.println(findPalindrome("madam good morning Madam")); // madam
        System.out.println(findPalindrome("room llevell morning refer")); // llevell
    }
}
