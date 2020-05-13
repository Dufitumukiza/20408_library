/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement.system.Model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Joela
 */
@Entity
@Table(name="BOOKS")
public class Book implements Serializable {
    @Id
   private String bookId;
   private String title;
   private String publishingHouse;
    @Temporal(TemporalType.DATE)
   private Date dateOfPublication;
   private String author;
   private int pages;
  @OneToMany
    private List<CheckInOut> checkInOut;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<CheckInOut> getCheckInOut() {
        return checkInOut;
    }

    public void setCheckInOut(List<CheckInOut> checkInOut) {
        this.checkInOut = checkInOut;
    }

    public Book() {
    }

    public Book(String bookId, String title, String publishingHouse, Date dateOfPublication, String author, int pages) {
        this.bookId = bookId;
        this.title = title;
        this.publishingHouse = publishingHouse;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
        this.pages = pages;
    }

    
   
}
