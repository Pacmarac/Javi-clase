public class motocicleta extends vehiculo{
    public motocicleta (short cilindrada, short potencia, String color){
        super((byte)2, cilindrada,potencia,color);
    }

    @Override
    public int impuesto() {
        int result = 0;
        int temp = (this.getCilindrada()/30) + (this.getPotencia()*30);
        result = temp;
        return result;
    }
}
