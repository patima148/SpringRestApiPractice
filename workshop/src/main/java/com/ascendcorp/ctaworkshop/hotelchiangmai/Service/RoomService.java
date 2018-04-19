package com.ascendcorp.ctaworkshop.hotelchiangmai.Service;

import com.ascendcorp.ctaworkshop.hotelchiangmai.Entity.Room;
import com.ascendcorp.ctaworkshop.hotelchiangmai.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room>listAll() {
        return roomRepository.findAll();
    }

    public Room findRoomById(Long id) {
        return roomRepository.findById(id);
    }
}
