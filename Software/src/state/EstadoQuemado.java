package state;

import enemigos.Enemigo;
import graficos.Pantalla;

public class EstadoQuemado extends Estado{
    private final int duracion = 3;
    private int turnosRestantes; 

    public EstadoQuemado( EfectosContexto context){
        this.context = context;
        turnosRestantes = duracion;
    }
    
    public void ejecutar(Enemigo enemigo, Pantalla pantalla){
        if(turnosRestantes>=0){
            turnosRestantes--;

            enemigo.recibirDamage(10);
            pantalla.efectoDeEstado("Quemado");

            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        

    }

    public int getTurnosRestantes(){
        return turnosRestantes;
    }
}
