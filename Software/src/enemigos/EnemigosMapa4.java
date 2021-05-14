package enemigos;

public class EnemigosMapa4 implements EnemyFactory{

    public Skeleton crearSkeleton(int HP, int ATK) {
        return SkeletonMapa4(HP, ATK);
    }

    public Chief crearChief(int HP, int ATK) {
        return ChiefMapa4(HP, ATK);
    }

    public Wolf crearWolf(int HP, int ATK) {
        return WolfMapa4(HP, ATK);
    }

    public Robot crearRobot(int HP, int ATK) {
        return RobotMapa4(HP, ATK);
    }
    
}
