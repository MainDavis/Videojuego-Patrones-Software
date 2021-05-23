package state;

import enemigos.Enemigo;
import graficos.Pantalla;

public class EfectosContexto {
    private Estado estado;

    public EfectosContexto(){
        this.estado = new EstadoNinguno(this);
    }


    public void setEstado( Estado estado ){
        this.estado = estado;
    }

    public void ejecutarEstado( Enemigo enemigo, Pantalla pantalla){
        estado.ejecutar(enemigo, pantalla);
    }

    public void getTurnosRestantes(){
        estado.getTurnosRestantes();
    }
}
