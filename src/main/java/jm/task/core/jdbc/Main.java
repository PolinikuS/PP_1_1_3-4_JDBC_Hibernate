package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl usi = new UserServiceImpl();

        usi.createUsersTable();
        usi.saveUser("Polina", "Serdyukova", (byte) 23);
        usi.saveUser("Olga", "Petrova", (byte) 55);
        usi.saveUser("Nikolay", "Ivanov", (byte) 37);
        usi.saveUser("Karina", "Elizarova", (byte) 18);
        usi.getAllUsers();
        usi.cleanUsersTable();
        usi.dropUsersTable();
    }
}
