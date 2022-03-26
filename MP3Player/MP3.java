import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;

public class MP3 {
    public static Clip clip;
    public static AudioInputStream stream;
    public static String filename = "cro.wav";
    public static void start() {

        try {
            URL url = MP3.class.getResource("audio/" + filename);
            File file = new File(url.getPath());

            AudioFormat format;
            DataLine.Info info;

            stream = AudioSystem.getAudioInputStream(file);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        clip.start();
    }
    public static void pause() {
        if(clip.isOpen()) {
            clip.stop();
        }
    }
    public static void resume() {
        if(clip.isOpen()) {
            clip.start();
        }

    }
    public static void stop() {
        if(clip.isOpen()) {
            clip.close();
        }
    }
}