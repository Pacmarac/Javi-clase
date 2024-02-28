import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op = -1;
        String[] ps = {"Salir","Datos","Modificar","Listar","Precio"};
        electrodomestico[] maquinetas = new electrodomestico[10];
        menu men = new menu(ps);
        while(op != 0){
        men.mostrar();
        op = men.eligeOpcion();
        men.opcionElegida(op);
        switch(op){
        case 1:
        /**
         * 1. Generar datos aleatoriamente para 5 lavadoras y 5 televisiones
         */
        datoaleatorio aleatorio = new datoaleatorio();
        lavadora l1 = new lavadora(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt());
        lavadora l2 = new lavadora(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt());
        lavadora l3 = new lavadora(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt());
        lavadora l4 = new lavadora(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt());
        lavadora l5 = new lavadora(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt());
        television t1 = new television(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt(), aleatorio.bool());
        television t2 = new television(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt(), aleatorio.bool());
        television t3 = new television(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt(), aleatorio.bool());
        television t4 = new television(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt(), aleatorio.bool());
        television t5 = new television(aleatorio.dob(), aleatorio.intt(), aleatorio.str(), aleatorio.let(), aleatorio.intt(), aleatorio.bool());
        electrodomestico[] maquinetas2 = {l1,l2,l3,l4,l5,t1,t2,t3,t4,t5};
        for (int i = 0; i < maquinetas.length; i++){
            maquinetas[i] = maquinetas2[i];
        }
        System.out.println("Datos generados");
        break;
        case 2:
        /**
         * 2. Modificar el valor de un determinado electrodoméstico, solicitando la
         * posición del array y en función de su tipo, solicitar sus atributos específicos.
         */
        System.out.println("Indica la posicion del array");
        int i2 = sc.nextInt();
            boolean tv2 = maquinetas[i2] instanceof television;
            boolean lv2 = maquinetas[i2] instanceof lavadora;
            if (tv2){
                television temptv = (television)maquinetas[i2];
                String[] metv = {"Precio = "+ temptv.getPrecioBase(), "Peso = " + temptv.getPeso(), 
                                "Color = " + temptv.getColor(), "Consumo = " + temptv.getConsumoE(),
                                "Pulgadas = " + temptv.getPulgadas(), "Tiene TDT = " +temptv.isSintonizadorTDT()};
                menu mentv = new menu(metv);
                mentv.setTitulo("Television");
                mentv.mostrar();
                mentv.cambiarTele(temptv);
                maquinetas[i2] = temptv;
            }
            if (lv2){
                lavadora templv = (lavadora)maquinetas[i2];
                String[] melv = {"Precio = "+ templv.getPrecioBase(), "Peso = " + templv.getPeso(), 
                "Color" + templv.getColor(), "Consumo = " + templv.getConsumoE(), "Carga = " + templv.getCarga()};
                menu menlv = new menu(melv);
                menlv.setTitulo("Lavadora");
                menlv.mostrar();
                menlv.cambiarlava(templv);
                maquinetas[i2] = templv;
            }
        
        break;
        case 3:
        /**
         * 3. Listado de electrodoméstico indicando su tipo, color y precio final.
         */
        for (int i = 0; i < maquinetas.length; i++){
            System.out.println(maquinetas[i].toString_Parte3());
        }
        System.out.println();
        break;
        case 4:
        /**
         * 4. Resumen de precios de la colección, con 3 campos:
         *  El precio total de todas las televisiones
         *  El precio total de todas las lavadoras
         *  El precio total de todos los electrodomésticos
         */
        double precioTV = 0;
        double precioLV = 0;
        double precioEL = 0;
        for (int i = 0; i < maquinetas.length; i++){
            boolean tv = maquinetas[i] instanceof television;
            boolean lv = maquinetas[i] instanceof lavadora;
            if (tv){
                precioTV += maquinetas[i].precioFinal();
            }
            if (lv){
                precioLV += maquinetas[i].precioFinal();
            }
            precioEL += maquinetas[i].precioFinal();
        }
        System.out.println("Este es el precio final de todas las Televisiones "+ precioTV);
        System.out.println("Este es el precio final de todas las Lavadoras "+ precioLV);
        System.out.println("Este es el precio final de todos los Electrodomesticos "+ precioEL);
        break;
    }
}
        
    }
}
