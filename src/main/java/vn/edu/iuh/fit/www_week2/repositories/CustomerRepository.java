package vn.edu.iuh.fit.www_week2.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.www_week2.Connection.Connection;
import vn.edu.iuh.fit.www_week2.enums.EmployeeStatus;
import vn.edu.iuh.fit.www_week2.models.Customer;
import vn.edu.iuh.fit.www_week2.models.Employee;

import java.util.List;

public class CustomerRepository {
    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tr;
    //private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    private final Logger logger= LoggerFactory.getLogger(this.getClass().getName());
    public CustomerRepository(){
        emf = Connection.getInstance().getEmf();
        em = emf.createEntityManager();
        tr = em.getTransaction();
    }

    public void add(Customer e){
        tr.begin();
        try {
            em.persist(e);
            tr.commit();
        }
        catch (Exception ex){
            tr.rollback();
            ex.printStackTrace();
        }
    }

//    public void setStatus(Employee e, EmployeeStatus es){
//        e.setEmployeeStatus(es);
//    }

    public void update(Customer e){
        tr.begin();
        try {
            em.merge(e);
            tr.commit();
        }
        catch (Exception ex){
            tr.rollback();
            ex.printStackTrace();
        }
    }

    public Customer findById(long id){
        String sql = "select * from customers where cus_id like '"+id+"'";
        Customer e = (Customer) em.createNativeQuery(sql, Customer.class).getSingleResult();
        return e;
    }

    public List<Customer> getAll(){
        String sql = "select * from customers";
        List<Customer> le = em.createNativeQuery(sql, Customer.class).getResultList();
        return le;
    }
}
