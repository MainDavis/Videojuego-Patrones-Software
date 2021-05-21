package enemigos;

public interface Skeleton {
    boolean muerto();
    int[] getStats();
    void curarse(int cura);
    void recibirDamage(int damage);
}
