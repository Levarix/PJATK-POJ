/* 
POJ - laboratorium 3 2019-04-06
Grupa: Maciej Rybacki i Jakub Słomiński
Zadanie 2
*/
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem (String startid, String startdesc, int startqty, double startunitPrice) {
        id = startid;
        desc = startdesc;
        qty = startqty;
        unitPrice = startunitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return (unitPrice * qty);
    }
    public String toString () {
        return "InvoiceItem[id="+id+", desc="+desc+", qty="+qty+", unitPrice="+unitPrice+"]";
    }
}
