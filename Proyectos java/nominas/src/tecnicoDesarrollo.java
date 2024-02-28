public class tecnicoDesarrollo extends empleados{
    private int horasExtras;
    
    public tecnicoDesarrollo(String nombre, String DNI, double salraio, int hextras){
        super(nombre, DNI, salraio);
        this.horasExtras = hextras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calculaNomina(){
        double result = 0;
        result = getSalarioBase() + (horasExtras *= 10);
        return result;
    }

    @Override
    public String toString(){
        String resutl = "";
    
        resutl = "El tecnico de desarrollo " + getNombre() + " con NIF "+ getNif() +" cobra "+ getSalarioBase() 
        + " y ha hecho "+ horasExtras + " horas extras";
        resutl += " y su nomina final es " + calculaNomina();
    
        return resutl;
    }
}
