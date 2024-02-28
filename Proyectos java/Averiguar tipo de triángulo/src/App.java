import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    double a;
    double b;
    double c;
    Boolean Recta;

    Scanner lado= new Scanner(System.in);

    System.out.println("Introduce el lado A");
    a = lado.nextDouble();
    System.out.println("Introduce el lado B");
    b = lado.nextDouble();
    System.out.println("Introduce el lado C");
    c = lado.nextDouble();
    //Rectangulo
    Recta = Rectangulo(a,b,c);
    if (Recta == true)
    {
        System.out.println("Es un triangulo rectangulo");
    }
    else {
        //equilatero e isosceles 
        if ( a == b)
        {
            if( b == c)
            {
                System.out.println("Es un triangulo equilatero");
            }
            else if( b != c)
            {
                System.out.println("Es un triangulo Isosceles");
            }
        }
        else if( a == c)
        {
            if( c != b)
            {
                System.out.println("Es un triangulo Isosceles");
            }   
        }
        else if( b == c)
        {
            if( a != b)
            {
                System.out.println("Es un triangulo Isosceles");
            }   
        }
        else //if(Recta == false)
        {
            System.out.println("Es un triangulo escaleno");
        }
    }
    }
    static Boolean Rectangulo(double recA, double recB, double recC)
    {
        /*
         a^2 + b^2 = c^2
         c^2 - a^2 = b^2
         c^2 - b^2 = a^2
         */
        recA = recA * recA;
        recB = recB * recB;
        recC = recC * recC;
        double r1 = recA + recB;
        double r2 = recC - recA;
        double r3 = recC - recB;

        if ((r1 == recC) && (r2 == recB) && (r3 == recA))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
