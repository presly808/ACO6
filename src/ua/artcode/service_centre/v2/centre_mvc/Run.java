package ua.artcode.service_centre.v2.centre_mvc;

import ua.artcode.service_centre.v2.centre_mvc.controller.ClientController;
import ua.artcode.service_centre.v2.centre_mvc.model.Client;
import ua.artcode.service_centre.v2.centre_mvc.model.Product;
import ua.artcode.service_centre.v2.centre_mvc.model.ServiceCentre;
import ua.artcode.service_centre.v2.centre_mvc.view.ClientView;

public class Run {


    public static void main(String[] args) {
        Product product1 = new Product(123, "TV", false);
        Product product2 = new Product(4545, "PHONE", false);

        Client client = new Client("Andrey", 12355);

        client.getProducts().add(product1);
        client.getProducts().add(product2);



        ServiceCentre serviceCentre = new ServiceCentre();

        ClientController clientController = new ClientController(serviceCentre);

        ClientView clientView = new ClientView();
        clientView.setClient(client);
        clientView.setClientController(clientController);

        clientView.start();

    }
}
