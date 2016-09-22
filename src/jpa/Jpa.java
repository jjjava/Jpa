/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author hudson
 */
public class Jpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaPU");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            List dogs = new ArrayList();
            dogs.add(new Dog("Terminator"));
            dogs.add(new Dog("Fluffy"));
            dogs.add(new Dog("Bacon"));

            Customer customer = new Customer();
            customer.setName("Arnold");
            customer.setDogs(dogs);

            User user = new User();
            user.setLogin("jDoe");
            user.setPassword("123changeME!@#");

            customer.setUser(user);

            em.persist(customer);

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            emf.close();
        }

        System.out.println("It is over");
    }
}
