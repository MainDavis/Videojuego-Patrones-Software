package enemigos.Mapa1;

import enemigos.Robot;

public class RobotMapa1 implements Robot{
    int HPmax;
    int HP;
    int ATK;
    int MAG;
    int DEF;
    int SPD;

    public RobotMapa1(int HP, int ATK,int MAG, int DEF, int SPD){
        this.HP = HP;
        this.HPmax = HP;
        this.ATK = ATK;
        this.MAG = MAG;
        this.DEF = DEF;
        this.SPD = SPD;
    }
    
    public boolean muerto() { return (HP > 0) ? false : true; }
   
    public int[] getStats(){
        int[] stats = {HP, ATK, MAG, DEF, SPD};
        return stats;
    }

    public void curarse(int cura){
        this.HP += cura;
        if(this.HP > this.HPmax) this.HP = this.HPmax;
    }

    public void recibirDamage(int damage){
        this.HP -= damage;
    }

}
