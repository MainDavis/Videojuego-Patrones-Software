package enemigos.Estrategia;

public class Contexto {
  
    private EstrategiaCombate combate;

    public Contexto(EstrategiaCombate combate){
        this.combate = combate;
    }

    public ejecutaEstrategia(){
        return combate.sacarAccion();
    }


}
