package ua.artcode.service_centre.v1;

import java.util.Date;

/**
 * Wrapper
 */
public class ClientTicket {

    private Ticket ticket;

    public ClientTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getGiveTime(){
        return ticket.getPutTime();
    }

    public String getKeyNumber(){
        return ticket.getNumber();
    }



}
