package designpatterns.creationalpatterns.builder;

public class ConcreteABuilder extends Builder {

    @Override
    public void buildId() {
        product.setId(1);
    }

    @Override
    public void buildName() {
        product.setName("ProductA");
    }

}
