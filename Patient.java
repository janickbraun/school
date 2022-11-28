public class Patient implements Dataelement
{
    String name;

    Patient(String name) {
        this.name = name;
    }

    public String getKey(){
        return this.name;
    }

    public boolean isSameKey(String value) {
        return value.equals(name);
    }

    public boolean isKeyHigher(String value) {
        return name.compareToIgnoreCase(value) > 0;
    }

    public void printInformation() {
        System.out.println("Name: "+ name);
    }
}
