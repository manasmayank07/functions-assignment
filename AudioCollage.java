public class AudioCollage {

    // Returns a new array that is a sum of a[] and b[].
    public static double[] sum(double[] a, double[] b) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    // Returns a new array that changes the volume by a factor alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * alpha;
        }
        return b;
    }

    // Returns a new array that reverses the order of a[].
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }

    // Returns a new array that applies a simple filter.
    public static double[] filter(double[] a) {
        double[] b = new double[a.length];
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            b[i] = (a[i-1] + a[i]) / 2.0;
        }
        return b;
    }

    // Test client (optional)
    public static void main(String[] args) {
        // Fill in according to your testing needs
    }
}
