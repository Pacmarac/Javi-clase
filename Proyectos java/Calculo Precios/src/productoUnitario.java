public class productoUnitario extends producto implements IPrecio{
    private int cantidad;
    private double precio;

    public productoUnitario(int cantidad, double precio, String nombre, String categoria){
        super(nombre, categoria);
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getImporteTotal(){
        double result = 0;
        result = cantidad*precio;
        return result;
    }
    public String imprimir(){
        String imprimir ="";
        imprimir = "Nombre "+ getNombre() + ",\n"+
                    "Cantidad "+ cantidad + ",\n"+
                    "precio "+ precio + ",\n"+
                    "precio total " + getImporteTotal();
        return imprimir;
    }
}
