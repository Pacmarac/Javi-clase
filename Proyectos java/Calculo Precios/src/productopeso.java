public class productopeso extends producto implements IPrecio{
    private double peso;
    private double precioPorPeso;

    public productopeso(double peso, double precioPorPeso, String nombre, String categoria){
        super(nombre, categoria);
        this.peso = peso;
        this.precioPorPeso = precioPorPeso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioPorPeso() {
        return precioPorPeso;
    }

    public void setPrecioPorPeso(double precioPorPeso) {
        this.precioPorPeso = precioPorPeso;
    }

    public double getImporteTotal(){
        double result = 0;
        result = peso*getPrecioPorPeso();
        return result;
    }
    public String imprimir(){
        String imprimir ="";
        imprimir = "Nombre "+ getNombre() + ",\n"+
                    + peso + " Kg ,\n"+
                    "precio "+ precioPorPeso + ",\n"+
                    "importe total " + getImporteTotal();
        return imprimir;
    }
}
