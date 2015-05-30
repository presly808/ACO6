package ua.artcode.service_centre.v3.service_centre.controller;

import ua.artcode.service_centre.v3.service_centre.exception.NoTechniqueFound;
import ua.artcode.service_centre.v3.service_centre.model.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class ServiceCentre implements Serializable {


    private Client client;
    private Repairer repairer;

    private ArrayList<WorkLog> workLogs = new ArrayList<>();
    private TechnicsList technicsList = new TechnicsList();


    public void initTestData() {
        client = new Client("Oleg", "Ivanov");
        repairer = new Repairer("Yuriy", "Liskov", "repairer", 1000);

        Technics technics1 = new Technics("new", new Date(), 677,345);
        Technics technics2 = new Technics("new", new Date(), 5656,222);
        Technics technics3 = new Technics("new", new Date(), 2332,111);

        client.getTechnicsList().addToList(technics1);
        client.getTechnicsList().addToList(technics2);
        client.getTechnicsList().addToList(technics3);
    }

    public Client logInAsClient(){
        return client;
    }


    public Repairer logInAsRepairer(){
        return repairer;
    }

    public Technics getTechnique(int id) throws NoTechniqueFound {
        int i = technicsList.indexById(id);
        if(i == -1){
            throw new NoTechniqueFound("wrong id of tech");
        }
        return technicsList.getList().remove(i);
    }

    public void showBufferTechinics(){
        technicsList.showAll();
    }

    public String giveForRepairTechnics(Technics technics, Client client){
        WorkLog workLog = new WorkLog(new Date(), null,technics, null, client);
        workLogs.add(workLog);
        technicsList.addToList(technics);
        return "your key is " + technics.getIdentificationCode();
    }

    // Spec
    public void repair(Repairer repairer, Technics technics) {
        WorkLog found = null;
        for(WorkLog workLog : workLogs){
            if(workLog.getTechnics().equals(technics)){
               found = workLog;
            }
        }

        if(found == null) {
            System.out.println("Techinque not found");
            return;
        }

        found.setTo(new Date());
        found.setRepairer(repairer);
        technics.setCondition("repaired");

        technicsList.addToList(technics);
    }


    public Repairer getRepairer() {
        return repairer;
    }

    public void setRepairer(Repairer repairer) {
        this.repairer = repairer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
