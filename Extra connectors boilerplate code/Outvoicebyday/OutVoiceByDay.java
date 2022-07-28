package com.back.demo.Outvoicebyday;

import javax.persistence.*;

@Entity
@Table
public class OutVoiceByDay {
    @Id
    @SequenceGenerator(
            name = "OutVoiceByDay_sequence",
            sequenceName = "OutVoiceByDay_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "OutVoiceByDay_sequence"
    )
    private Long ID;
    private int OutCallByDay ;

    public OutVoiceByDay() {
    }

    public OutVoiceByDay(Long id, int outCallByDay) {
        ID = id;
        OutCallByDay = outCallByDay;
    }
    public OutVoiceByDay( int outCallByDay) {
        OutCallByDay = outCallByDay;
    }

    public int getOutCallByDay() {
        return OutCallByDay;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setOutCallByDay(int outCallByDay) {
        OutCallByDay = outCallByDay;
    }
}
