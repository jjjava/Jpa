/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author hudson
 */
public class Cliente {

    public static void main(String args[]) {
        
        try{

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();

        txn.begin();

        Funcionario f = new Funcionario();
        Endereco a = new Endereco();
        Estado e = new Estado();
        Municipio m = new Municipio();

        f.setNome("Hudson Luiz Sales Schumaker");
        f.setMatricula("007");

        a.setLogradouro("Rua do Sol");
        a.setBairro("Barra");
        a.setCep("28623-620");
        a.setNumero("777");

        e.setSigla("RJ");
        m.setNome("Rio de Janeiro");
        m.setEstado(e);
        a.setMunicipio(m);
        a.setEstado(e);
        f.setEndereco(a);

        em.merge(f);

        txn.commit();
        
        }catch(Exception e){
            System.err.println(e);
        }

    }
}
