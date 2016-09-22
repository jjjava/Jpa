/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author hudson
 */
@Entity
@Table(name="DOG")
@SequenceGenerator(name="DOG_SEQUENCE", sequenceName="DOG_SEQUENCE", allocationSize=1, initialValue=0)
public class Dog implements Serializable {
 
    public Dog(){
    }
 
    public Dog(String name){
        this.name = name;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="DOG_SEQUENCE")
    private int id;
 
    @Column
    private String name;
 
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}