// Problem 5. Smallest multiple
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class p005 {
    public static void main(String[] args) {
        System.out.println(new p005().solve());
    }

    public int solve() {
        int number = 2520;
        while (!isDivisible(number)) {
            number++;
        }
        return number;
    }

    public boolean isDivisible(int number) {
        // dividers 1-10 are included in the decomposition of dividers 11-20.
        for (int i = 11; i <= 20 ; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}