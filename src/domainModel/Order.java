package domainModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order{

    /*Fields*/
    private int id;
    private Date modified;
    private OrderStatus status;
    private String shippingAddress;
    private double total;
    private List<LineItem> items;

    /*Constructors*/
    public Order(){
        this.id = 1;
        this.modified = new Date();
        this.status = OrderStatus.SHIPPED;
        this.shippingAddress = "Cra 87b # 63a 40 sur";
        this.total = 0;
        this.items = new ArrayList<>();
    }

    public Order(int id, Date date, OrderStatus status, String shippingAddress, double total, ArrayList<LineItem> items ){
        this.id = id;
        this.modified = date;
        this.status = status;
        this.shippingAddress = shippingAddress;
        this.total = total;
        this.items = items;
    }

    /*methods*/

    public void setId(int id) {
        this.id = id;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public Date getModified() {
        return modified;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public double getTotal() {

        for( LineItem item : items ){
            this.total += item.getPrice();
        }
        return this.total;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void addItem( LineItem item){
        this.items.add(item);
    }

    public static void main(String[] args) {
        Order myOrder = new Order();
        myOrder.addItem(new LineItem(5,6000.0, new Product()));
        myOrder.addItem(new LineItem(5,6000.0, new Product()));
        myOrder.addItem(new LineItem(5,7000.0, new Product()));
        myOrder.addItem(new LineItem(5,8000.0, new Product()));
        myOrder.addItem(new LineItem(5,9000.0, new Product()));

        System.out.println("El precio total es de " + myOrder.getTotal() );
    }

}
