package ua.artcode.service_centre.v1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by serhii on 14.03.15.
 */
public class Menu {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Client> clients = new ArrayList<>();
    private ServiceCentre serviceCentre = new ServiceCentre();

    public Menu() {
    }

    public Menu(ServiceCentre serviceCentre) {
        this.serviceCentre = serviceCentre;
    }

    public void start(){
        while(true){
            showMainMenu();
            doChoice(sc.nextInt());
        }
    }

    public void doChoice(int choice){
        if(choice == 1){
            create();
        } else if(choice ==2){
            signIn();
        }
    }

    public void create(){
        System.out.println("Input name");
        String name = sc.next();
        System.out.println("Input type");
        String type = sc.next();

        switch (type) {

            case "client" :{
                Client client = new Client();
                client.setName(name);
                clients.add(client);
                break;
            }

            case "admin" : {
                Admin admin = new Admin();
                admin.setName(name);
                serviceCentre.setAdmin(admin);
                break;
            }



        }
    }


    public void signIn(){

        System.out.println("Input Type");
        String type = sc.next();

        switch (type) {

            case "admin" :{
                showAdminMenu();
                break;
            }

            case "client" : {
                showClientMenu();
                break;
            }

        }
    }


    public void showMainMenu(){
        System.out.println("1. Create");
        System.out.println("2. Sign in");
    }

    public void showAdminMenu(){
        System.out.println("1. Show products");
        System.out.println("2. Take to specialist");
        System.out.println("4. exit");
    }

    public void showClientMenu(){
        System.out.println("1. Show products");
        System.out.println("2. Give product to admin");
        System.out.println("3. Take product from admin");
        System.out.println("4. exit");
    }

    public void showTypes(){
        System.out.println("1. Client");
        System.out.println("1. Admin");
    }









}
