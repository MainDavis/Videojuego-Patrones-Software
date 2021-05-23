package state;

import enemigos.Enemigo;
import graficos.Pantalla;

public abstract class Estado {
    protected EfectosContexto context;
    public abstract void ejecutar( Enemigo enemigo, Pantalla pantalla);
    public abstract int getTurnosRestantes();
}
