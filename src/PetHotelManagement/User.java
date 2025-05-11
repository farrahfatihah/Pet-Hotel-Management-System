/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetHotelManagement;

/**
 *
 * @author frrah
 */
public class User {

    protected final String id;
    protected String username;
    protected String password;
    protected String name;
    protected String email;

    public User(String id, String username, String password, String name, String email) {
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and include uppercase, lowercase, number, and special character.");
        }
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
    
    //id and password is permanent identifier, no need setters (shouldnt change)
    public String getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getName() {
        return name;
    }

    public boolean setUsername(String newUsername) {
        if (newUsername != null && newUsername.matches("^[a-zA-Z0-9_]{4,20}$")) {
            this.username = newUsername;
            return true;
        }
        return false; // Failed validation
    }

    public boolean setPassword(String newPassword) {
        if (isValidPassword(newPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public void setName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.name = newName.trim();
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String newEmail) {
        if (newEmail != null && newEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$")) {
            this.email = newEmail;
            return true;
        }
        return false; // Invalid email
    }
    // check aunthenticate for login
    public boolean authenticate(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
    // convert user details to csv format for file saving
    @Override
    public String toString() {
        return id + "," + username + "," + password + "," + name + "," + email;
    }
    //check password strength
    private boolean isValidPassword(String password) {
        return password != null &&
               password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&     // at least one uppercase
               password.matches(".*[a-z].*") &&     // at least one lowercase
               password.matches(".*\\d.*") &&       // at least one digit
               password.matches(".*[!@#$%^&*()_+=<>?{}\\[\\]-].*"); // at least one symbol
    }
}   
