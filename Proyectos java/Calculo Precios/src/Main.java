public class Main {
    public static void main(String[] args) throws Exception {
        productoUnitario pu1 = new productoUnitario(6, 4, "brick de leche", "Producto por unidades");
        productopeso pp1= new productopeso(5.5, 2.3, "naranjas", "Producto por peso");

        System.out.println(pu1.imprimir()); 
        System.out.println(pp1.imprimir());
    }
}
