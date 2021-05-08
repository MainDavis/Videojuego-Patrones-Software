import graficos.Pantalla;

public class Controlador {
    
    public static void main(String[] args) throws Exception {
        int nivel=0;
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

        System.out.println("ATRIBUTOS");

        pantalla.pantallaSeleccionAtributos();
    }
}

