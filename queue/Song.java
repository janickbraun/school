public class Song implements Dataelement
{
    String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getKey(){
        return this.title;
    }

    public boolean isSameKey(String value) {
        return value.equals(title);
    }

    public boolean isKeyHigher(String value) {
        return title.compareTo(value) > 0;
    }

    public void printInformation() {
        System.out.println("Artist: "+ artist + " - Title: "+ title);
    }
}