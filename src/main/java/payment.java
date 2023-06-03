
/**
 *
 * @author rawan
 */

public class payment {
    private String paymentOption;
    private String StoreName;
    private int orderID;
    private String customerFirstName;
    private String customerLastName;;
    private String date;
    private double totalPrice ;
    private double discount ;
    private Order  orderinfo ;
    
    public payment() {
    }

    public payment( String StoreName, String customerFirstName, String customerLastName, Order orderinfo) {

        this.StoreName = StoreName;
        this.orderinfo = orderinfo;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    public int getBillID() {
        int billID = (int)((100)* Math.random()+1);
        return billID;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public String printBill(){
        String result = "\n------------------------------------------------------------" +
                       "\n                              CAKE STORE" +
                       "\n------------------------------------------------------------" +
                       "\n                        Store:"+this.StoreName +
                       "\n\nInvoice No:"+ getBillID() + "\n" +
                         orderinfo.getProduct().toString()+"\t"+orderinfo.getQuantity()+
                        "\n____________________________________________________________" +
    
                        "\nSUBTOTAL: " +subTotal()+ " SR" +
                        "\nTOTAL: "+(subTotal()+calculateTax(subTotal()))+" SR" ;
        return result;
    }
     public double subTotal() {
        return orderinfo.getProduct().getPrice() * orderinfo.getQuantity();
    }
  public static double calculateTax(double subtotal) {
        return subtotal * 0.15;
    }
}

    
