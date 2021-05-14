package enemigos.Mapa4;

import enemigos.EnemyFactory;
import enemigos.Skeleton;
import enemigos.Chief;
import enemigos.Wolf;
import enemigos.Robot;

public class EnemigosMapa4 implements EnemyFactory{
    public Skeleton crearSkeleton(int HP, int ATK) {
        return new SkeletonMapa4(HP, ATK);
    }

    public Chief crearChief(int HP, int ATK) {
        return new ChiefMapa4(HP, ATK);
    }

    public Wolf crearWolf(int HP, int ATK) {
        return new WolfMapa4(HP, ATK);
    }

    public Robot crearRobot(int HP, int ATK) {
        return new RobotMapa4(HP, ATK);
    }
}
