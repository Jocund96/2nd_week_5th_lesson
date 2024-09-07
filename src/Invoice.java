public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double itemPrice;

    Invoice(String partNumber, String partDescription, int quantity, double itemPrice){
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setItemPrice(itemPrice);
        getInvoiceAmount(getQuantity(), getItemPrice());


    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;

    }
    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }
    public String getPartNumber(String partNumber){
        return partNumber;
    }
    public String getPartDescription(String partDescription){
        return partDescription;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getItemPrice(){
        return this.itemPrice;
    }
    /*double getInvoiceAmount(){
        if (getQuantity()>=0) {
            return (double) getQuantity() * getItemPrice();
        }else{
            return 0;
        }
    }*/
    double getInvoiceAmount(int quantity, double itemPrice){
        if (quantity>=0) {
            System.out.println("hello");
            return (double) quantity * itemPrice;

        }else{
            return 0;
        }
    }
    }
