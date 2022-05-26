package com.back.demo.OutVoiceByHour;

import javax.persistence.*;

@Entity
@Table
public class OutVoiceByHour {
    @Id
    @SequenceGenerator(
            name = "OutVoiceByHour_sequence",
            sequenceName = "OutVoiceByHour_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "OutVoiceByHour_sequence"
    )
    private Long ID;
    private int OutCallByHour ;

    public OutVoiceByHour() {
    }

    public OutVoiceByHour(Long id, int outCallByHour) {
        ID = id;
        this.OutCallByHour = outCallByHour;
    }
    public OutVoiceByHour( int outCallByHour) {
        OutCallByHour = outCallByHour;
    }

    public int getOutCallByHour() {
        return OutCallByHour;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setOutCallByHour(int outCallByHour) {
        OutCallByHour = outCallByHour;
    }
}
