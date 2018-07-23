package domainModel;
import java.lang.String;

public class Product {
    private String sku;
    private String name;
    private String description;

    /*default values just for test*/
    public Product(){
        this.sku = "the sku";
        this.name = "Cafe colombiano";
        this.description = "El mejor cafe del mundo";
    }
    public Product(String sku, String name, String description){
        this.sku = sku;
        this.name = name;
        this.description = description;
    }

    /*Setters*/
    public void setSku(String sku){
        this.sku = sku;
    }

    public void setName( String name){
        this.name = name;
    }

    public void setDescription( String description){
        this.description = description;
    }

    /*Getters*/
    public String getSku(){
        return this.sku;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }
}
