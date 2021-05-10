package model;

import java.util.ArrayList;

public class Methods {

    private ArrayList products= new ArrayList();
    private Enum Status;

    public ArrayList getProducts() {
        return products;
    }

    public void AddToProducts(Order product, enum Status){
        products.add(product);
        Enum tus=this.Status;

    }
    public void ShowProducts(){
        for (Object product:products) {
            System.out.println(product.toString()+"\n" +Status);

        }
    }

}
