package com.ascendcorp.ctaworkshop.hotelchiangmai.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "ROOM_NAME")
    private String name;
    @Column(name = "ROOM_NUMBER")
    private String number;
    @Column(name = "BED_INFO",columnDefinition = "TEXT")
    private String bedInfo;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
