package com.back.demo.LocSMSbyYear;

import javax.persistence.*;

@Entity
@Table
public class LocSMSbyYear {
    @Id
    @SequenceGenerator(
            name = "LocSMSbyYear_sequence",
            sequenceName = "LocSMSbyYear_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LocSMSbyYear_sequence"
    )
    private Long ID;
    private int LocSMSbyYear ;

    public LocSMSbyYear() {
    }

    public LocSMSbyYear(Long id, int LocSMSbyYear) {
        ID = id;
        this.LocSMSbyYear = LocSMSbyYear;
    }
    public LocSMSbyYear(int LocSMSbyYear) {
        LocSMSbyYear = LocSMSbyYear;
    }

    public int getLocSMSbyYear() {
        return LocSMSbyYear;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setLocSMSbyYear(int LocSMSbyYear) {
        LocSMSbyYear = LocSMSbyYear;
    }
}
