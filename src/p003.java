// Problem 3. Largest prime factor
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

import java.util.ArrayList;
import java.util.Collections;

public class p003 {
    public static void main(String[] args) {
        System.out.println(new p003().solve());
    }

    public int solve() {
        long number = 600_851_475_143L;
        ArrayList<Integer> primes = getListOfPrimes(number);
        ArrayList<Integer> factors = new ArrayList<>();
        factors = findPrimeFactors(number, primes, factors);
//        System.out.println(factors);
        return Collections.max(factors);

    }

    public boolean isPrime (int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public ArrayList<Integer> getListOfPrimes(long belowNumber) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        int range = (int)Math.ceil(Math.sqrt(belowNumber));
        for (int i = 0; i < range; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public ArrayList<Integer> findPrimeFactors(long number, ArrayList<Integer> primes, ArrayList<Integer> factors) {
        for (int i = 0; i < primes.size(); i++) {
            if (number % primes.get(i) == 0) {
                factors.add(primes.get(i));
                findPrimeFactors(number/primes.get(i), primes, factors);
                break;
            }
        }
        return factors;
    }
}
