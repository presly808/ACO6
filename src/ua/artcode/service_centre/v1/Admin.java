package ua.artcode.service_centre.v1;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 * Created by serhii on 14.03.15.
 */
public class Admin extends Worker {

    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<Specialist> specialists = new ArrayList<>();


    public ClientTicket receiveProduct(Product product, Client client){
        String randomKey = UUID.randomUUID().toString();
        Ticket ticket = new Ticket(randomKey, product, new Date(), null, client);
        tickets.add(ticket);
        ClientTicket clientTicket = new ClientTicket(ticket);

        return clientTicket;
    }

    public Product giveProductToClient(ClientTicket clientTicket){
        //

        return null;
    }

    public Ticket giveTicket(){
        return tickets.remove(tickets.size() - 1);
    }

    public void receiveTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<Specialist> getSpecialists() {
        return specialists;
    }

    public void setSpecialists(ArrayList<Specialist> specialists) {
        this.specialists = specialists;
    }
}
