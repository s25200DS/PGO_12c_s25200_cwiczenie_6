public interface Fun {
    static double minimum(Fun func, double a, double b, double alpha) {
        if (a > b) return 0;
        // if statement is wrong the result is 0, alternatively, it can be done like this: throw new Exception("a > b"); Assignment does not specify the desired behavior

        if (a == b) return func.f(a);

        double tmp = a;
        double min = func.f(a);
        while (tmp < b) {
            if (func.f(tmp) < min) {
                min = func.f(tmp);
            }
            tmp += alpha;
        }

        return Math.min(func.f(b), min);
    }

    double f(double x);
}