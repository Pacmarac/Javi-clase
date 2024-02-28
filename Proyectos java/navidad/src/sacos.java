public class sacos {
    private int sacos_cantidad = 0;
    private int sacos_max;
    private int sacos_min;
    private int[] sacos_suma;
    private int[] mis_sacos;

    sacos(int[] sacos){
        this.mis_sacos = sacos;
    }
    public int[] getSacos_suma() {
        return sacos_suma;
    }
    public void setSacos_suma(int[] sacos_suma) {
        this.sacos_suma = sacos_suma;
    }
    public int getSacos_cantidad() {
        return sacos_cantidad;
    }
    public void setSacos_cantidad(int sacos_cantidad) {
        this.sacos_cantidad = sacos_cantidad;
    }
    public int getSacos_max() {
        return sacos_max;
    }
    public void setSacos_max(int sacos_max) {
        this.sacos_max = sacos_max;
    }
    public int getSacos_min() {
        return sacos_min;
    }
    public void setSacos_min(int sacos_min) {
        this.sacos_min = sacos_min;
    }
    public int[] getMis_sacos() {
        return mis_sacos;
    }
    public void setMis_sacos(int[] mis_sacos) {
        this.mis_sacos = mis_sacos;
    }
    public void cantidad_de_sacos(){
        for (int i = 0; i < mis_sacos.length ; i++){
            if (mis_sacos[i] == -1){
                this.sacos_cantidad++;
            }
        }
        System.out.println("Hay "+ sacos_cantidad +" sacos");
    }
    public void maximo(){
        for (int i = 0; i < mis_sacos.length ; i++){
            if(mis_sacos[i] > sacos_max){
                this.sacos_max = mis_sacos[i];
            }
        }
        System.out.println("El alimento con mas calorias en un saco es "+ sacos_max);
    }
    public void minimo(){
        this.sacos_min = mis_sacos[0];
        for (int i = 0; i < mis_sacos.length ; i++){
            if(mis_sacos[i] != -1){
                if(mis_sacos[i] < sacos_min){
                    this.sacos_min = mis_sacos[i];
                }
            }
        }
        System.out.println("El alimento con menos calorias en un saco tiene "+ sacos_min);
    }
    public void cantidad_en_saco(){
        sacos_suma = new int[sacos_cantidad];
        int posi = 0;
        int j = 1;
        for (int i = 0; i < mis_sacos.length ; i++){
            if (mis_sacos[i] == -1){
                posi++;
            }
            else{
                sacos_suma[posi] += mis_sacos[i];
            }
        }
        for(int f = 0; f < sacos_suma.length;f++){
            System.out.println("En el saco "+ j + " hay "+ sacos_suma[f]);
            j++;
        }
    }
    public void cantidad_en_saco_max(){
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < sacos_suma.length ; i++){
            if(sacos_suma[i] > sacos_max){
                this.sacos_max = sacos_suma[i];
            }
        }
        for (int i = 0; i < sacos_suma.length ; i++){
            if (sacos_max > sacos_suma[i] && sacos_suma[i] > max2){
                max2 = sacos_suma[i];
            }
        }
        for (int i = 0; i < sacos_suma.length ; i++){
            if(max2 > sacos_suma[i] && sacos_suma[i] > max3){
                max3 = sacos_suma[i];
            }
        }
        System.out.println("El primer saco con mayor cantidad es "+ sacos_max);
        System.out.println("El segundo saco con mayor cantidad es "+ max2);
        System.out.println("El tercero saco con mayor cantidad es "+ max3);
    }
    
}
