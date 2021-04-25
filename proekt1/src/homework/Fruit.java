package homework;

public class Fruit {
    private double weight;
    private String type;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    Fruit(double weight, String type){
        this.weight=weight;
        this.type=type;
    }
    public void getInfo(){
        System.out.println("Waga: "+weight+" typ: "+type);
    }
}
