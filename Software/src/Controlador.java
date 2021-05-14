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


        //Asigno un recorrido aleatorio del mapa
        Random rand = new Random();
        for(int i = 0; i < mapa.length; ++i) {
            int index = rand.nextInt(mapa.length - i);
            int tmp = mapa[mapa.length - 1 - i];
            mapa[mapa.length - 1 - i] = mapa[index];
            mapa[index] = tmp;
        }




        
    }
}

