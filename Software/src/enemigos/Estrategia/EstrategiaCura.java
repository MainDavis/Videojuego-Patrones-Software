package enemigos.Estrategia;

public class EstrategiaCura implements EstrategiaCombate{
    private final int posATK = 3;

    public boolean sacarAccion() {
        int rand = (int) (Math.random()*10);
        
        if(rand <= posATK) return true;
        return false;
    }
}
