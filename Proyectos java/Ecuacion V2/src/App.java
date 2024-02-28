public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        int c;
        double r;
        double vr;
        double x;
        double x2;
    
        a = 10;
        b = -40;
        c = 20;
        if (a == 0)
        {
            System.out.println("No se puede realizar la operacion");
        }
        else 
        {
            r = b * b - 4 * a * c;
            vr = Math.sqrt(b * b - 4 * a * c);
            if(r <= 0)
            {
                System.out.println("La raiz cuadrada da negativo o 0 r = "+ r);
            }
            else
            { 
                x = (-b + vr) / (2 * a);
                x2 = (-b - vr) / (2 * a);
                System.out.println("el resultado positivo es "+ x);
                System.out.println("el resultado negativo es "+ x2);
            }
        }
    }
}
