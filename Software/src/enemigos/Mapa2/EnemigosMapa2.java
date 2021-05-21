package enemigos.Mapa2;

import enemigos.Enemigo;
import enemigos.EnemyFactory;

public class EnemigosMapa2 implements EnemyFactory{
    public Enemigo crearSkeleton(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new SkeletonMapa2(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearChief(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new ChiefMapa2(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearWolf(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new WolfMapa2(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearRobot(int HP, int ATK,int MAG, int DEF, int SPD) {
        return new RobotMapa2(HP, ATK, MAG, DEF, SPD);
    }
}
