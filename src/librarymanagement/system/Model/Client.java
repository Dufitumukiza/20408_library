/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement.system.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CLIENTS")
public class Client implements Serializable {
    @Id
    private String regNo;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String photo;
    @Enumerated(EnumType.STRING)
    @OneToMany(mappedBy = "client")
    private List<CheckInOut> checkInOut;

    public Client(String regNo, String firstName, String lastName, String phoneNumber, String emailAddress, String photo, List<CheckInOut> checkInOut) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.photo = photo;
        this.checkInOut = checkInOut;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<CheckInOut> getCheckInOut() {
        return checkInOut;
    }

    public void setCheckInOut(List<CheckInOut> checkInOut) {
        this.checkInOut = checkInOut;
    }

   

    
    
    
    
}
