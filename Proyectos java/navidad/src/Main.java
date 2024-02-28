public class Main {
    public static void main(String[] args) throws Exception {
        int[] sacos = {1000 , 2000, 3000, -1, 4000, -1, 5000, 6000, -1, 7000, 8000, 9000, -1, 10000, -1};
        sacos nuevo = new sacos(sacos);
        nuevo.cantidad_de_sacos();
        nuevo.maximo();
        nuevo.minimo();
        nuevo.cantidad_en_saco();
        nuevo.cantidad_en_saco_max();
    }
}
