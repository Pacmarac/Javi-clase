public abstract class empleados {
    private String nombre;
    private String nif;
    private double salarioBase;

 public empleados(String nombre, String DNI, double salraio){
    this.nombre = nombre;
    this.nif = DNI;
    this.salarioBase = salraio;
 }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getNif() {
    return nif;
}

public void setNif(String nif) {
    this.nif = nif;
}

public double getSalarioBase() {
    return salarioBase;
}

public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
}

public abstract double calculaNomina();

public String toString(){
    String resutl = "";

    resutl = "El trabajador " + nombre + " con NIF "+ nif +" cobra "+ salarioBase;

    return resutl;
}
}

