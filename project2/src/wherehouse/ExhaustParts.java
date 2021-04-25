package wherehouse;

public class ExhaustParts extends Part {
    private Boolean euStandard;

    public Boolean getEuStandard() {
        return euStandard;
    }

    public void setEuStandard(Boolean euStandard) {
        this.euStandard = euStandard;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Standard EU is:"+euStandard);
    }

    public ExhaustParts(String numberId, String manufacturerName, String serialNumber, Boolean euStandard) {
        super(numberId, manufacturerName, serialNumber);
        this.euStandard = euStandard;
    }
}
