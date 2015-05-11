package ua.artcode.service_centre.v2.centre_mvc.model;

public class Ticket {

    private String key;
    private Product product;

    public Ticket(String key, Product product) {
        this.key = key;
        this.product = product;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Ticket)){
            return false;
        }

        Ticket other = (Ticket) obj;

        return key.equals(other.key);
    }
}
