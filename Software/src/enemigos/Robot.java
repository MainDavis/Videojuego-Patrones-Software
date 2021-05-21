package enemigos;

public interface Robot {
    boolean muerto();
    int[] getStats();
    void curarse(int cura);
    void recibirDamage(int damage);
}
