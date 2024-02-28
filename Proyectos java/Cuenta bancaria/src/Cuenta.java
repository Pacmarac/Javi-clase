import java.util.Random;

public class Cuenta {
    float saldo;
    String numero_cuenta;

    Cuenta(){
    }
    Cuenta(String cn, float saldo){
        this.numero_cuenta = cn;
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String getNumero_cuenta() {
        return numero_cuenta;
    }
    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
    
    // generar numero cuenta 
    public String generar_cuenta(){
        Random random = new Random();
        String cuenta_num = " ";
        char[] Chars = "0123456789".toCharArray();
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < 19; i++){
            if (i == 0){
                buffer.append('E');
            }
            else if (i == 1){
                buffer.append('S');
            }
            else {
                buffer.append(Chars[random.nextInt(Chars.length)]);
            }
        }
        cuenta_num = this.numero_cuenta = buffer.toString();
        return cuenta_num;
    }

    //ingresar
    public boolean ingresar(double cantidad){
        boolean result = false;
        if(cantidad < 0){
            System.out.println("Introduce una cantidad valida.");
        }
        else{
        this.saldo += cantidad;
        System.out.println("Se ha realizado la operacion el saldo es "+ saldo);
        result = true;
        }
        return result;
        
    }

   // retirar
   public boolean retirar(float cantidad){
    boolean result = false;
    float aux;
    aux = saldo - cantidad;
    if(cantidad <= 0){
        System.out.println("Introduce una cantidad valida");
    }
    else if (aux < 0){
        System.out.println("No se puede realizar la opreacion no hay cantidad suficiente en la cuenta");
    }
    else{
        this.saldo = aux;
        System.out.println("Se ha realizado la operacion el saldo es "+ saldo);
        result = true;
    }
    return result;
    }
    public boolean saldo_mostrar(Cuenta cori){
        boolean result = false;
        System.out.println(cori.saldo);
        result = true;
        return result;
    }
    public boolean transferencia(float cantidad, Cuenta cdest, Cuenta cori){
        boolean result = false;
        float aux1 = cori.saldo - cantidad;
        float aux2 = cdest.saldo + cantidad;
        if(cantidad <= 0){
            System.out.println("Introduce una catidad valida");
        }
        else if(aux1 < 0){
            System.out.println("No se puede realizar esta operacion, debido a que no tienes suficiente saldo en la cuenta");
        }
        else{
            cdest.saldo = aux2;
            System.out.println("La operacion se ha realizado con exito");
        }
        return result;
    }


    public String toString(){
        String result = "";
        result = result + this.saldo + " " + this.numero_cuenta;
        return result;
    }
    
    public float generar_saldo(){
        float randon = (float)(Math.random()*501);
        return randon;
    }
}
