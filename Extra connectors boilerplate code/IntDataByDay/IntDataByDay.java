package com.back.demo.IntDataByDay;

import javax.persistence.*;

@Entity
@Table
public class IntDataByDay {
    @Id
    @SequenceGenerator(
            name = "IntDataByDay_sequence",
            sequenceName = "IntDataByDay_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IntDataByDay_sequence"
    )
    private Long ID;
    private int IntDataByDay ;

    public IntDataByDay() {
    }

    public IntDataByDay(Long id, int IntDataByDay) {
        ID = id;
        this.IntDataByDay = IntDataByDay;
    }
    public IntDataByDay(int IntDataByDay) {
        IntDataByDay = IntDataByDay;
    }

    public int getIntDataByDay() {
        return IntDataByDay;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIntDataByDay(int IntDataByDay) {
        IntDataByDay = IntDataByDay;
    }
}
