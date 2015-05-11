package ua.artcode.dp.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class UsersHolder implements IUserModel { // my model

    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
