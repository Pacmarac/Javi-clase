public class television extends electrodomestico{
    private int pulgadas;
    private boolean sintonizadorTDT;

    public television(){
        super();
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }

    public television(double precio, int peso){
        super(precio, peso);
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }
    public television(double precio, int peso, String color, char consumo, int pulgadas, boolean tdt){
        super(precio, peso, color, consumo);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = tdt;
    }
    

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
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
        if (getPulgadas() > 40){
            result += (result *0.3);
        }
        if(isSintonizadorTDT()){
            result += 50;
        }
        return result;
    }

    @Override
    public String toString_Parte3(){
        String resutl = "";
    
        resutl = "Esta television de color "+ getColor() +" vale "+ precioFinal() +" euros";
    
        return resutl;
    }

    @Override
    public String toString(){
        String resutl = "";

        //double precio, int peso, String color, char consumo, int pulgadas, boolean tdt

        resutl = "Esta lavadora tiene las siguiente carcateristicas:\n"
                  + "Precio: " + getPrecioBase() + "\n"
                  + "Peso: "+ getPeso() + "\n"
                  + "Consumo: "+ getConsumoE() + "\n"
                  + "Color: "+ getColor() + "\n"
                  + "pulgadas: " + getPulgadas() + "\n"
                  + "Tiene TDT: " +isSintonizadorTDT();
    
        return resutl;
    }
}
