package vn.edu.iuh.fit.www_week2.Connection;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private static Connection instance;
    private EntityManagerFactory emf;
    private Connection(){
        emf= Persistence.createEntityManagerFactory("WWW_week2");
    }
    public static Connection getInstance(){
        if (instance==null)
            instance= new Connection();
        return instance;
    }
    public EntityManagerFactory getEmf(){
        return emf;
    }
}
