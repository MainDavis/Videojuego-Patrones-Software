package Template;
import enemigos.Estrategia.Contexto;
import enemigos.Estrategia.EstrategiaFullAtk;


public class Atacar extends TemplateMethod {

    Contexto c = null;

    public void ejecutaAccion() {

        
    c = new Contexto(new EstrategiaFullAtk());
    }

   
    public void ejecutaAnimacion() {

        
    }
    
}
