public class Divisors {

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean isRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        else return gcd(b, a % b);
    }

    // Returns Euler’s totient function of n.
    public static int totient(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isRelativelyPrime(i, n)) count++;
        }
        return count;
    }

    // Test client (optional)
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("gcd: " + gcd(a, b));
        System.out.println("isRelativelyPrime: " + isRelativelyPrime(a, b));
        System.out.println("totient: " + totient(a));
    }
}
