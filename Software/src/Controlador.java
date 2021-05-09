import graficos.Pantalla;

public class Controlador {
    
    public static void main(String[] args) throws Exception {
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
    }
}

