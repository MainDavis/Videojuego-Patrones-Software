package enemigos;

public class EnemigosMapa3 implements EnemyFactory{

    public Skeleton crearSkeleton(int HP, int ATK) {
        return SkeletonMapa3(HP, ATK);
    }

    public Chief crearChief(int HP, int ATK) {
        return ChiefMapa3(HP, ATK);
    }

    public Wolf crearWolf(int HP, int ATK) {
        return WolfMapa3(HP, ATK);
    }

    public Robot crearRobot(int HP, int ATK) {
        return RobotMapa3(HP, ATK);
    }
    
}
