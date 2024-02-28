import java.util.Scanner;
public class menu{
    private String titulo;
    private String[] listaop;
    private int opcion;

    public  menu (String[] lista){
        this.titulo = "Menu";
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
    
    void mostrar(){
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
        while(opcion >= listaop.length || opcion < 0){
            System.out.println("Introduzca un numero valido.");
            opcion = ps.nextInt();
        }
        return opcion;
    }
    void opcionElegida(int opcion){
        if(opcion == 0){
            System.exit(opcion);
        }
    }
    void cambiarTele(television tv){
        Scanner tvsc = new Scanner(System.in);
        int i = eligeOpcion();
        switch(i){
            case 1:
            System.out.println("Introduce el peso");
            tv.setPeso(tvsc.nextInt());
            System.out.println(tv.toString());
            break;
            case 2:
            System.out.println("Introduce el color");
            tv.setColor(tvsc.nextLine());
            System.out.println(tv.toString());
            break;
            case 3:
            System.out.println("Introduce el consumo");
            String let = tvsc.nextLine();
            char[] let2 = let.toCharArray();
            tv.setConsumoE(let2[0]);
            System.out.println(tv.toString());
            break;
            case 4:
            System.out.println("Introduce el pulgada");
            tv.setPulgadas(tvsc.nextInt());
            System.out.println(tv.toString());
            break;
            case 5:
            System.out.println("Introduce si tiene TDT");
            System.out.println("[1] - Tiene TDT \n [2] - No tiene TDT");
            int bool = tvsc.nextInt();
            boolean tdt = (bool == 3)? true : false;
            tv.setSintonizadorTDT(tdt);
            System.out.println(tv.toString());
            break;
        }
    }
    void cambiarlava(lavadora lv){
        Scanner lvsc = new Scanner(System.in);
        int i = eligeOpcion();
        switch(i){
            case 1:
            System.out.println("Introduce el peso");
            lv.setPeso(lvsc.nextInt());
            System.out.println(lv.toString());
            break;
            case 2:
            System.out.println("Introduce el color");
            lv.setColor(lvsc.nextLine());
            System.out.println(lv.toString());
            break;
            case 3:
            System.out.println("Introduce el consumo");
            String let = lvsc.nextLine();
            char[] let2 = let.toCharArray();
            lv.setConsumoE(let2[0]);
            System.out.println(lv.toString());
            break;
            case 4:
            System.out.println("Introduce la carga");
            lv.setCarga(lvsc.nextInt());
            System.out.println(lv.toString());
            break;
        }
    }
}
