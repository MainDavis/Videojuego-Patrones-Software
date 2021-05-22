package template;

import Calculadora.CalcularDamage;
import Decorator.Estadisticas;
import Jugador.Jugador;
import enemigos.Enemigo;
import graficos.Pantalla;

public abstract class TemplateMethod {
    public final void turnoEnemigo(Jugador jugador, Estadisticas stats, Enemigo enemigo, CalcularDamage calculadora,  Pantalla pantalla, int nEnemigo){
        damageState();
        ejecutaAccion(jugador, stats, enemigo, calculadora);
        ejecutaAnimacion(pantalla, nEnemigo);
    }

    public abstract void ejecutaAccion(Jugador jugador, Estadisticas stats, Enemigo enemigo, CalcularDamage calculadora);
    public abstract void ejecutaAnimacion(Pantalla pantalla, int nEnemigo);

    private final void damageState() {

    }
}
