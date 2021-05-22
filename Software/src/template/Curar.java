package template;

import Calculadora.CalcularDamage;
import Decorator.Estadisticas;
import Jugador.Jugador;
import enemigos.Enemigo;
import graficos.Pantalla;

public class Curar extends TemplateMethod {

    public void ejecutaAccion(Jugador jugador, Estadisticas stats, Enemigo enemigo, CalcularDamage calculadora) {
        System.out.println("ME CURO");
    }

    public void ejecutaAnimacion(Pantalla pantalla, int nEnemigo) {
        System.out.println("EJECUTO ANIMACION");
    }
    
}
