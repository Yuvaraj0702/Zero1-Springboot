package com.back.demo.LocDataByYear;

import javax.persistence.*;

@Entity
@Table
public class LocDataByYear {
    @Id
    @SequenceGenerator(
            name = "LocDataByYear_sequence",
            sequenceName = "LocDataByYear_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LocDataByYear_sequence"
    )
    private Long ID;
    private int LocDataByYear ;

    public LocDataByYear() {
    }

    public LocDataByYear(Long id, int LocDataByYear) {
        ID = id;
        this.LocDataByYear = LocDataByYear;
    }
    public LocDataByYear(int LocDataByYear) {
        LocDataByYear = LocDataByYear;
    }

    public int getLocDataByYear() {
        return LocDataByYear;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setLocDataByYear(int LocDataByYear) {
        LocDataByYear = LocDataByYear;
    }
}
