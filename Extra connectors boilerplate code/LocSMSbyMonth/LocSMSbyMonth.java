package com.back.demo.LocSMSbyMonth;

import javax.persistence.*;

@Entity
@Table
public class LocSMSbyMonth {
    @Id
    @SequenceGenerator(
            name = "LocSMSbyMonth_sequence",
            sequenceName = "LocSMSbyMonth_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LocSMSbyMonth_sequence"
    )
    private Long ID;
    private int LocSMSbyMonth ;

    public LocSMSbyMonth() {
    }

    public LocSMSbyMonth(Long id, int LocSMSbyMonth) {
        ID = id;
        this.LocSMSbyMonth = LocSMSbyMonth;
    }
    public LocSMSbyMonth(int LocSMSbyMonth) {
        LocSMSbyMonth = LocSMSbyMonth;
    }

    public int getLocSMSbyMonth() {
        return LocSMSbyMonth;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setLocSMSbyMonth(int LocSMSbyMonth) {
        LocSMSbyMonth = LocSMSbyMonth;
    }
}
