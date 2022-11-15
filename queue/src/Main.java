public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.insertFront(new Patient("Janick"));
        list.insertFront(new Patient("Kalle"));
        list.insertFront(new Patient("Julius"));
        list.insertFront(new Patient("Papa"));
        list.insertFront(new Patient("Mama"));
        /*list.insertFront(new Song("We made it.", "T-low"));
        list.printInformation();
        System.out.println(list.getLength());
        list.insertBack(new Patient("Papa"));
        list.insertBack(new Patient("Mama"));
        list.removeValue("Kalle");
        list.removeValue("Jan");
        System.out.println(list.getLength());
        list.insertSorted(new Patient("ZZZZZ"));
        list.insertFront(new Patient("AAAAnfaang"));
        list.removeBack();
        list.removeBack();
        list.insertSorted(new Patient("ZZZZZ"));*/
        System.out.println(list.getLength());

        System.out.println(list.get(1));

        list.printInformation();
    }
}