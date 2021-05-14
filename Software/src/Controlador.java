import java.util.Random;

import graficos.Pantalla;

public class Controlador {
    
    public static void main(String[] args) throws Exception {
        //Atributos del jugador
        int mapa[] = {0,1,2,3};

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
        Jugador jugador = new Jugador(pantalla.getStats(), pantalla.getNpersonaje());
        //Patrón decorator

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
            pantalla.cambiarMapa(i);
            for(int j=0; j<4 && !jugador.muerto(); j++){  // Skeleton, Chief, Wolf, Robot
                pantalla.cambiarEnemigo(j);
                //Combates individuales

                while(!jugador.muerto() || !enemigos.muerto()){

                }




            }


        }


        
    }
}

