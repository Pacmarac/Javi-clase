public class App {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Juan", "12345X");
        Persona p2 = new Persona();
        Persona p3 = new Persona("Javier");
        Alumno p4 = new Alumno("0", "Nacho", "123456789P");

        //Polimorfismo
        Persona[] personas = new Persona[4];
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;
        //Polimorfismo

        for (Persona p: personas){
            System.out.println(p);
        }

        //System.out.println(p4.getDni() + "      " + p4.getNombre() + "         " + p4.getMatricula());
        //System.out.println(p4);
        //Persona.dimeHola();
    }
}