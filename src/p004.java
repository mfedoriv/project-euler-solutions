// Problem 4. Largest palindrome product
// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
// is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

public class p004 {
    public static void main(String[] args) {
        System.out.println(new p004().solve());
    }

    public int solve() {
        int number;
        int max = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                number = i * j;
                if (isPalindome(number) && number > max) {
                    max = number;
                }
            }
        }
        return max;
    }

    public boolean isPalindome(int number) {
        String str = Integer.toString(number);
        int middle = (int)Math.floor((double)str.length()/2);
        int left = 0;
        int right = str.length() - 1;
        for (int i = 0; i <= middle; i++) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}
