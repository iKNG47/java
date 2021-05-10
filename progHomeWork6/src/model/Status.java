package model;

public enum Status {
    NEW("NIEOPLACONE"),
    PAID("OPLACONE"),
    SHIPPED("WYSLANE"),
    DELIVERED("DOSTARCZĄNE"),
    CANCELED("ANULOWANE");
    public static Order status;
    private final String status1;



    Status(String status) {
        this.status1 = status;
    }
}
