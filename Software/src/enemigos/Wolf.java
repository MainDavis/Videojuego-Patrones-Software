package enemigos;

public interface Wolf {
    boolean muerto();
    int[] getStats();
    void curarse(int cura);
    void recibirDamage(int damage);
}
