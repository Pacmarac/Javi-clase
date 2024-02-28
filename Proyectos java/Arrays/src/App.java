import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ej235();
     /* 
        //crea coches
        Ejemplocoche coche1 = new Ejemplocoche();
        Ejemplocoche coche2 = new Ejemplocoche();

        //coche1
        coche1.marca ="BMW";
        coche1.color = "negro";
        coche1.matricula = "5267PWE";
        coche1.modelo = "sport";
        coche1.nivelCombus = 60;
        coche1.setFechaMatricula(2016);
        //coche2
        coche2.color = "rojo";
        coche2.marca ="Lamborgini";
        coche2.matricula = "4785PAR";
        coche2.modelo = "Aventador";
        coche2.nivelCombus = 48;
        coche2.setFechaMatricula(2012);
        //ejecuta
        coche1.soy();
        coche2.soy();
        */
    }
/*  public static void array(){
    int[] a = {10,20,30,40,50,60,70,80,90,100};
    int[] b = {1, -5,10,15,-20,21,2,5,3,8};
    int[][] c = {{1,2},{1,2},{1,2}};
    int i;
    i = 0;
    int h;
    h = 0;
    aux = 0;
    int aux;
    int j;
    j = 0;
    j = a.length -1;
    */
// RECORRER ARRAY A
/* 
     while (i < a.length)
    {
    System.out.println(a[i]);
    i++;
    }
 */
//RECORRER ARRAY B Y PARA CUANDO UN NUMERO SEA MAYOR QUE 20
/*    
    while (i < b.length)
    {
        if(b[i] > 20){
            break;
        }
    System.out.println(b[i]);
    i++;
    }
*/
   // DARLE LA VUELTA AL ARRAY A
   /* 
    while (i < a.length)
    {
        while(h < j)
        {
            aux = a[h];
            a[h] = a[j];
            a[j] = aux;
            h++;
            j--;
        }
    System.out.println(a[i]);
    i++;
    }
    */
    //SUMA EL ARRAY C
    /* 
    for(int i = 0; i < c.length;i++)
    {
        for(int j = 0;j < c[0].length;j++){
            aux += c[i][j];
            System.out.println(aux);
        }
    }
}
*/
/* 
public static void ej230(){
    Scanner bs = new Scanner(System.in);
    int base;
    base = bs.nextInt();
    System.out.println("Intorduce una base entre 3 y 50");
    if (base < 3 || base > 50){
        System.out.println("Intorduce una base entre 3 y 50");
    }
    while(base > 0){
        for(int i = 0; i < base; i++){
            System.out.print("*");
        }
        System.out.println();
        base--;
    }
}
*/
/* 
public static void ej231(){
    Scanner bs = new Scanner(System.in);
    int base;
    base = bs.nextInt();
    int j = 1;
    System.out.println("Intorduce una base entre 3 y 50");
    if (base < 3 || base > 50){
        System.out.println("Intorduce una base entre 3 y 50");
    }
    while(j < base){
        for(int i = 0; i < j; i++){
            System.out.print("*");
        }
        System.out.println();
        j++;
    }
}
*/
/* 
public static void ej232(){
    Scanner datos = new Scanner(System.in);
    System.out.println("Introduce la ancho");
    int base = datos.nextInt();
    int base2 = base + 4;
    System.out.println("Introduce la alto");
    int altura = datos.nextInt();
    int h = 0;
    for(int i = 0; i <= altura; i++){
        if(i == 0 || i == altura){
            for(int j = 0; j <= base2; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        else{
            for(int j = 0; j <= base2; j++)
            {
                if(j == 0 || j == base2){
                    System.out.print("*");
                    if(j == base2)
                    {
                        System.out.println();
                    }
                }
                else if(i == 1 && j >= 2 && j <= base + 2)
                {
                    System.out.print(h);
                    h = h + 1;
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
}
*/

