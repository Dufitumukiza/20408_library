/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library.management.system.Controller;
import java.util.List;
import librarymanagement.system.Model.Book;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Joela
 */
public class BookController {
   public void register(Book book){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(book);
        s.getTransaction().commit();
        s.close();
    }
    
    
    public void update(Book book){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(book);
        s.getTransaction().commit();
        s.close();
    }
    
    public void delete(Book book){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(book);
        s.getTransaction().commit();
        s.close();
    }
    
    public Book findById(String id){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Book x = (Book) s.get(Book.class, id);
        s.close();
        return x;
    }
    
    public List<Book> findAll(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM Book a ");
        List<Book> list = q.list();
        s.close();
        return list;
    }  
}
