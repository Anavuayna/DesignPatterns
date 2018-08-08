package designpatterns.creationalpatterns.abstractfactory;

public class ProductBFactory implements AbstractFactory {

    @Override
    public ProductA getProductA(String productType) {
        return null;
    }

    @Override
    public ProductB getProductB(String productType) {
        if (productType == null) {
            return null;
        }

        if (productType.equalsIgnoreCase("B1")) {
            return new ConcreteProductB1();
        } else if (productType.equalsIgnoreCase("B2")) {
            return new ConcreteProductB2();
        }

        return null;
    }

}
