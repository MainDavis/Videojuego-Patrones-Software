package state;

import enemigos.Enemigo;
import graficos.Pantalla;

public class EstadoSangrado extends Estado{
    private final int duracion = 5;
    private int turnosRestantes; 

    public EstadoSangrado( EfectosContexto context){
        this.context = context;
        turnosRestantes = duracion;
    }
    
    public void ejecutar(Enemigo enemigo, Pantalla pantalla){
        if(turnosRestantes>=0){
            turnosRestantes--;

            enemigo.recibirDamage(5);
            pantalla.efectoDeEstado("Sangrado");

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
