public class camion extends vehiculo{
    private int numEjes;

    public camion(byte ruedas, short cilindrada, short potencia, String color, int ejes){
        super(ruedas, potencia, cilindrada, color);
        this.numEjes = ejes;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public int impuesto() {
        int result = 0;
        int temp = (this.getCilindrada()/30) + (this.getPotencia() * 20)+ (this.getNumRuedas()*20) + (this.getNumEjes() * 50);
        result = temp;
        return result;
    }

    @Override
    public String toString(){
        String result = "";
        result = "El vehiculo tiene "+ this.getNumRuedas() + " de ruedas,\n" 
        + this.getCilindrada() +" esta cilindrada,\n" + this.getPotencia() + " esta potencia,\nes de color " + this.getcolor() +
        "\ny tiene "+ this.numEjes + " ejes.\n";
        return result;
    }
    
}
