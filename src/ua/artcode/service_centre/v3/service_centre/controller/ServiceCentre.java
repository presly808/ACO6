package ua.artcode.service_centre.v3.service_centre.controller;

import ua.artcode.service_centre.v3.service_centre.model.*;

import java.util.ArrayList;
import java.util.Date;

public class ServiceCentre {

    private ArrayList<WorkLog> workLogs = new ArrayList<>();
    private TechnicsList technicsList = new TechnicsList();

    public Technics getTechnique(int id){
        int i = technicsList.indexById(id);
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




}
