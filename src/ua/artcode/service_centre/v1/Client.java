package ua.artcode.service_centre.v1;

import java.util.ArrayList;

/**
 * Created by serhii on 14.03.15.
 */
public class Client extends Human {

    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<ClientTicket> tickets = new ArrayList<>();

    public Client() {
    }

    public void takeProduct(Admin admin, ClientTicket clientTicket){
        products.add(admin.giveProductToClient(clientTicket));
    }

    public void giveProductForRepair(Admin admin,Product product){
        ClientTicket clientTicket = admin.receiveProduct(product, this);
        tickets.add(clientTicket);
    }





}
