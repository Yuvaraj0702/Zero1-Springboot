package com.back.demo.LocSMSbyHour;

import javax.persistence.*;

@Entity
@Table
public class LocSMSbyHour {
    @Id
    @SequenceGenerator(
            name = "LocSMSbyHour_sequence",
            sequenceName = "LocSMSbyHour_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LocSMSbyHour_sequence"
    )
    private Long ID;
    private int LocSMSbyHour ;

    public LocSMSbyHour() {
    }

    public LocSMSbyHour(Long id, int LocSMSbyHour) {
        ID = id;
        this.LocSMSbyHour = LocSMSbyHour;
    }
    public LocSMSbyHour(int LocSMSbyHour) {
        LocSMSbyHour = LocSMSbyHour;
    }

    public int getLocSMSbyHour() {
        return LocSMSbyHour;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setLocSMSbyHour(int LocSMSbyHour) {
        LocSMSbyHour = LocSMSbyHour;
    }
}
