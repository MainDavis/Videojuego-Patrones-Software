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

    private ImageIcon knight_idle = new ImageIcon("resources//sprites//knight//idle.gif");

    private ImageIcon wizard_idle = new ImageIcon("resources//sprites//wizard//idle.gif");
    //GUI
    private ImageIcon btt_inicio = new ImageIcon("resources//sprites//gui//btt_inicioR.png");
    private JLabel pj;
    private JLabel background;
    //Botones
    private JButton btt_start;
    private JButton btt_siguiente, btt_anterior, btt_select;
    //Variables
    private int Npersonaje = 0;
    private boolean continuar = false;
    //Vida, Ataque fisico, Ataque magico, Defensa, Evasion
    private final int[] statsKnight =   {5,1,3,5,1};
    private final int[] statsGunwoman = {2,3,3,1,5};
    private final int[] statsWizard =   {3,5,3,3,3};
    private int[] stats;
    private int puntosStats = 5;

    public Pantalla(){
        super();
        configurarVentana();
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

    public void pantallaInicio(){
        
        btt_start = new JButton();
        btt_start.setBounds(303, 299, 294,102);
        btt_start.setIcon(btt_inicio);
        btt_start.setBorderPainted(false); 
        btt_start.setContentAreaFilled(false); 

        btt_start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              continuar=true;   
            }
        });
        
        background.setIcon(bg_inicio); 

        //Ordenado de arriba a abajo
        this.add(btt_start);
        this.add(background);     

    }

    public void pantallaSeleccionDePersonaje(){
        //Quito el boton de seguir
        this.remove(btt_start);

        //Imprimo el personaje
        pj = new JLabel();
        pj.setIcon(knight_idle);
        pj.setBounds(385,175,192,192);

        //Creo los nuevos botones
        btt_siguiente = new JButton("Siguiente");
        btt_siguiente.setBounds(545, 299, 150,50);

        btt_anterior = new JButton("Anterior");
        btt_anterior.setBounds(215, 299, 150,50);

        btt_select = new JButton("Seleccionar");
        btt_select.setBounds(375, 400, 150,50);
        //Añado los eventos
        btt_siguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Npersonaje++;
                if(Npersonaje > 2 ) Npersonaje = 0;
                cambiarIconPj(Npersonaje);
            }
        });
        btt_anterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Npersonaje--;
                if(Npersonaje < 0 ) Npersonaje = 2;
                cambiarIconPj(Npersonaje);  
            }
        });
        btt_anterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Npersonaje--;
                if(Npersonaje < 0 ) Npersonaje = 2;
                cambiarIconPj(Npersonaje);  
            }
        });
        btt_select.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                continuar = true; 
            }
        });
        //Añado por orden
        this.add(pj);
        this.add(btt_siguiente);
        this.add(btt_anterior);
        this.add(btt_select);
        this.add(background);        
    }

    public void pantallaSeleccionAtributos(){
        this.remove(btt_select);
        this.remove(btt_siguiente);
        this.remove(btt_anterior);
        pj.setBounds(385,50,192,192);
        //Dios que horror
    }

    public boolean continuar(){
        if(continuar){
            continuar=false;
            return true;
        }
        return false;
    }

    public void cambiarIconPj(int index){
        switch (index){
            case 0:
                pj.setIcon(knight_idle);
                break;
            case 1:
                pj.setIcon(gunwoman_idle);
                break;
            case 2:
                pj.setIcon(wizard_idle);    
        }
    }
} 
    
