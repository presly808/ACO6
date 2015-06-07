package ua.team;

import ua.team.controller.ContactControllerImpl;
import ua.team.controller.IContactController;
import ua.team.view.ContactListFrame;

/**
 * Created by serhii on 07.06.15.
 */
public class Run {

    public static void main(String[] args) {
        IContactController contactController = new ContactControllerImpl();
        new ContactListFrame(contactController);
    }

}
