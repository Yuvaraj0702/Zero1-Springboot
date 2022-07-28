package com.back.demo.LocDataByday;

import javax.persistence.*;

@Entity
@Table
public class LocDataByDay {
    @Id
    @SequenceGenerator(
            name = "LocDataByDay_sequence",
            sequenceName = "LocDataByDay_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LocDataByDay_sequence"
    )
    private Long ID;
    private int LocDataByDay ;

    public LocDataByDay() {
    }

    public LocDataByDay(Long id, int LocDataByDay) {
        ID = id;
        this.LocDataByDay = LocDataByDay;
    }
    public LocDataByDay(int LocDataByDay) {
        LocDataByDay = LocDataByDay;
    }

    public int getLocDataByDay() {
        return LocDataByDay;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setLocDataByDay(int LocDataByDay) {
        LocDataByDay = LocDataByDay;
    }
}
