package enemigos.Mapa4;

import enemigos.EnemyFactory;
import enemigos.Skeleton;
import enemigos.Chief;
import enemigos.Wolf;
import enemigos.Robot;

public class EnemigosMapa4 implements EnemyFactory{
    public Skeleton crearSkeleton(int HP, int ATK, int DEF, int SPD) {
        return new SkeletonMapa4(HP, ATK, DEF, SPD);
    }

    public Chief crearChief(int HP, int ATK, int DEF, int SPD) {
        return new ChiefMapa4(HP, ATK, DEF, SPD);
    }

    public Wolf crearWolf(int HP, int ATK, int DEF, int SPD) {
        return new WolfMapa4(HP, ATK, DEF, SPD);
    }

    public Robot crearRobot(int HP, int ATK, int DEF, int SPD) {
        return new RobotMapa4(HP, ATK, DEF, SPD);
    }
}
