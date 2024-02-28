public class puntodeventa {
    public static void main(String[] args) throws Exception {
       // System.out.println("Error compilation");

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNombre("Luis");
        vendedor1.setMatricula(1);
        vendedor1.setApellido("Piedrahita");

        Vendedor vendedor2 = new Vendedor("Jota jota", "Vaquero", 2,0);

        

        Articulo art001 = new Articulo("Calcetines", 500, 2);
        Articulo art002 = new Articulo("calzoncillos", 30, 7);
        Articulo art003 = new Articulo("Cerezas", 48, 3);
        Articulo art004 = new Articulo("Ivanes y Raules", 0, 2);
        Articulo art005 = new Articulo("Pepinos gordos grandes y negros", 80, 40);

        muestra_art(art001);
        muestra_art(art002);
        muestra_art(art003);
        muestra_art(art004);
        muestra_art(art005);
        // muestra_ art == System.out.println(artnnn.nombre +" hay "+ artnnn.stock +" y valen "+ artnnn.precio + " euros cada una");

        // venta del vendedor 1
        System.out.println("El vendedor vende 6 uds de calzoncillos");
        vendedor1.vende(art002, 6);

        Tienda MyStore = new Tienda("jamóncin no ramoncín", "c//francos rodriguez 11 1", 5, 2);
        System.out.println("Mi tienda se llama "+ MyStore.getNombre());
        System.out.println("Articulos en tienda :" + MyStore.getNumArticulos());
        System.out.println("Articulos en tienda :" + MyStore.getArtTienda().length);

        MyStore.contratar(vendedor1,0);
        MyStore.contratar(vendedor2,1);

        MyStore.addArticulo(art001, 0);
        MyStore.addArticulo(art002, 1);
        MyStore.addArticulo(art003, 2);
        MyStore.addArticulo(art004, 3);

        //listar vendedores

        System.out.println("Vendedores:");
        for(int cont =0; cont < MyStore.getNumVendedores(); cont++){//puedes poner tambien MyStore.vendTiendo.length

            if(MyStore.vendTiendo[cont] != null){
                System.out.println("["+ cont +"] "+ MyStore.vendTiendo[cont].getNombre() +" "+ MyStore.vendTiendo[cont].getApellido());
            }
            else{
                System.out.println("vacio");
            }
        }


        System.out.println("Articulos:");
        //lista articulos 
        for(int cont =0; cont < MyStore.getNumArticulos(); cont++){//puedes poner tambien MyStore.vendTiendo.length

            if(MyStore.artTienda[cont] != null){
                System.out.println("["+ cont +"] "+ MyStore.artTienda[cont].nombre +" hay "+ MyStore.artTienda[cont].stock);
            }
            else{
                System.out.println("vacio");
            }
        }
    }

    /***
     * 
     * @param artnnn articulo que queremos inspeccionar
     */

    public static void muestra_art(Articulo artnnn){
        System.out.println(artnnn.nombre +" hay "+ artnnn.stock +" y valen "+ artnnn.precio + " euros cada una");
    }
}
