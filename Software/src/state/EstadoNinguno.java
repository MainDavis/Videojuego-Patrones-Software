package state;

import enemigos.Enemigo;
import graficos.Pantalla;

public class EstadoNinguno extends Estado{
    
    public EstadoNinguno( EfectosContexto context ){
        this.context = context;
    }

    public void ejecutar(Enemigo enemigo, Pantalla pantalla) {
        System.out.println("NINGUNO");
        
    }

    public int getTurnosRestantes(){
        return 1;
    }

}
