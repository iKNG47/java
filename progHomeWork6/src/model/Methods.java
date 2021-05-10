package model;

import java.util.ArrayList;

public class Methods {

    private ArrayList products= new ArrayList();



    public void AddToProducts(Order product, Status status){
        products.add(product);
        product = Status.status;


    }
    public void ShowProducts(){
        for (Object product:products) {
            System.out.println(product+"\n"+Status.status +"\n");

        }
    }

}
