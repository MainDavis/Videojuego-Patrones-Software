package Decorator;

public class NewEstadisticas extends Decorator{
    
    public NewEstadisticas(Estadisticas estadistica){
        super(estadistica);
    }

    public int[] getEstadisticas(){

        int[] temp = new int[5];
        for(int i=0; i<5;i++){
            temp[i] = getComponent().getEstadisticas()[i]+1;
        }
        return temp;
    }


    
}
