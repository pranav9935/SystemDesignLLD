package SOLID.SingleResponsibiltyPrinciple.Negative;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = marker.price* this.quantity;
        return price;
    }
    public void printInvoice (){

    }

    public void saveToDB(){

    }

    // It is having multiple responsiblity and it has multiple reason to change




}
