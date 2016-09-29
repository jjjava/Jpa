/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author hudson
 */
@Entity
@PrimaryKeyJoinColumn(name = "ID_PESSOA")
public class Funcionario extends Pessoa {

    
    @Column(name = "ID_FUNCIONARIO")
    private Long id;

    private String matricula;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
