/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetHotelManagement;

/**
 *
 * @author frrah
 */
public class Admin extends User {
    
    public Admin(String id, String username, String password, String name, String email) {
        super(id, username, password, name, email);
    }
    
     public static Admin addAdmin(String id, String username, String password, String name, String email) {
        return new Admin(id, username, password, name, email);
    }
}
