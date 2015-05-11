package ua.artcode.service_centre.v2.centre_mvc.view;

import ua.artcode.service_centre.v2.centre_mvc.controller.ClientController;
import ua.artcode.service_centre.v2.centre_mvc.model.Client;
import ua.artcode.service_centre.v2.centre_mvc.model.Product;

import java.util.Scanner;


public class ClientView {

    private Scanner scanner = new Scanner(System.in);
    private Client client;
    private ClientController clientController;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ClientController getClientController() {
        return clientController;
    }

    public void setClientController(ClientController clientController) {
        this.clientController = clientController;
    }

    public void start(){
        int choice = -1;
        while(true){
            showMainMenu();
            choice = scanner.nextInt();

            if(choice == 1) {
                addProductMenu();
            } else if(choice == 2){
                takeProductMenu();
            } else if(choice == 3){
                break;
            }
        }
    }

    private void showMainMenu(){
        System.out.println("1. Add product");
        System.out.println("2. get product");
        System.out.println("3. exit");
    }

    private void addProductMenu(){
        System.out.println("choose product");
        clientController.showProducts(client);
        int choice = scanner.nextInt();
        String key = clientController.giveProduct(client.getProducts().remove(choice), client.getMoney());
        System.out.println("Your key is " + key);
    }

    private void takeProductMenu(){
        System.out.println("Input key");
        String key = scanner.next();
        Product product = clientController.getByTicket(key);
        client.getProducts().add(product);
    }

}
