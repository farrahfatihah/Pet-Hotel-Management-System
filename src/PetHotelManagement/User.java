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
    
<<<<<<< HEAD
    private String id;
    private String username;
    private String password;
    private String fullName;
    private String email;

    public User(String id, String username, String password, String fullName, String email) {
=======
    //use protected to allow inheritance
    protected String id;
    protected String username;
    protected String password;
    protected String name;
    protected String email;

    public User(String id, String username, String password, String name, String email) {
>>>>>>> 4e7f26b5e7f4b1ca0adb6ac2aa045244b664823b
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
    
<<<<<<< HEAD
=======
    //id and password is permanent identifier, no need setters (shouldnt change)
>>>>>>> 4e7f26b5e7f4b1ca0adb6ac2aa045244b664823b
    public String getId() {
        return id;
    }
    
<<<<<<< HEAD
    public void setId (String id){
        this.id = id;
    }
    
=======
>>>>>>> 4e7f26b5e7f4b1ca0adb6ac2aa045244b664823b
    public String getUsername() {
        return username;
    }

    public boolean setUsername(String newUsername) {
        if (newUsername != null && newUsername.matches("^[a-zA-Z0-9_]{4,20}$")) {
            this.username = newUsername;
            return true;
        }
        return false; // Failed validation
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
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
    
    
}   
