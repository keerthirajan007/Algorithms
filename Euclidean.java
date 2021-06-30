/**
 * <p>
 * <i>Euclidean algorithm or Euclid's algorithm</i>, is an efficient method for
 * computing the greatest common divisor (GCD) of two integers (numbers), the
 * largest number that divides them both without a remainder.
 * </p>
 * <b>gcd(m, n) = gcd(n, m mod n)</b>
 * <p>
 * where m mod n is the remainder of the division of m by n, until m mod n is
 * equal to 0. Since gcd(m, 0) = m, the last value of m is also the greatest
 * common divisor of the initial m and n.
 * </p>
 */

public class Euclidean {
    /**
     * <p>
     * If n = 0, returns the value of m as the answer; Otherwise,it divide m by n
     * and assign the value of the remainder to n, Assign the value of previous n to
     * m ( <b>gcd(m, n) => gcd(n, m % n) </b>)
     * <p>
     * 
     * @param m
     * @param n
     * @return gcd of m and n
     */
    public static int findGcd(int m, int n) {
        if (n == 0)
            return m;
        return findGcd(n, m % n);
    }
}