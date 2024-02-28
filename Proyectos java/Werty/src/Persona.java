public class Persona{

    private String nombre;
    private String dni;

    //Atributo estático no se influye por isntancias
    private static int indice = 0;
    //Atributo estático no se influye por isntancias

    //Sobrecarga de métodos
    public Persona(){
        this.nombre = "Ejemplo";
        this.dni = "23423423";
        indice++;
    }

    public Persona(String nombre){
        this.nombre = nombre;
        this.dni = "123";
        indice++;
    }

    public Persona(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        indice++;
    }
    //Sobrecarga de métodos

    public static void dimeHola(){
        System.out.println(indice);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //Sobrescritura del método toString de la clase object
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
    }
    //Sobrescritura del método toString de la clase object
}