package com.ascendcorp.ctaworkshop.hotelchiangmai.Repository;

import com.ascendcorp.ctaworkshop.hotelchiangmai.Entity.Room;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
@Transactional(readOnly = true)
public class RoomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Room> findAll() {
        Query query = entityManager.createQuery("from Room");
        return query.getResultList();
    }

    public Room findById(Long id) {
        return entityManager.find(Room.class, id);
    }
}
