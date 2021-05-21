package template;

public abstract class TemplateMethod {
    public final void turnoEnemigo(){
        damageState();
        ejecutaAccion();
        ejecutaAnimacion();
    }

    public abstract void ejecutaAccion();
    public abstract void ejecutaAnimacion();

    private final void damageState() {

    }
}
