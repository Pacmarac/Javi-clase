public class App {
    public static void main(String[] args) throws Exception {
    int a;
    int b;
    int c;
    double r;
    double x;
    double x2;

    a = 15;
    b = -20;
    c = 15;

        r = Math.sqrt(b * b - 4 * a * c);
        x = (-b + r) / (2 * a);
        x2 = (-b - r) / (2 * a);
        System.out.println("el resultado positivo es "+ x);
        System.out.println("el resultado negativo es "+ x2);
    }
}
