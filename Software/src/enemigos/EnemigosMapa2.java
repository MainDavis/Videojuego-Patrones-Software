package enemigos;

public class EnemigosMapa2 implements EnemyFactory{

    public Skeleton crearSkeleton(int HP, int ATK) {
        return SkeletonMapa2(HP, ATK);
    }

    public Chief crearChief(int HP, int ATK) {
        return ChiefMapa2(HP, ATK);
    }

    public Wolf crearWolf(int HP, int ATK) {
        return WolfMapa2(HP, ATK);
    }

    public Robot crearRobot(int HP, int ATK) {
        return RobotMapa2(HP, ATK);
    }
    
}
