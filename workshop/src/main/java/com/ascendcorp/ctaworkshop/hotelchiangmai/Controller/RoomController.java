package com.ascendcorp.ctaworkshop.hotelchiangmai.Controller;

import com.ascendcorp.ctaworkshop.hotelchiangmai.Entity.Room;
import com.ascendcorp.ctaworkshop.hotelchiangmai.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/room", method = RequestMethod.GET)
public class RoomController {

    @Autowired
    RoomService roomService;

    @RequestMapping
    public List<Room> getAllRoom() {
        return roomService.listAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Room getRoomById(@PathVariable Long id) {
        return roomService.findRoomById(id);
    }

}
