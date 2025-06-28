public class ActivationFunction {

    // Returns the Heaviside step function of x.
    public static double heaviside(double x) {
        if (x < 0) return 0.0;
        else if (x == 0) return 0.5;
        else return 1.0;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (x >= 20.0) return 1.0;
        else if (x <= -20.0) return -1.0;
        else {
            double ePos = Math.exp(x);
            double eNeg = Math.exp(-x);
            return (ePos - eNeg) / (ePos + eNeg);
        }
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        return x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (x <= -2) return -1;
        else if (x < 0) return x + (x * x) / 4;
        else if (x < 2) return x - (x * x) / 4;
        else return 1;
    }

    // Test client (optional)
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println("heaviside: " + heaviside(x));
        System.out.println("sigmoid: " + sigmoid(x));
        System.out.println("tanh: " + tanh(x));
        System.out.println("softsign: " + softsign(x));
        System.out.println("sqnl: " + sqnl(x));
    }
}
