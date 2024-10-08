/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84336
 */
public class Account {

    private String username;
    private String password;
    private String name;
    // Constructor
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Default constructor
    public Account() {
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
               "username='" + username + '\'' +
               ", password='" + password + '\'' +
               '}';
    }
}
