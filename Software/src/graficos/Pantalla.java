package graficos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class Pantalla extends JFrame{

    //Backgrounds
    private ImageIcon backgrounds[] = {
        new ImageIcon("resources//backgrounds//catedral.gif"),
        new ImageIcon("resources//backgrounds//city.gif"),
        new ImageIcon("resources//backgrounds//apocalipsis.gif"),
        new ImageIcon("resources//backgrounds//samurai.gif"),
        new ImageIcon("resources//backgrounds//muerte.gif"),
        new ImageIcon("resources//backgrounds//catedral.gif")
    };
    //Sprites
    private ImageIcon PJ_idle[] = { //Knight, Gunwoman, Wizard
        new ImageIcon("resources//sprites//knight//idle.gif"),
        new ImageIcon("resources//sprites//gunwoman//idle.gif"),
        new ImageIcon("resources//sprites//wizard//idle.gif")
    };
    private ImageIcon PJ_attack[] = {
        new ImageIcon("resources//sprites//knight//attack.gif"),
        new ImageIcon("resources//sprites//gunwoman//attack.gif"),
        new ImageIcon("resources//sprites//wizard//attack.gif")
    };
    private ImageIcon ImpactPJ[] = {
        new ImageIcon("resources//sprites//knight//impact.gif"),
        new ImageIcon("resources//sprites//gunwoman//impact.gif"),
        new ImageIcon("resources//sprites//wizard//impact.gif")
    };
    private ImageIcon Enemigo_idle[] = { //Skeleton, Chief, Wolf, Robot
        new ImageIcon("resources//sprites//skeleton//idle.gif"),
        new ImageIcon("resources//sprites//chief//idle.gif"),
        new ImageIcon("resources//sprites//wolf//idle.gif"),
        new ImageIcon("resources//sprites//robot//idle.gif")
    };
    private ImageIcon Enemigo_attack[] = { //Skeleton, Chief, Wolf, Robot
        new ImageIcon("resources//sprites//skeleton//attack.gif"),
        new ImageIcon("resources//sprites//chief//attack.gif"),
        new ImageIcon("resources//sprites//wolf//attack.gif"),
        new ImageIcon("resources//sprites//robot//attack.gif")
    };
    private ImageIcon ImpactEnemigo[] = {
        new ImageIcon("resources//sprites//skeleton//impact.gif"),
        new ImageIcon("resources//sprites//chief//impact.gif"),
        new ImageIcon("resources//sprites//wolf//impact.gif"),
        new ImageIcon("resources//sprites//robot//impact.gif") 
    };
    private ImageIcon estadosAlterados[] = { //Cura, 
        new ImageIcon("resources//sprites//estadosAlterados//cura.gif"),
        new ImageIcon("resources//sprites//estadosAlterados//quemado.gif"),
        new ImageIcon("resources//sprites//estadosAlterados//sangrado.gif"),
        new ImageIcon("resources//sprites//estadosAlterados//electrocutado.gif")
    };
    //GUI
    private ImageIcon btt_inicio = new ImageIcon("resources//sprites//gui//btt_inicio.png");
    private ImageIcon char_stats_icon = new ImageIcon("resources//sprites//gui//char_stats.png");
    private ImageIcon btt_mas_icon = new ImageIcon("resources//sprites//gui//boton_mas_45.png");
    private ImageIcon btt_menos_icon = new ImageIcon("resources//sprites//gui//boton_menos_45.png");
    private ImageIcon btt_anterior_icon = new ImageIcon("resources//sprites//gui//btt_anterior.png");
    private ImageIcon btt_siguiente_icon = new ImageIcon("resources//sprites//gui//btt_siguiente.png");
    private ImageIcon btt_atacar_icon = new ImageIcon("resources//sprites//gui//btt_atacar.png");
    private ImageIcon btt_curar_icon = new ImageIcon("resources//sprites//gui//btt_curar.png");

    private JLabel pj; // <- Jugador
    private JLabel enemigo; // <- Enemigo
    private JLabel damage_pj, damage_enemigo;
    private JLabel background;
    private JLabel char_stats; // <- UI Atributos
    private JLabel HP_Jugador, HP_Enemigo;
    private JLabel victoria_derrota;
    //Atributos
    private JLabel lb_stats[] = new JLabel[5];
    //Botones
    private JButton btt_start;
    private JButton btt_siguiente, btt_anterior, btt_select;
    private JButton btt_atributos[][] = new JButton[5][2]; //[Estadistica][add/rmv]
    private JButton btt_atacar, btt_curarse;
    //Variables
    private int Npersonaje = 0;
    private int Nenemigo = 0;
    private boolean continuar = false, atacar=false, curarse=false;
    private int puntosAtributos = 5;
    private int stats[] = new int[5];
    //Vida, Ataque fisico, Ataque magico, Defensa, Evasion
    private final int[][] statsPJ = { {5,4,1,4,1}, {3,3,3,1,5}, {3,1,5,3,3}}; //Knight, Gunwoman, Wizard

    public Pantalla(){
        super();
        configurarVentana();
    }

    private void configurarVentana(){
        this.setTitle("RPG");
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
        btt_start.setBounds(500, 299, 256, 126);
        btt_start.setIcon(btt_inicio);
        btt_start.setBorderPainted(false); 
        btt_start.setContentAreaFilled(false); 

        btt_start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              continuar=true;   
            }
        });
        
        background.setIcon(backgrounds[0]);

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
        int y=240;
        for(int i=0; i<5; i++){
            lb_stats[i] = new JLabel(Integer.toString(statsPJ[0][i]));
            lb_stats[i].setBounds(735,y,50,100);
            lb_stats[i].setFont(new Font("Serif", Font.BOLD, 35));
            y+=35;
        }
        //Creo los nuevos botones
        btt_siguiente = new JButton();
        btt_siguiente.setIcon(btt_siguiente_icon);
        btt_siguiente.setBorder(null);
        btt_siguiente.setBounds(868, 340, 45, 45);

        btt_anterior = new JButton();
        btt_anterior.setIcon(btt_anterior_icon);
        btt_anterior.setBorder(null);
        btt_anterior.setBounds(370, 340, 45, 45);

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

        for(int i=0; i<5;i++)
            this.add(lb_stats[i]);

        this.add(pj);
        this.add(char_stats);
        this.add(btt_siguiente);
        this.add(btt_anterior);
        this.add(background);        
    }

    public void pantallaSeleccionAtributos(){
        //Elimino los botones anterior y siguiente
        this.remove(btt_siguiente);
        this.remove(btt_anterior);

        stats = Arrays.copyOf(statsPJ[Npersonaje], 5);
        //Creo y coloco los botones de add y rmv
        int y=255;
        for(int i=0; i<5; i++){
            //Añadir
            btt_atributos[i][0] = new JButton();
            btt_atributos[i][0].setIcon(btt_mas_icon);
            btt_atributos[i][0].setBorder(null);
            btt_atributos[i][0].setBounds(815, y, 40, 40);
            //Quitar
            btt_atributos[i][1] = new JButton();
            btt_atributos[i][1].setIcon(btt_menos_icon);
            btt_atributos[i][1].setBorder(null);
            btt_atributos[i][1].setBounds(770, y, 40, 40);
            y+=42;
        }
        //Añado los eventos de los botones
        //No puedo con un for -_-
        //HP
        btt_atributos[0][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==0) return;
                puntosAtributos--;
                stats[0]++;
                lb_stats[0].setText(Integer.toString(stats[0]));
                actualizarBtt_select();
            }
        });
        btt_atributos[0][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==5 ||stats[0] == statsPJ[Npersonaje][0]) return;
                puntosAtributos++;
                stats[0]--;
                lb_stats[0].setText(Integer.toString(stats[0]));
                actualizarBtt_select();
            }
        });
        //ATK
        btt_atributos[1][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==0) return;
                puntosAtributos--;
                stats[1]++;
                lb_stats[1].setText(Integer.toString(stats[1]));
                actualizarBtt_select();
            }
        });
        btt_atributos[1][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==5 ||stats[1] == statsPJ[Npersonaje][1]) return;
                puntosAtributos++;
                stats[1]--;
                lb_stats[1].setText(Integer.toString(stats[1]));
                actualizarBtt_select();
            }
        });
        //MAG
        btt_atributos[2][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==0) return;
                puntosAtributos--;
                stats[2]++;
                lb_stats[2].setText(Integer.toString(stats[2]));
                actualizarBtt_select();
            }
        });
        btt_atributos[2][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==5 ||stats[2] == statsPJ[Npersonaje][2]) return;
                puntosAtributos++;
                stats[2]--;
                lb_stats[2].setText(Integer.toString(stats[2]));
                actualizarBtt_select();
            }
        });
        //DEF
        btt_atributos[3][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==0) return;
                puntosAtributos--;
                stats[3]++;
                lb_stats[3].setText(Integer.toString(stats[3]));
                actualizarBtt_select();
            }
        });
        btt_atributos[3][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==5 ||stats[3] == statsPJ[Npersonaje][3]) return;
                puntosAtributos++;
                stats[3]--;
                lb_stats[3].setText(Integer.toString(stats[3]));
                actualizarBtt_select();
            }
        });
        //SPD
        btt_atributos[4][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==0) return;
                puntosAtributos--;
                stats[4]++;
                lb_stats[4].setText(Integer.toString(stats[4]));
                actualizarBtt_select();
            }
        });
        btt_atributos[4][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(puntosAtributos==5 ||stats[4] == statsPJ[Npersonaje][4]) return;
                puntosAtributos++;
                stats[4]--;
                lb_stats[4].setText(Integer.toString(stats[4]));
                actualizarBtt_select();
            }
        });
       
        //Modifico el botón de seleccionar
        btt_select.setBorder(null);
        btt_select.setEnabled(false);
        btt_select.setText("Tienes 5");

        //Añado en orden
        this.add(pj);
        this.add(btt_select);

        for(int i=0; i<5;i++){
            this.add(lb_stats[i]);
        }

        for(int i=0; i<5; i++){
            this.add(btt_atributos[i][0]);
            this.add(btt_atributos[i][1]);
        }

        this.add(pj);
        this.add(char_stats);
        this.add(background);
    }

    public void iniciaCombate(){
        //Elimino todo menos el PJ y el fondo
        for(int i=0; i<5; i++){
            remove(btt_atributos[i][0]);
            remove(btt_atributos[i][1]);
            remove(lb_stats[i]);
        }
        remove(btt_select);
        remove(char_stats);

        //Recoloco el PJ
        pj.setBounds(200,225,192,192);

        //Creo al enemigo
        enemigo = new JLabel();
        enemigo.setBounds(900,225,192,192);

        //Creo y coloco las labes de los daños
        damage_pj = new JLabel();
        damage_pj.setBounds(200, 225, 192, 192);

        damage_enemigo = new JLabel();
        damage_enemigo.setBounds(900,225,192,192);
        //Creo y pongo los botones
        btt_atacar = new JButton();
        btt_atacar.setBounds(350, 500, 256, 126);
        btt_atacar.setBorder(null);
        btt_atacar.setIcon(btt_atacar_icon);
        btt_atacar.setContentAreaFilled(false);
        

        btt_curarse = new JButton();
        btt_curarse.setBounds(650, 500, 256, 126);
        btt_curarse.setIcon(btt_curar_icon);
        btt_curarse.setBorder(null);
        btt_curarse.setContentAreaFilled(false);

        //Creo las labels de la vida
        HP_Jugador = new JLabel("HP: ");
        HP_Jugador.setBounds(200, 200, 200, 50);
        HP_Jugador.setFont(new Font("Serif", Font.BOLD, 35));
        HP_Jugador.setForeground(Color.red);

        HP_Enemigo = new JLabel("HP: ");
        HP_Enemigo.setFont(new Font("Serif", Font.BOLD, 35));
        HP_Enemigo.setForeground(Color.red);
        HP_Enemigo.setBounds(920, 200, 200, 50);

        //Eventos de los botones
        btt_atacar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atacar = true;
            }
        });
        btt_curarse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                curarse = true;
            }
        });

        //this.add(pj);
        this.add(damage_pj);
        this.add(damage_enemigo);
        this.add(btt_atacar);
        this.add(btt_curarse);
        this.add(HP_Jugador);
        this.add(HP_Enemigo);
        this.add(pj);
        this.add(enemigo);
        this.add(background);
    }


    public void pantallaFinal(boolean victoria){
        remove(damage_pj);
        remove(damage_enemigo);
        remove(btt_atacar);
        remove(btt_curarse);
        remove(HP_Jugador);
        remove(HP_Enemigo);
        remove(pj);
        remove(enemigo);

        background.setIcon(backgrounds[0]);

        victoria_derrota = new JLabel();
        victoria_derrota.setBounds(400, 200, 500, 200);
        victoria_derrota.setFont(new Font("Serif", Font.BOLD, 72));
        victoria_derrota.setForeground(Color.white); 

        if(victoria){
            victoria_derrota.setText("VICTORIA"); 
                      
        }else{
            victoria_derrota.setText("DERROTA");  
        }

        this.add(victoria_derrota);
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
        for(int i=0; i<5; i++){
            lb_stats[i].setText(Integer.toString(statsPJ[index][i]));
        }
    }

    public void actualizarBtt_select(){
        if(puntosAtributos==0){
            btt_select.setText("Comenzar");
            btt_select.setEnabled(true);
        }else{
            btt_select.setText("Tienes " + puntosAtributos);
            btt_select.setEnabled(false);
        }
    }

    public void cambiarEnemigo(int n){
        Nenemigo = n;
        enemigo.setIcon(Enemigo_idle[n]);
    }

    public void cambiarMapa(int n){
        background.setIcon(backgrounds[n+1]);
    }

    public boolean getAtacar(){
        if(atacar){
            atacar = false;
            return true;
        }
        return false;
    }

    public boolean getCurarse(){
        if(curarse){
            curarse = false;
            return true;
        }
        return false;
    }

    public int[] getStats(){
        return stats;
    }

    public int getNpersonaje(){
        return Npersonaje;
    }

    public void actualizarHP(int jugador, int enemigo){
        HP_Jugador.setText("HP: " + jugador);
        HP_Enemigo.setText("HP: " + enemigo);
    }

    public void animAttackPJ(boolean animacion){
        if(animacion){
            pj.setBounds(104, 225, 384, 192);
            pj.setIcon(PJ_attack[Npersonaje]);
        }else{
            pj.setBounds(200,225,192,192);
            pj.setIcon(PJ_idle[Npersonaje]);
        }
    }

    public void animAttackEnemigo(boolean animacion, int nEnemigo){
        if(animacion){
            switch(nEnemigo){
                case 0:
                    enemigo.setBounds(708,130,384,288);
                    break;
                case 1:
                    enemigo.setBounds(800,130,384,288);
                    break;
                case 2:
                    enemigo.setBounds(808,180,384,288);
                    break;
                case 3:
                    enemigo.setBounds(804,176,384,288);
                    break;
            }
            enemigo.setIcon(Enemigo_attack[Nenemigo]);
        }else{
            enemigo.setBounds(900,225,192,192);
            enemigo.setIcon(Enemigo_idle[Nenemigo]);
        }
    }

    public void impactoPJ(){

        damage_pj.setIcon(null);
        ImpactEnemigo[Nenemigo].getImage().flush();
        damage_pj.setIcon(ImpactEnemigo[Nenemigo]);
        
    }

    public void impactoEnemigo(){

        damage_pj.setIcon(null);
        ImpactPJ[Npersonaje].getImage().flush();
        damage_enemigo.setIcon(ImpactPJ[Npersonaje]);

    }

    public void curarPJ(boolean animacion){

        if(animacion){
            estadosAlterados[0].getImage().flush();
            damage_pj.setIcon(estadosAlterados[0]);
        }else{
            damage_pj.setIcon(null);
        }
        
    }

    public void curarEnemigo(boolean animacion){

        if(animacion){
            estadosAlterados[0].getImage().flush();
            damage_enemigo.setIcon(estadosAlterados[0]);
        }else{
            damage_enemigo.setIcon(null);
        }
     
    }

    public void efectoDeEstado(String estado){
        damage_enemigo.setIcon(null);
        switch(estado){
            case "Quemado":
                estadosAlterados[1].getImage().flush();
                damage_enemigo.setIcon(estadosAlterados[1]);
                break;
            case "Sangrado":
                estadosAlterados[2].getImage().flush();
                damage_enemigo.setIcon(estadosAlterados[2]);
                break;
            case "Electrocutado":
                estadosAlterados[3].getImage().flush();
                damage_enemigo.setIcon(estadosAlterados[3]);
                break;
        }
    }

} 
    
