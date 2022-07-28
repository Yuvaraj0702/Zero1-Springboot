package com.back.demo.LocDataByMonth;

import javax.persistence.*;

@Entity
@Table
public class LocDataByMonth {
    @Id
    @SequenceGenerator(
            name = "LocDataByMonth_sequence",
            sequenceName = "LocDataByMonth_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LocDataByMonth_sequence"
    )
    private Long ID;
    private int LocDataByMonth ;

    public LocDataByMonth() {
    }

    public LocDataByMonth(Long id, int LocDataByMonth) {
        ID = id;
        this.LocDataByMonth = LocDataByMonth;
    }
    public LocDataByMonth(int LocDataByMonth) {
        LocDataByMonth = LocDataByMonth;
    }

    public int getLocDataByMonth() {
        return LocDataByMonth;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setLocDataByMonth(int LocDataByMonth) {
        LocDataByMonth = LocDataByMonth;
    }
}
