public class Alumno extends Persona{
    private String matricula;

    public Alumno(String matricula, String nombre, String dni){
        super(nombre, dni);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre(){
        return "NombreCambiado";
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [matricula=" + matricula + "]";
    }

    
}
