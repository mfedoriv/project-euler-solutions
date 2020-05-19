// Problem 6. Sum square difference
// The sum of the squares of the first ten natural numbers is, 1^2+2^2+...+10^2=385
// The square of the sum of the first ten natural numbers is, (1+2+...+10)^2=55^2=3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum
// is 3025−385=2640.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class p006 {
    public static void main(String[] args) {
        System.out.println(new p006().solve(100));
    }

    public int solve(int range){
        double sumOfSq = sumOfSq(range);
        double sqOfSum = sqOfSum(range);
        return (int)(sqOfSum - sumOfSq);
    }

    public double sumOfSq(int range){
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public double sqOfSum(int range){
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        return Math.pow(sum, 2);
    }
}