package enemigos.Mapa4;

import enemigos.Enemigo;
import enemigos.EnemyFactory;

public class EnemigosMapa4 implements EnemyFactory{
    public Enemigo crearSkeleton(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new SkeletonMapa4(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearChief(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new ChiefMapa4(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearWolf(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new WolfMapa4(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearRobot(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new RobotMapa4(HP, ATK, MAG, DEF, SPD);
    }
}
