package enemigos.Mapa1;

import enemigos.EnemyFactory;
import enemigos.Skeleton;
import enemigos.Chief;
import enemigos.Wolf;
import enemigos.Robot;

public class EnemigosMapa1 implements EnemyFactory{
    public Skeleton crearSkeleton(int HP, int ATK, int DEF, int SPD) {
        return new SkeletonMapa1(HP, ATK, DEF, SPD);
    }

    public Chief crearChief(int HP, int ATK, int DEF, int SPD) {
        return new ChiefMapa1(HP, ATK, DEF, SPD);
    }

    public Wolf crearWolf(int HP, int ATK, int DEF, int SPD) {
        return new WolfMapa1(HP, ATK, DEF, SPD);
    }

    public Robot crearRobot(int HP, int ATK, int DEF, int SPD) {
        return new RobotMapa1(HP, ATK, DEF, SPD);
    }
}
