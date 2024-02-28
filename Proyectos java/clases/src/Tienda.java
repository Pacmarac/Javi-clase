public class Tienda {
    //atributos
    public String nombre;
    public String direccion;
    private int numArticulos;
    private int numVendedores;

    public Articulo[] artTienda;
    public Vendedor[] vendTiendo;
    //atributos

    //constructo 
    public Tienda(String nombre, String direccion, int numArticulos, int numVendedores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numArticulos = numArticulos;
        this.numVendedores = numVendedores;

        this.artTienda = new Articulo[numArticulos];
        this.vendTiendo = new Vendedor[numVendedores];
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getNumArticulos() {
        return numArticulos;
    }
    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }
    public int getNumVendedores() {
        return numVendedores;
    }
    public void setNumVendedores(int numVendedores) {
        this.numVendedores = numVendedores;
    }
    public Articulo[] getArtTienda() {
        return artTienda;
    }
    public void setArtTienda(Articulo[] artTienda) {
        this.artTienda = artTienda;
    }
    public Vendedor[] getVendTiendo() {
        return vendTiendo;
    }
    public void setVendTiendo(Vendedor[] vendTiendo) {
        this.vendTiendo = vendTiendo;
    }

    public boolean contratar(Vendedor v1, int posicion){

        int i = posicion;
        //algoritmo
        //hay espacio por y utilizamos i para iterar
        this.vendTiendo[i] = v1;
        return true;
    }
    public boolean addArticulo(Articulo v1, int posicion){
        int i = posicion;
        this.artTienda[i] = v1;
        return true;
        
    }

}
