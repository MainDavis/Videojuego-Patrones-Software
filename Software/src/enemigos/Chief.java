package enemigos;

public interface Chief {
    boolean muerto();
    int[] getStats();
    void curarse(int cura);
    void recibirDamage(int damage);
}
