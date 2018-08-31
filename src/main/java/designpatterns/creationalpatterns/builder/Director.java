package designpatterns.creationalpatterns.builder;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product getProduct() {
        return builder.getProduct();
    }

    public void constractProduct() {
        builder.createProduct();
        builder.buildId();
        builder.buildName();
    }
}
