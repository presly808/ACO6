package ua.artcode.dp.mvc.model;

/**
 * Created by serhii on 04.04.15.
 */
public enum UserType {

    ADMIN("admin role"),
    WORKER("worker type"),
    CLIENT("test");

    private final String desc;

    private UserType(String desc) {
        this.desc = desc;
    }
}
