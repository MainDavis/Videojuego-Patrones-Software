package enemigos;

public interface EnemyFactory {
    Skeleton crearSkeleton(int HP, int ATK);
    Chief crearChief(int HP, int ATK);
    Wolf crearWolf(int HP, int ATK);
    Robot crearRobot(int HP, int ATK);
}
