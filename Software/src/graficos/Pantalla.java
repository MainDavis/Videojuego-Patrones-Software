package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pantalla extends JFrame{

    //Backgrounds
    private ImageIcon bg_inicio = new ImageIcon("resources//backgrounds//DarkSouls_epicR.gif");
    //Sprites
    private ImageIcon gunwoman_idle = new ImageIcon("resources//sprites//gunwoman//idle.gif");
    private ImageIcon gunwoman_attack = new ImageIcon("resources//sprites//gunwoman//attack.gif");
    //GUI
    private ImageIcon btt_inicio = new ImageIcon("resources//sprites//gui//btt_inicioR.png");
    private JLabel pj;
    private JLabel background;

    //Botones
    public JButton btt_start;

    public Pantalla(){
        super();
        configurarVentana();
        //inicializarComponentes();
    }

    private void configurarVentana(){
        this.setTitle("Prueba");
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creo el background
        background = new JLabel();
        background.setBounds(0,0,900,700);
    }

    private void inicializarComponentes(){
        pj = new JLabel();
        pj.setIcon(gunwoman_idle);
        pj.setBounds(50,50,400,400);
        this.add(pj);
    }

    public void pantallaInicio(){
        
        btt_start = new JButton();
        btt_start.setBounds(303, 299, 294,102);
        btt_start.setIcon(btt_inicio);
        btt_start.setBorderPainted(false); 
        btt_start.setContentAreaFilled(false); 
        
        background.setIcon(bg_inicio); 

        //Ordenado de arriba a abajo
        this.add(btt_start);
        this.add(background);     

    }

    public void pantallaSeleccionDePersonaje(){
        //Quito el boton de start
        this.remove(btt_start);
        
    }

    public void cambiarSprite(){
        this.remove(btt_start);
        this.repaint();
    }

    public void actionPerformed(ActionEvent e) { 
        synchronized (btt_start) {
            btt_inicio.notify();
        }    
    }

    public static boolean waitForEnter() throws InterruptedException {
        synchronized(btt_start) {
            try {
                
                b.wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("After button clicked");
    //... more code
    }
} 
    
