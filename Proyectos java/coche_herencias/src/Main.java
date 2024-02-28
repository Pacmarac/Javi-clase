public class Main {
    public static void main(String[] args) throws Exception {
        motocicleta moto1 = new motocicleta((short) 125, (short) 50, "verde");
        motocicleta moto2 = new motocicleta((short) 250, (short) 100, "amarillo");
        camion camion1 = new camion((byte) 4, (short)2000, (short) 400, "Negro", 2);
        camion camion2 = new camion((byte) 8, (short)4000, (short) 800, "Blanco", 4);
        
        System.out.println(moto1.toString());
        System.out.println(camion1.toString());
    }
}
