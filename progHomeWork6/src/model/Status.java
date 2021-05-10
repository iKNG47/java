package model;

public enum Status {
    NEW("NIEOPLACONE"),
    PAID("OPLACONE"),
    SHIPPED("WYSLANE"),
    DELIVERED("DOSTARCZĄNE"),
    CANCELED("ANULOWANE");
    private String status;

    public String getStatus() {
        return status;
    }

    Status(String status) {
        this.status = status;
    }
}
