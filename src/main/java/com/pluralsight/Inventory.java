package com.pluralsight;

public class Inventory {
    private int id;
    private String sku;
    private String productName;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Inventory(int id, String sku, String productName) {
        this.id = id;
        this.sku = sku;
        this.productName = productName;

        this.setCheckedOut(false);
        this.setCheckedOutTo("");
    }
    public void checkOut(String name) {
        this.setCheckedOut(true);
        this.setCheckedOutTo(name);
    }

    public void checkIn(String name) {
        this.setCheckedOut(false);
        this.setCheckedOutTo(" ");

    }

    public int getId(){
        return id;
    }
    public String getSku(){
        return sku;
    }

    public String getProductName(){
        return productName;
    }
    public boolean isCheckedOut(){
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut){
        isCheckedOut = checkedOut;
    }
    public String getCheckedOutTo(){
        return checkedOutTo;
    }
    public void setCheckedOutTo(String checkedOutTo){
        this.checkedOutTo = checkedOutTo;
    }
}
