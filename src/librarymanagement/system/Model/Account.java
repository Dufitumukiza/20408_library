/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement.system.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Joela
 */
@Entity
@Table(name="ACCOUNTS")
public class Account implements Serializable {
   
     private String username;
     private String email;
     private String firstname;
     private String lastname;
     private String password;

    public Account() {
    }

    public Account(String username, String email, String firstname, String lastname, String password) {
       this.username = username;
       this.email = email;
       this.firstname = firstname;
       this.lastname = lastname;
       this.password = password;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
 
}
