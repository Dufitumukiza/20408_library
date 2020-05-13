/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library.management.system.Controller;

import java.util.List;
import librarymanagement.system.Model.Client;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Joela
 */
public class ClientController {
   public void register(Client client){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(client);
        s.getTransaction().commit();
        s.close();
    }
    
    
    public void update(Client client){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(client);
        s.getTransaction().commit();
        s.close();
    }
    
    public void delete(Client client){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(client);
        s.getTransaction().commit();
        s.close();
    }
    
    public Client findById(String id){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Client x = (Client) s.get(Client.class, id);
        s.close();
        return x;
    }
    
    public List<Client> findAll(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM Client a ");
        List<Client> list = q.list();
        s.close();
        return list;
    } 
}
