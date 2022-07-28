package com.back.demo.IntSMSbyYear;

import javax.persistence.*;

@Entity
@Table
public class IntSMSbyYear {
    @Id
    @SequenceGenerator(
            name = "IntSMSbyYear_sequence",
            sequenceName = "IntSMSbyYear_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IntSMSbyYear_sequence"
    )
    private Long ID;
    private int IntSMSbyYear ;

    public IntSMSbyYear() {
    }

    public IntSMSbyYear(Long id, int IntSMSbyYear) {
        ID = id;
        this.IntSMSbyYear = IntSMSbyYear;
    }
    public IntSMSbyYear(int IntSMSbyYear) {
        IntSMSbyYear = IntSMSbyYear;
    }

    public int getIntSMSbyYear() {
        return IntSMSbyYear;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIntSMSbyYear(int IntSMSbyYear) {
        IntSMSbyYear = IntSMSbyYear;
    }
}
