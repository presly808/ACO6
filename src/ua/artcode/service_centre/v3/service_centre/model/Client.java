package ua.artcode.service_centre.v3.service_centre.model;

import java.util.Date;

/**
 * Created by tokar on 06.05.2015.
 */
public class Client {

    private  String name;
    private String surname;
    private TechnicsList technicsList = new TechnicsList();

    public Client() {
    }

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //сдать товар на ремонт
    public void giveGoodsforRepair (Technics technics){


       technicsList.addToList(technics);
        technics.setCondition("Gived for repair");


    }
    //- купить технику
    public void buyTechnics(Technics technics, Date date) {
        for (int i = 0; i < technicsList.getList().size(); i++) {

            if (technicsList.getList().get(i) == technics) {

                technics.setCondition("Sold");
                technics.setDatePurchase(date);
            }


        }
    }
    //забрать товар по идентификационному коду
   public void  giveBack( int identifyCode,Date date){
       for(int i=0;i<technicsList.getList().size();i++){
           if(technicsList.getList().get(i).getIdentificationCode()==identifyCode){
               technicsList.getList().get(i).setCondition("Repaired");
               technicsList.getList().get(i).setDate(date);


           }

       }



   }

    public TechnicsList getTechnicsList() {
        return technicsList;
    }

    public void setTechnicsList(TechnicsList technicsList) {
        this.technicsList = technicsList;
    }
}
