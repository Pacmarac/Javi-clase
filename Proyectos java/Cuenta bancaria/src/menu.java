import java.util.Scanner;

public class menu {
    public String titulo;
    private String[] listaop;
    private int opcion;

    public  menu (String[] lista){
        
        this.listaop = lista;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String[] getListaop() {
        return listaop;
    }
    public void setListaop(String[] listaop) {
        this.listaop = listaop;
    }
    public int getOpcion() {
        return opcion;
    }
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    void mostrar(String[] menu){
        System.out.println(titulo);
        for(int i = 1; i < getListaop().length; i++){
            System.out.println("["+ i +"]" + " - "+ listaop[i]+".");
        }
        System.out.println("[0] - Salir.");
    }
    public int eligeOpcion(){
        Scanner ps = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int opcion = ps.nextInt();
        while(opcion >= listaop.length){
            System.out.println("Introduzca un numero valido.");
            opcion = ps.nextInt();
        }
        return opcion;
    }
    void muestraLiteral (int opcion){
        if(opcion == 0){
            System.exit(opcion);
        }
       System.out.println(listaop[opcion]);
    }
}
