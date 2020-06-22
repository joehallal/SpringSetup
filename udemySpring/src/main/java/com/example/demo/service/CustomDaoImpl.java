package com.example.demo.service;

import com.example.demo.user.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CustomDaoImpl implements CustomDao {

    // TODO how does the entity manager know which table???

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getByName(String name) {
        Query q = entityManager.createNativeQuery("SELECT * from user WHERE name LIKE ?", User.class);
        q.setParameter(1, name + "%");

        return q.getResultList();
    }

    @Override
    public List<User> sortByZip() {
        Query q = entityManager.createNativeQuery("SELECT * from user ORDER BY zip", User.class);

        return q.getResultList();
    }
}
