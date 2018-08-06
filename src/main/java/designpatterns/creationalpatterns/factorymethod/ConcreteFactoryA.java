package designpatterns.creationalpatterns.factorymethod;

public class ConcreteFactoryA implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }

}
