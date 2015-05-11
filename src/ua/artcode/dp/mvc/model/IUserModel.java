package ua.artcode.dp.mvc.model;

import java.util.List;

/**
 * Created by serhii on 28.03.15.
 */
public interface IUserModel {


    List<User> getUsers();

    void setUsers(List<User> users);
}
