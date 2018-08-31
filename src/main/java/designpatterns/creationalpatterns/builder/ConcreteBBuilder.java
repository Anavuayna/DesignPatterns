package designpatterns.creationalpatterns.builder;

public class ConcreteBBuilder extends Builder {

    @Override
    public void buildId() {
        product.setId(2);
    }

    @Override
    public void buildName() {
        product.setName("ProductB");
    }

}
