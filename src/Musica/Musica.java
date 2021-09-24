
package Musica;

import java.applet.AudioClip;

/*
 * @author ChrisPaz
 */
public class Musica {
        AudioClip sonido;
        
    public void playMusica(){ 
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/cancion.wav")); 
        sonido.loop();
    }
    public void stopMusica(){ 
        
        sonido.stop();
    }
}
