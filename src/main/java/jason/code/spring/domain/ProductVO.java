package jason.code.spring.domain;

/**
 * Created by Jason on 2016-06-07.
 */
public class ProductVO {
    private String name;
    private double price;

    public ProductVO(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "ProductVO [name=" + this.name +
                ", price=" + this.price + "]";
    }
}
