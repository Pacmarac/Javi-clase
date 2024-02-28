public class libro extends publicacion{
    public String titulo;
    public String TipoPortada;
    public String ISBN;
    public String NombreAutor;
    public String editorial;

    public libro (){
        super();
    }

    public libro(String titulos, String portada, String ISBN, String Autor, String Editorial, int numpag, float precio){
        super(numpag, precio);
        this.titulo = titulos;
        this.TipoPortada = portada;
        this. ISBN = ISBN;
        this.NombreAutor = Autor;
        this.editorial = Editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoPortada() {
        return TipoPortada;
    }

    public void setTipoPortada(String tipoPortada) {
        TipoPortada = tipoPortada;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        NombreAutor = nombreAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
