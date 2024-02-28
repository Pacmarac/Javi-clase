public class Ejemplocoche {
//atributos

    public String matricula;
    public String marca;
    public String color;
    public String modelo;
    public int tipoCombus; // 0-Gasolina, 1-Diesel, 2-Electrico, 
    public int nivelCombus;
    private int FechaMatricula;

//metodos
Ejemplocoche(){
    super();
}
public void soy(){
    System.out.println("Soy un " + marca + " " + modelo + ", color "+ color + ", con matricula "+ matricula + ", trae "+ nivelCombus 
     +" litros de combustible");
    System.out.println("El año de matriculacion es "+ FechaMatricula);
}

public String getMatricula() {
    return matricula;
    
}

public void setMatricula(String matricula) {
    this.matricula = matricula;
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public int getTipoCombus() {
    return tipoCombus;
}

public void setTipoCombus(int tipoCombus) {
    this.tipoCombus = tipoCombus;
}

public int getNivelCombus() {
    return nivelCombus;
}

public void setNivelCombus(int nivelCombus) {
    this.nivelCombus = nivelCombus;
}

public int getFechaMatricula() {
    return FechaMatricula;
}

public void setFechaMatricula(int fechaMatricula) {
    this.FechaMatricula = fechaMatricula;
}
}