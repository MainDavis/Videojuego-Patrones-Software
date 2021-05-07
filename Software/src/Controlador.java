import graficos.Pantalla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    
    public static void main(String[] args) throws Exception {
        int nivel=0;
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);

        //Pantalla de inicio
        pantalla.pantallaInicio();
        
        pantalla.btt_start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.cambiarSprite(); 
            }
        });
 
        

    }

}

