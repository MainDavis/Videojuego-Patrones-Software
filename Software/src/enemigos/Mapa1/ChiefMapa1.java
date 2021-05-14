package enemigos.Mapa1;

import enemigos.Chief;

public class ChiefMapa1 implements Chief{
    int HP;
    int ATK;
    int DEF;
    int SPD;

    public ChiefMapa1(int HP, int ATK){
        this.HP = HP;
        this.ATK = ATK;
    }
    
    public boolean muerto() { return (HP>0) ? false : true; }
    public int getHP(){ return this.HP;}
    public int getATK() {   return 0;    }
    public int getDEF() {        return 0;    }
    public int getSPD() {        return 0;    }
}
