package enemigos.Mapa3;

import enemigos.Enemigo;
import enemigos.EnemyFactory;

public class EnemigosMapa3 implements EnemyFactory{
    public Enemigo crearSkeleton(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new SkeletonMapa3(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearChief(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new ChiefMapa3(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearWolf(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new WolfMapa3(HP, ATK, MAG, DEF, SPD);
    }

    public Enemigo crearRobot(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new RobotMapa3(HP, ATK, MAG, DEF, SPD);
    }
}
