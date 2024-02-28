public class Articulo {
    //atributos de la clase
    public String nombre;
    public float precio;
    public int stock;
    //atributos de la clase

    //constructor (vacio)
    public Articulo(){

    }
    //constructor(vacio)
    
    //constructor(lleno)
    public Articulo(String _nombre, float _precio, int _stock){

        //variables creadas
        this.nombre = _nombre; 
        this.stock = _stock;
        this.precio = _precio;
        this.stock = _stock;
        //variables creadas 

    }
    //constructor(lleno)

    //getter y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    //getters y setters de la clase

}
