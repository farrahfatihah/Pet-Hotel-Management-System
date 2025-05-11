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
    private ArrayList<Pet> clientPets;
    
    public Client(String id, String username, String password, String name, String email, String phone, String address) {
        super(id, username, password, name, email);
        this.phone = phone;
        this.address = address;
        this.clientPets = new ArrayList<>();
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public ArrayList<Pet> getClientPets() {
        return clientPets;
    }

    public void setClientPets(ArrayList<Pet> clientPets) {
        this.clientPets = clientPets;
    }

    public void addPet(Pet pet) {
        clientPets.add(pet);
        System.out.println(pet.getPetName() + " successfully added.");
    }

    public void removePet(Pet pet) {
        clientPets.remove(pet);
        System.out.println(pet.getPetName() + " successfully removed.");
    }

    public void displayPet() {
        if (clientPets.isEmpty()) {
            System.out.println("No pets registered.");
        } else {
            for (Pet pet : clientPets) {
                System.out.println("- " + pet.getPetName() + " (ID: " + pet.getPetId() + ")");
            }
        }
    }
}
    