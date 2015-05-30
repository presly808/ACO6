package ua.artcode.service_centre.v3.service_centre;

import ua.artcode.service_centre.v3.service_centre.controller.ServiceCentre;
import ua.artcode.service_centre.v3.service_centre.model.Client;
import ua.artcode.service_centre.v3.service_centre.model.Repairer;
import ua.artcode.service_centre.v3.service_centre.model.Stuff;
import ua.artcode.service_centre.v3.service_centre.utils.StringServiceCentreIOHelper;
import ua.artcode.service_centre.v3.service_centre.view.ClientView;
import ua.artcode.service_centre.v3.service_centre.view.LoginHelper;
import ua.artcode.service_centre.v3.service_centre.view.RepairView;
import ua.artcode.week5.serial.IOHelper;
import ua.artcode.week5.serial.IOHelperSerial;

import java.util.Scanner;

/**
 * Created by tokar on 11.05.2015.
 */
public class RunApp {

    public static final String PATH = "/home/serhii/IdeaProjects/ACO6/temp/service_centre.out";
    public static final String PATH_STR = "/home/serhii/IdeaProjects/ACO6/temp/service_centre.txt";

    public static void main(String[] args) {

        IOHelper<ServiceCentre> serviceCentreIOSerialHelper = new StringServiceCentreIOHelper();
        //LoginHelper loginHelper = new LoginHelper();

        ServiceCentre serviceCentre = new ServiceCentre();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Client");
            System.out.println("2. Repairer");
            System.out.println("3. save");
            System.out.println("4. load");
            System.out.println("6. save as string");
            System.out.println("5. Exit");
            int ch = scanner.nextInt();

            /*if(ch != 4 && serviceCentre == null){
                System.err.println("please load service centre");
            }  else*/ if (ch == 1) {
                Client client = serviceCentre.logInAsClient();
                new ClientView(client, serviceCentre).start();
            } else if (ch == 2) {
                Repairer repairer = serviceCentre.logInAsRepairer();
                new RepairView(repairer, serviceCentre).start();
            } else if(ch == 3){
                serviceCentre.initTestData();
                serviceCentreIOSerialHelper.save(PATH_STR, serviceCentre);
            } else if(ch == 4){
                serviceCentre = serviceCentreIOSerialHelper.load(PATH_STR);
            } else if(ch == 5){
                break;
            }

        }

    }
}
