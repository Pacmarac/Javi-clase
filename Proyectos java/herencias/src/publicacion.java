public class publicacion{
    public int NumeroDePaginas;
    public float precio;

    public publicacion(int numpag, float precio){
        this.NumeroDePaginas = numpag;
        this.precio = precio;
    }
    public publicacion(){}

    public int getNumeroDePaginas(){
        return NumeroDePaginas;
    }
    public void setNumeroDePaginas(int NumeroDePaginas){
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public float getprecio(){
        return precio;
    }
    public void setprecio(float precio){
        this.precio = precio;
    }
}
