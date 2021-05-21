public class CalcularDamage {
    
    private final int escaladoDamage = 150;
    private static CalcularDamage instancia = null;

    private CalcularDamage(){
    }

    public static CalcularDamage instance(){
        if(instancia == null) instancia = new CalcularDamage();
        return instancia;
    }

    public int calcDamage(int[] statsAtacante, int[] statsDefensor){
        return formula(statsAtacante[1], statsDefensor[3], statsDefensor[4]);
    }

    public int formula(int damage, int defense, int speed){
        int nRandom = (int) (Math.random()*12);

        System.out.println("nRandom: " + nRandom + ", Dmg: " + damage + ", Def: " + defense + ", Spd: " + speed);

        if( nRandom >= speed/2 ) {
            int finalDamage = (int) ( escaladoDamage*( Math.log(damage)/Math.log(15) )*( 1 - ( Math.log(defense)/Math.log(15) ) ) );
            System.out.println("Final: " + finalDamage);
            return finalDamage;
        }
        return 0;        
    }

}
