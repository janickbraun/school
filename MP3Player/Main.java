public class Main {
    public static String status = "off";
    Main() {
        Frame.create();
    }
    public static void main(String[] args) {
        Frame.create();
    }

    public static void pressedShort() {
        if(status.equals("play")) {
            MP3.pause();
            status = "pause";
            Frame.setButtonText("Paused");
        } else if(status.equals("pause")) {
            MP3.resume();
            status = "play";
            Frame.setButtonText("Playing");
        }
    }

    public static void pressedLong() {
        if(status.equals("off")) {
            MP3.start();
            status = "play";
            Frame.setButtonText("Playing");
        } else if(status.equals("play")) {
            MP3.stop();
            status = "off";
            Frame.setButtonText("Off");
        } else if(status.equals("pause")) {
            MP3.stop();
            status = "off";
            Frame.setButtonText("Off");
        }
    }

}
