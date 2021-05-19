public class Jugador {
    private final int nPJ;
    private int HP, HPMax;
    
    public Jugador(int nPJ){
        this.nPJ = nPJ;
        this.HP = 100;
        this.HPMax = 100;
    }

    public void recibirDamage(int damage){ this.HP -= damage; }

    public void curarse(int HP){
        this.HP += HP;
        if(HP > HPMax) HP = HPMax;
    }

    public boolean muerto(){ return (HP > 0) ? false : true; }

    public void actualizarVida(int HPstat){
        
        switch(nPJ){
            case 0:
                HPMax = HPstat*25;
                break;
            case 1:
                HPMax = HPstat*15;
                break;
            case 2:
                HPMax = HPstat*10;
        }

        this.HP = HPMax;
    }

    public int getNPJ(){ return this.nPJ; }

    public int getHP() { return this.HP; }

}
