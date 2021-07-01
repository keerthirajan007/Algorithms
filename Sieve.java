import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

/**
 * <p>
 * <i>The Sieve of Eratosthenes</i> is a method for finding all primes up to
 * (and possibly including) a given natural n. This method works well when n is
 * relatively small, allowing us to determine whether any natural number less
 * than or equal to n is prime or composite
 * </p>
 * <p>
 * This technique formulated by a brilliant Greek mathematician, Eratosthenes
 * </p>
 * <p>
 * A prime number is a positive integer or a whole number greater than 1, which
 * is only divisible by 1 and itself. The Prime number algorithm is a program
 * used to find prime numbers by sieving or removing composite numbers. The
 * algorithm makes work easier by eliminating complex looping divisions or
 * multiplications.
 * </p>
 */

public class Sieve {
    /**
     * Implements the sieve of Eratosthenes
     * 
     * @param n a positive integer > 1
     * @return Integer ArrayList consist of all prime numbers less than or equal to
     *         n
     */

    public static ArrayList<Integer> findSieve(int n) {
        boolean eliminated[] = new boolean[n + 1];
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (eliminated[i] == false) {
                int j = i * i;
                while (j <= n) {
                    eliminated[j] = true;
                    j += i;
                }
            }
        }

        ArrayList<Integer> output = new ArrayList<>((int) (n / (Math.log(n) - 1)));

        for (int i = 2; i <= n; i++)
            if (eliminated[i] == false)
                output.add(i);

        return output;
    }
}