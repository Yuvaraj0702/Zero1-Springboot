package com.back.demo.HomeRoaming;

import javax.persistence.*;

@Entity
@Table
public class HomeRoaming {
    @Id
    @SequenceGenerator(
            name = "HomeRoaming_sequence",
            sequenceName = "HomeRoaming_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "HomeRoaming_sequence"
    )
    private Long ID;
    private String Destination_country;
    private int MincCalled;
    private int MincCalled1;
    private int MincCalled2;
    private int MincCalled3;

    public HomeRoaming() {
    }

    public HomeRoaming(Long ID, String destination_country, int mincCalled, int mincCalled1, int mincCalled2, int mincCalled3) {
        this.ID = ID;
        this.Destination_country = destination_country;
        this.MincCalled = mincCalled;
        this.MincCalled1 = mincCalled1;
        this.MincCalled2 = mincCalled2;
        this.MincCalled3 = mincCalled3;
    }

    public HomeRoaming(String destination_country, int mincCalled, int mincCalled1, int mincCalled2, int mincCalled3) {
        this.Destination_country = destination_country;
        this.MincCalled = mincCalled;
        this.MincCalled1 = mincCalled1;
        this.MincCalled2 = mincCalled2;
        this.MincCalled3 = mincCalled3;
    }

    public Long getID() {
        return ID;
    }

    public String getDestination_country() {
        return Destination_country;
    }

    public int getMincCalled() {
        return MincCalled;
    }

    public int getMincCalled1() {
        return MincCalled1;
    }

    public int getMincCalled2() {
        return MincCalled2;
    }

    public int getMincCalled3() {
        return MincCalled3;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setDestination_country(String destination_country) {
        Destination_country = destination_country;
    }

    public void setMincCalled(int mincCalled) {
        MincCalled = mincCalled;
    }

    public void setMincCalled1(int mincCalled1) {
        MincCalled1 = mincCalled1;
    }

    public void setMincCalled2(int mincCalled2) {
        MincCalled2 = mincCalled2;
    }

    public void setMincCalled3(int mincCalled3) {
        MincCalled3 = mincCalled3;
    }
}
