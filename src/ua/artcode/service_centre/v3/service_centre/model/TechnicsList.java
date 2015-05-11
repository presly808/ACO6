package ua.artcode.service_centre.v3.service_centre.model;

import java.util.ArrayList;

/**
 * Created by tokar on 06.05.2015.
 */
public class TechnicsList {
   private ArrayList<Technics> list;


    public TechnicsList() {
       this.list=new ArrayList<Technics>();

    }
    public void addToList(Technics technics){
        list.add(technics);

    }
    public void showAll(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }



    public Technics getById(int id){
        for (int i = 0; i < list.size(); i++) {
            Technics technics = list.get(i);
            if(technics.getIdentificationCode() == id){
                return technics;
            }
        }
        return null;
    }

    public int indexById(int id){
        for (int i = 0; i < list.size(); i++) {
            Technics technics = list.get(i);
            if(technics.getIdentificationCode() == id){
                return i;
            }
        }
        return -1;
    }

    public void setList(ArrayList<Technics> list) {
        this.list = list;
    }

    public ArrayList<Technics> getList() {
        return list;
    }




}
