public class Word implements Dataelement {
    String de;
    String en;
    Word(String de, String en) {
        this.de = de;
        this.en = en;
    }

    public String getValue() {
        return this.de;
    }
    public String getEn() {
        return this.en;
    }
}
