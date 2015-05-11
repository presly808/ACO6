package ua.artcode.dp.mvc.controller;

public interface IUserController {

    void addUser(String name, int age);

    void removeUser(String name);

    String getUserList();
}
