package ua.artcode.service_centre.v3.service_centre.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by tokar on 06.05.2015.
 */
public class TechnicsList implements Serializable{
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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TechnicsList{");
        sb.append("list=");
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i)).append(",");
        }
        // appemd last without comma
        sb.append(list.get(list.size() - 1));

        sb.append('}');
        return sb.toString();
    }
}
