package com.back.demo.LocDataByHour;

import javax.persistence.*;

@Entity
@Table
public class LocDataByHour {
    @Id
    @SequenceGenerator(
            name = "LocDataByHour_sequence",
            sequenceName = "LocDataByHour_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LocDataByHour_sequence"
    )
    private Long ID;
    private int LocDataByHour ;

    public LocDataByHour() {
    }

    public LocDataByHour(Long id, int LocDataByHour) {
        ID = id;
        this.LocDataByHour = LocDataByHour;
    }
    public LocDataByHour(int LocDataByHour) {
        LocDataByHour = LocDataByHour;
    }

    public int getLocDataByHour() {
        return LocDataByHour;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setLocDataByHour(int LocDataByHour) {
        LocDataByHour = LocDataByHour;
    }
}
