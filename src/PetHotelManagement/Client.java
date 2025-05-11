/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetHotelManagement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frrah
 */
public class Client extends User {
    
    private String phone;
    private String address;
    private final List<Pet> clientPets; //list interface
    
    public Client(String id, String username, String password, String name, String email, String phone, String address) {
        super(id, username, password, name, email);
        setPhone(phone);
        setAddress(address);
        this.clientPets = new ArrayList<>();
    }
    
    public String getPhone() {
        return phone;
    }
    
    //letak validation, digits only, 8-15 digits
    public void setPhone(String phone) {
        if (phone != null && phone.matches("\\d{8,11}")) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone number format. Must be 8-11 digits");
        }
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null) {
            this.address = "";
            return;
        }
        this.address = address.trim();
    }
    
    public List<Pet> getClientPets() {
        return new ArrayList<>(clientPets);
    }

    public void setClientPets(List<Pet> clientPets) {
        if (clientPets != null) {
        this.clientPets.clear();
        this.clientPets.addAll(clientPets);
        }
    }

    public void addPet(Pet pet) {
        if (pet != null && !clientPets.contains(pet)) {
            clientPets.add(pet);
            System.out.println(pet.getPetName() + " successfully added.");
        } else {
            System.out.println("Pet is null or already registered.");
        }
    }

    public boolean removePet(Pet pet) {
        if (clientPets.remove(pet)) {
            System.out.println(pet.getPetName() + " successfully removed.");
            return true;
        }
        System.out.println("Pet not found");
        return false;
    }

    public void displayPet() {
        if (clientPets.isEmpty()) {
            System.out.println("No pets registered for " + this.getName() + ".");
        } else {
            System.out.println("\nPets registered for " + this.getName() + ":");
            for (Pet pet : clientPets) {
                System.out.printf("- %s (ID: %s)%n",pet.getPetName(), pet.getPetId());
            }
        }
    }
}
    