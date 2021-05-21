package enemigos.Mapa3;

import enemigos.EnemyFactory;
import enemigos.Skeleton;
import enemigos.Chief;
import enemigos.Wolf;
import enemigos.Robot;

public class EnemigosMapa3 implements EnemyFactory{
    public Skeleton crearSkeleton(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new SkeletonMapa3(HP, ATK, MAG, DEF, SPD);
    }

    public Chief crearChief(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new ChiefMapa3(HP, ATK, MAG, DEF, SPD);
    }

    public Wolf crearWolf(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new WolfMapa3(HP, ATK, MAG, DEF, SPD);
    }

    public Robot crearRobot(int HP, int ATK, int MAG, int DEF, int SPD) {
        return new RobotMapa3(HP, ATK, MAG, DEF, SPD);
    }
}
