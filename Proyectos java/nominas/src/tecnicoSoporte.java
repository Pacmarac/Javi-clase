public class tecnicoSoporte extends empleados{
    private double dietas;

    public tecnicoSoporte(String nombre, String DNI, double salraio, double dieta){
        super(nombre, DNI, salraio);
        this.dietas = dieta;
    }

    public double getDietas() {
        return dietas;
    }

    public void setDietas(double dietas) {
        this.dietas = dietas;
    }

    @Override
    public double calculaNomina(){
        double result = 0;
        result = getSalarioBase() + dietas;
        return result;
    }

    @Override
    public String toString(){
        String resutl = "";
    
        resutl = "El tecnico de soporte " + getNombre() + " con NIF "+ getNif() +" cobra "+ getSalarioBase() + " y tiene este dinero "
        + dietas + " para dietas";
        resutl += " y su nomina final es " + calculaNomina();
    
        return resutl;
    }
}
