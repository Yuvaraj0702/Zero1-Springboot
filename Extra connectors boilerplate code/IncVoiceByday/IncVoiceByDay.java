package com.back.demo.IncVoiceByday;

import javax.persistence.*;

@Entity
@Table
public class IncVoiceByDay {
    @Id
    @SequenceGenerator(
            name = "IncVoiceByDay_sequence",
            sequenceName = "IncVoiceByDay_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IncVoiceByDay_sequence"
    )
    private Long ID;
    private int IncCallByDay ;

    public IncVoiceByDay() {
    }

    public IncVoiceByDay(Long id, int IncCallByDay) {
        ID = id;
        this.IncCallByDay = IncCallByDay;
    }
    public IncVoiceByDay(int IncCallByDay) {
        IncCallByDay = IncCallByDay;
    }

    public int getIncCallByDay() {
        return IncCallByDay;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIncCallByDay(int IncCallByDay) {
        IncCallByDay = IncCallByDay;
    }
}
