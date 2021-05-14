package enemigos.Mapa2;

import enemigos.Wolf;

public class WolfMapa2 implements Wolf{
    int HP;
    int ATK;
    int DEF;
    int SPD;

    public WolfMapa2(int HP, int ATK, int DEF, int SPD){
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SPD = SPD;
    }
    
    public boolean muerto() { return (HP > 0) ? false : true; }
    public int getHP() { return this.HP; }
    public int getATK() { return this.ATK; }
    public int getDEF() { return this.DEF; }
    public int getSPD() { return this.SPD; }
}
