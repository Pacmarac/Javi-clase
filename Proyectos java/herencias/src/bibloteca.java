public class bibloteca {
    public String nombre;
    public int posicion;
    public libro[] estanteLibros = new libro[10];
    public periodico[]estantePeriodicos = new periodico[10];

    public bibloteca(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public libro[] getEstanteLibros() {
        return estanteLibros;
    }

    public void setEstanteLibros(libro[] estanteLibros) {
        this.estanteLibros = estanteLibros;
    }

    public periodico[] getEstantePeriodicos() {
        return estantePeriodicos;
    }

    public void setEstantePeriodicos(periodico[] estantePeriodicos) {
        this.estantePeriodicos = estantePeriodicos;
    }
    
    // 4 metodos add libro, add periodico, listar libro , listar periodico.
    public boolean add_libro(libro ln){
        boolean bl = true;
        for(int i = 0; i < estanteLibros.length; i++){
            if (estanteLibros[i] == null){
                this.estanteLibros[i] = ln;
                return bl;
            }
        }
        System.out.println("No se ha podido introducir el libro por que la libreria esta llena");
        bl = false;
        return bl;
    }

    public boolean add_periodico(periodico Perin){
        boolean bl = true;
        for(int i = 0; i < estantePeriodicos.length; i++){
            if (estantePeriodicos[i] == null){
                this.estantePeriodicos[i] = Perin;
                return bl;
            }
        }
        System.out.println("No se ha podido introducir el periodico por que la libreria esta llena");
        bl = false;
        return bl;
    }

    public void listar_libro(){}

    public void listar_periodico(){}
    
}
