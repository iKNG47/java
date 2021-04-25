package homework;

public class Apple extends Fruit{
    private static final String type ="Jabko" ;
     private String strain;



    public Apple(double weight,String strain) {
        super(weight, type);
        this.strain=strain;

    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print(" odmiana: "+strain);
    }
}
