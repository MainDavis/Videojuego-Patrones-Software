package enemigos.Mapa3;

import enemigos.EnemyFactory;
import enemigos.Skeleton;
import enemigos.Chief;
import enemigos.Wolf;
import enemigos.Robot;

public class EnemigosMapa1 implements EnemyFactory{
    public Skeleton crearSkeleton(int HP, int ATK) {
        return new SkeletonMapa3(HP, ATK);
    }

    public Chief crearChief(int HP, int ATK) {
        return new ChiefMapa3(HP, ATK);
    }

    public Wolf crearWolf(int HP, int ATK) {
        return new WolfMapa3(HP, ATK);
    }

    public Robot crearRobot(int HP, int ATK) {
        return new RobotMapa3(HP, ATK);
    }
}
