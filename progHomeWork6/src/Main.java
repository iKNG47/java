import model.*;


public class Main {
    public static void main(String[] args) {
        Order product1 = new Order("Notebook", "Acer", "Nitro 5", 5199.00);
        Order product2 = new Order("Notebook", "Acer", "Nitro 6", 5299.00);
        Order product3 = new Order("Notebook", "Acer", "Nitro 7", 5399.00);
        Order product4 = new Order("Notebook", "Acer", "Nitro 8", 5499.00);
        Order product5 = new Order("Notebook", "Acer", "Nitro 9", 5599.00);
        Methods add = new Methods();
        add.AddToProducts(product1, Status.NEW);
        add.AddToProducts(product2,Status.DELIVERED);
        add.AddToProducts(product3, Status.PAID);
        add.AddToProducts(product4, Status.SHIPPED);
        add.AddToProducts(product5, Status.CANCELED);
        add.ShowProducts();


    }
}
