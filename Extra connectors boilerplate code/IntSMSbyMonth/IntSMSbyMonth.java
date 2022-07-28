package com.back.demo.IntSMSbyMonth;

import javax.persistence.*;

@Entity
@Table
public class IntSMSbyMonth {
    @Id
    @SequenceGenerator(
            name = "IntSMSbyMonth_sequence",
            sequenceName = "IntSMSbyMonth_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IntSMSbyMonth_sequence"
    )
    private Long ID;
    private int IntSMSbyMonth ;

    public IntSMSbyMonth() {
    }

    public IntSMSbyMonth(Long id, int IntSMSbyMonth) {
        ID = id;
        this.IntSMSbyMonth = IntSMSbyMonth;
    }
    public IntSMSbyMonth(int IntSMSbyMonth) {
        IntSMSbyMonth = IntSMSbyMonth;
    }

    public int getIntSMSbyMonth() {
        return IntSMSbyMonth;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIntSMSbyMonth(int IntSMSbyMonth) {
        IntSMSbyMonth = IntSMSbyMonth;
    }
}
