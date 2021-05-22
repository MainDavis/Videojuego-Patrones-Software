package enemigos.Estrategia;

public class Contexto {
  
    private EstrategiaCombate combate;

    public Contexto(EstrategiaCombate combate){
        this.combate = combate;
    }

    public boolean ejecutaEstrategia(int HP){
        return combate.sacarAccion(HP);
    }


}