/* 
public static void ej224() {
    String cadena="hola soy ramon";

    for(int i = cadena.length() - 1; i >= 0; i--){
    char[] l = cadena.toCharArray();
    System.out.print(l[i]);
    }
    System.out.println();
    System.out.println(cadena);
}
*/
/* 
public static void ej222(){
    Scanner ps = new Scanner(System.in);
    System.out.println("Introduce la cantidad de numero que va a introducir");
    int h = ps.nextInt();
    int[] array = new int[3];
    for(int i = 0; i < array.length ; i++){
        System.out.println("introduce un numero entero");
        array[i] = ps.nextInt();
    }
    for(int i = 0; i < array.length ; i++){
        System.out.print(array[i] + "; ");
    }
    System.out.println();
    for(int i = 0; i < array.length ; i++){
        int sumado = array[i] + 1;
        System.out.print(sumado + "; ");
    }
}
*/
/*
public static void ej218(){
    Scanner ps = new Scanner(System.in);
    int max = 100;
    int min = 1;
    int num = 0;
    int comprobacion = 1;
    int i = 0;
    //Genera numero aleatorio
    while(num != comprobacion){
        num = (int)(Math.random()* (max - min)) + min; 
        //Comprobación
        System.out.println("Es numero es: "+ num);
        System.out.println("1. el numero es Menor");
        System.out.println("2. el numero es Mayor");
        System.out.println("3. Correcto");
        comprobacion = ps.nextInt();
        //fin comprobacion
        //realiza esto depende de respuesta usuario
        if( comprobacion == 1)
        {
            min = num + 1;
        }
        else if( comprobacion == 2)
        {
            max = num - 1;
        }
        else if( comprobacion == 3)
        {
            System.out.println("La maquina ha acertado el numero");
            break;
        }
        else
        {
            System.out.println("Introduce uno de los 3 numeros pedidos");
        }
        i++;
    }
    System.out.print("Ha tardado "+ i);
    System.out.print("intentos");
    //fin de las respuestas
}
*/
/* 
public static void ej233(){
    int h = 0;
    Scanner a = new Scanner (System.in);
    System.out.println("Introduce el nombre de la ventana");
    String texto = a.nextLine();
    char [] chari = texto.toCharArray();
    System.out.println("Introduce el largo entre 1 y 23");
    int altura = a.nextInt();
    int ancho = texto.length() + 4;
    if (altura >= 1 && altura < 23){
    for(int i = 0; i <= altura; i++)
    {
        for(int j = 0; j <= ancho; j++)
        {
            if (i == 0 || i == altura || i == 2){
                System.out.print("*");
            }
            else if((j == 0 || j == ancho)  ){
                System.out.print("*");
            }
            else if(i == 1 && j >= 2 && j <= ancho - 3)
            {
                System.out.print(chari[h]);
                h = h + 1;
            }
            else if(j > 0 && j < ancho){
                System.out.print(" ");
            }
           // if(i == 2 && j < texto.length()-2){
               // System.out.print(" ");
           // }
        }
        System.out.println();
    }
}
else{
    System.out.println("introduce un numero entre 1 y 23 ");
}
}
*/
/* 
public static void biunario(){
    Scanner ps = new Scanner(System.in);
    System.out.println("introduce el numero en decimal");
    int decimalInicial = ps.nextInt();

    // de decimal a binario
    String binario = Integer.toBinaryString(decimalInicial);
    System.out.println(binario); // 1000

    // de binario a decimal
    int decimalConvertido = Integer.parseInt(binario, 2);
    System.out.println(decimalConvertido); // 12
}
*/
/* 
public static void menu(){
    Scanner el = new Scanner(System.in);
    System.out.println("Por favor eliga una opcion con los numeros");
    System.out.println("1. De decimal a binario");
    System.out.println("2. De binario a decimal");
    System.out.println("3. De decimal a hexadecimal");
    int eleccion = el.nextInt();
    switch(eleccion){
    case(1):{
        bin();
        break;
    }
    case(2):{
        todecimal();
        break;
    }
    case(3):{
        tohexadecimal();
        break;
    }
    default:{
        System.out.println("elige una opcion entre 1 y 2 por favor");
    }
}
}

public static void bin(){
    Scanner ls = new Scanner(System.in);
    int decprim;
    int i = 0;
    System.out.println("introduce un numero decimal");
    decprim = ls.nextInt();
    int[] bina = new int[decprim + 4];
    while(decprim > 1){
        bina[i] = decprim % 2;
        decprim /= 2;
        i++;
    }
    bina[i] = decprim;
    while(0 <= i){
        System.out.print(bina[i]);
        i--;
    }
}
public static void todecimal(){
    Scanner bin = new Scanner(System.in);
    System.out.println("Introduce un numero binario");
    String isBinario = bin.nextLine();
    char[] b =isBinario.toCharArray();
    double resultado = 0;
    for(int i = b.length - 1; i >= 0; i--){
        if (b[i] != 49 && b[i] != 48){
            System.out.println("El numero introducido no es binario");
        }
        else if (b[i] == '1'){
            resultado += 1 * Math.pow(2, i);
        }
    }
    System.out.println(resultado);
}
public static void tohexadecimal(){
    Scanner bin = new Scanner(System.in);
    System.out.println("Introduce un numero binario");
    String isBinario = bin.nextLine();
    char[] b =isBinario.toCharArray();
    double resultado = 0;
    for(int i = b.length - 1; i >= 0; i--){
        if (b[i] != 49 && b[i] != 48){
            System.out.println("El numero introducido no es binario");
        }
        else if (b[i] == '1'){
            resultado += 1 * Math.pow(2, i);
        }
    }
    System.out.println(resultado);

/* 
public static void tablero(){
    // x = lleno ;; ' ' = vacio
    Scanner ps= new Scanner(System.in);
    String[][] tablero = new String[9][9];
    int filas = tablero[0].length;
    int columnas = tablero.length;
    System.out.println("introduce 1 si quieres limpiar, 2 si quieres revertir");
    int eleccion = ps.nextInt();
    for(int i = 0; i < filas; i++){
      for(int h = 0; h < columnas; h++){
        if(eleccion == 1){
        tablero[i][h] = limpia(tablero[i][h]);
        System.out.print(tablero[i][h]);}
        else if(eleccion == 2){
         tablero[i][h] = invierte(tablero[i][h]);
         System.out.print(tablero[i][h]);}
       }System.out.println();}}
 public static String limpia(String posicion){
      posicion = " ";
      return posicion;}
 public static String invierte(String posicion){
      if(posicion == "x"){
      posicion = " ";
      return posicion;}
      if(posicion == " "){
      posicion = "x";
      return posicion;}
    return "a";}
    */
    /* 
    public static void tabaco_profe(){
        Scanner ps = new Scanner(System.in);
        double[] monedas = new double[8];
        double[] centimos = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2};
        double suma = 0;
        int j = 0;
        //System.out.println("Elige la moneda que quieres introducir");
        //System.out.println("1 = 0.01€, 2 = 0.02€, 3 = 0.05€, 4 = 0.10€, 20 = 0.20€, 50 = 0.50€, 100 = 1€ o 200 = 2€");
        for (int h = 0; h<centimos.length; h++){
            System.out.println("Cuantas monedas quiere añadir de "+ centimos[h] +" euros");
            int i = ps.nextInt();
            monedas[h] = i;
        }
        while (j < centimos.length){
            Double multiplicacion = centimos[j] * monedas[j];
            suma += multiplicacion;
            j++;
        }
        System.out.println("tienes en total " + suma + " Euros");
        switch(i){
            case(1):{
                System.out.println("¿Cuantas monedas quieres añadir?");

                
                break;
            }
            case(2):{
                System.out.println("¿Cuantas monedas quieres añadir?");
                
                break;
            }
            case(5):{
                System.out.println("¿Cuantas monedas quieres añadir?");
                
                break;
            }
            case(10):{
                System.out.println("¿Cuantas monedas quieres añadir?");
                
                break;
            }
            case(20):{
                System.out.println("¿Cuantas monedas quieres añadir?");
                
                break;
            }
            case(50):{
                System.out.println("¿Cuantas monedas quieres añadir?");
                
                break;
            }
            case(100):{
                System.out.println("¿Cuantas monedas quieres añadir?");
                
                break;
            }
            case(200):{
                System.out.println("¿Cuantas monedas quieres añadir?");
                
                break;
            }
        }
    }
    */
    
    public static void ej235(){
        Scanner pt = new Scanner(System.in);
        double resultado =0;
        System.out.println("Introduce por favor la cantidad de Kilos ");
        float kilos = pt.nextFloat();
        System.out.println("Elige el país:");
        System.out.println("1.Portugal");
        System.out.println("2.Francia");
        System.out.println("3.Italia");
        System.out.println("4.Reino unido");
        System.out.println("5.Alemania");
        System.out.println("6.Grecia");
        System.out.println("7.Canadá");
        System.out.println("8.EEUU");
        System.out.println("9.Mexico");
        System.out.println("10.Colombia");
        System.out.println("11.Chile");
        System.out.println("12.Argentina");
        int pais = pt.nextInt();
        while( 0 > pais || pais > 12){
            System.out.println("Por favor introduce un numero valido.");
            pais = pt.nextInt();
        }
        switch(pais){
            case(1):{
                resultado = kilos * 0.25;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(2):{
                resultado = kilos * 0.37;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(3):{
                resultado = kilos * 0.40;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(4):{
                resultado = kilos * 0.45;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(5):{
                resultado = kilos * 0.58;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(6):{
                resultado = kilos * 0.58;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(7):{
                resultado = kilos * 1.23;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(8):{
                resultado = kilos * 1.33;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(9):{
                resultado = kilos * 1.45;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(10):{
                resultado = kilos * 2.03;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(11):{
                resultado = kilos * 3.01;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
            case(12):{
                resultado = kilos * 2.99;
                System.out.println("El coste del paquete es de: " + resultado +" Euros");
                break;
            }
        }
    }
}


