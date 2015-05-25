package ua.artcode.service_centre.v3.service_centre;

import ua.artcode.service_centre.v3.service_centre.controller.ServiceCentre;
import ua.artcode.service_centre.v3.service_centre.model.Client;
import ua.artcode.service_centre.v3.service_centre.model.Repairer;
import ua.artcode.service_centre.v3.service_centre.view.ClientView;
import ua.artcode.service_centre.v3.service_centre.view.LoginHelper;
import ua.artcode.service_centre.v3.service_centre.view.RepairView;

import java.util.Scanner;

/**
 * Created by tokar on 11.05.2015.
 */
public class RunApp {

    public static void main(String[] args) {

        LoginHelper loginHelper = new LoginHelper();

        ServiceCentre serviceCentre = new ServiceCentre();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Client");
            System.out.println("2. Repairer");
            System.out.println("3. save");
            System.out.println("4. load");
            System.out.println("5. Exit");
            int ch = scanner.nextInt();

            if (ch == 1) {
                Client client = loginHelper.logInAsClient();
                new ClientView(client, serviceCentre).start();
            } else if (ch == 2) {
                Repairer repairer = loginHelper.logInAsRepairer();
                new RepairView(repairer, serviceCentre).start();
            } else if(ch == 5){
                break;
            }

        }


    }
}
