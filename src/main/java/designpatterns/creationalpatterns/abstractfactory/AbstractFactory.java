package designpatterns.creationalpatterns.abstractfactory;

public interface AbstractFactory {
    ProductA getProductA(String productType);
    ProductB getProductB(String productType);
}
