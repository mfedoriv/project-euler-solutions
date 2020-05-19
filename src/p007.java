// Problem 7. 10001st prime
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?


import java.util.ArrayList;

public class p007 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(new p007().eratosthenes(10001));
        System.out.println("Estimated time: " + (System.currentTimeMillis() - start)/1000 + " sec");
    }

    public long eratosthenes(int primesSize) { // half-eratosthenes
        ArrayList<Long> primes = new ArrayList<>();
        primes.add(1L);
        primes.add(2L);
        int counter = 2;

        for (long i = 3L; primes.size() <= primesSize; i += 2) {
            boolean isPrime = true;
            for (int j = 1; j < primes.size(); j++) {
                if (i % primes.get(j) == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primes.add(i);
//                System.out.println(counter + ". " + i);
                counter++;
            }
        }
        return primes.get(primesSize);
    }
}
