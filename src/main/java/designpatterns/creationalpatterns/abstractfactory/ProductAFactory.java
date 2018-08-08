package designpatterns.creationalpatterns.abstractfactory;

public class ProductAFactory implements AbstractFactory {

    @Override
    public ProductA getProductA(String productType) {
        if (productType == null) {
            return null;
        }

        if (productType.equalsIgnoreCase("A1")) {
            return new ConcreteProductA1();
        } else if (productType.equalsIgnoreCase("A2")) {
            return new ConcreteProductA2();
        }

        return null;
    }

    @Override
    public ProductB getProductB(String productType) {
        return null;
    }

}
