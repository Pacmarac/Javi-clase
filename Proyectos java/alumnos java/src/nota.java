public class nota {
    alumno alum;
    asignatura asig;
    private int curso;
    private int eval;
    private int calif;

    nota(alumno alum, asignatura asig, int curso, int eval, int calif){
        this.alum = alum;
        this.asig = asig;
        this.curso = curso;
        this.eval = eval;
        this.calif = calif;
    }

    public alumno getAlum() {
        return alum;
    }

    public void setAlum(alumno alum) {
        this.alum = alum;
    }

    public asignatura getAsig() {
        return asig;
    }

    public void setAsig(asignatura asig) {
        this.asig = asig;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getEval() {
        return eval;
    }

    public void setEval(int eval) {
        this.eval = eval;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }

    
}
