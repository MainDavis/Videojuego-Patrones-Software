package template;

import Calculadora.CalcularDamage;
import Decorator.Estadisticas;
import Jugador.Jugador;
import enemigos.Enemigo;
import graficos.Pantalla;

public class Atacar extends TemplateMethod {

    public void ejecutaAccion(Jugador jugador, Estadisticas stats, Enemigo enemigo, CalcularDamage calculadora) {
       
        int damage = calculadora.calcDamage(enemigo.getStats(), stats.getEstadisticas());
        jugador.recibirDamage(damage);

    }
    
    public void ejecutaAnimacion(Pantalla pantalla, int nEnemigo) {

        pantalla.animAttackEnemigo(true, nEnemigo);

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pantalla.impactoPJ();

        int millis=0;

        switch(nEnemigo){
            case 0:
                millis = 900;
                break;
            case 1:
                millis = 900;
                break;
            case 2:
                millis = 900;
                break;
            case 3:
                millis = 900;
                break;
        }

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pantalla.animAttackEnemigo(false, nEnemigo);

    }
    
}
