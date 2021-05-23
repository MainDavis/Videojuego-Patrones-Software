package state;

import enemigos.Enemigo;
import graficos.Pantalla;

public class EstadoElectrocutado extends Estado{
    private final int duracion = 10;
    private int turnosRestantes; 

    public EstadoElectrocutado( EfectosContexto context){
        this.context = context;
        turnosRestantes = duracion;
    }
    
    public void ejecutar(Enemigo enemigo, Pantalla pantalla){
        if(turnosRestantes>=0){
            turnosRestantes--;

            enemigo.recibirDamage(2);
            pantalla.efectoDeEstado("Electrocutado");

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