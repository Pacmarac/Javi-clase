import java.util.Random;

public class Clase_De_prueba {
        double saldo;
        String numero_cuenta;

        public Clase_De_prueba(){}

        

    public double getSaldo() {
            return saldo;
        }



        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }



        public String getNumero_cuenta() {
            return numero_cuenta;
        }



        public void setNumero_cuenta(String numero_cuenta) {
            this.numero_cuenta = numero_cuenta;
        }



    public void generar_cuenta(){
        Random random = new Random();
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
        this.numero_cuenta = buffer.toString();
    }
}
