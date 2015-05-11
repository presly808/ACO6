package ua.artcode.dp.mvc.controller;

import ua.artcode.dp.mvc.model.IUserModel;
import ua.artcode.dp.mvc.model.User;
import ua.artcode.dp.mvc.model.UsersHolder;

public class UserController implements IUserController {

    private IUserModel usersHolder;

    public UserController(IUserModel usersHolder) {
        this.usersHolder = usersHolder;
    }

    @Override
    public void addUser(String name, int age){
        User user = new User(name, age);
        usersHolder.getUsers().add(user);
    }

    @Override
    public void removeUser(String name){
        usersHolder.getUsers().remove(new User(name, 0));
    }

    @Override
    public String getUserList(){
        StringBuilder sb = new StringBuilder();
        for(User u : usersHolder.getUsers()){
           sb.append(u.toString() + "\n");
        }
        return sb.toString();
    }



}
