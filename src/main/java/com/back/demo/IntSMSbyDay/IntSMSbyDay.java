package com.back.demo.IntSMSbyDay;

import javax.persistence.*;

@Entity
@Table
public class IntSMSbyDay {
    @Id
    @SequenceGenerator(
            name = "IntSMSbyDay_sequence",
            sequenceName = "IntSMSbyDay_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IntSMSbyDay_sequence"
    )
    private Long ID;
    private int IntSMSbyDay ;

    public IntSMSbyDay() {
    }

    public IntSMSbyDay(Long id, int IntSMSbyDay) {
        ID = id;
        this.IntSMSbyDay = IntSMSbyDay;
    }
    public IntSMSbyDay(int IntSMSbyDay) {
        IntSMSbyDay = IntSMSbyDay;
    }

    public int getIntSMSbyDay() {
        return IntSMSbyDay;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIntSMSbyDay(int IntSMSbyDay) {
        IntSMSbyDay = IntSMSbyDay;
    }
}
