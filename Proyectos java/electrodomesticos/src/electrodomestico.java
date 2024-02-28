public class electrodomestico {
    private double precioBase;
    private String color;
    private char consumoE;
    private int peso;

    public electrodomestico(){
        this.precioBase = 100;
        this.color = "Blanco";
        this.consumoE = 'F';
        this.peso = 5;
    }

    public electrodomestico(double precio, int peso){
        this.precioBase = precio;
        this.peso = peso;
        this.color = "Blanco";
        this.consumoE = 'F';
    }
    public electrodomestico(double precio, int peso, String color, char consumo){
        this.precioBase = precio;
        this.color = comprobarColor(color);
        this.consumoE = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = comprobarConsumoEnergetico(consumoE);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        char result = 'F';
        if(letra >= 65 && letra <= 70){
            return letra;
        }
        else if (letra >= 97 && letra <= 102){
            return (char)(letra - 32);
        }
        else
        return result;
    }
    private String comprobarColor(String colore){
        /* blanco, negro, rojo, azul y gris */
        String result = "Blanco";
        String temp = colore.toLowerCase();
       if (temp.equals("negro")){
            result = colore;
        }
        else if (temp.equals("rojo")){
            result = colore;
        }
        else if (temp.equals("azul")){
            result = colore;
        }
        else if (temp.equals("gris")){
            result = colore;
        }
        return result;
    }

    public double precioFinal(){
        double result = getPrecioBase();
        char temp = (char) (getConsumoE() - 32);
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
        if(getPeso() < 20){
            result += 10;
        }
        else if(19 < getPeso() && getPeso() < 50){
            result += 50;
        }
        else if(49 < getPeso() && getPeso() < 80){
            result += 80;
        }
        else {
            result += 100;
        }
        return result;
    }

    public String toString_Parte3(){
        String resutl = "";
    
        resutl = "Esta electrodomestico de color "+ getColor() +" vale "+ precioFinal() +" euros";
    
        return resutl;
    }

    public String toString(){
        String resutl = "";
    
        resutl = "Esta electrodomestico de color "+ getColor() +" vale "+ precioFinal() +" euros";
    
        return resutl;
    }
}
