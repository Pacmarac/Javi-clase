public class Main {
    /*  
    1. array con las opciones.
    2. Instanciar el objeto menu.
    3.while (!salir);
    */
    public static void main(String[] args) throws Exception {
        //cuentas de ejemplo
        Cuenta Cn = new Cuenta();
        Cuenta c1 = new Cuenta(Cn.generar_cuenta(), Cn.generar_saldo());
        Cuenta c2 = new Cuenta(Cn.generar_cuenta(), Cn.generar_saldo());
        Cuenta c3 = new Cuenta(Cn.generar_cuenta(), Cn.generar_saldo());
        Cuenta c4 = new Cuenta(Cn.generar_cuenta(), Cn.generar_saldo());
        Cuenta c5 = new Cuenta(Cn.generar_cuenta(), Cn.generar_saldo());
        Cuenta[] cejemplo ={c1,c2,c3,c4,c5};

        // menu
        String[] menuses = {"Salir","Ingresar","Retirar","Saldo","Ultimos Movimientos","Transferencia"};
        menu menu = new menu(menuses);
        
        // Mostrar menu 
        // menu.mostrar(menuses);

        // Mostrar cuenta y saldo 
        /* 
        for(int i = 0; i < 5;i++){
            imprimir(cejemplo[i]);
        }
        */
    }
    public static void imprimir(Cuenta cn){
        System.out.println(cn.toString());
    }
}
