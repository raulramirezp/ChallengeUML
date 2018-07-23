package pattern;

public class ConcreteFactoryX  extends AbstractFactory{

    @Override
    public ProductA createProductA() {
        return new ProductAX();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBX();
    }
}
