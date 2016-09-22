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
@Table(name="USER")
@SequenceGenerator(name="USER_SEQUENCE", sequenceName="USER_SEQUENCE", allocationSize=1, initialValue=0)
public class User implements Serializable{
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="USER_SEQUENCE")
    private int id;
 
    @Column
    private String login;
 
    @Column
    private String password;
    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}