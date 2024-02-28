import java.time.LocalDateTime;

public class cajero {
    private String idCajero;
    private movimientos mov[] = new movimientos[100];
    private int ultMov;
    public enum tipoOperacion {
        Ingreso, retirada, transferencia, saldo, ultimos_mov
    }
    String[] opeLit = {"INGRESO","RETIRADA","TRANSFERENCIA","SALDO","ULTIMOS MOVIMIENTOS"};
    // 14 id de caracteres 
    public cajero(String Idcajero){
        super();
        this.idCajero = Idcajero;
        this.ultMov = 0;
    }
    
    public String getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(String idCajero) {
        this.idCajero = idCajero;
    }

    public movimientos[] getMov() {
        return mov;
    }

    public void setMov(movimientos[] mov) {
        this.mov = mov;
    }

    public int getUltMov() {
        return ultMov;
    }

    public void setUltMov(int ultMov) {
        this.ultMov = ultMov;
    }

    public boolean operacion(Cuenta corigen, Cuenta cdestino, float importe, tipoOperacion tipo){
        boolean result = false;
        LocalDateTime t;
        switch(tipo){
            case Ingreso:
                result = corigen.ingresar(importe);
                if(result){
                    t = LocalDateTime.now();
                    movimientos m = new movimientos(corigen, cdestino, importe, t, idCajero);
                    result = this.registroMovimiento(m);
                }
            break;
            case retirada:
            result = corigen.retirar(importe);
            if(result){
                t = LocalDateTime.now();
            }
            break;
            case saldo:
            result = corigen.saldo_mostrar(corigen);
            break;
            case ultimos_mov:
            /*ver ultimos mov */
            break;
            case transferencia:
            result = corigen.transferencia(importe, cdestino, corigen);
            break;
        }
        return result;
    }
    public boolean registroMovimiento(movimientos movi){
        boolean result = false;
        if(ultMov < 100){
        this.mov[this.ultMov] = movi;
        this.ultMov += 1;
        result = true;
        }
        else{
            this.ultMov = 0;
        }
        
        return result;
    }
}
