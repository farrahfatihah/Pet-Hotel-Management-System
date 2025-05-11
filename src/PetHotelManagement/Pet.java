/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetHotelManagement;

/**
 *
 * @author frrah
 */
public class Pet {
    private String petId;
    private String petName;
    
    public Pet(String petId, String petName) {
        this.petId = petId;
        this.petName = petName;
    }
    
    public String getPetId() {
    return petId;
    }

    public void setPetId(String petId) {
    this.petId = petId;
    }

    public String getPetName() {
    return petName;
    }

    public void setPetName(String petName) {
    this.petName = petName;
    }
    
}
