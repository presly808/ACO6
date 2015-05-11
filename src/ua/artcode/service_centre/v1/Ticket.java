package ua.artcode.service_centre.v1;

import java.util.Date;

/**
 * Created by serhii on 14.03.15.
 */
public class Ticket {

    private String number;
    private Product product;
    private Date putTime;
    private Date getTime;
    private Client client;


    public Ticket() {
    }

    public Ticket(String number, Product product, Date putTime, Date getTime, Client client) {
        this.number = number;
        this.product = product;
        this.putTime = putTime;
        this.getTime = getTime;
        this.client = client;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getPutTime() {
        return putTime;
    }

    public void setPutTime(Date putTime) {
        this.putTime = putTime;
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
