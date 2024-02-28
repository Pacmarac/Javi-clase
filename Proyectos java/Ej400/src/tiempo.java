public class tiempo {
    private int segundo;
    private int minuto;
    private int hora;

    tiempo(int hora, int minutos, int segundos){
        this.hora = hora;
        this.minuto = minutos;
        this.segundo = segundos;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void sumaSegundos(int segundos){
        int tmp = this.segundo + segundos;
        if(segundos < 0){
            System.out.println("El numero introducido no es valido");
        }
        else{
            while(tmp >= 60){
                tmp -= 60;
                sumaMinutos(1);
            }
        this.segundo = tmp;
        }
    }
    public void sumaMinutos(int minutos){
        int tmp = this.minuto + minutos;
        if(minutos < 0){
            System.out.println("El numero introducido no es valido");
        }
        else{
            while(tmp >= 60){
                tmp -= 60;
                sumaHoras(1);
                }
        this.minuto = tmp;
        }
    }
    public void sumaHoras(int horas){
        int tmp = this.hora + horas;
        if(horas < 0){
            System.out.println("El numero introducido no es valido");
        }
        else{
            while(tmp >= 24){
                    tmp -= 24;
            }
            this.hora = tmp;
        }
    }
    
    
    public void restaSegundos(int segundos){
        int tmp = this.segundo - segundos;
        if(segundos < 0){
            System.out.println("El numero introducido no es valido ");
        }
        else{
            while(tmp < 0){
                tmp += 60;
                restaMinutos(1);
            }
        this.segundo = tmp;
        }
    }
    public void restaMinutos(int minutos){
        int tmp = this.minuto - minutos;
        if(minutos < 0){
            System.out.println("El numero introducido no es valido el minuto");
        }
        else{
            while(tmp < 0){
                tmp += 60;
                restaHoras(1);
                
            }
        this.minuto = tmp;
        }
    }
    public void restaHoras(int horas){
        int tmp = this.hora - horas;
        if(horas < 0){
            System.out.println("El numero introducido no es valido para la hora");
        }
        else{
            while(tmp < 0){
                    tmp += 24;
                    //restaMinutos(1);
            }

        this.hora = tmp;
        }
    }
    
    
    public String toString(){
        String result = "";
        result += hora + "h "+ minuto + "m "+ segundo + "s";
        return result;
    }
    public tiempo sumar(tiempo otro){
        sumaSegundos(otro.segundo);
        sumaMinutos(otro.minuto);
        sumaHoras(otro.hora);
        tiempo temp = new tiempo(this.hora, this.minuto, this.segundo);
        return temp;
    }
    public tiempo resta(tiempo otro){
        restaSegundos(otro.segundo);
        restaMinutos(otro.minuto);
        restaHoras(otro.hora);
        tiempo temp = new tiempo(this.hora, this.minuto, this.segundo);
        return temp;
    }
}
