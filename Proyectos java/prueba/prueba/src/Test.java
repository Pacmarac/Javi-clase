/*public class PruebaParam {
    public static void pasaValor(int x){
    x++;
    } //pasaValor
    public static void pasaRef(int[] ref){
    ref[0]++;
    } //pasaRef
    public static void main(String[] args){
    int x = 3;
    System.out.println(x);
    int[] miArray = {3};
    System.out.println(miArray[0]);
    pasaValor(x);
    pasaRef(miArray);
    System.out.println(x);
    System.out.println(miArray[0]);
    } // main
    } //Class
*/

public class Test {
    /* 
    public int dato=0;
    public static int datoestatico=1;
    public void metodo() {
    this.datoestatico++;
    this.dato++;
    datoestatico++;
    } //metodo
    public static void metodoestatico() {
    // this.datoestatico++;
    datoestatico++;
    } //metodoestatico
    */
    public static void main(String[] args){
    // dato++;
    // datoestatico++;
    // metodoestatico();
    // metodo();// -- error
    String colore = "ROJO";
    String result = "Blanco";
    String temp = colore.toLowerCase();
    // System.out.println(temp);
    if (temp.equals("blanco")){
        result = colore;
        System.out.println(result);
    } 
    else if (temp.equals("negro")){
        result = colore;
        System.out.println(result);
    }
    else if (temp.equals("rojo")){
        result = colore;
        System.out.println(result);
    }
    else if (temp.equals("azul")){
        result = colore;
        System.out.println(result);
    }
    else if (temp .equals("gris")){
        result = colore;
        System.out.println(result);
    }
    /* 
    switch (temp){
        case "NEGRO":
            result = colore;
            break;
        
        case "ROJO":
            result = colore;
            break;
        
        case "AZUL":
            result = colore;
            break;
        
        case "gris":
            result = colore;
            break;
        
        default :
            return result;
    }
    */
    // System.out.println(result);
    } // main

    public static double precioFinal(double precio, int peso, char consumo){
        double result = precio;
        char temp = (char) (consumo - 32);
        switch(temp){
            case 'A':
            result += 100;
            break;
            case 'B':
            result += 80;
            break;
            case 'C':
            result += 60;
            break;
            case 'D':
            result += 50;
            break;
            case 'E':
            result += 30;
            break;
            default:
            result += 10;
            break;
        }
        if(peso < 20){
            result += 10;
        }
        else if(19 < peso && peso < 50){
            result += 50;
        }
        else if(49 < peso && peso < 80){
            result += 80;
        }
        else {
            result += 100;
        }
        return result;
    }
} 