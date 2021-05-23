package Jugador;

public class Jugador {
    private final int nPJ;
    private int HP, HPMax;
    
    public Jugador(int nPJ){
        this.nPJ = nPJ;
        this.HP = 100;
        this.HPMax = 100;
    }

    public void recibirDamage(int damage){ 
        this.HP -= damage; 
        if(this.HP < 0) this.HP = 0;
    }

    public void curarse(int cura){
        this.HP += cura;
        if(this.HP > HPMax) this.HP = HPMax;
    }

    public boolean muerto(){ return (HP > 0) ? false : true; }

    public void actualizarVida(int HPstat){
        
        switch(nPJ){
            case 0:
                HPMax = HPstat*75;
                break;
            case 1:
                HPMax = HPstat*50;
                break;
            case 2:
                HPMax = HPstat*30;
        }

        this.HP = HPMax;
    }

    public int getNPJ(){ return this.nPJ; }

    public int getHP() { return this.HP; }

}
