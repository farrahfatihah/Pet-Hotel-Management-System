/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetHotelManagement;
import java.util.ArrayList;
/**
 *
 * @author frrah
 */
public class Client extends User {
    
    private String phone;
    private String address;
    private ArrayList<String> clientPets = new ArrayList<>();
    
    public Client (String id, String username, String password, String fullName, String email, String phone, String address){
        super (id, username, password, fullName, email);
        this.phone = phone;
        this.address = address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone (String phone) {
        this.phone = phone;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress (String address) {
        this.address = address;
    }
    
    public void addPet(String pet){
        clientPets.add(pet);
        System.out.println(pet + "successfully added.");
    }
    
    public void removePet(String pet){
        clientPets.remove(pet);
        System.out.println(pet + "successfully removed.");
    }
    
    public void displayPet(){
        System.out.println(clientPets);
    }
}
