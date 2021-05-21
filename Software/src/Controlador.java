import java.util.Random;

import Decorator.EstadisticasBase;
import Decorator.NewEstadisticas;
import enemigos.Skeleton;
import enemigos.Chief;
import enemigos.Wolf;
import enemigos.Robot;
import enemigos.EnemyFactory;
import enemigos.Mapa1.EnemigosMapa1;
import enemigos.Mapa2.EnemigosMapa2;
import enemigos.Mapa3.EnemigosMapa3;
import enemigos.Mapa4.EnemigosMapa4;
import graficos.Pantalla;

public class Controlador {
    
    public static void main(String[] args) throws Exception {
        int mapa[] = {0,1,2,3};
        //Creo los enemigos
        EnemyFactory enemyFactory = new EnemigosMapa1(); //Por defecto lo pongo a Mapa1
        Skeleton skeleton;
        Chief chief;
        Wolf wolf;
        Robot robot;

        CalcularDamage calculadora = CalcularDamage.instance();

        boolean accion=false;

        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);

        //Pantalla de inicio
        pantalla.pantallaInicio();
        
        //Espero a que pulse
        while(!pantalla.continuar()){
            Thread.sleep(100);
        }
        
        pantalla.pantallaSeleccionDePersonaje();

        //Espero a que seleccione el personaje
        while(!pantalla.continuar()){
            Thread.sleep(100);
        }

        pantalla.pantallaSeleccionAtributos();

        //Espero a que seleccione los atributos
        while(!pantalla.continuar()){
            Thread.sleep(100);
        }

        //Crear el personaje
        Jugador jugador = new Jugador(pantalla.getNpersonaje());
        //Patrón decorator
        EstadisticasBase estadisticasBase = new EstadisticasBase(pantalla.getStats());
        NewEstadisticas newEstadisticas =  new NewEstadisticas(estadisticasBase);
        jugador.actualizarVida(newEstadisticas.getEstadisticas()[0]);


        //Asigno un recorrido aleatorio del mapa
        Random rand = new Random();
        for(int i = 0; i < mapa.length; ++i) {
            int index = rand.nextInt(mapa.length - i);
            int tmp = mapa[mapa.length - 1 - i];
            mapa[mapa.length - 1 - i] = mapa[index];
            mapa[index] = tmp;
        }

        //Combate
        pantalla.iniciaCombate();

        for(int i=0; i<4 && !jugador.muerto(); i++){

            //Cargo el mapa
            pantalla.cambiarMapa(mapa[i]);
            //Pongo la fabrica
            switch(i){
                case 0:
                    enemyFactory = new EnemigosMapa1();
                    break;
                case 1: 
                    enemyFactory = new EnemigosMapa2();
                    break;
                case 2:
                    enemyFactory = new EnemigosMapa3();
                    break;
                case 3:
                    enemyFactory = new EnemigosMapa4();
                    break;    
            }
            skeleton = enemyFactory.crearSkeleton(100+(25*i), 2+(2*i), 1+(2*i), 1+(1*i), 1+(1*i));
            chief = enemyFactory.crearChief(75+(25*i),5+(2*i), 3+(2*i), 1+(1*i), 1+(1*i));
            wolf = enemyFactory.crearWolf(100+(25*i), 5+(2*i), 1+(2*i), 1+(1*i), 3+(1*i));
            robot = enemyFactory.crearRobot(200+(25*i), 7+(2*i), 4+(2*i), 4+(1*i), 1+(1*i));

            //Duelos

            pantalla.cambiarEnemigo(0);
            while(!jugador.muerto() || !skeleton.muerto()){
                pantalla.actualizarHP(jugador.getHP(), skeleton.getStats()[0]);
                //Turno jugador
                accion = true;
                while(accion){
                    if(pantalla.getAtacar()){

                        int damage = calculadora.calcDamage(newEstadisticas.getEstadisticas(), skeleton.getStats());
                        System.out.println("DAMAGE: " + damage);
                        skeleton.recibirDamage(damage);

                        pantalla.animAttackPJ(true);
                        Thread.sleep(1000);
                        pantalla.impactoEnemigo();
                        Thread.sleep(1600);
                        pantalla.animAttackPJ(false);
                        
                        pantalla.actualizarHP(jugador.getHP(), skeleton.getStats()[0]);

                        accion = false;
                    }else if(pantalla.getCurarse()){
                        
                        pantalla.animAttackEnemigo(true);
                        Thread.sleep(1800);
                        pantalla.animAttackEnemigo(false);
                        //curarPJ(jugador, newEstadisticas.getEstadisticas()[2], pantalla);
                        accion = false;
                    }

                    Thread.sleep(250);
                }

                //Turno enemigo
                if(!skeleton.muerto()){
                    //Acciones del skeleto
                }
            }

            pantalla.cambiarEnemigo(1);
            while(!jugador.muerto() || !chief.muerto()){
                
            }

            pantalla.cambiarEnemigo(2);
            while(!jugador.muerto() || !wolf.muerto()){

            }

            pantalla.cambiarEnemigo(3);
            while(!jugador.muerto() || !robot.muerto()){
                
            }
            //Subimos las estadisticas cuando se pase de mundo
            newEstadisticas = new NewEstadisticas(newEstadisticas);

        }
 
    }

    public static void curarPJ(Jugador jugador, int MAG, Pantalla pantalla){
        int curacion = MAG*7;
        jugador.curarse(curacion);
        pantalla.curarPJ();
    }

}

