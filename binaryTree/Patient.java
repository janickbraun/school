public class Patient implements Dataelement {
    String name;
    Patient(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.name;
    }
}
