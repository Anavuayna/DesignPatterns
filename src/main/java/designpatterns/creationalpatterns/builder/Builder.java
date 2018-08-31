package designpatterns.creationalpatterns.builder;

public abstract class Builder {

    protected Product product;

    public Product getProduct() {
        return product;
    }

    public void createProduct() {
        this.product = new Product();
    }

    public abstract void buildId();

    public abstract void buildName();

}
