package Decorator;

public class EstadisticasBase implements Estadisticas {
    int stats[] = new int[5];


public EstadisticasBase(int stats[]){
    this.stats = stats;
}

public int[] getEstadisticas(){
    return stats;
}

}
