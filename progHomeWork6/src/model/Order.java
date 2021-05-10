package model;

public class Order {
    private Status status;
    private String typeProduct, producer, model;
    private double price;





    public Order(String typeProduct, String producer, String model, double price) {
        this.typeProduct = typeProduct;
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products: " +
                "typ productu " + typeProduct + "\n"+
                "producent " + producer + '\n' +
                "model " + model + '\n' +
                "cena " + price;
    }

}
