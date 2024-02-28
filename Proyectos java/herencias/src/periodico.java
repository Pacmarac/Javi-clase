public class periodico extends publicacion{
    private String tituloP;
    private String editorialP;

    public periodico(){}
    
    public periodico(String titulo, String editorial, int numpag, float precio){
        super(numpag,precio);
        this.tituloP = titulo;
        this.editorialP = editorial;
    }

    public String getTituloP() {
        return tituloP;
    }

    public void setTituloP(String tituloP) {
        this.tituloP = tituloP;
    }

    public String getEditorialP() {
        return editorialP;
    }

    public void setEditorialP(String editorialP) {
        this.editorialP = editorialP;
    }
    
}
