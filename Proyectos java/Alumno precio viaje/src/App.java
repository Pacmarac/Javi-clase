import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int alumnos;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos alumnos van en autobus?");
        alumnos = sc.nextInt();

        if(alumnos < 30)
        {
            System.out.println("el coste del autobus será 4000 euros");
        }
        else if(alumnos >= 30 && alumnos <= 49)
        {
            System.out.println("el precio son 95 euros por alumno");
        }
        else if(alumnos >= 50 && alumnos <= 99)
        {
            System.out.println("el precio son 70 euros por alumno");
        }
        else
        {
            System.out.println("el precio son 65 euros por alumno");
        }
    }
}
