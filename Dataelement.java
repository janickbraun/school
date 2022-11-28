interface Dataelement
{
    public String getKey();
    public boolean isSameKey(String value);
    public boolean isKeyHigher(String value);
    public void printInformation();
}