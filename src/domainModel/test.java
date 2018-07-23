package domainModel;

public class test {
    public static void main(String [] args){
        Order myOrder = new Order();
        myOrder.addItem(new LineItem(5,5000.0, new Product()));
        myOrder.addItem(new LineItem(5,6000.0, new Product()));
        myOrder.addItem(new LineItem(5,7000.0, new Product()));
        myOrder.addItem(new LineItem(5,8000.0, new Product()));
        myOrder.addItem(new LineItem(5,9000.0, new Product()));

        System.out.println("El precio total es de " + myOrder.getTotal() );
    }
}
