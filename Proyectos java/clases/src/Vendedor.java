public class Vendedor {
    //atributos
    public String nombre;
    public String apellido;
    public int matricula;
    public int ventas;
    //atributos

    //constructor
    public Vendedor (){

    }
    //contructor lleno
    public Vendedor(String _nombre, String _apellido, int _matricula, int _ventas){
        this.nombre =_nombre;
        this.apellido = _apellido;
        this.matricula = _matricula;
        this.ventas = _ventas;

    }
    //constructor

    //Getters y settters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getVentas() {
        return ventas;
    }
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    //Getters y settters


    //metodos del negocio

    public void vende(Articulo art, int numart){

        double preciodeoperacion;
        int nuevo_stock;

        if(numart <= art.getStock()){
            preciodeoperacion = numart * art.precio; // importe de venta
            nuevo_stock = art.getStock() - numart; // Nuevo stock
            art.setStock(nuevo_stock);// Stock actualizado

            //apuntarme la venta

            this.ventas += preciodeoperacion;
        }
        else{

        }
    }
}
