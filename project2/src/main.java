import wherehouse.ExhaustParts;
import wherehouse.Part;
import wherehouse.Tire;

public class main {
    public static void main(String[] args) {
        Part motor= new Part("1411v","Volvo","1488");
        Tire frostByte= new Tire("3244s","FrostByte","6455","28", "16");
        ExhaustParts peszel= new ExhaustParts("5248w","ORION", "638-094P",true);
        motor.getInfo();
        frostByte.getInfo();
        peszel.getInfo();
    }
}
