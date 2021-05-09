package graficos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pantalla extends JFrame{

    //Backgrounds
    private ImageIcon bg_inicio = new ImageIcon("resources//backgrounds//DarkSouls_epic.gif");
    //Sprites
    private ImageIcon PJ_idle[] = { //Knight, Gunwoman, Wizard
        new ImageIcon("resources//sprites//gunwoman//idle.gif"),
        new ImageIcon("resources//sprites//knight//idle.gif"),
        new ImageIcon("resources//sprites//wizard//idle.gif")
    }; 
    //GUI
    private ImageIcon btt_inicio = new ImageIcon("resources//sprites//gui//btt_inicioR.png");
    private ImageIcon char_stats_icon = new ImageIcon("resources//sprites//gui//char_stats.png");
    private JLabel pj;
    private JLabel background;
    private JLabel char_stats;
        //Atributos
        private JLabel stat_HP;
        private JLabel stat_ATK;
        private JLabel stat_MAG;
        private JLabel stat_DEF;
        private JLabel stat_SPD;
    //Botones
    private JButton btt_start;
    private JButton btt_siguiente, btt_anterior, btt_select;
    private JButton btt_addHP, btt_rmvHP, btt_addATK, btt_rmvATK, btt_addMAG, btt_rmvMAG, btt_addDEF, btt_rmvDEF, btt_addSPD, btt_rmvSPD;
    //Variables
    private int Npersonaje = 0;
    private boolean continuar = false;
    //Vida, Ataque fisico, Ataque magico, Defensa, Evasion
    private final int[][] statsPJ = { {5,4,1,4,1}, {3,3,3,1,5}, {3,1,5,3,3}}; //Knight, Gunwoman, Wizard

    public Pantalla(){
        super();
        configurarVentana();
    }

    private void configurarVentana(){
        this.setTitle("Prueba");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creo el background
        background = new JLabel();
        background.setBounds(0,0,1280,720);
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
        pj.setIcon(PJ_idle[0]);
        pj.setBounds(435,225,192,192);

        //Creo la intefaz
        char_stats = new JLabel();
        char_stats.setIcon(char_stats_icon);
        char_stats.setBounds(417, 251, 450, 218);

        //Creo las Labels para las stats
        stat_HP = new JLabel(Integer.toString(statsPJ[0][0]));
        stat_HP.setBounds(690,240,50,100);
        stat_HP.setFont(new Font("Serif", Font.BOLD, 35));

        stat_ATK = new JLabel(Integer.toString(statsPJ[0][1]));
        stat_ATK.setBounds(735,275,50,100);
        stat_ATK.setFont(new Font("Serif", Font.BOLD, 35));

        stat_MAG = new JLabel(Integer.toString(statsPJ[0][2]));
        stat_MAG.setBounds(735,310,50,100);
        stat_MAG.setFont(new Font("Serif", Font.BOLD, 35));

        stat_DEF = new JLabel(Integer.toString(statsPJ[0][3]));
        stat_DEF.setBounds(710,345,50,100);
        stat_DEF.setFont(new Font("Serif", Font.BOLD, 35));

        stat_SPD = new JLabel(Integer.toString(statsPJ[0][4]));
        stat_SPD.setBounds(710,380,50,100);
        stat_SPD.setFont(new Font("Serif", Font.BOLD, 35));

        //Creo los nuevos botones
        btt_siguiente = new JButton("Siguiente");
        btt_siguiente.setBounds(900, 350, 150,50);

        btt_anterior = new JButton("Anterior");
        btt_anterior.setBounds(250, 350, 150,50);

        btt_select = new JButton("Seleccionar");
        btt_select.setBounds(450, 415, 100,25);
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
        btt_select.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                continuar = true; 
            }
        });
        //Añado por orden
        this.add(pj);
        this.add(btt_select);

        this.add(stat_HP);
        this.add(stat_ATK);
        this.add(stat_MAG);
        this.add(stat_DEF);
        this.add(stat_SPD);

        this.add(char_stats);
        this.add(btt_siguiente);
        this.add(btt_anterior);
        this.add(background);        
    }

    public void pantallaSeleccionAtributos(){
        //Damos 5 puntos para mejorar las stats
        int puntos = 5;
        //Pongo las stats del jugador igual a las del personaje que ha seleccionado
        int stats[] = new int[5];
        stats = statsPJ[Npersonaje];
        //Creo y coloco los botones de add y rmv
        btt_addHP = new JButton("+");
        btt_addHP.setBounds(815,255,45,45);
        btt_rmvHP = new JButton("-");
        btt_rmvHP.setBounds(770,255,45,45);

        btt_addATK = new JButton("+");
        btt_addATK.setBounds(815,295,45,45);
        btt_rmvATK = new JButton("-");
        btt_rmvATK.setBounds(770,295,45,45);

        btt_addMAG = new JButton("+");
        btt_addMAG.setBounds(815,335,45,45);
        btt_rmvMAG = new JButton("-");
        btt_rmvMAG.setBounds(770,335,45,45);

        btt_addDEF = new JButton("+");
        btt_addDEF.setBounds(815,375,45,45);
        btt_rmvDEF = new JButton("-");
        btt_rmvDEF.setBounds(770,375,45,45);

        btt_addSPD = new JButton("+");
        btt_addSPD.setBounds(815,415,45,45);
        btt_rmvSPD = new JButton("-");
        btt_rmvSPD.setBounds(770,415,45,45);
        //Añado los eventos de click
        btt_addHP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });


        btt_select.setEnabled(false);
        btt_select.setText("Tienes 5");
        

        //Añado en orden
        this.add(pj);
        this.add(btt_select);

        this.add(stat_HP);
        this.add(stat_ATK);
        this.add(stat_MAG);
        this.add(stat_DEF);
        this.add(stat_SPD);

        this.add(btt_addHP);
        this.add(btt_rmvHP);
        this.add(btt_addATK);
        this.add(btt_rmvATK);
        this.add(btt_addMAG);
        this.add(btt_rmvMAG);
        this.add(btt_addDEF);
        this.add(btt_rmvDEF);
        this.add(btt_addSPD);
        this.add(btt_rmvSPD);

        this.add(char_stats);
        this.add(background);
    }

    public boolean continuar(){
        if(continuar){
            continuar=false;
            return true;
        }
        return false;
    }

    public void cambiarIconPj(int index){
        pj.setIcon(PJ_idle[index]);
        stat_HP.setText(Integer.toString(statsPJ[index][0]));
        stat_ATK.setText(Integer.toString(statsPJ[index][1]));
        stat_MAG.setText(Integer.toString(statsPJ[index][2]));
        stat_DEF.setText(Integer.toString(statsPJ[index][3]));
        stat_SPD.setText(Integer.toString(statsPJ[index][4]));
    }
} 
    
