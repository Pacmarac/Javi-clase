import java.util.TimeZone;

public class main {
    public static void main(String[] args) throws Exception {
        publicacion p1 = new publicacion();
        publicacion p2 = new publicacion(500, 20);
        libro l1 = new libro();
        libro l2 = new libro("pernambuco", "pito", "8454651686454", "Jose Antonio Menisco", 
                            "BCSπto",500, 20);
        System.out.println("Datos publicacion 2");
        System.out.println("Numero de paginas "+ p2.getNumeroDePaginas());
        System.out.println("Numero de paginas "+ p2.getprecio());
        p1.setNumeroDePaginas(350);
        p1.setprecio((float)10.6);
        System.out.println("Datos publicacion 1");
        System.out.println("Numero de paginas "+ p1.getNumeroDePaginas());
        System.out.println("Numero de paginas "+ p1.getprecio());
    }
}
