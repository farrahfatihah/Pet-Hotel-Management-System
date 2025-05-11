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
    private String remarks;
    
    
    public Pet(String petId, String petName, String remarks) {
        this.petId = petId;
        this.petName = petName;
        this.remarks = remarks;
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
    
    public String getRemarks() {
    return remarks;
}

    public void setRemarks(String remarks) {
    this.remarks = remarks;
    }
    
}
