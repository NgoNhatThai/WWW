package vn.edu.iuh.fit.www_week2.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.www_week2.Connection.Connection;
import vn.edu.iuh.fit.www_week2.enums.EmployeeStatus;
import vn.edu.iuh.fit.www_week2.models.Employee;
import vn.edu.iuh.fit.www_week2.models.Product;

import java.util.List;

public class ProductRepository {
    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tr;
    //private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    private final Logger logger= LoggerFactory.getLogger(this.getClass().getName());
    public ProductRepository(){
        emf = Connection.getInstance().getEmf();
        em = emf.createEntityManager();
        tr = em.getTransaction();
    }

    public void add(Product e){
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

    public void update(Product e){
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

    public Product findById(long id){
        String sql = "select * from products where product_id like '"+id+"'";
        Product e = (Product) em.createNativeQuery(sql, Product.class).getSingleResult();
        return e;
    }

    public List<Product> getAll(){
        String sql = "select * from products";
        List<Product> le = em.createNativeQuery(sql, Product.class).getResultList();
        return le;
    }
}
