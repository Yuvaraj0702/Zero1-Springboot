package com.back.demo.IntSMSbyHour;

import javax.persistence.*;

@Entity
@Table
public class IntSMSbyHour {
    @Id
    @SequenceGenerator(
            name = "IntSMSbyHour_sequence",
            sequenceName = "IntSMSbyHour_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IntSMSbyHour_sequence"
    )
    private Long ID;
    private int IntSMSbyHour ;

    public IntSMSbyHour() {
    }

    public IntSMSbyHour(Long id, int IntSMSbyHour) {
        ID = id;
        this.IntSMSbyHour = IntSMSbyHour;
    }
    public IntSMSbyHour(int IntSMSbyHour) {
        IntSMSbyHour = IntSMSbyHour;
    }

    public int getIntSMSbyHour() {
        return IntSMSbyHour;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIntSMSbyHour(int IntSMSbyHour) {
        IntSMSbyHour = IntSMSbyHour;
    }
}
