public class FirstPalindrome{
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aba", "cfg", "madam"};

        String firstPalindrome = null;

        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                firstPalindrome = words[i];
                break;
            }
        }

        if (firstPalindrome != null) {
            System.out.println("The first palindrome string in the list is: " + firstPalindrome);
        } else {
            System.out.println("No palindrome string found in the list.");
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
