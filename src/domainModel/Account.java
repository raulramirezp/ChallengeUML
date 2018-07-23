package domainModel;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private Integer id;
    private Customer customer;
    private  AccountStatus status;
    private ShoppingCart cart;
    private List<Address> addresses;
    private List<PaymentMethod> methods;


    public Account(Integer id, Customer customer, AccountStatus status, ShoppingCart cart, List<Address> addresses, List<PaymentMethod> methods) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.cart = cart;
        this.addresses = new ArrayList<Address>();
        this.addresses = addresses;
        this.methods = new ArrayList<PaymentMethod>();
        this.methods = methods;
    }

    public void addMethod(PaymentMethod paymentMethod){
        this.methods.add(paymentMethod);
    }

    public void addAddress( Address address){
        this.addresses.add(address);
    }

    public void destroyMethods(){
        this.methods = new ArrayList<PaymentMethod>();
    }

    public void destroyAddresses(){
        this.addresses = new ArrayList<Address>();
    }
}
