public abstract class vehiculo {

private byte NumRuedas;
private short Cilindrada;
private short Potencia;
private String color;
    
public vehiculo(byte ruedas, short cilindrada, short potencia, String color){
    this.NumRuedas = ruedas;
    this.Cilindrada = cilindrada;
    this.Potencia = potencia;
    this.color = color;
}

public byte getNumRuedas() {
    return NumRuedas;
}

public void setNumRuedas(byte numRuedas) {
    this.NumRuedas = numRuedas;
}

public short getCilindrada() {
    return Cilindrada;
}

public void setCilindrada(short cilindrada) {
    this.Cilindrada = cilindrada;
}

public short getPotencia() {
    return Potencia;
}

public void setPotencia(short potencia) {
    this.Potencia = potencia;
}

public String getcolor() {
    return color;
}

public void setcolor(String color) {
    this.color = color;
}

public abstract int impuesto();

public String toString(){
    String result = "";
    result = "El vehiculo tiene "+ this.NumRuedas + " ruedas,\n" 
    + this.Cilindrada +" esta cilindrada,\n" + this.Potencia + " esta potencia \ny es de color " + this.color +".\n";
    return result;
}

}// final clase
