public class lavadora extends electrodomestico{
    private int carga;

    public lavadora(){
        super();
        this.carga = 5;
    }

    public lavadora(double precio, int peso){
        super(precio, peso);
        this.carga = 5;
    }
    public lavadora(double precio, int peso, String color, char consumo, int carga){
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    public void setCarga(int carga){
        this.carga = carga;
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
        if (carga > 30){
            result += 50;
        }
        return result;
    }

    @Override
    public String toString_Parte3(){
        String resutl = "";
    
        resutl = "Esta lavadora de color "+ getColor() +" vale "+ precioFinal() +" euros";
    
        return resutl;
    }

    @Override
    public String toString(){
        String resutl = "";

        //double precio, int peso, String color, char consumo, int carga

        resutl = "Esta lavadora tiene las siguiente carcateristicas:\n"
                  + "Precio: " + getPrecioBase() + "\n"
                  + "Peso: "+ getPeso() + "\n"
                  + "Consumo: "+ getConsumoE() + "\n"
                  + "Color: "+ getColor() + "\n"
                  + "Carga: " + getCarga();
    
        return resutl;
    }
}

