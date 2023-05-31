
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
//
//    public void setBillID(int billID) {
//        this.billID = billID;
//    }

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
    
    public void printBill(){
    System.out.println("------------------------------------------------------------");
    System.out.println("                              CAKE STORE");
    System.out.println("------------------------------------------------------------");
    System.out.println("                        Store:"+this.StoreName);
    System.out.println("Invoice No:"+ getBillID());
    System.out.println("order number:"+this.orderID+"          Order Date:"+this.date);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("ID"+"\tITEM"+"\t"+"Price"+"\t"+"Size"+"\tFlavore"+"\tQuantity");
    System.out.println(orderinfo.getProduct().toString()+"\t"+orderinfo.getQuantity());
    System.out.println("____________________________________________________________");
    double sub=subTotal();
    System.out.println("SUBTOTAL:\t"+sub+" SR");
    System.out.println("TOTAL:\t"+(sub+calculateTax(sub))+" SR");
    System.out.println("Payment option: " + getPaymentOption());

    }
     public double subTotal() {
        return orderinfo.getProduct().getPrice() * orderinfo.getQuantity();
    }
  public static double calculateTax(double subtotal) {
        return subtotal * 0.15;
    }

//    @Override
//    public String toString() {
//    }
    
    
}

    
