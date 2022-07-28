package com.back.demo.IntDataByYear;

import javax.persistence.*;

@Entity
@Table
public class IntDataByYear {
    @Id
    @SequenceGenerator(
            name = "IntDataByYear_sequence",
            sequenceName = "IntDataByYear_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IntDataByYear_sequence"
    )
    private Long ID;
    private int IntDataByYear ;

    public IntDataByYear() {
    }

    public IntDataByYear(Long id, int IntDataByYear) {
        ID = id;
        this.IntDataByYear = IntDataByYear;
    }
    public IntDataByYear(int IntDataByYear) {
        IntDataByYear = IntDataByYear;
    }

    public int getIntDataByYear() {
        return IntDataByYear;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIntDataByYear(int IntDataByYear) {
        IntDataByYear = IntDataByYear;
    }
}
