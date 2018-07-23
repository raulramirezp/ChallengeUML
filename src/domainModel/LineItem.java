package domainModel;

public class LineItem  {

    private Integer quantity;
    private Double price;
    private domainModel.Product Product;

    /*default values just for test*/
    public LineItem(){
        this.quantity = 10;
        this.price = 2750.0;
        this.Product = new Product();
    }
    public LineItem(Integer quantity, Double price, domainModel.Product Product){
        this.quantity = quantity;
        this.price = price;
        this.Product = Product;

    }


    public void setQuantity( Integer quantity){
        this.quantity = quantity;
    }

    public void setPrice( Double price){
        this.price = price;
    }

    public void setProduct( domainModel.Product Product){
        this.Product = Product;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public Double getPrice(){
        return this.price;
    }

    public domainModel.Product getProduct(){
        return  this.Product;
    }
}
