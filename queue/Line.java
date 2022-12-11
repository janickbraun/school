public class Line
{
    List line;
    Line() {
        line = new List();
    }
    
    void insert(Dataelement data) {
        line.insertBack(data);
    }
    
    void remove() {
        line.removeFront();
    }
    
    void printInformation() {
        line.printInformation();
    }
}
