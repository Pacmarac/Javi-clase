public class director extends empleados{
    private boolean bonus;

    public director(String nombre, String DNI, double salraio, boolean bon){
        super(nombre, DNI, salraio);
        this.bonus = bon;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double calculaNomina(){
        double result = 0;
        result = (bonus)?getSalarioBase() + (getSalarioBase()*0.10):getSalarioBase();
        return result;
    }

    @Override
    public String toString(){
        String resutl = "";

        resutl = "El director " + getNombre() + " con NIF "+ getNif() +" cobra "+ getSalarioBase() +" y ";
        resutl += (bonus)?"tiene bonus":"no tiene bonus";
        resutl += " y su nomina final es " + calculaNomina();
    
        return resutl;
    }
}
