package enemigos.Mapa1;

import enemigos.EnemyFactory;
import enemigos.Enemigo;

public class EnemigosMapa1 implements EnemyFactory{
    public Enemigo crearSkeleton(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new SkeletonMapa1(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearChief(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new ChiefMapa1(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearWolf(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new WolfMapa1(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearRobot(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new RobotMapa1(HP, ATK, MAG, DEF, SPD);
    }
}
