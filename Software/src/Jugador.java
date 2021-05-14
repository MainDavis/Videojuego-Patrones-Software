import java.util.Arrays;

public class Jugador {
    //HP ATK MAG DEF SPD
    private int atributos[] = new int[5]; 
    private int estadisticas[] = new int[5];
    private final int escaladoPJ[][] = {
        {20,3,1,4,1},
        {10,2,2,2,4},
        {15,1,3,2,2}
    };
    public Jugador(int atributos[], int nPJ){
        this.atributos = Arrays.copyOf(atributos, 5);

        for(int i=0; i<0; i++)
        this.estadisticas[i] = atributos[i] * escaladoPJ[nPJ][i];

    }

    void recibirDamage(int damage){
        this.estadisticas[0] -= damage;
    }

    boolean muerto(){
        return (this.estadisticas[0] > 0) ? false : true;
    }

    int getHP() { return this.estadisticas[0]; }
    int getATK(){ return this.estadisticas[1]; }
    int getMAG(){ return this.estadisticas[2]; }
    int getDEF(){ return this.estadisticas[3]; }
    int getSPD(){ return this.estadisticas[4]; }
}
