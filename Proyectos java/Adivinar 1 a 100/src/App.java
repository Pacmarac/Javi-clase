import java.util.Scanner;
import arrayView.arrayView;
public class App{
    public static void main(String[] args) throws Exception {
            System.out.println("Visor de arrays!");
           arrayView visor = new arrayView(8,1);
           visor.Item_On(0, 0);
           visor.Item_On(0, 2);
        }
        /* 
        int na;
        int n;
        int intentos;
        Scanner numero= new Scanner(System.in);
        intentos = 0;

        na = (int)(Math.random()* (101 - 1)) + 1;
        //System.out.println("Numero aleatorio es:  "+ na);
        System.out.println("ingrese un numero entre 1 y 100");
        n = numero.nextInt();

        while(n != na)
        {
            if (n < na && n >= 1)
            {
                System.out.println("El numero introducido es menor");
            }
            else if (n > na && n <= 100)
            {
                System.out.println("El numero introducido es mayor");
            }
            if (n > 100)
            {
                System.out.println("El numero introducido en mayor que 100");
            }
            else if (n < 1)
            {
                System.out.println("El numero introducido en menor que 1");
            }
            System.out.println("ingrese otro numero");
            n = numero.nextInt();
            intentos++;
        }
        System.out.print("El numero "+ n);
        System.out.println(" es correcto");
        System.out.println("Numero de intentos: "+ intentos);
    }
    */
}
