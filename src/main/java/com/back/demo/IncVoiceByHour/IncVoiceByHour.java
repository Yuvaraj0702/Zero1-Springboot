package com.back.demo.IncVoiceByHour;

import javax.persistence.*;

@Entity
@Table
public class IncVoiceByHour {
    @Id
    @SequenceGenerator(
            name = "IncVoiceByHour_sequence",
            sequenceName = "IncVoiceByHour_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IncVoiceByHour_sequence"
    )
    private Long ID;
    private int IncCallByHour ;

    public IncVoiceByHour() {
    }

    public IncVoiceByHour(Long id, int IncCallByHour) {
        ID = id;
        this.IncCallByHour = IncCallByHour;
    }
    public IncVoiceByHour(int IncCallByHour) {
        IncCallByHour = IncCallByHour;
    }

    public int getIncCallByHour() {
        return IncCallByHour;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIncCallByHour(int IncCallByHour) {
        IncCallByHour = IncCallByHour;
    }
}
