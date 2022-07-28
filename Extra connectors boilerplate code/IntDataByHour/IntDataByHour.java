package com.back.demo.IntDataByHour;

import javax.persistence.*;

@Entity
@Table
public class IntDataByHour {
    @Id
    @SequenceGenerator(
            name = "IntDataByHour_sequence",
            sequenceName = "IntDataByHour_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IntDataByHour_sequence"
    )
    private Long ID;
    private int IntDataByHour ;

    public IntDataByHour() {
    }

    public IntDataByHour(Long id, int IntDataByHour) {
        ID = id;
        this.IntDataByHour = IntDataByHour;
    }
    public IntDataByHour(int IntDataByHour) {
        IntDataByHour = IntDataByHour;
    }

    public int getIntDataByHour() {
        return IntDataByHour;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIntDataByHour(int IntDataByHour) {
        IntDataByHour = IntDataByHour;
    }
}
