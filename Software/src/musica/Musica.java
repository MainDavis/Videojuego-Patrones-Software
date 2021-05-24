package musica;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

public class Musica {
    
    Clip clip;

    public Musica(){
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void ReproducirSonido(String nombreSonido){
        try {
            AudioInputStream musica= AudioSystem.getAudioInputStream(new File("resources//musica//" + nombreSonido + ".WAV").getAbsoluteFile());

            clip.stop();
            clip.close();

            clip.open(musica);
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch(Exception ex) {
            System.out.println("Error al reproducir el sonido. Error: " + ex);
        }
    }
}
