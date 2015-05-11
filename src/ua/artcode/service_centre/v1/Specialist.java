package ua.artcode.service_centre.v1;

import java.util.ArrayList;

/**
 * Created by serhii on 14.03.15.
 */
public class Specialist extends Worker {

    private ArrayList<Ticket> items;
    private Admin admin;

    private void getTicket(){
        items.add(admin.giveTicket());
    }

    private void returnTicket(){
        admin.receiveTicket(items.remove(items.size() - 1));
    }

    public void fix(){
        for(Ticket ticket : items){
            ticket.getProduct().setFixed(true);
        }
    }


}
