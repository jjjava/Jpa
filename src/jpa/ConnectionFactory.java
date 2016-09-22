/*
 * Copyright(c) 2016 Luminieux Company, Inc.  All Rights Reserved.
 * This software is the proprietary information of Luminieux Company.
 */

package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hudson Schumaker - Luminieux 21/09/2016
 * @version 1.0.0 
 */
public abstract class ConnectionFactory {
    private ConnectionFactory() {
    }
 
    private static EntityManagerFactory entityManagerFactory;
 
    public static EntityManager getEntityManager(){
        if (entityManagerFactory == null){
            entityManagerFactory = Persistence.createEntityManagerFactory("JpaPU");
        }
        return entityManagerFactory.createEntityManager();
    }
}