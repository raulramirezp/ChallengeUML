package domainModel;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    /*Fields*/
    private List<LineItem> items;

    /*Constructor*/
    public void ShoppingCart(){
        this.items = new ArrayList<>();
    }

    /*Methods*/
    public void addItem( LineItem item){
        this.items.add(item);
    }
    public void cleanCart(){
        this.items = new ArrayList<>();
    }

}
