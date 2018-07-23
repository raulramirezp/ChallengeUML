package pattern;

import domainModel.Product;

public class Client {

    private AbstractFactory factoryProduct;

    public Client(){
    }

    public void setFactory(AbstractFactory factory){
        this.factoryProduct = factory;
    }

    public AbstractFactory getFactory(){
        return this.factoryProduct;
    }

    public static void main(String [] args){
        /* ** Test** */
        Client client = new Client();
        //client.factoryProduct = AbstractFactory.getFactory(ProductType.X);
        client.setFactory(AbstractFactory.getFactory(ProductType.X));

        ProductA productAX = client.getFactory().createProductA();
        System.out.println(productAX.getDescription());

        ProductB productBX = client.getFactory().createProductB();
        System.out.println(productBX.getDescription());

        client.setFactory( AbstractFactory.getFactory(ProductType.Y));

        ProductA productAY = client.getFactory().createProductA();
        System.out.println(productAY.getDescription());

        ProductB productBY = client.getFactory().createProductB();
        System.out.println(productBY.getDescription());


    }
}
