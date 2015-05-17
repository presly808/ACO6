package ua.artcode.service_centre.v3.service_centre.view;

import ua.artcode.service_centre.v3.service_centre.exception.NoTechniqueFound;
import ua.artcode.service_centre.v3.service_centre.model.Client;
import ua.artcode.service_centre.v3.service_centre.controller.ServiceCentre;
import ua.artcode.service_centre.v3.service_centre.model.Technics;

import java.util.Scanner;

/**
 * Created by tokar on 11.05.2015.
 */
public class ClientView {

    private Client client;
    private ServiceCentre serviceCentre;
    private Scanner sc = new Scanner(System.in);

    public ClientView(Client client, ServiceCentre serviceCentre) {
        this.client = client;
        this.serviceCentre = serviceCentre;
    }

    public ClientView() {
    }

    public void showMainMenu(){
        System.out.println("1. Show products");
        System.out.println("2. give product to");
        System.out.println("3. Get product");
        System.out.println("4. Exit");
    }

    public void start(){
        while(true){
            showMainMenu();
            int choice = sc.nextInt();

            if(choice == 1){
                client.getTechnicsList().showAll();
            }else if(choice == 2){
                showGiveProductMenu();
            } else if(choice == 3){
                try {
                    showTakeProductMenu();
                } catch (NoTechniqueFound noTechniqueFound) {
                    System.err.println("No tech fount " + noTechniqueFound.getMessage());
                }
            } else if(choice == 4){
                return;
            }
        }
    }

    public void showGiveProductMenu(){
        System.out.println("enter product id");
        int id = sc.nextInt();
        int index = client.getTechnicsList().indexById(id);
        Technics forRepair = client.getTechnicsList().getList().remove(index);
        String key = serviceCentre.giveForRepairTechnics(forRepair, client);
        System.out.println(key);
    }

    public void showTakeProductMenu() throws NoTechniqueFound {
        System.out.println("enter product id");
        int id = sc.nextInt();
        Technics repaired = serviceCentre.getTechnique(id);
        client.getTechnicsList().addToList(repaired);
    }

}
