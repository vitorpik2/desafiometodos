package desafiométodo8;

public class DesafioMétodo8 {

    public static double média(double a, double b, double c) {
        double p1 = 3, p2 = 4, r;

        if (a > 1 && a < 3) {
            a = a * p1;
        } else {
            a = a * p2;
        }

        if (b > 1 && b < 3) {
            b = b * p1;
        } else {
            b = b * p2;
        }

        if (c > 1 && c < 3) {
            c = c * p1;
        } else {
            c = c * p2;
        }

        a = a + b + c;

        r = p1 + p1 + p2;

        a = a / r;

        return a;
    }

    public static void main(String[] args) {

        System.out.println(média(1.5, 2.9, 3));

    }

}
