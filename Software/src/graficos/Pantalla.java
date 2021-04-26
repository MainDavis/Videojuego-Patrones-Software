package graficos;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Pantalla extends JFrame{

    private ImageIcon gunwoman_idle = new ImageIcon("resources//sprites//gunwoman//idle.gif");
    private ImageIcon gunwoman_attack = new ImageIcon("resources//sprites//gunwoman//attack.gif");
    private JButton pj;

    public Pantalla(){
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana(){
        this.setTitle("Prueba");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes(){
        pj = new JButton();
        pj.setIcon(gunwoman_idle);
        pj.setBounds(50,50,400,400);
        pj.setPressedIcon(gunwoman_attack);
        this.add(pj);
    }
}