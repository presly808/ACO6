package ua.artcode.service_centre.v3.service_centre.utils;

import ua.artcode.service_centre.v3.service_centre.controller.ServiceCentre;
import ua.artcode.service_centre.v3.service_centre.model.Client;
import ua.artcode.service_centre.v3.service_centre.model.Repairer;
import ua.artcode.service_centre.v3.service_centre.model.Stuff;
import ua.artcode.week5.serial.IOHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by serhii on 30.05.15.
 */
public class StringServiceCentreIOHelper implements IOHelper <ServiceCentre> {
    @Override
    public void save(String path, ServiceCentre o) {
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.println(o.getClient().toString());
            pw.println(o.getRepairer().toString());
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ServiceCentre load(String path) {
        try {
            ServiceCentre serviceCentre = new ServiceCentre();

            Scanner sc = new Scanner(new File(path));
            while(sc.hasNextLine()){
                String dataLine = sc.nextLine();
                int bodyStartIndex = dataLine.indexOf("{");
                int bodyEndIndex = dataLine.lastIndexOf("}");
                String type = dataLine.substring(0, bodyStartIndex);
                String body = dataLine.substring(bodyStartIndex + 1, bodyEndIndex);

                if(type.equals("Stuff")){
                    Repairer repairer = parseRepairer(body);
                    serviceCentre.setRepairer(repairer);
                } else if(type.equals("Client")){
                    Client client = parseClient(body);
                    serviceCentre.setClient(client);
                }




            }

            return serviceCentre;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Client parseClient(String body) {
        Client client = new Client();
        String[] parts = body.split(",");

        for (String part : parts) {

            String trimPart = part.trim();
            String[] pair = trimPart.split("=");
            String key = pair[0];
            String value = pair[1];

            if(key.equals("name")){
                client.setName(value);
            } else if(key.equals("surname")){
                client.setSurname(value);
            }

        }

        return client;
    }


    private Repairer parseRepairer(String body){
        Repairer repairer = new Repairer();
        String[] parts = body.split(",");

        for (String part : parts) {

            String trimPart = part.trim();
            String[] pair = trimPart.split("=");
            String key = pair[0];
            String value = pair[1];

            if(key.equals("name")){
                repairer.setName(value);
            } else if(key.equals("surname")){
                repairer.setSurname(value);
            } else if(key.equals("salary")){
                repairer.setSalary(Double.valueOf(value));
            } else if(key.equals("post")){
                repairer.setPost(value);
            }

        }

        return repairer;
    }
}


