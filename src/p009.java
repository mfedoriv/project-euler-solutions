// Problem 9. Special Pythagorean triplet
// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class p009 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(new p009().solve());
        System.out.println("Estimated time: " + (float)(System.currentTimeMillis() - start)/1000 + " sec");
    }

    public int solve() {
        int productAB;
        int c;
        for (int a = 1; a < 1000; a++) {
            productAB = 0;
            c = 0;
            for (int b  = 2; b < 1000; b++) {
                productAB = (int)(Math.pow(a, 2) + Math.pow(b, 2));
                c = (int)Math.sqrt(productAB);
                c = Math.round(c);
                if (Math.pow(c, 2) == productAB) {
                    if (a < b && b < c && a + b + c == 1000)
                        return a * b * c;
                }
            }
        }
        return 0;
    }
}