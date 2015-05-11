package ua.artcode.service_centre.v2.centre_mvc.controller;

import ua.artcode.service_centre.v2.centre_mvc.model.Client;
import ua.artcode.service_centre.v2.centre_mvc.model.ServiceCentre;
import ua.artcode.service_centre.v2.centre_mvc.model.Product;
import ua.artcode.service_centre.v2.centre_mvc.model.Ticket;

import java.util.ArrayList;
import java.util.Date;


public class ClientController {

    private ServiceCentre serviceCentre;

    public ClientController(ServiceCentre serviceCentre) {
        this.serviceCentre = serviceCentre;
    }

    public void showProducts(Client client){
        ArrayList<Product> products = client.getProducts();
        for (int i = 0; i < products.size(); i++) {
            System.out.println( i + "-" + products.get(i));
        }
    }

    public String giveProduct(Product product, double money){
        serviceCentre.setMoney(serviceCentre.getMoney() + money);
        // generate code product
        String key = new Date().getTime() + "/" + product.getModel() + "/" + money;

        Ticket ticket = new Ticket(key,product);
        serviceCentre.getTickets().add(ticket);
        return key;
    }

    public Product getByTicket(String key){
        ArrayList<Ticket> tickets = serviceCentre.getTickets();
        int position = tickets.indexOf(new Ticket(key, null));
        Ticket removedTicket = tickets.remove(position);
        return removedTicket.getProduct();
    }

}
