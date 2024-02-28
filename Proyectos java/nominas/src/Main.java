public class Main {
    public static void main(String[] args) throws Exception {
        /** 
        DIRECTOR Pérez, Jorge | 51200201X | 60000 | true
        TÉC.SOPORTE 1 "Ramírez, Luis", "29300301M", 30000, 1256,34
        TÉC.SOPORTE 2 "Poveda, Alfredo", "29300301M", 30000, 974.28
        TÉC.DES 1 "Sanz, Carlos", "29300301M", 34000, 4
        TÉC.DES 2 "Sanchez, Jorge","29300301M", 33500, 6
        */
        director d1 = new director("Perez, Jorge", "51200201X", 60000, true);
        tecnicoSoporte ts1 = new tecnicoSoporte("Ramírez, Luis", "29300301M", 30000, 1256.34);
        tecnicoSoporte ts2 = new tecnicoSoporte("Poveda, Alfredo", "29300301M", 30000, 974.28);
        tecnicoDesarrollo td1 = new tecnicoDesarrollo("Sanz, Carlos", "29300301M", 34000, 4);
        tecnicoDesarrollo td2 = new tecnicoDesarrollo("Sanchez, Jorge","29300301M", 33500, 6);
        /* 
        System.out.println(d1.toString()); 
        System.out.println(d1.calculaNomina()); 
        System.out.println();
        */
        empleados[] Mis_empleados = {d1, ts1, ts2, td1, td2};

        for(int i = 0; i < Mis_empleados.length; i++){
            System.out.println(Mis_empleados[i].toString());
        }
    }
}
