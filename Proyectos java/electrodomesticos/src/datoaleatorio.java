public class datoaleatorio {
    
    public datoaleatorio(){}

    public int intt(){
        int result = 0;
        result = (int)(Math.random()* (101 - 1)) + 1;
        return result;
    }

    public double dob(){
        double result = (double)(intt()) + intt()*1.5;
        return result;
    }

    public boolean bool(){
        boolean result = (intt() < 50)?true:false;
        return result;
    }

    public String str(){
        String result = "";
        int na = intt();
        if(na < 21){
            result = "rojo";
        }
        else if(na > 20 && na < 41){
            result = "negro";
        }
        else if(na > 40 && na < 61){
            result = "azul";
        }
        else if(na > 60 && na < 81){
            result = "gris";
        }
        else{
            result = "blanco";
        }
        return result;
    }
    public char let(){
        char result = 'a';
        int na = intt();
        if(na < 11){
            result = 'A';
        }
        else if(na > 10 && na < 21){
            result = 'B';
        }
        else if(na > 20 && na < 31){
            result = 'C';
        }
        else if(na > 30 && na < 41){
            result = 'D';
        }
        else if(na > 40 && na < 51){
            result = 'E';
        }
        else if(na > 50 && na < 61){
            result = 'F';
        }
        else{
            result = 'P';
        }
        return result;
    }
}
