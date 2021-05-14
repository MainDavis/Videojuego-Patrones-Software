package enemigos;

public interface EnemyFactory {
    Skeleton crearSkeleton(int HP, int ATK, int DEF, int SPD);
    Chief crearChief(int HP, int ATK, int DEF, int SPD);
    Wolf crearWolf(int HP, int ATK, int DEF, int SPD);
    Robot crearRobot(int HP, int ATK, int DEF, int SPD);
}
