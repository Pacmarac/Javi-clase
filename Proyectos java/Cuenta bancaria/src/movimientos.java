import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class movimientos {

    private Cuenta corigen;
    private Cuenta cdestino;
    private double importe;
    private LocalDateTime Fechamov;
    private String operacion;

    movimientos(Cuenta cori, Cuenta cdest, double importe, LocalDateTime fecha, String ope){
        super();
        this.corigen = cori;
        this.cdestino = cdest;
        this.importe = importe;
        this.Fechamov = fecha;
        this.operacion = ope;
    }

    public Cuenta getCorigen() {
        return corigen;
    }

    public void setCorigen(Cuenta corigen) {
        this.corigen = corigen;
    }

    public Cuenta getCdestino() {
        return cdestino;
    }

    public void setCdestino(Cuenta cdestino) {
        this.cdestino = cdestino;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public LocalDateTime getFechamov() {
        return Fechamov;
    }

    public void setFechamov(LocalDateTime fechamov) {
        Fechamov = fechamov;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String toString(){
        String result = "";
        String tmp = " ";
        result = result + this.Fechamov + " ";
        tmp = String.format("-%14s", this.operacion);
        result = result + this.operacion + " ";
        result = result + this.corigen.getNumero_cuenta() + " ";
        if(this.cdestino == null){
            tmp = String.format("%-24s"," ");
            result = result + tmp;
        }
        return result;
    }

    public void ejfecha(){
        // o * fecha/hora actual
        LocalDateTime today = LocalDateTime.now();
        System.out.println("actual:    "+ today);
        // 1 patron por defecto
        String time = "2024-01-11T12:05:30";
        LocalDateTime localtimeobj = LocalDateTime.parse(time);
        System.out.println("actural:    "+ localtimeobj);
        //2 - patron a medida
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time1 = "2024-01-11 12:15:30";
        LocalDateTime localtomeobj1 = LocalDateTime.parse(time1,formatter);
        System.out.println("actural:    "+ localtomeobj1.format(formatter));
    }

}
