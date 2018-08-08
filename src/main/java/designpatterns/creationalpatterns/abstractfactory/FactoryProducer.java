package designpatterns.creationalpatterns.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }

        if (factoryType.equalsIgnoreCase("A")) {
            return new ProductAFactory();
        } else if (factoryType.equalsIgnoreCase("B")) {
            return new ProductBFactory();
        }

        return null;
    }
}
