package model;

public class Order {
    private String typeProduct, producer, model;
    private double price;

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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
