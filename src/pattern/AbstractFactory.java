package pattern;


abstract class AbstractFactory {

    private static final ConcreteFactoryX factoryX = new ConcreteFactoryX();
    private static final ConcreteFactoryY factoryY = new ConcreteFactoryY();

    static AbstractFactory getFactory(ProductType productType){
        AbstractFactory factory = null;
        switch (productType){
            case X:
                factory = factoryX;
                break;
            case Y:
                factory = factoryY;
            break;
        }
        return factory;
    }

    public abstract ProductB createProductB();
    public abstract ProductA createProductA();
}
