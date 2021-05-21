package enemigos;

public interface EnemyFactory {
    Enemigo crearSkeleton(int HP, int ATK, int MAG, int DEF, int SPD);
    Enemigo crearChief(int HP, int ATK, int MAG, int DEF, int SPD);
    Enemigo crearWolf(int HP, int ATK, int MAG, int DEF, int SPD);
    Enemigo crearRobot(int HP, int ATK, int MAG, int DEF, int SPD);
}
