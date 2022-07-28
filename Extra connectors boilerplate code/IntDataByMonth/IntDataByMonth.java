package com.back.demo.IntDataByMonth;

import javax.persistence.*;

@Entity
@Table
public class IntDataByMonth {
    @Id
    @SequenceGenerator(
            name = "IntDataByMonth_sequence",
            sequenceName = "IntDataByMonth_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IntDataByMonth_sequence"
    )
    private Long ID;
    private int IntDataByMonth ;

    public IntDataByMonth() {
    }

    public IntDataByMonth(Long id, int IntDataByMonth) {
        ID = id;
        this.IntDataByMonth = IntDataByMonth;
    }
    public IntDataByMonth(int IntDataByMonth) {
        IntDataByMonth = IntDataByMonth;
    }

    public int getIntDataByMonth() {
        return IntDataByMonth;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIntDataByMonth(int IntDataByMonth) {
        IntDataByMonth = IntDataByMonth;
    }
}
