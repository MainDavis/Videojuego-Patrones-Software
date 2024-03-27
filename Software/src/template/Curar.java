package Template;

import Calculadora.CalcularDamage;
import Decorator.Estadisticas;
import Jugador.Jugador;
import enemigos.Enemigo;
import graficos.Pantalla;

public class Curar extends TemplateMethod {

    public void ejecutaAccion(Jugador jugador, Estadisticas stats, Enemigo enemigo, CalcularDamage calculadora) {
        int cura = enemigo.getStats()[2]*7;
        enemigo.curarse(cura);

    }

    public void ejecutaAnimacion(Pantalla pantalla, int nEnemigo) {
        pantalla.curarEnemigo(true);

        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pantalla.curarEnemigo(false);
    }
    
}
