package designpatterns.creationalpatterns.factorymethod;

public class ConcreteFactoryB implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }

}
