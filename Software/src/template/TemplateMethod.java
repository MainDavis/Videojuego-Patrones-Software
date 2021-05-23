package template;

import Calculadora.CalcularDamage;
import Decorator.Estadisticas;
import Jugador.Jugador;
import enemigos.Enemigo;
import graficos.Pantalla;
import state.EfectosContexto;
import state.EstadoNinguno;

public abstract class TemplateMethod {
    public final void turnoEnemigo(EfectosContexto efecto, Jugador jugador, Estadisticas stats, Enemigo enemigo, CalcularDamage calculadora,  Pantalla pantalla, int nEnemigo){
        damageState(efecto, enemigo, pantalla);
        ejecutaAccion(jugador, stats, enemigo, calculadora);
        ejecutaAnimacion(pantalla, nEnemigo);
    }

    public abstract void ejecutaAccion(Jugador jugador, Estadisticas stats, Enemigo enemigo, CalcularDamage calculadora);
    public abstract void ejecutaAnimacion(Pantalla pantalla, int nEnemigo);

    private final void damageState(EfectosContexto efecto, Enemigo enemigo, Pantalla pantalla) {
        efecto.ejecutarEstado(enemigo, pantalla);
        if(efecto.getTurnosRestantes()<0) efecto.setEstado( new EstadoNinguno(efecto));
    }
}
