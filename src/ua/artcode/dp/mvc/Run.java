package ua.artcode.dp.mvc;

import ua.artcode.dp.mvc.controller.IUserController;
import ua.artcode.dp.mvc.controller.UserController;
import ua.artcode.dp.mvc.model.IUserModel;
import ua.artcode.dp.mvc.model.UsersHolder;
import ua.artcode.dp.mvc.view.UserView;

public class Run {

    public static void main(String[] args) {
        IUserModel model = new UsersHolder();
        IUserController controller = new UserController(model);
        UserView userView = new UserView(controller);

        userView.start();
    }

}
