package com.back.demo.LocSMSbyDay;

import javax.persistence.*;

@Entity
@Table
public class LocSMSbyDay {
    @Id
    @SequenceGenerator(
            name = "LocSMSbyDay_sequence",
            sequenceName = "LocSMSbyDay_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LocSMSbyDay_sequence"
    )
    private Long ID;
    private int LocSMSbyDay ;

    public LocSMSbyDay() {
    }

    public LocSMSbyDay(Long id, int LocSMSbyDay) {
        ID = id;
        this.LocSMSbyDay = LocSMSbyDay;
    }
    public LocSMSbyDay(int LocSMSbyDay) {
        LocSMSbyDay = LocSMSbyDay;
    }

    public int getLocSMSbyDay() {
        return LocSMSbyDay;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setLocSMSbyDay(int LocSMSbyDay) {
        LocSMSbyDay = LocSMSbyDay;
    }
}
