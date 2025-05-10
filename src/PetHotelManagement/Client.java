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
public class Client {
    
    private String phone;
    private String address;
    private ArrayList<String> pets = new ArrayList<>();
    
    public Client (String id, String username, String password, String name, String phone, String address){
        this.phone = phone;
        this.address = address;
        //tak siap lagi
    }
    
    //add deleteAccount
    
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
        pets.add(pet);
        System.out.println(pet + "successfully added.");
    }
    
    public void removePet(String pet){
        pets.remove(pet);
        System.out.println(pet + "successfully removed.");
    }
    
    public void displayPet(){
        System.out.println(pets);
    }
}
