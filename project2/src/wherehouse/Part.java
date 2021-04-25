package wherehouse;

public class Part {
    private String numberId;
    private String manufacturerName;
    private String serialNumber;

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Part(String numberId, String manufacturerName, String serialNumber) {
        super();
        this.numberId = numberId;
        this.manufacturerName = manufacturerName;
        this.serialNumber = serialNumber;
    }
    public void getInfo(){
        System.out.println("number ID is:"+numberId
                +"\nName manufacturer is:"+manufacturerName
                +"\nSerial number is:"+serialNumber);
    }
}
