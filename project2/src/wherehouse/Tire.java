package wherehouse;

public class Tire extends Part{
    private String size;
    private String width;

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Size is:"+size+"\nWidth is:"+width);
    }

    public Tire(String numberId, String manufacturerName, String serialNumber,String size, String width) {
        super(numberId, manufacturerName, serialNumber);
        this.size = size;
        this.width = width;
    }
}
